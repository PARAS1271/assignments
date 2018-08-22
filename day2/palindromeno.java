import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
int x,temp,rem,p=0;
Scanner sc=new Scanner(System.in);
x= sc.nextInt();
temp=x;
while(n>0)
{
rem=n%10;
p=p*10+rem;
n=n/10;
}
if(temp==p)
{
System.out.println("no is palindrome");
}
else
{
System.out.println("no is not palindrome");
}
}
}
