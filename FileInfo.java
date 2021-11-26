///How to get File Information
//
/

               
import java.io.*;


class FileInfo
{
public static void main(String args[])throws IOException
    {
        File fobj=new File("\\Users\\nic\\desktop\\FileHandlingJ\\LC.txt");
        if(fobj.exists())
        {
            System.out.println("File Name:"+fobj.getName());
            System.out.println("File Location:"+fobj.getAbsolutePath());
            System.out.println("File Writelable:"+fobj.canWrite());
            System.out.println("File Readble:"+fobj.canRead());
            System.out.println("File Size :"+fobj.length());
            System.out.println("File Removed:"+fobj.delete());
        }
        else
        {
            System.out.println("File Does not exists");
        }
    }
}


