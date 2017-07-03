# dd
import java.io.*;
import java.util.*;
public class Sum
{
  public static void main(String args[])
  {
    int n,sum=0;
    int i=0;
    System.out.println("Enter Number of items :");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(;i<=n;)
    {
      sum=sum+i;
      i++;
    }
    System.out.println("Sum of "+n+" numbers is :"+sum);
  }
}

