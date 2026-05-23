// Problem : Write a Java program to find the frequency of each character from an array of strings.
// Approach : Nested Loop Technique
// Time Complexity : O(n²)
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
      String arr[]={"nareshit","java","springboot","restapi"};
      String str="";
      for(int i=0;i<arr.length;i++)
      {
        str=str+arr[i];
      }
      char ch[]=str.toCharArray();
      for(int i=0;i<ch.length;i++)
      {
        int count=1;
        boolean isVisited=false;
        for(int k=i-1;k>=0;k--)
        {
          if(ch[i]==ch[k])
          {
            isVisited=true;
            break;
          }
        }
        if(isVisited)
        {
          continue;
        }
        for(int j=i+1;j<ch.length;j++)
        {
            if(ch[i]==ch[j])
            {
              count++;
            }
        }
        System.out.println(ch[i]+"-"+count);
      }
    }
}