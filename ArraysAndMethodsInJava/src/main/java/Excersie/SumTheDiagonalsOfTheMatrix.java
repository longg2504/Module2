package Excersie;
import  java.util.Scanner;
public class SumTheDiagonalsOfTheMatrix {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        sumTheDiagonals();
    }

    public static int [][] createMatrix() {

        System.out.println("Enter Width of Matrix");
        int x = scanner.nextInt();
        System.out.println("Enter a length of row of Matrix");
        int y = scanner.nextInt();
        int[][] matrix = new int[x][y];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("Enter a value of Matrix at row" + row + " col " + col);
                matrix[row][col] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void sumTheDiagonals() {
        int [][] matrix = createMatrix();
        int diagonalTotal = 0;
        for (int row = 0; row < matrix.length; row++){
            diagonalTotal += matrix[row][row];
        }
        System.out.println("Sum the Diagonals of Matrix is : " +diagonalTotal);
    }
}
