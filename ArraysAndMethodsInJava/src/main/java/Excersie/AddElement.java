package Excersie;
import java.util.Scanner;
import java.util.Arrays;
public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = {10,4,6,7,8,6};
        numbers = addElement(6,numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static int [] addElement(int value, int[] numbers) {
        int[] newList = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newList[i] = numbers[i];
        }
        newList[newList.length - 1] = value;

        return newList;
    }
}
