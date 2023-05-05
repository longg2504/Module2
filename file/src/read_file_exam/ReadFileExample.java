package read_file_exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public static Scanner scanner = new Scanner(System.in);
    public void readFileText(String filePath){
        try {
            //đọc file theo hướng dẫn
            File file = new File(filePath);

            // kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if(!file.exists()){
                throw new FileNotFoundException();
            }

            //đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum =0;
            while((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            //hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " +sum);

        }catch (Exception e) {
            System.err.println("file không tồn tại or nội dung có lỗi ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
