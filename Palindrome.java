class Palindrome{

    public static boolean checkPalindrome(String s){
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args) {
        String vansh = "Able was I, ere I saw Elba";
        String jalaj= "JalaJ";
        // System.out.println(checkPalindrome(jalaj));
        System.out.println(checkPalindrome(vansh));
}
}
// {
// public static void main(String args[])
// {
// Scanner s=new Scanner(System.in);
// System.out.println(" Enter a number");
// intnum=s.nextInt();
// int num1=num;
// int rev=0;
// while(num1>0)
// {
// int digit=num1%10;
// rev=rev*10+digit;
// num1=num1/10;
// }
// if(rev==num)
// System.out.println("The entered number "+num+ " is a palindrome");
// else
// System.out.println("The entered number "+num+ " is not a palindrome");
// }
// }