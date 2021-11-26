import java.io.*;


class FileWrite
{
  public static void main(String args[])
    {
      try
        {
            FileWriter fobj=new FileWriter("\\Users\\nic\\desktop\\FileHandlingJ\\LC.txt");
            try
            {
                fobj.write("JIMMY BUTTLER.......!");
            }
            finally
            {
                fobj.close();
            }
            System.out.println("Succesfully Writen in file");

        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
}


