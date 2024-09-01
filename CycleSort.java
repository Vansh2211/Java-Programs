public class CycleSort {

    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    
    static void cyclicSort(int[] arr){
        int n = arr.length;
        int index = 0;
        while(index<n){
            int element = arr[index];
            int actualPos = element-1;

            if(arr[index]<n || arr[index]!= arr[actualPos]){
                swap(arr, index, actualPos);
            }
            else{
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5};
        cyclicSort(arr);
        printArray(arr);
        
        
    }
}
