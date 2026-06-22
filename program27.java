// Write a java program to print the digits of a number.

import java.util.*;

class program27
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int iValue = sobj.nextInt();

        DigitX dobj = new DigitX();

        dobj.Dispaly(iValue);
    }
}

class DigitX
{
    public void Dispaly(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}
