import java.util.Scanner;
public class ReverseArray {
    public static void reverseArray(int arr[]){
        int first = 0;
        int end = arr.length-1;
        while(first<end){
            int temp=arr[first];
            arr[first]=arr[end];
            arr[end]=temp;
            first++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of an Array: ");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter a Elements of an Array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1) 