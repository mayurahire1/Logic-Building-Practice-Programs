// Accept 2D matrix from user and calculate sum of each row.

import java.util.*;

class program16
{
    public static void Accept(int Arr[][])
    {
        Scanner sobj = new Scanner(System.in);

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0 ; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public static void Display(int Arr[][])
    {
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void RowSum(int Arr[][])
    {
        int iSum = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                iSum = iSum + Arr[i][j];
            }
            System.out.println("Row " + (i+1) + " summation : " + iSum);
            iSum = 0;
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter " + (iRow * iCol) + " Elements :");
        Accept(Arr);

        System.out.println("Array elements are : ");
        Display(Arr);

        RowSum(Arr);
    }
}