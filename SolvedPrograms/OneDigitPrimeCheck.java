// Print numbers where exactly one digit is prime
// Approach : String Traversal + Prime Digit Counting
// Time Complexity : O(n)
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
      int[] arr = {122,31,2,0,313,456,552,9,0 ,1};
      for(int i=0;i<arr.length;i++)
      {
        boolean value=checkValid(arr[i]);
        if(value)
        {
          System.out.println(arr[i]);
        }
      }
    }
    public static boolean checkValid(int num)
    {
      String str=String.valueOf(num);
      int size=str.length(); int c=0;
      for(int i=0;i<size;i++)
      {
          int a=Character.getNumericValue(str.charAt(i));
          if(isPrime(a))
          {
            c++;
          }
      }
      return c==1;
    }
    public static boolean isPrime(int no)
    {
      if(no < 2)
      {
        return false;
      }
      for(int i=2;i<no;i++)
      {
        if(no%i==0)
        {
            return false;
        }
      }
      return true;
    }
}