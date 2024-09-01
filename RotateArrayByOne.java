import java.io.IOException;
import java.util.Scanner;
public class RotateArrayByOne{
    // public void rotate(int[] arr){

    //     int op[] = new int[arr.length];
    //     op[0] = arr[arr.length-1];
    //     for(int i=0;i<arr.length;i++){
    //         op[i] = arr[i-1];
    //     }
    //     for(int j=0;j<arr.length;j++){
    //         op[j] = arr[j];
    //     }
    //     rotate(arr);


    // }
    public static void main(String[] args) throws IOException {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int op[] = new int[arr.length];
        op[0] = arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            op[i] = arr[i-1];
        }
        for(int j=0;j<arr.length;j++){
            op[j] = arr[j];
        }
        System.out.println(arr);
    }
}
