package org.example;
import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year:");
        year = scanner.nextInt();

        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100) {
                boolean isDivisible400 = year % 400 == 0;
                if(isDivisible400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = false;
            }
        }

        if(isLeapYear){
            System.out.printf("%d is a leap year" , year);
        }else{
            System.out.printf("%d is NOT a leap year", year);
        }

        /**
         * solution 1

        System.out.println("Enter a year:");
        year = scanner.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0) {
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year" , year);
                }else {
                    System.out.printf("%d is NOT a leap year" , year);
                }
            }else {
                System.out.printf("%d is a leap year" , year);
            }
        }else {
            System.out.printf("%d is NOT a leap year", year);
        }
         **/
    }
}
