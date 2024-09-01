
public class ReverseArray{

    static void reverseArray(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {14,3,2,5,6};
        reverseArray(arr);
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter size of array");
    // int n = sc.nextInt();
    // int[] array =  new int[n];
    // for(int i=array.length-1;i>=0;i--){
    //     System.out.print(array[i] + " ");
    // }
    }
}
