import java.util.HashSet;

public class CheckIfSumPairExist {
    
    static boolean checkPair(int arr[],int target){

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){

            int complement = target-arr[i];

            if(set.contains(complement)){
                return true;
            }

            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,-1-2,3};
        int target = 8;

        System.out.println(checkPair(arr, target));
    }
}
