// Problem : Write a Java program to check whether a given string is a palindrome or not.
// Approach : Two Pointer Technique
// Time Complexity : O(n)
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
      String str="A man a plan a canal Panama";
      str = str.replace(" ", "");
      str=str.toLowerCase();
      int start=0;
      int end=str.length()-1;
      boolean isPalindrome=true;
      while(start<end)
      {
        if(str.charAt(start)!=str.charAt(end))
        {
          isPalindrome=false;
          break;
        }
        start++; end--;
      }
      if(isPalindrome)
          System.out.print("palindrome");
      else
          System.out.print("not a palindrome");
    }
}