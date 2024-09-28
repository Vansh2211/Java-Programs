import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        while(n*n <= m){
            if(n*n == m){
                System.out.println("perfect square");
            }
            else{
                System.out.println("not a perfect square");
            }
            n++;
        }
        

    }
}
