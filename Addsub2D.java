import java.util.Scanner;
public class Addsub2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the matrices: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns for the matrices: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        int[][] differenceMatrix = subtractMatrices(matrix1, matrix2);

        System.out.println("Sum of Matrices:");
        printMatrix(sumMatrix);

        System.out.println("Difference of Matrices:");
        printMatrix(differenceMatrix);

        scanner.close();
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sumMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] differenceMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                differenceMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return differenceMatrix;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

