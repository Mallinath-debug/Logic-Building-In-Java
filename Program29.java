import java.util.*;

class  ChkEqual
{
    public static boolean  chkequal(int ivalue1,int ivalue2)
    {
        if(ivalue1==ivalue2)
        {
            return true;
        }
        else {
            return false;
        }
    }
}

class Program29
{
public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino1=0;
        int ino2=0;
        boolean bret=false;
        
        System.out.println("ENTER THE FIRST NUMBER");
        ino1=sobj.nextInt();
        
        System.out.println("ENTER THE SECOND NUMBER");
        ino2=sobj.nextInt();
        
        ChkEqual cobj=new ChkEqual();
        bret=cobj.chkequal(ino1,ino2);
        
        if(bret==true)
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
