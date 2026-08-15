// Accept a string from user and count the number of words.

import java.util.*;

class program1
{
    public static int CountWords(String str)
    {
        str = str.trim();                   // remove leading and trailing white spaces
        str = str.replaceAll("\\s+", " ");  // remove the more than 1 white spaces from the string
        
        String Tokens[] = str.split(" ");   // Split the string by space

        return Tokens.length;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        int iRet = CountWords(str);

        System.out.println("Number of words in the string : " + iRet);
    }
}