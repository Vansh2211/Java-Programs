import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<=n;i++){
            if(i==0){
                System.out.println("0");
            }
            else if(i%2==0){
                System.out.println("it is prime number");
            }
            else{
                System.out.println("not a valid number");
            }
        }
    }
}
