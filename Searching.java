import java.util.*;
/**
 * Searching
 */
public class Searching {
public static void main(String[] args) {
    int key;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter array elements");
    for (int i = 0; i < n; i++) 
        a[i] = s.nextInt();

    System.out.println("Enter Key you want to search");
    key = s.nextInt();
    int found =0;
    for (int  x : a) {
        if(x==key){
            found =1;
            break;
        }
    }
    if(found==1){
        System.out.println("Value found");
    }
    else
    System.out.println("Value not found");  

    }
}
