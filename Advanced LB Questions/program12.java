//Accept a String from user and find the character which occurs maximum times.

import java.util.*;

class program12
{
    public static void CharacterOccuresMaximum(String str)
    {
        HashMap<Character, Integer> hobj = new HashMap<>();

        char strArr[] = str.toCharArray();

        for(char ch : strArr)
        {
            if(hobj.containsKey(ch))
            {
                int iCount = hobj.get(ch);
                hobj.put(ch, iCount+1);
            }
            else
            {
                hobj.put(ch, 1);
            }
        }
        
        int iMax = 0;
        char temp = '\0';

        for(char ch : hobj.keySet())
        {
            if(hobj.get(ch) > iMax)
            {
                iMax = hobj.get(ch);
                temp = ch;
            }
        }

        System.out.println(temp + " occurs maximum times: " + iMax);
    }

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        CharacterOccuresMaximum(str);
    }
}