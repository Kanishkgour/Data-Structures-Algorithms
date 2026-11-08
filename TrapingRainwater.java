import java.util.*;

public class TrapingRainwater {

    public static int rainwater(int height[]) {
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        int waterLevel[] = new int[height.length];
        int trapdWater = 0;

        // calculate Left Max Boundry
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate Right Max Boundry
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Loop
        for (int m = 0; m < height.length; m++) {
            // Calculate Watr Level
            waterLevel[m] = Math.min(leftMax[m], rightMax[m]);

            // calculate traped water
            trapdWater += waterLevel[m] - height[m];
        }
        return trapdWater;

        // To Print LeftMax and RightMax Boundry
        // System.out.println("LeftMax: [");
        // for (int i = 0; i < height.length; i++) {
        // System.out.print("," + leftMax[i]);
        // }
        // System.out.println("]");
        // System.out.println("RightMax: [");
        // for (int i = 0; i < height.length; i++) {
        // System.out.print("," + rightMax[i]);
        // }
        // System.out.println("]");
    }

    public static void main(String[] args) {
        // int height[] = { 4, 1, 7, 3, 4, 7, 5, 2, 6 };
        int height[] = { 1, 2, 1, 4, 2, 3, 1, 3, 4 };
        int result = rainwater(height);
        System.out.println(result);
    }

}
