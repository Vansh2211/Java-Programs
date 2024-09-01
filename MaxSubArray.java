public class MaxSubArray {
    
    public static int maximumsubArray(int arr[]){
        int maxSoFar = Integer.MIN_VALUE;
        int maxEnding = 0;

        for(int i=0;i<arr.length;i++){
            maxEnding += arr[i];
            maxSoFar = Math.max(maxSoFar,maxEnding);

            //maxEnding = Math.max(maxEnding,0);

        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int arr[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("answer is" + maximumsubArray(arr));
    }


}
