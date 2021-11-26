/*Assignment
 NO 31
 Q3
 */
import java.util.*;

class StringX
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

class StringDemo extends StringX
{
public int CountDiff()
    {
        char Arr[]=str.toCharArray();
        int icnt=0;
        int differ=0;
        int icnt1=0;
        int i=0;
        
        while(i<Arr.length)
        {
            if(Arr[i]>='A' && Arr[i]<='Z')
            {
                icnt++;
            }
            else
            {
                icnt1++;
            }
           if(icnt>icnt1)
           {
               differ=icnt-icnt1;
           }
            else
            {
                differ=icnt1-icnt;
            }
            i++;
        }
        return differ;
        
    }
}
class Program5
{
public static void main(String arg[])
    {
        StringDemo mobj= new StringDemo();
        mobj.accept();
        mobj.display();
        int iret=0;
        iret=mobj.CountDiff();
        System.out.println("Difference is "+iret);
    }
}
