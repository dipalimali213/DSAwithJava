import java.util.*;

public class SelectionSort {
    // Selection Sort Function
    public static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {  
            int minPos = i;
            for (int j = i + 1; j < n; j++) {  
                if (arr[j] < arr[minPos]) {  
                    minPos = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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

        System.out.println("After Selection Sort:");
        selectionSort(arr, n);
        printArr(arr, n);
    }
}

// Time Complexity:
// Best Case (Already Sorted): O(n^2)
// Worst Case (Reverse Sorted): O(n^2)
// Average Case: O(n^2)

// Space Complexity: O(1) 
