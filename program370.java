import java.util.*;

class program370
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+", " ");

        str = str.trim();

        int iFrequency = 0;
        int iCnt = 0;

        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if(str.charAt(iCnt) == ' ');
            {
                iFrequency++;
            }
        }
        System.out.println("Number of words are : "+(iFrequency+1));
    }

   
}