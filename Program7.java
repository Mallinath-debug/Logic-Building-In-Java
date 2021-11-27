/*Assignment
 NO 31
 Q4
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
        public boolean ChkVowel()
        {
            char Arr[]=str.toCharArray();
            int i=0;
            
            while(i<Arr.length)
            {
                if((Arr[i]=='a')||(Arr[i]=='i')||(Arr[i]=='e')||(Arr[i]=='o')||(Arr[i]=='u'))
                {
                    return true;
                }
                
                i++;
            }
            return false;
            
        }
    }
    
class Program7
    {
        public static void main(String arg[])
        {
        StringDemo mobj=new StringDemo();
        mobj.accept();
        mobj.display();
        boolean bret;
        bret=mobj.ChkVowel();
        if(bret==true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    }
    

