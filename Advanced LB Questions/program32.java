// Accept a string from user and check whether the string is rotation or not.

import java.util.Scanner;

class program32
{
    public static boolean isRotation(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        str1 = str1.concat(str1);

        if(str1.contains(str2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first String : ");
        String str1 = sc.nextLine();

        System.out.println("Enter second String : ");
        String str2 = sc.nextLine();
       
        boolean isRotation = isRotation(str1, str2);

        if(isRotation)
        {
            System.out.println("String is rotation");
        }
        else
        {
            System.out.println("String is not rotation");
        }
        sc.close();
    }
}