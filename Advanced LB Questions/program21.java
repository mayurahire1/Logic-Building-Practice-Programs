// Accept the number of from user and check whether the number is harshad or not.
// harshad number : number is divisible by sum of its digits.    

import java.util.Scanner;

class program21
{
    public static boolean isHarshad(int iNo)
    {
        int iTemp = iNo;
        int iSum  = 0;

        while(iNo != 0)
        {
            int iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        return (iTemp % iSum == 0);
    }
    
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        if(isHarshad(iNo))
        {
            System.out.println(iNo + " is a harshad number");
        }
        else
        {
            System.out.println(iNo + " is not a harshad number");
        }
    }
}