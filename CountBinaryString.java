import java.util.*;
public class CountBinaryString {
    public static void main(String[] args) {
        // Binary string with no consecutive zeroes
        //we are working on two dp arrays dp0 and dp1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dp0[] = new int[n+1];
        int dp1[] = new int[n+1];

        dp0[1] = 1;
        dp1[1] = 1;

        for(int i=2;i<=n;i++){
            dp1[i] = dp1[i-1] + dp0[i-1];
            dp0[i] = dp1[i-1];
        }
        System.out.println(dp0[n] + dp1[n]);
    }
}
