///////  Copy content from one file to another

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFile
{
public static void main(String args[]) throws IOException
    {
        FileInputStream fobj=new FileInputStream("\\User\\nic\\desktop\\FileHandlingJ\\LC.txt");   //used to read data
        FileOutputStream frobj=new FileOutputStream("\\User\\nic\\desktop\\FileHandlingJ\\Kunal.txt");
        
        int ivalue=0;
        
        while((ivalue=fobj.read())!=-1)
        {
            frobj.write((char)ivalue);
        }
        System.out.println("data copied successfully");
    }
}


