// Accept the number of from user and check whether the number is strong or not.
// strong number : sum of factorial of each digit is equal to number itself.

import java.util.Scanner;

class program19
{
    public static int fact(int iNo)
    {
        int iFact = 1;

        while(iNo != 0)
        {
            iFact = iFact * iNo;
            iNo--;
        }

        return iFact;
    }

    public static boolean isStrong(int iNo)
    {
        int iTemp = iNo;
        int iSum = 0;

        while (iNo != 0) { 
            int iDigit = iNo % 10;
            iSum = iSum + fact(iDigit);
            iNo = iNo / 10;
        }

        return iTemp == iSum;
    }
    
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        if(isStrong(iNo))
        {
            System.out.println(iNo + " is a strong number");
        }
        else
        {
            System.out.println(iNo + " is not a strong number");
        }
    }
}