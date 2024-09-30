public class MaximumCoinGame{

    static long countMax(int arr[],int n){
        long sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        long dp[][] = new long[n][n];
        return calculate(arr, 0, n-1, dp, sum); 
    }

    static long calculate(int arr[],int start,int end,long dp[][],long sum){
        if(start>end || arr.length==0 || start>arr.length-1 || end<start){
            return 0;
        }
        if(start==end){
            dp[start][end] = arr[start];
            return dp[start][end];
        }
        else{
            if(dp[start][end] == 0){
                dp[start][end] = sum- Math.min(calculate(arr, start+1, end, dp,sum-arr[start]),
                calculate(arr, start,end-1, dp, sum-arr[end]));
            }
            return dp[start][end];
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,7,10};
        int n = arr.length;
        System.out.println(countMax(arr, n));
    }
}