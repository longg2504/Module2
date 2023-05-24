package exercise_20;

import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 12, 16, 18, 18, 20, 27, 40, 46, 48,48};
        System.out.println(Arrays.toString(numbers));
        numbers = insertElementToAscending(48,numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] insertElementToAscending(int element, int[] numbers) {
        int index=0;
        if (element > numbers[numbers.length - 1]) {
            index = numbers.length - 1;
        } else if (element < numbers[0]) {
            index = 0;
        } else {
            for (int i = 1; i < numbers.length - 1; i++) {
                if (element >= numbers[i - 1] && element <= numbers[i]) {
                    index = i;
                    break;
                }
            }
        }
        int[] newNumbers = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        for (int i = index; i < newNumbers.length - 1; i++) {
            int temp = newNumbers[i];
            newNumbers[i] = newNumbers[newNumbers.length - 1];
            newNumbers[newNumbers.length - 1] = temp;
        }
        newNumbers[index] = element;
        return newNumbers;
    }
}
