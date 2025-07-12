import java.util.*;

public class LongestSubstringNonRepeating {
    
    public int lengthOfLongestSubstring(String s){
        int n= s.length();

        Set<Character> set = new HashSet<>();
        int left =0;
        int right = 0;
        int maxLength = 0;


        while(right<n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

        public static void main(String[] args){
            String s = "abcabcab";
            LongestSubstringNonRepeating L= new LongestSubstringNonRepeating();
            int result = L.lengthOfLongestSubstring(s);
            System.out.println("max length = " + result);
        }

    }

