public class MinimumElement {
    
    static int findMin(int arr[]){

        int low = 0;
        int high = arr.length-1;

        while(low<=high){

            if(arr[low]<arr[high]){
                return arr[low];
            }

            int mid =(low+high)/2;

            if(arr[mid] > arr[high]){
                low = mid +1;
            }

            else{
                high = mid;
            }
        }
        return arr[low];
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,2,6,5,7,6,7,1};
        System.out.println(findMin(arr));
    }
}
