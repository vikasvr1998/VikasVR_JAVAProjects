package Java18Aug2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exe5 // Using throws in the place try and catch method
{
    public static void main(String[] args) throws FileNotFoundException  // this applies to whole method, and you can add other type of exceptions
    {
        arithmetic();
        file();
    }
   static void arithmetic() throws ArithmeticException
    {
      int a=10;
      System.out.println(a/0);
    }
    static void file() throws FileNotFoundException
    {
        String path="C://a.txt";
        File file=new File(path);
        FileReader fileReader=new FileReader(file);
        // Note :  You can also use the Exception in the place of FileNotFoundException
    }// But as a good coder you know what is the exception it will throw , And simply using the Exception(Bigger one) is not essential always !!!!
    }