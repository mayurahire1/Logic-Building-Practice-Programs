// Accept a number from user and check whether number is palindrome or not
// A number is palindrome if reverse number is equal to original number itself.

import java.util.Scanner;

class program21
{
    public static boolean isPalindrome(int iNo)
    {
        int iRev = 0;

        while(iNo != 0)
        {
            int iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }

        return iNo == iRev;

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int iNo = sobj.nextInt();

        
        if(isPalindrome(iNo))
        {
            System.out.println(iNo + " is Palindrome");
        }
        else
        {
            System.out.println(iNo + " is not Palindrome");
        }
        sobj.close();
    }
}