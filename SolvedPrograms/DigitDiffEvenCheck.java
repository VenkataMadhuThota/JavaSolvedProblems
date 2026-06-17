// Question : Print numbers where difference between max digit and min digit is even
// Approach : Digit Traversal + Max-Min Extraction + Condition Check
// Time Complexity : O(n * d)
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
      int arr[]={3326,2453,2469,6213,5486};
      for(int i=0;i<arr.length;i++)
      {
        int arr1[]=getMaxMin(arr[i]);
        int value=Math.abs(arr1[0]-arr1[1]);
        if(value%2==0)
        {
          System.out.println(arr[i]);
        }
      }
    }
    public static int[] getMaxMin(int num)
      {
        int max=Integer.MIN_VALUE; int min=Integer.MAX_VALUE;
        String str=String.valueOf(num);
        for(int i=0;i<str.length();i++)
        {
          int a=Character.getNumericValue(str.charAt(i));
          if(a>max)
          {
            max=a;
          }
          if(a<min)
          {
            min=a;
          }
        }
        return new int[]{max,min};
      }
}