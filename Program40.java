import java.util.*;

class CircleArea
{
    public static double circlearea(double dradius)
    {
        double darea=0;
        
        darea=3.14*dradius*dradius;
        
        return darea;
    }
}


class Program40
{
public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
      double darea=0;
        double dret=0;
        
        System.out.println("Enter the number");
        darea=sobj.nextFloat();
        
        CircleArea cobj=new CircleArea();
        dret=cobj.circlearea(darea);
        
        System.out.println(dret);
    }
}
    

