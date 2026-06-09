// Count numbers where first half digits sum equals second half digits sum
// Approach : String Traversal + Half Partition Sum Comparison
// Time Complexity : O(n)
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
      int arr[] = {11,636, 1212, 3434, 9090,  1111, 2222, 1233};
      for(int i=0;i<arr.length;i++)
      {
        if(isSumEqual(arr[i]))
        {
          System.out.println(arr[i]);
        }
      }
    }
    public static boolean isSumEqual(int num)
    {
      String str=String.valueOf(num);
      int size=str.length();
      if(size>=4 && size%2==0)
      {
        int fhSum=0; int lhSum=0;
        for(int i=0;i<size/2;i++)
        {
          fhSum=fhSum+Character.getNumericValue(str.charAt(i));
        }
        for(int j=size/2;j<size;j++)
        {
          lhSum=lhSum+Character.getNumericValue(str.charAt(j));
        }
        return fhSum==lhSum;
      }
      else
      {
        return false;
      }
    }
}