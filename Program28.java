import java.util.*;

class ChkGreater
{
    public static boolean chkgreater(int ivalue)
    {
        if(ivalue>100)
        {
            return true;
        }
        else {
            return false;
        }
    }
}

class Program28
{
public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino1=0;
        boolean bret=false;
        
        System.out.println("ENTER THE NUMBER");
        ino1=sobj.nextInt();
        
        ChkGreater cobj=new ChkGreater();
        bret=cobj.chkgreater(ino1);
        
        if(bret==true)
        {
            System.out.println("Greater");
        }
        else{
            System.out.println("Smaller");
        }
    }
}
