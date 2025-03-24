import java.util.Scanner;
public class SubArray {
    public static void subArray(int arr[]){
        int total_sub_array = 0;
        for(int i = 0;i<arr.length;i++){
            int start = i;
            for(int j=i+1;j<arr.length;j++){
                int end = j;
                for(int k = start;k<end;k++){
                    System.out.print("["+arr[k]+"]");
                }
                System.out.println();
                total_sub_array++;
            }
            System.out.println();
        }
        System.out.println("Total SubArray : "+total_sub_array);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of an Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the Elements of an Array: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        subArray(arr);
    }
    
}

//Time Complexity: O(n^3)
//Space Complexity: O(n)