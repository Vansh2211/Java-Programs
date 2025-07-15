// LeetCode Problem: Find Minimum in Rotated Sorted Array
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class MinimumInRotatedSorted {
    public int findMin(int[] arr) {
        int ans  = Integer.MAX_VALUE;

        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[low]<=arr[mid]){
                ans = Math.min(ans,arr[low]);
                low = mid+1;
            }
            else{
                ans = Math.min(ans,arr[mid]);
                high = mid-1;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        MinimumInRotatedSorted min = new MinimumInRotatedSorted();
        int[] arr = {4, 5, 6, 7, 0, 1, 2}; // Example input
        int result = min.findMin(arr);

        System.out.println("Minimumm is:" + result);
    }
}
