
import java.util.Arrays;

public class RemoveAllOccureneces {
    
    public static int[] removeOccurence(int[] arr,int key){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != key){
                arr[index++] = arr[i];
            }
        }

        return Arrays.copyOf(arr, index);
    }

    public static void main(String[] args) {
         int arr[] = {1,2,3,3,3,4,5,6,7,8,9,9,0,0};
         int key = 3;

         arr = removeOccurence(arr, key);
         System.out.println(arr.toString());
    }
}
