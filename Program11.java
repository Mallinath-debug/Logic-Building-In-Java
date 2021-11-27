import java.util.*;

class Display
{
    public static void display(int ivalue)
    {
        int icnt=0;
        
        for(icnt=1;icnt<=ivalue;icnt++)
        {
         System.out.println("MARVELLOUS");
        }
    }
}


class Program11
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
