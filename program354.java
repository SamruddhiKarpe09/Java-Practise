import java.util.*;

class program354
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        
        int iRet = obj.CountCapital(name);
        System.out.println("Number of capital characters are : "+iRet);
        
    }
}

class StringX
{
    public int CountCapital(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCount++;

            }
            return iCount;
        }

    }
}