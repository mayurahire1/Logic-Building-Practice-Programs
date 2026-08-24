// Accept a string from user and check whether the string is pangram or not.
// String is pangram if it contains all the 26 alphabets atleast once.

import java.util.*;

class program30
{
    public static boolean isPangram(String str)
    {
        str = str.toLowerCase();
        str = str.trim();
        str = str.replaceAll("\\s+", "");

        HashMap<Character, Integer> map = new HashMap<>();
        
        char Arr[] = str.toCharArray();

        for(char ch : Arr)
        {
            if(ch >= 'a' && ch <= 'z')
            {
                map.put(ch, 1);
            }
        }

        System.out.println(map);

        if(map.size() == 26)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();
    
        if(isPangram(str))
        {
            System.out.println("String are Pangram");
        }
        else
        {
            System.out.println("String are not Pangram");
        }

        sc.close();
    }
}