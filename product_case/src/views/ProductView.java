package views;
import model.ECategory;
import model.Product;
import services.ProductServiceInFile;
import utils.DateUtils;
import services.ProductServiceInMemory;

import javax.sound.midi.MidiDevice;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class ProductView {
    private Scanner scanner = new Scanner(System.in);
    private ProductServiceInFile productService;

    public ProductView(){
        productService = new ProductServiceInFile();
    }

    public void laucher(){
        do{
            System.out.println("Menu chương trình:");
            System.out.println("Nhập 1: Xem danh sách sản phẩm");
            System.out.println("Nhập 2: Thêm sản phẩm");
            System.out.println("Nhập 3: Xóa sản phẩm");
            System.out.println("Nhập 4: Sắp xếp sản phẩm");
            System.out.println("Nhập 5: Tìm kiếm sản phẩm");
            System.out.println("Nhập 6: Đọc dữ liệu từ file");
            System.out.println("Nhập 7: Ghi dữ liệu xuống file");
            System.out.println("Nhập 8: Tìm kiếm sản phẩm có phân trang");

            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu) {
                case 1:
                    showProducts(productService.findAllProducts());
                    break;
                case 2:
                    showCreateProduct();
                    break;
                case 3:
                    showProducts(productService.findAllProducts());
                    System.out.println("nhập vào sản phẩm muốn xoá (ID)");
                    long idDelete = Long.parseLong(scanner.nextLine());
                    productService.deleteProduct(idDelete);
                    showProducts(productService.findAllProducts());
                case 4:
                    System.out.println("nhập vào loại muốn sort");
                    System.out.println("1.Phone");
                    System.out.println("2.Tablet");
                    int input = Integer.parseInt(scanner.nextLine());
                    switch (input){
                        case 1:
                            productService.showProductName("Điện Thoại");
                            break;
                        case 2:
                            productService.showProductName("Máy Tính Bảng");
                            break;
                    }



            }
        }while (true);

    }

    private void showCreateProduct(){
        System.out.println("Thêm sản phẩm");
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập mo ta: ");
        String description = scanner.nextLine();
        System.out.println("Nhap gia: ");
        float price = Float.parseFloat(scanner.nextLine());

        System.out.println("Chon danh muc:");
        for (ECategory eCategory : ECategory.values()) {
            System.out.printf("Chon %-5s %-10s", eCategory.getId(), eCategory.getName());
        }
        int idCategory = Integer.parseInt(scanner.nextLine());
        ECategory eCategory = ECategory.getECategoryById(idCategory);

        //long id, String name, String description,float price, Date createAt, ECategory eCategory) {
        Product p = new Product(System.currentTimeMillis() / 1000, name, description, price, new Date(), eCategory);
        productService.addProduct(p);

        showProducts(productService.findAllProducts());
    }




    private void showProducts(List<Product> allProducts) {

        System.out.printf("%-15s %-10s %-30s %-10s %-30s %-20s\n", "ID", "Name", "Description", "Price", "Create at", "Category");
        for (Product p : allProducts) {
            //long id, String name, String description,float price, Date createAt, ECategory eCategory) {
            System.out.printf("%-15s %-10s %-30s %-10s %-30s %-20s\n", p.getId(), p.getName(), p.getDescription(),
                    p.getPrice(), DateUtils.format(p.getCreateAt()), p.geteCategory());
        }
    }

}
