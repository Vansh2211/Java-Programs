public class SwapWithoutTemp {
    
    public static void main(String[] args) {
        
        String a = "Hello";
        String b = "Vansh";

        a = a+b;
        b = a.substring(0, a.length()-b.length());

        a = a.substring(b.length());

        System.out.println(a + " "+  b);
    }
}
