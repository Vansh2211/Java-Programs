class Solution {
    static int lis(int arr[]) {
        // code here
        int n = arr.length;
        
        int[] dp = new int[n];
        
        int orgMax = 0;
        dp[0] = 1;
        
        for(int i=0;i<dp.length;i++){
            
            int max = 0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    if(dp[j]>max){
                        max = dp[j];
                    }
                }
            }
            dp[i] = max+1;
            
           orgMax = Math.max(orgMax,dp[i]);
        }
        
        
        return orgMax;
        
    }
}
