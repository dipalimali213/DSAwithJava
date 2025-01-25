import java.util.Scanner;
public class MaxSubArraySum {
    public static void maxSubArray(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int start = i;
            for(int j=i+1;j<arr.length;j++){
                int end = j;
                currsum =0;
                for(int k = start;k<=end;k++){
                        currsum+=arr[k];
                }
                System.out.println("Current Sum: "+currsum);
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
        maxSubArray(arr);
    }
}

//Time Complexity: O(n^3)
//Space Complexity: O(n)