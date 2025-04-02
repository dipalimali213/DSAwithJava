import java.util.*;

public class InsertionSort {
    // Insertion Sort Function
    public static void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {  
            int curr = arr[i];
            int prev = i - 1;
            
            // Shift elements to the right to create the correct position for curr
            while (prev >= 0 && arr[prev] > curr) {  
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    // Function to Print Array
    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("After applying the Insertion Sort:");
        insertionSort(arr, n);
        printArray(arr, n);
    }
}

// Time Complexity:
// Best Case (Already Sorted): O(n) (Only one comparison per element)
// Worst Case (Reverse Sorted): O(n^2) (Maximum number of shifts and comparisons)
// Average Case: O(n^2)

// Space Complexity: O(1) 
