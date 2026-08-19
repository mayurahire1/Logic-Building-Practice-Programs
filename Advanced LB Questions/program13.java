// Accept a String from user and display such a string which contains all the character only once (unique elements)

import java.util.*;

class program13
{
    public static void UniqueCharacterString(String str)
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
        
        char Arr[] = new char[hobj.size()];

        int i = 0;
        for(char ch : hobj.keySet())
        {
            Arr[i] = ch;
            i++;
        }

        System.out.println(new String(Arr));
    }

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        UniqueCharacterString(str);
    }
}