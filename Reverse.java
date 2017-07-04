# dd
import java.io.*;
import java.util.*;
public class Reverse
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);  
    String str =""; 
    str=sc.nextLine();
    char[] strArray = str.toCharArray();

    for (int i = strArray.length - 1; i >= 0; i--)
    {
  	System.out.print(strArray[i]);
  	}
   }
   } 	
  
