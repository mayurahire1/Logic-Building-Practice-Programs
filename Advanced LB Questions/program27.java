// Accept a number from user and check whether number is sunny or not.
// A number is sunny if number + 1 is a perfect number.

import java.util.Scanner;

class program27
{
    public static boolean isPerfect(int iNo)
    {
        int iTemp = iNo;
        
        int iSum = 0;
        for(int i = 0; i <= (iNo / 2); i++)
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
        }
        return iTemp == iSum;
    }

    public static boolean isSunny(int iNo)
    {
        return isPerfect(iNo + 1);
    }
    
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int iNo = sc.nextInt();

        if(isSunny(iNo))
        {
            System.out.println(iNo + " is a Sunny Number");
        }
        else
        {
            System.out.println(iNo + " is not a Sunny Number");
        }
    }
}