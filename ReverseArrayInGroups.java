public class ReverseArrayInGroups {
// Examples: 

// Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], K = 3 
// Output: 3, 2, 1, 6, 5, 4, 9, 8, 7

// Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], K = 5 
// Output: 5, 4, 3, 2, 1, 8, 7, 6

       static void reverse(int arr[],int n,int k){
        for(int i=0;i<n;i+=k){
            int left =i;

            int right = Math.min(i+k-1,n-1);
            int temp;

            while(left<right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left += 1;
                right -= 1;
            }
        }
       }

       public static void main(String[] args) {
           int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
           int k=3;
           int n = arr.length;

           reverse(arr, n, k);

           for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
           }
       }
}
