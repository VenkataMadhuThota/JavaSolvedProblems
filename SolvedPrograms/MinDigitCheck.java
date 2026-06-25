// Question : Count numbers where min digit appears only once
// Approach : Find Minimum Digit + Frequency Counting
// Time Complexity : O(n * d)
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
      int arr[]={112,2342,568,2988,121};
      for(int i=0;i<arr.length;i++)
      {
        if(isTrue(arr[i]))
        {
          System.out.println(arr[i]);
        }
      }
    }
    public static boolean isTrue(int num)
    {
      String str=String.valueOf(num);
      int smallest=Integer.MAX_VALUE;
      for(int i=0;i<=str.length()-1;i++)
      {
        int no=Character.getNumericValue(str.charAt(i));
        if(no<smallest)
        {
          smallest=no;
        }
      }
      int count=0;
      for(int i=0;i<=str.length()-1;i++)
      {
        int no=Character.getNumericValue(str.charAt(i));
        if(smallest==no)
        {
          count++;
        }
      }
      if(count==1)
      {
        return true;
      }
      return false;
    }

}