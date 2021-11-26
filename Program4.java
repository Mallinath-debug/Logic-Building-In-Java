/*Assignment
 NO 31
 Q2
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
    public int CountSmall()
    {
        char Arr[]=str.toCharArray();
        int icnt=0;
        int i=0;
        
        while(i<Arr.length)
        {
            if(Arr[i]>='a' && Arr[i]<'z')
            {
                icnt++;
            }
            i++;
        }
        return icnt++;
    }

}
class Program4
{
    public static void main(String arg[])
    {
    StringDemo mobj=new StringDemo();
    mobj.accept();
    mobj.display();
    int iret=0;
    iret=mobj.CountSmall();
    System.out.println("Small letters are::"+iret);
}
}

