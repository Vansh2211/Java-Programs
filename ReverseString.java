public class ReverseString {
    public static void main(String[] args) {
        
        String str = "Vansh";
        String nstr = "";
        char ch;

        for(int i=0;i<str.length();i++){

            ch = str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed string is " + nstr);

        // 2nd method
        // StringBuffer sf = new StringBuffer(str);
        // System.out.println(sf.reverse());
    }
}
