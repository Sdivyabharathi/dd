# dd
import java.io.*;
import java.util.*;
public class Natural
{
public static void main(String args[])
{
int n,sum=0;
int i=0;
System.out.println("Enter Number of items :");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(i<=n)
{
sum=sum+i;
i++;
}
 System.out.println("Sum of "+n+" numbers is :"+sum);
 }
 }

