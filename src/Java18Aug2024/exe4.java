package Java18Aug2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exe4
{
    public static void main(String[] args)
    {
        String path="C://a.txt";
        File file=new File(path);
        try
        {
            FileReader fileReader=new FileReader(file);
        }
        catch (FileNotFoundException e) //   Note FileNotFoundException is smaller basket
        {                              //    Whereas Exception is bigger basket
            System.out.println("No");
        }                            // Here the control comes and falls in the FileNotFoundException first if it is able to catch then fine
        catch (Exception e)         // Else the bigger basket (Exception) will catch it
        {
            System.out.println("Sorry");
        }
    }}