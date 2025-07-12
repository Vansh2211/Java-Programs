// Given an array of integers nums and an integer target, 
// return indices of the two numbers such that they add up to target.

import java.util.HashMap;
import java.util.Map;


public class TwoSumLeetcode {
    
   public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                int index = map.get(diff);

                res[0] = i;
                res[1] = index;
            }
            else{
            map.put(nums[i],i);
        }

        }

        return res;
    }

    public static void main(String[] args){
        int arr[] = {2,7,11,15};
        int target = 9;
        TwoSumLeetcode ts = new TwoSumLeetcode();
        int[] result = ts.twoSum(arr, target);
        System.out.println("Indices of the two numbers that add up to " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}
