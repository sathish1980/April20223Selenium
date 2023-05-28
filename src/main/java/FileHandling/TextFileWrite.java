package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWrite {
	String filepath = "C:\\Users\\sathishkumar\\eclipse-workspace\\April2023JavaSelenium\\Input\\Sample.txt";

	String outputpath = "C:\\Users\\sathishkumar\\eclipse-workspace\\April2023JavaSelenium\\Output\\outputfile.txt";
	String textvalue = "sathish Kumar.R";
	public void writedata() throws IOException
	{
		File F= new File(outputpath);
		FileOutputStream FS = new FileOutputStream(F);
		FS.write(textvalue.getBytes());
		System.out.println("Done");
	}
	
	public void writedatawithFileWrited() throws IOException
	{
		File F= new File(outputpath);
		FileWriter FS = new FileWriter(F);
		FS.write(textvalue);
		System.out.println("Done");
	}
	
	public void readandwrite() throws IOException, InterruptedException
	{
		
		File F = new File(filepath);
		if (F.exists())
		{
			File outfile= new File(outputpath);
			FileWriter FW = new FileWriter(outfile);
			FileReader FS = new FileReader(F);
			BufferedReader BF = new BufferedReader(FS);
			String i=null;
			while((i=BF.readLine())!=null)
			{
				System.out.println(i);
				FW.write(i);
				FW.write("\n");
			}
			FW.close();
			FS.close();
		}
		System.out.println("Done");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		TextFileWrite T = new TextFileWrite();
		T.readandwrite();
	}

}
