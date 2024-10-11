public class QuicksortNew {

    public static void swap(int[] arr, int low, int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }


    public static int partition(int arr[],int low, int high){
        int pivot = arr[high];
        int i = (low -1);

        for(int j=low; j<=high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
                
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }

    public static void quicksort(int arr[],int low, int high){
        if(low>high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3,4,6,5};

        int N = arr.length;

        quicksort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }

    private static void quickSort(int[] arr, int low, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
