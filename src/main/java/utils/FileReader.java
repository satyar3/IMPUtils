package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Hello world!
 *
 */
public class FileReader 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
    	File file = new File("File Path\\File Path\\File.txt");
      	PrintWriter pw = new PrintWriter(file);
    	pw.println("Add lines to file");
    }
}
