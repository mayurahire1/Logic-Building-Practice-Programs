// Accept a string and a word from user and count the occurrences of that string in the string.
 
import java.util.*;

class program8
{
    public static int CountWordOccurences(String str, String key)
    {
        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        str = str.toLowerCase();
        
        String Tokens[] = str.split(" ");

        int iCount = 0;
        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals(key))
            {
                iCount++;
            }
        }
        return iCount;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        System.out.println("Enter word that you want to search : ");
        String word = sobj.nextLine();

        int wordFrequency = CountWordOccurences(str, word);

        System.out.println("Frequncy of the word : " + wordFrequency);
    }
}