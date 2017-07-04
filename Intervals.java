# dd
import java.io.*;
import java.util.*;
public class Intervals
{
  public static void main(String args[])
  {
    int a,b,i,j,flag=0;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    for(i=a;i<=b;i++)
    {
      for(j=2;j<i;j++)
      {
        if(i%j==0)
        {
          flag=0;
          break;
          }
          else
          {
            flag=1;
            }
          
          }
          if(flag==1)
          {
            
            System.out.println(i);
            }
            }
            }
            }




