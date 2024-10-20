import java.util.Arrays;

public class SquareOfSortedArray {
    static int[] squareOfSortedArray(int nums[]){

        int n = nums.length;
        int result[] = new int[n];
        int left = 0,right=n-1;
        int index = n-1;

        while(index>=0){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[index--] = nums[left]*nums[left];
                left++;
            }
            else{
                result[index--] = nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        int answer[] = squareOfSortedArray(nums);
        System.out.println(Arrays.toString(answer));

    }
}
