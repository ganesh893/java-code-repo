package InterivewQuetions;

import java.io.*;
//import java.io.BufferedReader;
/*import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;*/

import io.restassured.internal.support.FileReader;

public class ReadWriteFile{

	public static void main(String[] args) throws IOException {


		File f= new File("E://Doc.txt");
		if(f.exists())
		{
			System.out.println("File is preset");
		}
		else
			f.createNewFile();
		
		FileWriter fw=new FileWriter(f);
		BufferedWriter bfw= new BufferedWriter(fw);
		bfw.write("Ganesh patkal");
		bfw.close();
		
		//FileReader fr= new FileReader();
	//	BufferedReader bfr= new BufferedReader(f);
		
		

	}

}
