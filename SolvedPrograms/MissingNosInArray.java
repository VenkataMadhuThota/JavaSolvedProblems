// Problem : Find all missing numbers in an array from 1 to maximum element.
// Approach : Brute Force Frequency Counting
// Time Complexity : O(m * n)
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
      int arr[]={35,1,25,45,2};
      Arrays.sort(arr);
      for(int k=1;k<arr[arr.length-1];k++)
      {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==k)
          {
            count++;
          }
        }
        if(count==0)
        {
          System.out.print(k+" ");
        }
      }
      
    }
}