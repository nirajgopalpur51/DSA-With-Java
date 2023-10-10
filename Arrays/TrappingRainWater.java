package Github;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int left = 0,
                right = height.length - 1;
        int leftMax = height[0],
                rightMax = height[height.length - 1];
        int water = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                if (leftMax < height[left]) leftMax = height[left];
                else water += leftMax - height[left];

            } else {
                right--;
                if (rightMax < height[right]) rightMax = height[right];
                else water += rightMax - height[right];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}
