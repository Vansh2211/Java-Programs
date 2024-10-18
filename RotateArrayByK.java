public class RotateArrayByK {
    static void rotateArrayByK(int nums[],int k){
        k %= nums.length; // Step 1: Normalize k
        reverse(nums, 0, nums.length - 1); // Step 2: Reverse the entire array
        reverse(nums, 0, k - 1); // Step 3: Reverse the first k elements
        reverse(nums, k, nums.length - 1); // Step 4: Reverse the remaining elements
    }

    static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArrayByK(nums, k);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
