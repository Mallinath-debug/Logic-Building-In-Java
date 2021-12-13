import java.util.*;

class  Multiply
{
public static int multiply(int ivalue1,int ivalue2,int ivalue3)
    {
        int imult=0;
        imult=ivalue1*ivalue2*ivalue3;
         return imult;
    }
 
}

class Program30
{
public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino1=0;
        int ino2=0;
        int ino3=0;
        int iret=0;
        
        System.out.println("ENTER THE FIRST NUMBER");
        ino1=sobj.nextInt();
        
        System.out.println("ENTER THE SECOND NUMBER");
        ino2=sobj.nextInt();
        
        System.out.println("ENTER THE THIRD NUMBER");
        ino3=sobj.nextInt();
        
        Multiply mobj=new Multiply();
        iret=mobj.multiply(ino1,ino2,ino3);
        
        System.out.println(iret);
    }
}
