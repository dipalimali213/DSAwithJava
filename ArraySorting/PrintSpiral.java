import java.util.Scanner;

public class PrintSpiral {
    public static void printSpirals(int matrix[][], int rows, int cols) {
        int startRow = 0;
        int startCol = 0;
        int endRow = rows - 1;
        int endCol = cols - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse from left to right
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // Traverse from top to bottom
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // Traverse from right to left
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }

            // Traverse from bottom to top
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Spiral order of the matrix:");
        printSpirals(matrix, rows, cols);
        
    }
}

/*Time Complexity: O(m×n), where m is the number of rows and n is the number of columns. Each element is visited exactly once.
Space Complexity: O(1), since we are modifying the input matrix in place without using additional space. */