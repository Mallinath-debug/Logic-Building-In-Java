import java.util.*;


class Divide
{
    public int Divide(int ivalue1,int ivalue2)
    {
        int ians=0;
        ians=ivalue1+ivalue2;
        return ians;
    }
}

class Program1
{
public static void main(String str[])
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
        iret=mobj.Divide(ino1,ino2);
        
        System.out.println("Addition is :"+iret);
    }
}

