public class Sorting012 {
    static void sort012(int arr[],int n){
        int low = 0;
        int high = n-1;
        int mid = 0;
        int temp=0;

        while(mid<= high){
            switch (arr[mid]) {
                case 0:{
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                }

                case 1:{
                    mid++;
                    break;
                }

                case 2:{
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
                    
            }
        }
    }

    static void printArray(int arr1[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr1[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr1.length;
        sort012(arr1, n);
        printArray(arr1, n);
    }
}
