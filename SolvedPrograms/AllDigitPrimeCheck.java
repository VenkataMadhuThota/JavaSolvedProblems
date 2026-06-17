// Question : Count numbers where all digits are prime
// Approach : Digit Traversal + Early Exit Prime Validation
// Time Complexity : O(n * d)

import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        int arr[] = {3326,2453,2469,6213,5486,235};
        for(int i=0;i<arr.length;i++)
        {
            if(allDigitsPrime(arr[i]))
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static boolean allDigitsPrime(int num)
    {
        while(num != 0)
        {
            int digit = num % 10;
            if(!isPrime(digit))
            {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static boolean isPrime(int no)
    {
        if(no < 2)
        {
            return false;
        }
        for(int i=2;i<no;i++)
        {
            if(no % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}