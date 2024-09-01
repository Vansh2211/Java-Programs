
public class LongestCommonSubsequence {

    static int lcs(String s1,String s2,int m,int n){

        if(m==0 || n==0){
            return 0;
        }
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1 + lcs(s1, s2, m-1, n-1);
        }
        else{
            return Math.max(lcs(s1, s2, m-1, n),lcs(s1, s2, m, n-1));
        }
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int m = s1.length();
        int n = s2.length();

        System.out.println("Answer is: " + lcs(s1, s2, m, n));

    }
}
    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String s1 = sc.next();
//         String s2 = sc.next();

//         int dp[][] = new int[s1.length()+1][s2.length()+1];
//         for(int i=dp.length-2;i>=0;i--){
//             for(int j=dp[0].length-2;j>=0;j--){
//                 if(s1.charAt(i)==s2.charAt(j)){
//                     dp[i][j] =  1+dp[i+1][j+1];
//                 }
//                 else{
//                     dp[i][j] =  Math.max(dp[i+1][j],dp[i][j+1]);
//                 }
//             }
//         }

//         System.out.println(dp[0][0]);
//     }
//}



