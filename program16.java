// Write a java program to check whether a number prime or not.

import java.util.*;

class program16
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        boolean bRet = nobj.isPrime(iValue);

        if(bRet == true)
        {
            System.out.println("Number is a prime number");
        }
        else
        {
            System.out.println("Number is not a prime number");
        }
    }
}

class NumberX
{
    public boolean isPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = true;

        if(iNo <= 1)
        {
            return false;
        }

        for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;

    }
}
