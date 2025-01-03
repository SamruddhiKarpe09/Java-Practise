//Approach 2

import java.util.*;

class program333
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int iNo = sobj.nextInt();

        int iMult = 1;
        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iMult = iMult * iCnt;
        }
        Numbers nobj = new Numbers();
        int iRet = nobj.EvenFact(iNo);

        System.out.println("Multiplication of even factors is : "+iRet);

        sobj.close();
    }
}

class Numbers
{
    public int EvenFact(int iValue)
    {
        int iMult = 1;
        for(int iCnt = 2; iCnt <= iValue; iCnt+2)
        {
            if(iValue % iCnt == 0)
            {
               
                    iMult = iMult * iCnt;
    
            }
        }
        
        return iMult;

    }

}

