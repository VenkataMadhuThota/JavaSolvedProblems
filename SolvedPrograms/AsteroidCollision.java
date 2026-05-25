// Problem : Asteroid Collision
// Approach : Brute Force
// Time Complexity : O(n²)
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
      int[] arr = {4, -20, -3, -10, 6, -2, 15};
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]<0)
        {
          int pos=-arr[i];
          for(int j=i-1;j>=0;j--)
          {
            if (arr[j] == 0) continue;
            if (arr[j] > 0) 
            {
              if(arr[j]<pos)
              {
                arr[j]=0; 
                continue;
              }
              else if(arr[j]>pos)
              {
                arr[i]=0; 
                break;
              }
              else
              {
                arr[j]=0; arr[i]=0; break;
              }
            }
          }
        }
      }
       for(int a : arr)
        {
          if(a!=0)
          {
            System.out.print(a+" ");
          }
        }
    }
}