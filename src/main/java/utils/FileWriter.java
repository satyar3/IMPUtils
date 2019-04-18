package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class FileWriter 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
    	List<String> linesOfFIle = new ArrayList<String>();
    	File file = new File("File Path\\File Path\\File.txt");
    	Scanner sc = new Scanner(file);

    	while (sc.hasNext()) 
    	{
    		linesOfFIle.add(sc.nextLine());
    	}
    }
}
