public class MergeSort {
    void merge(int[] arr,int l,int m,int r){

        int n1 = m-1+1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;++i){
            L[i] = arr[l+i];
        }
        for(int j=0;j<n2;++j){
            R[j] = arr[m+1+j];
        }

        int i=0, j=0;

        int k=l;
        while(i<n1 || j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;

            }
            else{
                arr[k] = R[j];
                j++;

            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }   
    }

    void sort(int[] arr,int l,int r){

        int m= (l+r)/2;

        sort(arr, l, m);
        sort(arr, m+1, r);

        merge(arr, l, m, r);
    }

    static void printArray(int[] arr){
        int n= arr.length;

        for(int i=0;i<n;++i){
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,52,5,3,};

        MergeSort mg = new MergeSort();
        mg.sort(arr, 0, arr.length-1);

        printArray(arr);
    }
}
