// Accept a string from user and find the word which has highest length.

import java.util.*;

class program3
{
    public static String LargestWordLength(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        String largestString = Tokens[0];
        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].length() > largestString.length())
            {
                largestString = Tokens[i];
            }
        }

        return largestString;
    }
    
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        String largestString = LargestWordLength(str);

        System.out.println("Largest string is  : " + largestString + " having length : " + largestString.length());
    }
}