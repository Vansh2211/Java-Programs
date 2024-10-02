import java.util.*;
public class CoinChangeCOMBINATION {
    public static void main(String[] args) {
        
        // we have given an array and an specific amount,
        // we have to find number of combinations not permutations
        // eg. {2,3,5} and amount = 7 
        // so combinations are - 223,25
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
       

        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter amount");
        int amount = sc.nextInt();

        int dp[] = new int[amount+1];
        dp[0] = 1;

        for(int i=0;i<arr.length;i++){
            for(int j=arr[i];j<dp.length;j++){
                dp[j] += dp[j-arr[i]];
            }
        }
        System.out.println("Number of combinations are:" +dp[amount]);
    }
}
