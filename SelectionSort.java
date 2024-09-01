 /**
  * SelectionSort
//   */
//  public class SelectionSort {
 
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }
//     }
//  public static void main(String[] args) {
//         int arr[] = {7,8,3,1,2};

//         for(int i=0;i<arr.length-1;i++){
//             int smallest = i;
//             for(int j=i+1; j<arr.length;j++){
//                 if(arr[smallest]>arr[j]){
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i]= temp;
//         }
//         printArray(arr);
//     }
//  }

public class SelectionSort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.err.println(arr[i] + "");
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,3,4,7,0,5};

        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        printArray(arr);

    }
}