// Write a java program to check whether a number is perfect or not.

import java.util.*;


class program10
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean iRet = false;

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        iRet = nobj.IsPerfect(iValue);

        if(iRet == true)
        {
            System.out.println("Number is Perfect");
        } 
        else
        {
            System.out.println("Number is not Perfect");
        }
    }
}

class NumberX
{
    public boolean IsPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}