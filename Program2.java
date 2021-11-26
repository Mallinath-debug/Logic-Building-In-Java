import java.util.*;


class Display
{
public static void Display(int ivalue)
{
     int icnt=0;

for(icnt=1;icnt<=ivalue;icnt++)
{
System.out.println("Marvellous\n");

}
    }
}


class Program2
{
public static void main(String str[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino=0;
        
        System.out.println("Enter the number");
        ino=sobj.nextInt();
        
        Display mobj=new Display (ino);
        
    }
}

