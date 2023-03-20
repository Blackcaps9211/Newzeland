package java_io_package;

import java.io.File;
import java.io.FileWriter;

public class File_class_Example1 {

	public static void main(String[] args) throws Exception {
		
		
	//	File f1 = new File("NewzealandFolder","Newzealand.xml");
		
		 File f4 = new File("Newzealand.txt");
		 f4.createNewFile();
		 FileWriter fw = new FileWriter(f4);
	fw.write("veeru");
	fw.flush();
	
	// FileWriter fw1 = new FileWriter(fw,);

	
		// f1.createNewFile();
		
		
		//f1.delete();
		// f2.delete();
		
		
		
		
//		if(f1.exists()) {
//			System.out.println("File already exists");
//		}
//		else {
//			f1.createNewFile();
//			System.out.println("File newly created");
//		}


		
		
		
		
		
}
	
	
}

