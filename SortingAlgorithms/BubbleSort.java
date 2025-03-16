import java.util.*;
public class BubbleSort {
    // Bubble Sort Function
    public static void bubbleSort(int arr[], int n) {
        // Outer loop runs (n-1) times
        for (int j = 0; j < n - 1; j++) {  
            // Inner loop runs (n-1-j) times
            for (int k = 0; k < n - 1 - j; k++) {  
                // Swap if elements are in the wrong order
                if (arr[k] > arr[k + 1]) {  
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
    }

    // Function to Print Array
    public static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Sorting Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("After Bubble Sort:");
        bubbleSort(arr, n);
        printArr(arr, n);
    }
}
        // Time Complexity: 
        // Best Case (Already Sorted): O(n^2) (Without Optimization), O(n) (With Optimization)
        // Worst Case (Reverse Sorted): O(n^2)
        // Average Case: O(n^2)