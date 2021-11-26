/*Assignment
 NO 31
 Q1
 */

import java.util.*;


class Stringx
{
    public String str;
    
    public void accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the string");
        str=sobj.nextLine();
    }
    
    public void display()
    {
        System.out.println("String is"+str);
    }
}
class StringDemo extends Stringx
{
    public int CountCapital()
    {
    char Arr[]=str.toCharArray();
    int icnt=0;
    int i=0;
    
    while(i<Arr.length)
    {
        if(Arr[i]>='A' && Arr[i]<='Z')
        {
            icnt++;
        }
        i++;
    }
    return icnt++;
}
}

class Program3
{
    public static void main(String arg[])
    {
    StringDemo mobj=new StringDemo();
    mobj.accept();
    mobj.display();
    int iret=0;
    iret=mobj.CountCapital();
    System.out.println("Capital letters are "+iret);
    
    }
}

