// Write a java program to find the factors of the given number.

import java.util.*;

class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        nobj.FindFactors(iValue);
    }
}

class NumberX
{
    public void FindFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt < (iNo / 2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
