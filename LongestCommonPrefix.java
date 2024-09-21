import java.util.*;
class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix prefix=new LongestCommonPrefix();
        String[] str = {"flower","flow","flight"};
        prefix.longestCommonPrefix(str);
        //System.out.println();   
    }
}
