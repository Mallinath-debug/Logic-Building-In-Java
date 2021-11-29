// Armstrong Number
import java.util.*;

class Armstrong
{
    public static void armstrong(int ino)
    {
        
        int irem=0;
        int itemp=0;
        int arm=0;
        
        itemp=ino;
        
        while(ino>0)
        {
            irem=ino%10;
            arm=(irem*irem*irem)+arm;
            ino=ino/10;
        }
        if(itemp==arm)
        {
            System.out.println("IT IS ARMSTRONG NUMBER");
        }
        else
        {
            System.out.println("IT IS NOT AN ARMSTRONG NUMBER");
        }
    }
}


class Program57
{
public static void main(String args[])
    {
        int ivalue=0;
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the number");
        ivalue=sobj.nextInt();
        
        Armstrong aobj=new Armstrong();
        aobj.armstrong(ivalue);
        
    }
}

