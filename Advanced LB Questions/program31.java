// Accept a string from user and find the duplicate characters.

import java.util.*;

class Q4
{
    public static void DuplicateChars(String str)
    {
        str = str.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        char Arr[] = str.toCharArray();

        for(char ch : Arr)
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);
            }
            else
            {
                map.put(ch, 1);
            }
        }

        for(char ch : map.keySet())
        {
            if(map.get(ch) > 1)
            {
                System.out.println(ch);
            }
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        DuplicateChars(str);

        sobj.close();
    }
}