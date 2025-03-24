import java.util.Scanner;
public class SmallestElementArray {
    public static int getSmallest(int[] arr) {
        int smallest = arr[0]; // Assume the first element is the largest initially
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] < smallest) {
                smallest = arr[i]; // Update the largest if the current element is greater
            }
        }
        return smallest; // Return the largest element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = getSmallest(arr);

        System.out.println("Largest Element in Array: " + smallest);

    }
}

/*Time Complexity: O(n) - The array is traversed once to find the largest element.
Space Complexity: O(1) - No additional space is used.*/
    

