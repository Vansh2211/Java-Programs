import java.util.*;


public class PairWithGivenSum {
    

    static boolean PairWithGivenSum(int arr[],int target) {

        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;

        for(int i=0;i<n;i++){

            int complement = target - arr[i];

            if(set.contains(complement)){
                return true;
            }
            set.add(arr[i]);
            
        }

        return false;

    }

    

        public static void main(String[] args){
            int arr[]  = {0,-1,2,-3,1};
            int target = -2;

            System.out.println(PairWithGivenSum(arr, target));
        }
    }

