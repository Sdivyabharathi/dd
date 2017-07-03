# dd
import java.io.*;
import java.util.*;
public class Alphabet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch1;
ch1=sc.next().charAt(0);
if((ch1>='a')&&(ch1>='z')||(ch1>='A')&&(ch1>='Z'))
{
System.out.println("alphabet");
}
else
{
System.out.println("not");
}
}
}
