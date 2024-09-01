public class Swap {
    public static void main(String[] args){
       int a = 10;
       int b = 20;
       System.out.println("a is" + a + "b is" + b);


       int temp = a;
        a = b;
        b = temp;

        System.out.println(" after swap a is " + a + " after swap b is " + b);
    }
}
