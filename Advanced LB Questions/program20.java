// Accept the number of from user and check whether the number is armstrong or not.
// armstrong number : number is equal to the sum of its own digits raised to power of total umber of digits.  

import java.util.Scanner;

class program20
{
    public static boolean isArmstrong(int iNo)
    {
        int iTemp = iNo;
        int iCount = 0;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;
        int iSum = 0;

        while(iNo != 0)
        {
            int iDigit = iNo % 10;
            iSum = iSum + (int)Math.pow(iDigit, iCount);
            iNo = iNo / 10;
        }

        return iTemp == iSum;
    }
    
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        if(isArmstrong(iNo))
        {
            System.out.println(iNo + " is a armstrong number");
        }
        else
        {
            System.out.println(iNo + " is not a armstrong number");
        }
    }
}