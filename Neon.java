import java.util.Scanner;
class Neon
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println(" Enter a number");
int orinum=s.nextInt();
int num=orinum*orinum;
int sum=0;
while(num!=0)
{
int n1=num%10;
sum=sum+n1;
num=num/10;
}
if(orinum==sum)
System.out.println(orinum+ " is a neon number");
else
System.out.println(orinum+ " is a not neon number");
}
}