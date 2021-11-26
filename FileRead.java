import java.io.*;


class FileRead
{
public static void main(String args[])
    {
        try
        {
            FileReader fobj=new FileReader("\\Users\\nic\\desktop\\FileHandlingJ\\LC.txt");
            try
            {
                int ivalue=0;
                while((ivalue=fobj.read())!=-1)
                {
                    System.out.print((char)ivalue);
                }
            }
            finally
            {
                fobj.close();
                System.out.print("File closed");
            }

        }
        catch(IOException i)
        {
            System.out.println("Exception Handled....!!!!");
        }
    }
}

