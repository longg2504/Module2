package exercise_20;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào n");
        int input = Integer.parseInt(scanner.nextLine());
        printN(input);

    }

    public static void printN(int n){
        int total = 0;
        for(int i = 1 ; i<= 10 ; i ++){
            total = n * i;
            System.out.println(n + "*" +i + "=" +total);
        }
    }
}
