package exercise.decimal_to_binary;

import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int number = 33;
        StringBuilder binary = new StringBuilder();
        while (number/2 != 0){
            stack.push(number%2);
            number = number/2;
        }
        stack.push(number%2);
        while (!stack.isEmpty()){
            binary.append(stack.pop());
        }
        System.out.println(binary);
    }
}
