//Incomplete code....complete it
import java.util.*;


class Matrix
{
    public int Arr[][];

    public Matrix(int i, int j)
    {
        Arr = new int[i][j];
    }
}

    public void Accept()
    {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter elements : ");
    for(int i = 0; i < Arr.length; i++)
    {
        for(int j = 0; j < Arr.length; j++)
        {
            System.out.print(Arr[i][j]+"\t");
        }
        System.out.println();
    }
    }
    public void Display()
    {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter elements : ");
    for(int i = 0; i < Arr.length; i++)
    {
        for(int j = 0; j < Arr.length; j++)
        {
            System.out.print(Arr[i][j]+"\t");
        }
        System.out.println();
    }
    }

    int Summation()
    {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter elements : ");
    int iSum = 0;
    for(int i = 0; i < Arr.length; i++)
    {
        for(int j = 0; j < Arr.length; j++)
        {
            iSum = iSum + Arr[i][j];
        }
        return iSum;
    }
    }

    int SummationRow()
    {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter elements : ");
    int iSum = 0;
    for(int i = 0; i < Arr.length; i++)
    {
        for(int j = 0; j < Arr.length; j++)
        {
            iSum = iSum + Arr[i][j];
        }
        return iSum;
    }
    }



class program388
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0;

        System.out.println("Enter number of rows");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow,iCol);
        mobj.Accept();
        mobj.Display();

        int iRet = mobj.Summation();


    }
}