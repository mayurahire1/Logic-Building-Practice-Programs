// Accept a string from user and reverse each word from that string.

import java.util.*;

class program6
{
    public static String ReverseEachWord(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        StringBuffer sb = null;
        StringBuffer finalString = new StringBuffer("");

        for(int i = 0; i < Tokens.length; i++)
        {
            sb = new StringBuffer(Tokens[i]);
            sb.reverse();
            finalString.append(sb);
            finalString.append(" ");
        }

        return finalString.toString();
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        String UpdatedString = ReverseEachWord(str);

        System.out.println("Updated string is : " + UpdatedString);
    }
}