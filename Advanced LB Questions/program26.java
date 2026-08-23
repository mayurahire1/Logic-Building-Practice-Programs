// Accept a number from user and check whether number is spy or not.
// A number is spy if sum of digits is equal to product of digits.

import java.util.Scanner;

class program26
{
    public static boolean isSpy(int iNo)
    {
        int iSum = 0;
        int iProduct = 1;

        while(iNo != 0)
        {
            int iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iProduct = iProduct * iDigit;
            iNo = iNo / 10;
        }
        return iSum == iProduct;
    }

    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int iNo = sc.nextInt();

        if(isSpy(iNo))
        {
            System.out.println(iNo + " is a Spy Number");
        }
        else
        {
            System.out.println(iNo + " is not a Spy Number");
        }
    }
}