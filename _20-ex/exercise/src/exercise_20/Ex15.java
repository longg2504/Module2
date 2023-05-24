package exercise_20;

import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {
        int[] numbers = {2,1, 3, 5, 6, 1, 0, 5, 9, 1, 6, 1};
        System.out.println(Arrays.toString(numbers));
        move1ToFirst(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void move1ToFirst(int[] numbers) {
//        for (int i =0, k = 0; i< numbers.length;i++){
//            if(numbers[i] == 1){
//                int temp = numbers[i];
//                numbers[i] = numbers[k];
//                numbers[k] = temp;
//                k++;
//            }
//        }
        for (int i = 0, k = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                int temp = numbers[i];
                for(int j = i; j>k;j--){
                    numbers[j] = numbers[j-1];
                }
                numbers[k] = temp;
                k++;
            }
        }
    }
}
