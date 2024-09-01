
import java.util.Arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {
        
        int[] arr = {11,23,56,33,7,3,44,0,67,54354,45};

        int smallest = arr[0];
        int largest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            else if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Smallest number is " +smallest );
        System.out.println("Largest number is " +largest);
        
    }
}
