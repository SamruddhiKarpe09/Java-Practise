import java.util.*;

class program385
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first String :");
        String str1 = sobj.nextLine();

        System.out.println("Enter second String :");
        String str2 = sobj.nextLine();


        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        int Freq[] = new int[26];

        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Freq[Arr[iCnt] - 'a']++;
            Freq[Arr[iCnt] - 'a']--;
            
        }

       
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] != Brr[iCnt])
            {
                break;
            }
        }

        if(iCnt == Freq1.length)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }

    }
}