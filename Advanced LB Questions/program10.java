// Accept a string and two words from user and check whether string is Anagram or not.

import java.util.*;

class program9
{
    public static boolean isAnagram(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char StrArr1[] = str1.toCharArray();
        char StrArr2[] = str2.toCharArray();

        Arrays.sort(StrArr1);
        Arrays.sort(StrArr2);

        return Arrays.equals(StrArr1, StrArr2);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter second string : ");
        String str2 = sobj.nextLine();

        if(isAnagram(str1, str2))
        {
            System.out.println("Both strings are Anagram.");
        }
        else
        {
            System.out.println("Both strings are not Anagram.");
        }
        
    }
}