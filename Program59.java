// Perfect Number

import java.util.*;

class PerfectNumber
{
    public static void perfectnumber(int ino)
    {
        int i=0;
        int isum=0;
        
        for(i=1;i<ino;i++)
        {
            if(ino%i==0)
            {
                isum=isum+i;
            }
        }
        if(isum==ino)
        {
            System.out.println("Number is perfect");
        }
        else{
            System.out.println("Number is not perfect");
        }
    }
}



class Program59
{
public static void main(String args[])
    {
        int ivalue=0;
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the number");
        ivalue=sobj.nextInt();
        
        PerfectNumber pobj=new PerfectNumber();
        pobj.perfectnumber(ivalue);
        
    }
}

