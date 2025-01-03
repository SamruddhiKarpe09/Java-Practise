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

        StringBuffer output = new StringBuffer();

        for(String s : arr)
        {
            StringBuffer word = new StringBuffer(s);
            output.append((word.reverse()).append(" "));
        }

        System.out.print("Result is : "+output);

    }
}
  