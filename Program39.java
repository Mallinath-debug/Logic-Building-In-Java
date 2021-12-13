import java.util.*;

class MultDigits
{
    public static int multdigits(int ino)
    {
        int idigit=1;
        int imult=1;
        
        if(ino<0)          //input updator
        {
            ino=-ino;
        }
        
        while(ino!=0)
        {
            idigit=ino%10;
            imult=idigit*imult;
            ino=ino/10;
           
    }
        return imult;
}
}


class Program39
{
public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int ivalue=0;
        int iret=0;
        
        System.out.println("Enter the number");
        ivalue=sobj.nextInt();
        
        MultDigits cobj=new MultDigits();
        iret=cobj.multdigits(ivalue);
        
        System.out.println(iret);
    }
}
