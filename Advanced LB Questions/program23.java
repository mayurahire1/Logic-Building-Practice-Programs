// Accept a number from user and check whether number is harshad or not
// A number is harshad if the sum of digits is divisible by number itself.

import java.util.Scanner;

class program23
{
    public static boolean isHarshad(int iNo)
    {
        int iTemp = iNo;
        int iSum = 0;

        while(iNo != 0)
        {
            int iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        return (iTemp % iSum == 0);
    }
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int iNo = sc.nextInt();


        if(isHarshad(iNo))
        {
            System.out.println(iNo + " is a Harshad Number");
        }
        else
        {
            System.out.println(iNo + " is not a Harshad Number");
        }

        sc.close();
    }
}