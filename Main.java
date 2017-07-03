# dd
import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])
{
int n,i=0;
System.out.print("Enter a Number:");
  Scanner sc = new Scanner(System.in);
  n = sc.nextInt();
  while(n>0)
  {
    n=n/10;
    i++;
  }
System.out.println("Number of Digits : "+i);
}
}
