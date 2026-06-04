import java.util.*;
// Count the numbers whose highest digit is repeated at least 2 times in it.
// Approach : Brute force
// Time Complexity : O(n*d)
public class Main 
{
    public static void main(String[] args) 
    {
      int arr[]={1289,9981,4556,7772,1100,1,11,0}; int count=0;
      for(int i=0;i<arr.length;i++)
      {
        boolean value=repeatedDigit(arr[i]);
        if(value)
        {
          count++;
        }
      }
      System.out.println(count);
    }
    public static boolean repeatedDigit(int no)
    {
      int largest=0; int c=0;
      String str=String.valueOf(no);
      for(int i=0;i<str.length();i++)
      {
        int a=Character.getNumericValue(str.charAt(i));
        if(a>largest)
        {
          largest=a;
        }
      }
      for(int i=0;i<str.length();i++)
      {
        int digit=Character.getNumericValue(str.charAt(i));
        if(digit==largest)
        {
          c++;
        }
      }
      if(c>=2)
      {
        return true;
      }
      return false;
    }
}