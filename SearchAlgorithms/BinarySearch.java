import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        int start = 0,end = arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
            
        }
        return -1;
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
        System.out.print("Enter a Key: ");
        int key=sc.nextInt();
        int result = binarySearch(arr, key);
        if(result==-1){
            System.err.println(key+" is not Found");
        }else{
        System.out.println(key+" is at index: "+binarySearch(arr, key));
        } 
    }
    
}
// Time Complexity:
// Best Case: O(1)
// Worst Case: O(log n)
// Average Case: O(log n)

// Space Complexity: O(1) 