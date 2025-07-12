import java.util.HashSet;
import java.util.Set;

class HappyNumber {
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet<>();

        while(true){

            int sum = 0;
            while(n!=0){
                sum += Math.pow(n % 10,2.0);
                n = n/10;
            }

            if(sum == 1){
                return true;
            }
            
            n = sum;

            if(set.contains(n)){
                return false;
            }
            set.add(n);            
        }
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        int n = 19; // Example input
        boolean result = happyNumber.isHappy(n);
        System.out.println("Is " + n + " a happy number? answer : " + result);
    }
}