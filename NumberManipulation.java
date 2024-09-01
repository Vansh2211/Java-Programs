// You are using Java
import java.util.*;
class NumberManipulation{
    public static int arr[] = new int[9];
    
    public static void extractDigits(int n){
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }
    
    public static void findLatDigit(int digit){
        for(int i=0;i<digit;i++){
            digit++;
        }
        for(int i=0;i<10;i++){
            int d = digit*i;
        }
        
        if(digit==9){
            digit = digit%11;
        }
    }
    
    public static void main(String args[]){
        // NumberManipulation nm = new NumberManipulation();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int digit = sc.nextInt();
        extractDigits(x);
        findLatDigit(digit);
    }
    
    
}