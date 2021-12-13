import java.util.*;

class FactDiffer
{
    public static int factdiffer(int ivalue)
    {
        int icnt=0;
        int isum=0;
        int isum1=0;
        
        for(icnt=1;icnt<ivalue;icnt++)
        {
            if((ivalue%icnt)!=0)
            {
                 isum=isum+icnt;
            }
            else
            {
                isum1=isum1+icnt;
            }
        }
      return isum-isum1;
    }
    
}
class Program26
{
public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino1=0;
        int iret=0;
        
        System.out.println("Enter the number");
        ino1=sobj.nextInt();
        
        FactDiffer fobj=new FactDiffer();
        iret=fobj.factdiffer(ino1);
        
        System.out.println(iret);
    }
}
