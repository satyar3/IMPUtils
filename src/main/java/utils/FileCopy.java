package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileCopy 
{
	public static void main(String[] args) throws IOException {
		String fileName = "TestF.txt";
		File dest = new File("D:\\New folder_2\\"+fileName);
		dest.createNewFile();
		
		Files.copy(new File("D:\\New folder_1\\"+fileName).toPath(), dest.toPath(),StandardCopyOption.REPLACE_EXISTING);
	}
}
