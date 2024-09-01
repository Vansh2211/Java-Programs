import java.util.Scanner;
class Duck1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println(" Enter a number");
String num=s.nextLine();
char ch;
int c=0;
int l=num.length();
for(int i=0;i<l;i++)
{
ch=num.charAt(i);
if(ch=='0')
c++;
}
char f=num.charAt(0);
System.out.println("No of zeros in "+num+"is"+c);
if(c>0 && f!='0')
System.out.println(num+ " is a duck number");
else
System.out.println(num+ " is a not duck number");
}
}