
import java.util.Arrays;

public class EqualArray{
    public static void main(String[] args) {
        int a[] = {10,20,30};
        int b[] = {10,30,30};


        boolean result = Arrays.equals(a,b);
        if(result==true){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

         
}
}