package Exercise;
import  java.util.Scanner;
public class ShowFirst20Primes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = input.nextInt();
        First20Primes(number);
    }
    public static void First20Primes(int number) {
        int count = 0;
        int i = 2;
        while (count < number) {
            boolean x = true;
            if(i > 3) {
                for(int j = i - 1 ; j >= 2 ; j--){
                    if(i % j == 0) {
                        x = false;
                        break;
                    }
                }
            }
            if(x) {
                System.out.println(i +" ");
                count++;
            }
            i++;
        }

    }

}
