import java.util.*;
public class SumOfEevenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;

        while(n>0){
            int digit = n%10;

            if(digit%2 == 0){
                even = even +1;
            }
            else{
                odd = odd+1;
            }

            n /= 10;

        }
        System.out.println("Odd sum is " + odd);
        System.out.println("Even sum is " + even);
    }
}
