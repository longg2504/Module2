package Exercise;
import java.util.Scanner;


public class CheckPrimes {

    public static void checkNumber(int number) {
        boolean check = false;
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            int i = 2;
            check = true;
            while (i <= Math.sqrt(number)) {
                check = false;
                break;
            }
            i++;
        }
        if (check) System.out.println(number + " is a prime");
        else System.out.println(number + " is not a prime");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        checkNumber(number);
    }
}
