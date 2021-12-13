import java.util.*;

class CountEven
{
    public static int counteven(int ino)
    {
        int idigit=0;
        int icnt=0;
        
        while(ino!=0)
        {
            idigit=ino%10;
            ino=ino/10;
            if((idigit%2)==0)
            {
                icnt++;
            }
        }
        return icnt++;
    }
}


class Program36
{
public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int ivalue=0;
        int iret=0;
        
        System.out.println("Enter the number");
        ivalue=sobj.nextInt();
        
        CountEven cobj=new CountEven();
        iret=cobj.counteven(ivalue);
        
        System.out.println(iret);
    }
}
