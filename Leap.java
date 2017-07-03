# dd
import java.io.*;
import java.util.*;
public class Leap
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if((n%400==0)||(n%4==0))
{
System.out.println("leapyear");
}
else
{
System.out.println("not a leapyear");
}
}
}
