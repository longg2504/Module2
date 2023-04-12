package Excersie;
import java.util.Arrays;
import java.util.Scanner;
public class FindMinInArray {
    public static void main(String[] args) {
        findMinInArray();
    }

    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a length of Array: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value for Array At index " + i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void findMinInArray() {
        int [] numbers = createArray();
        int min = numbers[0];
        for (int i = 1; i< numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Min value in Array is : " + min);
    }
}

