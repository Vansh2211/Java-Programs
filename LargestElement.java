import java.util.*;
public class LargestElement {

    
    static int largest(){

        Scanner sc = new Scanner(System.in);
        int arr[] = {23,45,11,67,88,24,4566,100};

        int large = arr[0];

        for(int i =1;i<arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }

        }
        return large;
    }

    public static void main(String[] args) {
        System.out.println(largest());
    }
}
