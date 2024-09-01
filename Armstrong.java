import java.util.*;

public class Armstrong {
    
    public void isArmstrong(int num){
        int cube = 0;
        int rem;
        int temp;

        temp=num;
        while(num>0){
            rem = num%10;
            num = num/10;
            cube = cube + (rem*rem*rem);
        }

        if(temp==cube){
            System.out.println("it is armstrong");
        }
        else{
            System.out.println("it is not armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Armstrong arm = new Armstrong();
        arm.isArmstrong(num);
    }
}
