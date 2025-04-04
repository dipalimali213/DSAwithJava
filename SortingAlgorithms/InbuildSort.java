import java.util.*;

public class InbuildSort {
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

        // Using Java's Inbuilt Sorting
        System.out.println("After Sorting..");
        Arrays.sort(arr);  // Efficient sorting method
        printArray(arr, n);
    }
}

// Time Complexity:
// Best Case (Already Sorted): O(n log n) 
// Worst Case: O(n log n)
// Average Case: O(n log n)

// Space Complexity: O(1) for primitive arrays (sorting in-place)
// Arrays.sort() for primitive types uses QuickSort (Dual-Pivot).
