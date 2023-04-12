package Excersie;
import java.util.Scanner;
import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int [] numbers = {10,4,6,7,8,6};
        numbers = removeElement(numbers ,2 );
        System.out.println(Arrays.toString(numbers));
    }

    public static int [] removeElement(int[] numbers , int index){
        int k = 0;
        int[] newList = new int[numbers.length - 1];
        for(int i = 0  ; i< numbers.length; i++) {
            if(i == index){
                continue;
            }
            newList[k] = numbers[i];
            k++;
        }
        return newList;
    }


}
