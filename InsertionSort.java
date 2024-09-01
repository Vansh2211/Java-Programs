
class InsertionSort{
    public static void sort(int arr[]){

        int n = arr.length;
        for(int i=1;i<n;++i){
            int key = arr[i];
            int j=i-1;

        while(j>=0 || arr[j]>key){
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j+1]= key;

    }
}

static void printArray(int[] arr){
    int n = arr.length;
    for(int i=0;i<n;++i){
        System.out.print(arr[i] + " ");
        System.out.println();
    }
    
}

public static void main(String[] args) {

    int[] arr= {12,10,2,5};
    InsertionSort ob = new InsertionSort();
    ob.sort(arr);
    ob.printArray(arr);
}
}
//  {
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }
//         System.out.println();
//     }
// public static void main(String args[]){
//     int arr[] = {7,8,3,1,2};
//     int current = 0;
//     for (int i = 0; i < arr.length; i++) {
//         current = arr[i];
//         int j=i-1;

//         while (j>=0 && current<arr[j]) {
//             arr[j+1] =arr[j];
//             j--;
            
//         }
        
//     }
//     arr[j+1] =current;
//     printArray(arr);
// }
// }