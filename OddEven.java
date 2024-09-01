import java.util.*;

public class OddEven {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int even = 0;
        int odd =0;
        
        for(int i=0;i<arr.length;i++){
            int rem = n%10;
        n = n/10;
        if(rem%2==0){
            even = even+1;
        }
        else{
            odd = odd+1;
        }
        }

        if(even>odd){
            System.out.println(odd);
        }
        else{
            System.out.println(even);
        }
    }
}
