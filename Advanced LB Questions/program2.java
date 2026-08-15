// Accept a string from user and count the length of each word in that string.

import java.util.*;

class program2
{
    public static void CountWordsLength(String str)
    {
       str = str.trim();
       str = str.replaceAll("\\s+", " ");

       String Tokens[] = str.split(" ");

       for(int i = 0; i < Tokens.length; i++)
       {
            System.out.println(Tokens[i] + " : " + Tokens[i].length());
       }
    }
    
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        CountWordsLength(str);

    }
}