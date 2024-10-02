import java.util.*;

public class Armstrong {
    
    static boolean isArmstrong(int num){
        int digits = 0;
        int last = 0;
        int temp;
        int sum = 0;

        temp=num;
        while(temp>0){
             temp = temp/10;
             digits++;
        }

        temp = num;
        while(temp>0){
            last = temp%10;
            sum += (Math.pow(last, digits));
            temp= temp/10;
        }
        

        if(num==sum){
            return true;
        }
        else{
            return false;
        }

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isArmstrong(1634));
    }
}
