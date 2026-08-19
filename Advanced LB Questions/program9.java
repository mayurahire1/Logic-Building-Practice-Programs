// Accept a string and two words from user and replace the first word into second word.

// Input : Hello world Hello my name is mayur
// Output: Hi world Hi my name is mayur

import java.util.*;

class program9
{
    public static String ReplaceWord(String str, String word1, String word2)
    {
        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        str = str.toLowerCase();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        
        String Tokens[] = str.split(" ");

        StringBuffer finalString = new StringBuffer("");

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals(word1))
            {
                finalString.append(word2);
                finalString.append(" ");

                continue;
            }
            finalString.append(Tokens[i]);
            finalString.append(" ");
        }

        return finalString.toString();
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        System.out.println("Enter first word : ");
        String word1 = sobj.nextLine();

        System.out.println("Enter second word : ");
        String word2 = sobj.nextLine();

        String UpdatedString = ReplaceWord(str, word1, word2);

        System.out.println("Updated String is : " + UpdatedString);
    }
}