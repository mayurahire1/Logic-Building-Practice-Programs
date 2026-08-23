// Accept a number from user and check whether number is neon or not
// A number is neon if the sum of digits of its square  is equal to number itself.

import java.util.Scanner;

class program24
{
    public static boolean isNeon(int iNo)
    {
        int iSquare = iNo * iNo;

        int iSum = 0;
        while(iSquare != 0)
        {
            int iDigit = iSquare % 10;
            iSum = iSum + iDigit;
            iSquare = iSquare / 10;
        }

        return iNo == iSum;
    }

    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int iNo = sc.nextInt();

        if(isNeon(iNo))
        {
            System.out.println(iNo + " is a neon Number");
        }
        else
        {
            System.out.println(iNo + " is not a neon Number");
        }
    }
}