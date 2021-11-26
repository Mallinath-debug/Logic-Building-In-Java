///////       HOW TO CREATE A FILE IN JAVA /////////////
///                                        ///////////
///                                         /////////

import java.io.*;


class CreateFile
{
public static void main(String args[])
    {
        
        File fobj=new File("\\User\\nic\\desktop\\FileHandlingJ\\LC.txt");
        
        try
        {
            if(fobj.createNewFile())
            {
                System.out.println("File Created Successfully");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException i)
        {
            System.out.println("Exception Handled....!!!");
        }
    }
}

