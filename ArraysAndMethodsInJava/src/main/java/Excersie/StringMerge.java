package Excersie;

import java.util.Arrays;
import java.util.Scanner;
public class StringMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[5];
        int[] array3 = new int[8];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter value in array 1 at index "+i);
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter value in array 1 at index "+i);
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < array1.length; i++){
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < array3.length; i++){
            array3[i] = array2[i - array1.length];
        }
        System.out.println("array after merge : "+ Arrays.toString(array3));
    }
}
