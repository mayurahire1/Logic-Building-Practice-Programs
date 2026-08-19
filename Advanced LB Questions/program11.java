//Accept a String from user and count the occurrences of the each character from that string.(Using HashMap).

import java.util.*;

class program11
{
    public static void CharacterOccurences(String str)
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

        System.out.println(hobj);
    }

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        CharacterOccurences(str);
    }
}