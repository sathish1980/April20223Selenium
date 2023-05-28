package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileHandling {

	String filepath = System.getProperty("user.dir")+"\\Input\\Environment.properties";
	
	public void readdata() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FS = new FileInputStream(F);
		Properties ps = new Properties();
		ps.load(FS);
		System.out.println(ps.getProperty("name"));
		System.out.println(ps.getProperty("age"));
		System.out.println(ps.getProperty("edu"));
		ps.setProperty("year", "2020");
		System.out.println(ps.getProperty("year"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyFileHandling p = new PropertyFileHandling();
		p.readdata();
	}

}
