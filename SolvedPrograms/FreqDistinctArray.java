//Question : Print the frequency of each distinct digit in every number of the array.
//Approach : Frequency Array Approach
//Time Complexity : O(d)
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[] = {112233,2358555,1234,23544,987654,121212,1234567};
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
            getFreq(arr[i]);
            System.out.println();
        }
    }
    public static void getFreq(int num) 
    {
        String str = String.valueOf(num);
        int freq[] = new int[10];
        for (int i = 0; i < str.length(); i++) 
        {
            int digit = str.charAt(i) - '0';
            freq[digit]++;
        }
        for (int i = 0; i < 10; i++) 
        {
            if (freq[i] > 0) 
            {
                System.out.println(i + "-" + freq[i]);
            }
        }
    }
}