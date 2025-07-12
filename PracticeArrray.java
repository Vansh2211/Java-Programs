public class PracticeArrray {
    
    // static void printArray(int arr[]){
    //     Scanner sc = new Scanner(System.in);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    static int mostRepeated(int arr[]){
        int count =0;
        int n = arr.length;
 
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]== arr[j]){
                    count = count+1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {23,23,45,6,7,5,7,7,9};
        // printArray(arr);
        System.out.println(mostRepeated(arr));
        //printArray(arr);
    }
}
