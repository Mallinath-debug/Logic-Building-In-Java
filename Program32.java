import java.util.*;

class ChkZero
{
    public static boolean chkzero(int ivalue)
    {
        int idigit=0;
        
        while(ivalue!=0)
        {
            idigit=ivalue%10;
            if(idigit==0)
            {
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}


class Program32
{
public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino=0;
        boolean bret=false;
        
        System.out.println("Enter the number");
        ino=sobj.nextInt();
        
        ChkZero cobj=new ChkZero();
        bret=cobj.chkzero(ino);
        
        if(bret==true)
        {
            System.out.println("It has zero");
        }
        else{
            System.out.println("There is no zero");
        }
    }
}
