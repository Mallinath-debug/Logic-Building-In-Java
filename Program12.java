import java.util.*;

class Display
{
    public static void display(int ivalue1)
    {
        int icnt=0;
        
        for(icnt=ivalue1;icnt>0;icnt--)
        {
            System.out.println(icnt);
        }
    }
}
class Program12
{
public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino1=0;
        
        System.out.println("Enter the number");
        ino1=sobj.nextInt();
        
        Display dobj=new Display();
        dobj.display(ino1);
    }
}
