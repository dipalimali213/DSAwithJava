import java.util.Scanner;
public class MaxSubArrayPrefix {
    public static void maxSubArray(int arr[],int size){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[size]; 
        prefix[0] =  arr[0];
        for(int i =1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i = 0;i<arr.length;i++){
            int start = i;
            for(int j=i+1;j<arr.length;j++){
                int end = j;
                currsum = (start==0)? prefix[end]: prefix[end]-prefix[start-1];
                if (maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max Sum in SubArray : "+maxsum);
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
        maxSubArray(arr,size);
    }
}

//Time Complexity: O(n^2)
//Space Complexity: O(n)