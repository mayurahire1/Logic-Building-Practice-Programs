// Accept string from user and convert first letter of each word into capital

import java.util.*;

class program4
{
    public static String CaptialiseEachWord(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        char Arr[] = str.toCharArray();

        if(Arr[0] >= 'a' && Arr[0] <= 'z')
        {
            Arr[0] = (char)(Arr[0] - 32);
        }

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                if(Arr[i+1] >= 'a' && Arr[i+1] <= 'z')
                {
                    Arr[i+1] = (char)(Arr[i+1] - 32);
                }
            }
        }

        return new String(Arr);
    }
    
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        String UpdatedString = CaptialiseEachWord(str);

        System.out.println("Updated string is  : " + UpdatedString);
    }
}