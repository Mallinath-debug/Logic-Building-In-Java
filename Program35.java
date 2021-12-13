import java.util.*;

class Count
{
    public static int count(int ino)
    {
        int idigit=0;
        int icnt=0;
        
        while(ino!=0)
        {
            idigit=ino%10;
            ino=ino/10;
            if(idigit<6)
            {
                icnt++;
            }
        }
        return icnt++;
    }
}


class Program35
{
public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int ivalue=0;
        int iret=0;
        
        System.out.println("Enter the number");
        ivalue=sobj.nextInt();
        
        Count cobj=new Count();
        iret=cobj.count(ivalue);
        
        System.out.println(iret);
    }
}
