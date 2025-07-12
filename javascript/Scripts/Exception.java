public class Exception1 {
 public static void main(String[] args) {
        try {
            int[] myNumbers = {1,2,3,4,5};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong");
        }
    }
}
