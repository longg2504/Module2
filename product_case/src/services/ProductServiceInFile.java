package services;

import model.Product;

import model.ECategory;
import model.Product;
import utils.CSVUtils;
import utils.DateUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
public class ProductServiceInFile {
    private final static String PATH = "./src/data/product.csv";

    public List<Product> findAllProducts() {
        List<Product> products = new ArrayList<>();
        List<String> lines = CSVUtils.read(PATH);
        for (String line : lines) {
            String[] items = line.split(",");
            //1683514051,Iphone 11,dep lam 11,1000.0,08-05-2023 10:40,PHONE
            long idProduct = Long.parseLong(items[0]);
            float priceProduct = Float.parseFloat(items[3]);
            Date createAt = DateUtils.parse(items[4]);
            ECategory eCategory = ECategory.getECategoryByName(items[5]);

            Product p = new Product(idProduct, items[1], items[2], priceProduct, createAt, eCategory);
            products.add(p);
        }
        return products;}


    public void addProduct(Product p) {
        List<Product> products = findAllProducts();
        products.add(p);
        CSVUtils.write(PATH, products);
    }


    public void deleteProduct(long id){
        List<Product> list = findAllProducts();
        for(int i=0; i<list.size();i++){
            if(list.get(i).getId() == id){
                list.remove(i);
                break;
            }

        }
        CSVUtils.write(PATH, list);

    }

    public void showProductName(String name){
      List<Product> list = findAllProducts();
      for(Product items : list){
          if(items.geteCategory().getName().toLowerCase().equals(name.toLowerCase()))
          {
              System.out.println(items);
          }
      }
    }

    public void findProduct(long id){
        List<Product> list = findAllProducts();
        for(Product items :list){
            if(items.getId() == id){
                System.out.println(items);
            }
        }
    }

}
