// Accept a string from user and check whether the string is palindrome or not.
// String is palindrome if the string is same read from forard and backward.

import java.util.Scanner;

class program29
{
    public static boolean isPalindrome(String str)
    {
        str = str.toLowerCase();
        
        StringBuffer sb = new StringBuffer(str);

        sb.reverse();

        String reversedString = sb.toString();

        return str.equals(reversedString);
    }
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();
    
        if(isPalindrome(str))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
        
        sc.close();
    }
}