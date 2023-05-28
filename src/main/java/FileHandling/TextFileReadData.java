package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReadData {
	
	String filepath = "C:\\Users\\sathishkumar\\eclipse-workspace\\April2023JavaSelenium\\Input\\Sample.txt";

	public void readdata() throws IOException
	{
		File F = new File(filepath);
		if (F.exists())
		{
		FileInputStream FS = new FileInputStream(F);
		System.out.println((char)FS.read());
		System.out.println((char)FS.read());
		}
	}
	
	public void readmultipledata() throws IOException
	{
		File F = new File(filepath);
		if (F.exists())
		{
			FileInputStream FS = new FileInputStream(F);
			int i=0;
			while((i= FS.read())!=-1)
			{
			System.out.print((char)i);
			}
		}
	}
	
	public void readmultipledatawithFilereader() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		if (F.exists())
		{
			FileReader FS = new FileReader(F);
			int i=0;
			while((i= FS.read())!=-1)
			{
			System.out.print((char)i);
			Thread.sleep(1000);
			}
		}
	}
	
	public void readLinebyLine() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		if (F.exists())
		{
			FileReader FS = new FileReader(F);
			BufferedReader BF = new BufferedReader(FS);
			String i=null;
			while((i=BF.readLine())!=null)
			{
			System.out.println(i);
			Thread.sleep(1000);
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		TextFileReadData t = new TextFileReadData();
		t.readmultipledatawithFilereader();
	}

}
