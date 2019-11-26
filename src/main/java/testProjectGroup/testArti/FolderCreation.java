package testProjectGroup.testArti;

import java.io.File;
import java.io.FileWriter;

public class FolderCreation {

	
	public static void main(String args[]) {
		
		try {
		new File("D://Narendra2").mkdir();
		
		File file =new File("D://Narendra2//TTT1//file1.txt");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("Hi");
		fileWriter.close();
		
		}catch(Exception e) {
			
		}
		
	}
}
