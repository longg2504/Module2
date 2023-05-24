package exercise_20;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        int key = 0;
        for(int i =0; i< numbers.length;i++){
            if(numbers[i] == 0){
                key = 1;
                break;
            }
        }
        System.out.println(key);
    }
}
