// Accept a number from user and check whether number is perfect or not
// A number is perfect if the sum of its divisors is equal to number itself.

import java.util.Scanner;

class program22
{
    public static boolean isPerfect(int iNo)
    {
        int iSum = 0;
        for(int i = 1; i <= (iNo / 2); i++)
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
        }

        return iSum == iNo;
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int iNo = sobj.nextInt();

        if(isPerfect(iNo))
            System.out.println("Number is perfect");
        else
            System.out.println("Number is not perfect");
    }
}