// Accept a string and a word from user and check whether that word is present in the string or not.
 
import java.util.*;

class program7
{
    public static boolean isWordPresent(String str, String key)
    {
        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        str = str.toLowerCase();
        
        String Tokens[] = str.split(" ");

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals(key))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        System.out.println("Enter word that you want to search : ");
        String word = sobj.nextLine();


        if(isWordPresent(str, word))
        {
            System.out.println("Given word is present in the string");
        }
        else
        {
            System.out.println("Given word is not present in the string");
        }
    }
}