// Count numbers where alternating sum of digits is zero
// Approach :  Array Traversal + Alternating Sum Logic
// Time Complexity : O(n)
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
      int[] arr = {0,99,5,121, 1234, 352, 3434, 5454, 9090, 1111, 2468}; 
      for(int i=0;i<arr.length;i++)
      {
        boolean value=isSumZero(arr[i]);
        if(value)
        {
          System.out.println(arr[i]);
        }
      }
    }
    public static boolean isSumZero(int num)
    {
      String str=String.valueOf(num);
      int size=str.length();
      int total=0;
      for(int i=0;i<size;i++)
      {
        if(i%2==0)
          total=total+Character.getNumericValue(str.charAt(i));
        else
          total=total-Character.getNumericValue(str.charAt(i));
      }
      if(total==0)
        return true;
      else
        return false;
    }
}