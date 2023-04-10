package Exercise;
import  java.util.Scanner;

public class ShowPictures {
    public static void main(String[] args) {
        Display();
    }

    public static void Display() {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
                    System.out.println("triangle botton-left");
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");

                    System.out.println("triangle top-left");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");

                    System.out.println("triangle top-right");
                    System.out.println("*****");
                    System.out.println(" ****");
                    System.out.println("  ***");
                    System.out.println("   **");
                    System.out.println("    *");

                    System.out.println("triangle botton-left");
                    System.out.println("    *");
                    System.out.println("   **");
                    System.out.println("  ***");
                    System.out.println(" ****");
                    System.out.println("*****");


                case 3:
                    System.out.println("3. Print isosceles triangle");
                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10 - i; j++) {
                            System.out.printf(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.printf("*");
                        }
                        System.out.printf("\n");
                    }
                    break;
            }
        }
    }
}
