# dd
import java.io.*;
import java.util.*;
public class Power
{
public static void main(String args[])
{
int a,b;
double num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
a=sc.nextInt();
System.out.println("Enter the power of number");
b=sc.nextInt();
num=Math.pow(a,b);
System.out.println(num);
}
}
