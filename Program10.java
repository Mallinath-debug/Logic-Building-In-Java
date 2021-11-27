import java.util.*;

class Divide
{
    public int divide(int ivalue1,int ivalue2)
    {
        int idiv=0;
        idiv=ivalue1/ivalue2;
        return idiv;
    }
}

class Program10
{
public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino1=0;
        int ino2=0;
        int iret=0;
        
        System.out.println("Enter the first number");
        ino1=sobj.nextInt();
        
        System.out.println("Enter the second number");
        ino2=sobj.nextInt();
        
        
        Divide mobj=new Divide();
        iret=mobj.divide(ino1,ino2);
        
        System.out.println("Answer is"+iret);
    }
}
