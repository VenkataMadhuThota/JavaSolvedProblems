// Question : Print numbers where any digit divides the number completely
// Approach : Digit Traversal + Divisibility Check with Early Exit
// Time Complexity : O(n * d)
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
      int arr[]={3326,2453,2469,6213,5486};
      for(int i=0;i<arr.length;i++)
      {
        if(checkDigitDivisibility(arr[i]))
        {
          System.out.println(arr[i]);
        }
      }
    }
    public static boolean checkDigitDivisibility(int num)
      {
       int org=num;
        while(num!=0)
        {
          int digit=num%10;
          if(digit!=0 && org%digit==0)
          {
              return true;
          }
          num/=10;
        }
        return false;
      }
}