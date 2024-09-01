public class ReverseInteger {
    public static void main(String[] args) {
        
        int n = 12345;
        int rev = 0;

        while(n!=0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        System.out.println("Reverse int is:" + rev);
    }

    // static int RevInt(int a){

    //     int rev = 0;

    //     System.out.println(RevInt(rev*10+a%10));
    //     return 0;
    // }
}
