import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
{
int y;
System.out.println("Enter  Year");
Scanner sc= new Scanner(System.in);
y= sc.nextInt();
if(y%4==0&&y%100==||y%400==0)
{
System.out.println("This is a Leap year");
}
else
{
System.out.println("is not a Leap year");
}
}
}



