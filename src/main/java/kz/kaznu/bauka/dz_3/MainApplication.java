package kz.kaznu.bauka.dz_3;
import java.util.Arrays;

public class MainApplication {
    static void main() {
        int[][] matrix1 = {
                {-1, 2, 3},
                {4, -5, 6}
        };
        System.out.println("1. Sum of Positie: " + sumOfPositiveElements(matrix1));
        System.out.println("\n2. Starsquare:");
        printSquare(4);
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        zeroDiagonals(squareMatrix);
        System.out.println("\n3. Zero:");
        for (int[] row : squareMatrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("\n4. Max elem: " + findMax(matrix1));
        System.out.println("\n5. Summ: " + sumOfSecondRow(matrix1));
    }
    static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
    static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void zeroDiagonals(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 0;
            matrix[i][n - 1 - i] = 0;
        }
    }
    static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
    static int sumOfSecondRow(int[][] array) {
        if (array == null || array.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int val : array[1]) {
            sum += val;
        }
        return sum;
    }
}
