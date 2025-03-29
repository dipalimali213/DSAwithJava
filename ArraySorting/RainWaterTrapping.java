import java.util.*;
public class RainWaterTrapping {
    public static int trappedRainWater(int heights[], int size) {
        int leftmax[] = new int[size];
        leftmax[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            leftmax[i] = Math.max(heights[i], leftmax[i - 1]);
        }
        int rightmax[] = new int[size];
        rightmax[size - 1] = heights[size - 1]; 
        for (int i = size - 2; i >= 0; i--) {
            rightmax[i] = Math.max(heights[i], rightmax[i + 1]);
        }
        int trapwater = 0;
        for (int i = 0; i < size; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater += waterlevel - heights[i];
        }
        return trapwater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of bars: ");
        int size = sc.nextInt();
        int heights[] = new int[size];
        System.out.println("Enter bar values: ");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println("Trapped Rainwater: " + trappedRainWater(heights, size));
        sc.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)