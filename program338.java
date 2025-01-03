//Approach 2

import java.util.*;

class program338
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.CountDigits(iNo);

        System.out.println("Sum of digits is : "+iRet);

        sobj.close();
    }
}

class Digits
{
    int CountDigits(int iValue)
    {
        int iSum = 0;
        if(iValue < 0)
        {
            iValue = -iValue;
        }
        while(iValue != 0)
        {
            iSum = iSum + (iValue % 10);
            iValue = iValue / 10;
        }
        return iSum;
    }

}
