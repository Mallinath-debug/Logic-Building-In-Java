import java.util.*;

class CountTwo
{
    public static int counttwo(int ivalue)
    {
        int idigit=0;
        int icnt=0;
        
        while(ivalue!=0)
        {
            idigit=ivalue%10;
            ivalue=ivalue/10;
            if(idigit==2)
            {
                icnt++;
            }
        }
        return icnt++;
    }
}

class Program33
{
public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino=0;
        int iret=0;
        
        System.out.println("Enter the number");
        ino=sobj.nextInt();
        
        CountTwo cobj=new CountTwo();
        iret=cobj.counttwo(ino);
        
        System.out.println(iret);
    }
}
