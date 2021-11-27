/*Assignment
 NO 31
 Q5
  */
import java.util.*;

class Stringx
{
    public String str;
    
    public void accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter  the string");
        str=sobj.nextLine();
    }
    public void display()
    {
        System.out.println("String is"+str);
    }
}

class StringDemo extends Stringx
{
    public String ReverseX()
    {
        char Arr[]=str.toCharArray();
        int istart=0;
        int iend=Arr.length-1;
        char temp;
        
      while(istart<iend)
      {
          temp=Arr[istart];
          Arr[istart]=Arr[iend];
          Arr[iend]=temp;
          
          istart++;
          iend--;
      }
        return String.valueOf(Arr);

    }
    
}

class Program8
{
    public static void main(String arg[])
    {
        StringDemo mobj=new StringDemo();
        mobj.accept();
        mobj.display();
        String s=mobj.ReverseX();
        System.out.println("Reverse sring is= "+s);
    }
}

