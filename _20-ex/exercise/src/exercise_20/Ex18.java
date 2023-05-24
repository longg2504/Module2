package exercise_20;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String input = scanner.nextLine();
        System.out.println("nhập vào điểm bắt đầu");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập điểm kết thúc ");
        int end = Integer.parseInt(scanner.nextLine());
        String output = input.substring(start,end);

        System.out.println("kết quả sau khi lấy");
        System.out.println(output);
    }
}
