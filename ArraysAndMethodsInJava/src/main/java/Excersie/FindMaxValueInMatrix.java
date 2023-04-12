package Excersie;
import java.util.Arrays;
import java.util.Scanner;
public class FindMaxValueInMatrix {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        findMaxValueInMatrix();
    }

    public static void findMaxValueInMatrix(){
        System.out.println("Nhap vao chieu dai cua matrix");
        int x = scanner.nextInt();
        System.out.println("Nhap vao do dai cua mot dong trong matrix");
        int y = scanner.nextInt();
        int[][] matrix = new int[x][y];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("Nhap vao gia tri cho matrix tai vi tri dong " + row + " cot " + col);
                matrix[row][col] = scanner.nextInt();
            }
        }
        int max = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                }
            }
        }
        System.out.println("Gia tri lon nhat trong matrix la " + max);
    }
}
