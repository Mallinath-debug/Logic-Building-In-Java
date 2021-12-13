import java.util.*;

class Reverse
{
    public static void reverse(int ivalue)
    {
        int idigit=0;
        
        while(ivalue!=0)
        {
            idigit=ivalue%10;
            System.out.println(idigit);
            ivalue=ivalue/10;
            
        }
        
    }
}
class Program31
{
public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino=0;
        
        System.out.println("Enter the number");
        ino=sobj.nextInt();
        
        Reverse robj=new Reverse();
        robj.reverse(ino);
        
    }
}
