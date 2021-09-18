package InterivewQuetions;

import java.io.*;

public class FileRead {

	public static void main(String[] args) throws IOException {

		File f= new File("E://Doc.txt");
		FileReader fr= new FileReader(f);
		BufferedReader bfr= new BufferedReader(fr);
		//int i;
		String s=null;
		/*while((i=bfr.read())!=-1)
		{
			System.out.print((char)i);
		}*/
		while((s=bfr.readLine())!=null)
		{
			System.out.print(s);
		}

	}

}
