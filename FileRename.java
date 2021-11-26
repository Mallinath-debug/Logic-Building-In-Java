import java.io.*;


class FileRename
{
public static void main(String args[])
    {
        File fobj=new File("\\User\\nic\\desktop\\FileHandlingJ\\LC.txt");
        File frobj=new File("\\User\\nic\\desktop\\FileHandlingJ\\Kunal.txt");
        
        if(fobj.exists())
        {
            System.out.println(fobj.renameTo(frobj));
        }
        else
        {
            System.out.println("File does not exists");
        }

    }
}

