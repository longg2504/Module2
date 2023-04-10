package Exercise;
import  java.util.Scanner;
public class PrintPrimesLessThan_100 {
    public static void main(String[] args) {
        int i , n ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        n = input.nextInt();
        System.out.println("All number than less " +n  +" is : ");
        if(n >= 2) {
            System.out.printf("%d \n" ,2);

        }
        for(i = 3 ; i< n ; i +=2) {
            if(isPrimeNumber(i)==1){
                System.out.printf("%d \n" , i);
            }
        }
    }

    public static int isPrimeNumber(int n) {
        if(n<2) {
           return 0 ;
        }
        int i ;
        int squareRoot = (int) Math.sqrt(n);
        for(i =2 ; i <squareRoot; i++) {
            if ( n % i == 0) {
                return 0;

            }
        }
        return 1;
    }
}
