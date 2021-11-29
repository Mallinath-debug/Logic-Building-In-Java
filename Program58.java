// Prime Number

import java.util.*;

class Prime
{
    public static void prime(int ino)
    {
        int i=1;
        int icnt=0;
        
        for(i=1;i<=ino;i++)
        {
            if(ino%i==0)
            {
                icnt++;
            }
        }
        if(icnt==2)
        {
            System.out.println("IT IS A PRIME NUMBER");
        }
        else
        {
            System.out.println("IT IS NOT A PRIME NUMBER");
        }
    }
}



class Program58
{
public static void main(String args[])
    {
        int ivalue=0;
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the number");
        ivalue=sobj.nextInt();
        
       Prime pobj=new Prime();
        pobj.prime(ivalue);
        
    }
}

