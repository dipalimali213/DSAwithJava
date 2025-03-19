import java.util.Scanner;

public class LinearSearch {     
    public static int findKeyUsingLinearSearch(int arr[], int key) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == key) {
                return j; // Return the index where the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        int index = findKeyUsingLinearSearch(arr, key);
        if (index == -1) {
            System.out.println("Key not found.");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}
     /* Time Complexity: O(n) - In the worst case, it iterates through all elements in the array.
     Space Complexity: O(1) - No extra space is used; only constant space is required.*/