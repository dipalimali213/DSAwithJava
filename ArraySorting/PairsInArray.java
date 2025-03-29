import java.util.Scanner;
public class PairsInArray{
    public static void pairsInArray(int arr[],int total_pairs){
        for(int i = 0;i<arr.length;i++){
            int curr = arr[i];
            for(int j = i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+total_pairs);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_pairs = 0;
        System.out.print("Enter a size of an Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the Elements of an Array: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        pairsInArray(arr,total_pairs);
    }
}

//Time Complexity: O(n^2)
//Space Complexity: O(n)