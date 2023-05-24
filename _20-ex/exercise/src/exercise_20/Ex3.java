package exercise_20;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        for(int i = 0; i< numbers.length;i++){
            String num = Integer.toString(numbers[i]);
            if(Integer.parseInt(String.valueOf(num.charAt(num.length()-1))) == 5){
                System.out.printf("%-3d",numbers[i]);
            }
        }
    }
}
