import java.util.*;

class program375
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+", " ");
        str = str.trim();

        String arr[] = str.split(" ");

        System.out.println("Enter the word that you want to search : ");
        String word = sobj.nextLine();
        
        int iFrequency = 0;
        for(String s : arr)
        {
            if(s.equals("india"))
            {
                iFrequency++;
            }

        }
        System.out.println("Frequency of india word is : "+iFrequency);

    }
}
  