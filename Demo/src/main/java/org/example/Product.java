package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Product {

    public static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg) {
    /** System.out.println("hello C0223G1");

        System.out.println("nhap vao mot chuoi");
        String b = scanner.nextLine();
        System.out.println(b);

        System.out.println("nhap vao mot so ");
        int a = scanner.nextInt();

        int a = 130;
        float c = 0.0f;
        double d = 0.0d;


        int a = 6;
        int b = a++ + ++a*2;
        ystem.out.println(a);
        System.out.println(b);


         System.out.println("nhap vao mot so");
         int number = scanner.nextInt();
         if(number > 0 ) {
         for(int i = 0 ; i<=number ; i++) {
         if(i % 2 == 0) {
         System.out.println(i);
         }
         }
         }else {
         System.out.println("so nhap vao khong dung (number > 0)");
         }

         }
    **/

        int number ;
        do{
                System.out.println("nhap lai mot so ");
                number = scanner.nextInt();
        }while(number < 0);

    }
}

