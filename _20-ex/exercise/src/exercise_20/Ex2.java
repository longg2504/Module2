package exercise_20;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        for(int i =0; i < numbers.length; i++){
            if(numbers[i]>=2){
                int count = 0;
                for(int j = 1; j < numbers[i]; j++){
                    if(numbers[i]%j==0){
                        count++;
                    }
                }
                if(count == 1){
                    System.out.printf("%3d",(i+1));
                }
            }
        }
    }
}
