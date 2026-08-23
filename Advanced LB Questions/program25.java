// Accept a number from user and check whether number is Authomorphic or not.
// A number is Automorphic if its square ends with same digits as the number itself.

import java.util.Scanner;

class Q2
{
    public static boolean isAutomorphic(int iNo)
    {
        int iSquare = iNo * iNo;

        while(iNo != 0)
        {
            if(iNo % 10 != iSquare % 10)
            {
                return false;
            }
            iNo = iNo / 10;
            iSquare = iSquare / 10;
        }

        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int iNo = sc.nextInt();

        if(isAutomorphic(iNo))
        {
            System.out.println(iNo + " is a Automorphic Number");
        }
        else
        {
            System.out.println(iNo + " is not a Automorphic Number");
        }
    }
}