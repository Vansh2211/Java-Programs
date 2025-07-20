public class HouseRobber{

    public int rob(int nums[]){
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

        return dp[n-1]; // Return the maximum amount that can be robbed
    }


public static void main(String[] args) {
    
    HouseRobber robber = new HouseRobber();
    int[] nums = {2, 7, 9, 3, 1}; // Example input
    int result = robber.rob(nums);
    
    System.out.println("Maximum amount that can be robbed: " + result);
}
}



