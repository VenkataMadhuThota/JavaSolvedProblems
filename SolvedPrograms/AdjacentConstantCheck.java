//  print numbers where difference between adjacent digits is constant
// Approach : Iterative Digit Checking / Bruteforce
// Time Complexity : O(n*d)
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,10,11,12,121,135,642,1357};
        for (int i = 0; i < arr.length; i++) 
        {
            if (isValid(arr[i])) 
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static boolean isValid(int no) 
    {
        String str = String.valueOf(no);
        if (str.length() <= 2) 
        {
            return true;
        }
        int diff = Character.getNumericValue(str.charAt(1)) - Character.getNumericValue(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) 
        {
            int currentDiff = Character.getNumericValue(str.charAt(i + 1)) - Character.getNumericValue(str.charAt(i));
            if (currentDiff != diff) 
            {
                return false;
            }
        }
        return true;
    }
}