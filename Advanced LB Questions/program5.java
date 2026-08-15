// Accept a string from user and reverse that string.

import java.util.Scanner;

class program5
{
    public static String ReverseString(String str)
    {
        StringBuffer sb = new StringBuffer(str);

        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        String reversedString = ReverseString(str);
        
        System.out.println("Reversed String is : " + reversedString);
    }
}