//Finding number of digits in Number

import java.util.*;

class Digits
{
  public static int digits(int ino)
    {
        int icnt=0;
        
        while(ino!=0)
        {
            ino=ino/10;
            icnt++;
           
        }
            return icnt++;
    }

}

class Program61
{
public static void main(String args[])
    {
        int ivalue=0;
        int iret=0;
        
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the number");
        ivalue=sobj.nextInt();
        
        Digits dobj=new Digits();
         iret=dobj.digits(ivalue);
        
        System.out.println(iret);
        
        
    }
}

