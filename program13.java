// Write a java program to check whether a number prime or not.

import java.util.*;

class program13
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        NumberX nobj = new NumberX();

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        bRet = nobj.CheckPrime(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            System.out.println("Number is not Prime");
        }
    }
}

class NumberX
{
    public boolean CheckPrime(int iNo)
    {
        int iCnt = 0;

        if (iNo <= 1)
        {
            return false;
        }
        
        for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                break;
            }
        }

        if(iCnt <= (iNo / 2))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}