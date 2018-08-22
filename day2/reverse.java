import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
int rem,a,r=0;
Scanner sc= new Scanner(System.in);
a= sc.nextInt();
while(a>0)
{
rem=a%10;
r=r*10+rem;
a=a/10;
}
System.out.println(r);
}
}

