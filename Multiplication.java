# dd
import java.io.*;
import java.util.*;
public class Multiplication
{
     public static void main(String args[])
{
    int num, i, c;
  Scanner scan = new Scanner(System.in);
    
  System.out.print("Enter a Number : ");
  num = scan.nextInt();
    
  System.out.print("Table of " + num + " is\n");
  for(i=1; i<=10; i++)
  {
      c= num*i;
      System.out.print(num + " * " + i + " = " + c + "\n");
  }
}
}
