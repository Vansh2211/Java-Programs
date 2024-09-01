import java.util.*;
public class Sorting{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of elements ");
        int n = s.nextInt();
        int a[]= new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            
        }

        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {
                if(a[i]>a[j]){

                    int temp = a[i];
                    a[i] =a[j];
                    a[j] = temp;
                }
                
            }
        }
        System.out.println("Ascending order");
        for (int i = 0; i < n-1; i++) {
            System.out.println(a[i]+",");
            
        }
        System.out.print(a[n-1]);




    }
}