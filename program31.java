// Write a java program to count digits a number.

import java.util.*;

class program31
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int iValue = sobj.nextInt();

        int iRet = DigitX.CountDigits(iValue);

        System.out.println("Number of digits are: " + iRet);
    }
}

class DigitX
{
    public static int CountDigits(int iNo)
    {
        int iCount = 0;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        return iCount;
    }
}