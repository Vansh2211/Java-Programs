
import java.util.Arrays;

public class MajorityElement {
    
    public static int majorityElement(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j= 0;
        int max = 0;
        int ans = -1;

        while(j<=n){
            if(arr[j] == arr[i]){
                int x = arr[i];
                if(max >= j-i+1){
                    max = j-i+1;
                    ans = x;

                }
                j++;
            }
            else{
                i=j;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        
        int[] arr = {2,3,4,4,4,5,6,7,6,6,5,8};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        // MajorityElement mj = new MajorityElement();
        System.out.println(majorityElement(arr));
        
        
    }
}
