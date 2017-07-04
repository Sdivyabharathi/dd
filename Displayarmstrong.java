# dd
import java.io.*;
import java.util.*;
public class Displayarmstrong
{
  public static void main(String[] args) {
    int a = 1;
    int b= 99999;
    for (int i=a;i<=b;i++) 
    {
      if (isArmstrong(i)) {
        System.out.println(i);
      } else {
        
      }
    }
  }
  public static boolean isArmstrong(int n) {
    int no_of_digits = String.valueOf(n).length();
    int sum = 0;
    int value = n;
    for (int i = 1; i <= no_of_digits; i++) {
      int digit = value % 10;
      value = value / 10;
      sum = sum + (int) Math.pow(digit, no_of_digits);
    }
    if (sum == n) {
      return true;
    } else {
      return false;
    }
  }
}
