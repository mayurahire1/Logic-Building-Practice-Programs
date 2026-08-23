// Accept a number from user and check whether number is Trimorphic or not.
// A number is Trimorphic if its cube ends with same digits as the number itself.

import java.util.Scanner;

class program28
{
    public static boolean isTriomorphic(int iNo)
    {
        int iCube = iNo * iNo * iNo;

        while(iNo != 0)
        {
            if(iNo % 10 != iCube % 10)
            {
                return false;
            }
            iNo = iNo / 10;
            iCube = iCube / 10;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int iNo = sc.nextInt();

        if(isTriomorphic(iNo))
        {
            System.out.println(iNo + " is a Triomorphic Number");
        }
        else
        {
            System.out.println(iNo + " is not a Triomorphic Number");
        }
    }
}