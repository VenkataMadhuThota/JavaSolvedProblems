// Question : Check whether an array is palindrome
// Approach : Reverse Array Construction + Element-wise Comparison
// Time Complexity : O(n)
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
      int arr[]={1,2,3,2,1,0};
      int arr1[]=new int[arr.length];
      int s=0;
      for(int i=arr1.length-1;i>=0;i--)
      {
        arr1[i]=arr[s];
        s++;
      }
      boolean isValid=true;
      for(int j=0;j<arr.length;j++)
      {
          if(arr[j]!=arr1[j])
          {
            isValid=false;
            break;
          }
      }
      if(isValid)
        System.out.println("palindrome array");
      else
        System.out.println("Not a palindrome array");
    }
}