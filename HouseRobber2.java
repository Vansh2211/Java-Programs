class HouseRobber2 {
    public int rob(int[] nums){
        int n = nums.length;

        if(n<2){
            return nums[0];
        }

        int[] skipLastElement = new int[n-1];
        int[] skipFirstElement = new int[n-1];

        for(int i=0;i<n-1;i++){
            skipLastElement[i] = nums[i];
            skipFirstElement[i] = nums[i+1];
        }

        int lootSkippingLast = robHelper(skipLastElement);
        int lootSkippingFirst = robHelper(skipFirstElement);

        return Math.max(lootSkippingLast, lootSkippingFirst);
    }

    private int robHelper(int nums[]){
        int n = nums.length;
        if(n<2){
            return nums[0];
        }

        int[] dp = new int[n];

        dp[0] = nums[0]; // Rob the first house
        dp[1] = Math.max(nums[0], nums[1]); // Max of robbing first or second house

        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        
        }

        return dp[n-1]; 
    }

    public static void main(String[] args) {
        HouseRobber2 robber = new HouseRobber2();
        int[] nums = {2, 7, 3, 1,4,2,1,8}; // Example input
        int result = robber.rob(nums);
        System.out.println("Maximum amount that can be robbed: " + result);
    }
}