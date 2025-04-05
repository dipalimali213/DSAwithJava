import java.util.Scanner;

public class DiagonalSum {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];  // Primary diagonal
            if (i != matrix.length - i - 1) {  // Avoid double counting center element
                sum += matrix[i][matrix.length - i - 1];  // Secondary diagonal
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (N x N): ");
        int n = sc.nextInt();
        
        int matrix[][] = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int result = diagonalSum(matrix);
        System.out.println("Sum of diagonals: " + result);
        
        sc.close();
    }
}
/*Time Complexity: O(N), since we iterate through each row once.
Space Complexity: O(1), since only a few integer variables are used.*/