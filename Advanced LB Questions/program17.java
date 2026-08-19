// Accept 2D matrix from user and find th maximum element.

import java.util.*;

class program17
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

    public static int maxElement(int Arr[][])
    {
        int iMax = Arr[0][0];

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
            }
        }
        return iMax;
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

        int Max = maxElement(Arr);
        System.out.println("Maximum element is : " + Max);
    }
}