import java.util.*;

class CountRange
{
    public static int countrange(int ino)
    {
        int idigit=0;
        int icnt=0;
        
        if(ino<0)          //input updator
        {
            ino=-ino;
        }
        
        while(ino!=0)
        {
            idigit=ino%10;
            ino=ino/10;
            if(idigit>3 && idigit<7)
            {
                icnt++;
            }
        }
        return icnt++;
    }
}


class Program38
{
public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int ivalue=0;
        int iret=0;
        
        System.out.println("Enter the number");
        ivalue=sobj.nextInt();
        
        CountRange cobj=new CountRange();
        iret=cobj.countrange(ivalue);
        
        System.out.println(iret);
    }
}
