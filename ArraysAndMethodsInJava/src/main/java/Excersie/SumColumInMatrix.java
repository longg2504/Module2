package Excersie;
import  java.util.Scanner;
import  java.util.Arrays;
public class SumColumInMatrix {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        sumColumInMatrix();
    }

    public static int[][] createMatrix() {

        System.out.println("Enter width of Matrix");
        int x = scanner.nextInt();
        System.out.println("Enter width of row in Matrix");
        int y = scanner.nextInt();
        int[][] matrix = new int[x][y];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("Enter a value Matrix at row " + row + " col " + col);
                matrix[row][col] = scanner.nextInt();
            }

        }
        return matrix;
    }

    public static void sumColumInMatrix(){
        int [][] matrix = createMatrix();
        System.out.println("Enter a colum want sum : ");
        int sumCol = scanner.nextInt();
        int colTotal = 0;
        for (int row = 0; row < matrix.length; row++){
            colTotal += matrix[row][sumCol];
        }
        System.out.println("sum of col "+sumCol+" is : "+colTotal);
    }
}
