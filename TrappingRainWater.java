public class TrappingRainWater {
    static int trap(int[] height) {
        int n  = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int water = 0;

        left[0] = height[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],height[i]);
        }

        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],height[i]);
        }

        for(int i=0;i<n;i++){
            water += Math.min(left[i],right[i]) - height[i];
        }
        return water;
    }

    public static void main(String[] args) {
        int height[] = {3,0,1,0,4,0,2};
        System.out.println(trap(height));
    }
}
