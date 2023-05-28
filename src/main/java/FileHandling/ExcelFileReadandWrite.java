package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReadandWrite {
	
	String filepath = System.getProperty("user.dir")+"\\Input\\Sample.xls";
	String outfilepath = System.getProperty("user.dir")+"\\Input\\Output.xls";
	
	public void ExcelfileReadData() throws IOException
	{
		File F = new File(filepath);
		FileInputStream Fs = new FileInputStream(F);
		//XSSFWorkbook workbook = new XSSFWorkbook(Fs);
		HSSFWorkbook workbook = new HSSFWorkbook(Fs);
		Sheet readSheet =workbook.getSheet("Sheet1");
		int userRows = readSheet.getPhysicalNumberOfRows();
		for (int i=0;i<userRows;i++)
		{
			Row eachRow =readSheet.getRow(i);
			int usedColumn = eachRow.getLastCellNum();
			for(int j=0;j<usedColumn;j++)
			{
				Cell eachCell = eachRow.getCell(j);
				String value = eachCell.getStringCellValue();
				System.out.print(value);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void WriteData() throws IOException
	{
		String s ="This is Sathish";
		File F = new File(outfilepath);
		FileOutputStream outfile = new FileOutputStream(F);
		HSSFWorkbook workbook = new HSSFWorkbook();
		Sheet outputSheet = workbook.createSheet("outputData");
		Row newRow = outputSheet.createRow(0);
		Cell cellValue = newRow.createCell(0);
		cellValue.setCellValue(s);
		workbook.write(outfile);
		outfile.close();
		workbook.close();
	}
	
	
	public void ReadandWrite() throws IOException
	{
		File F = new File(filepath);
		FileInputStream Fs = new FileInputStream(F);
		//XSSFWorkbook workbook = new XSSFWorkbook(Fs);
		HSSFWorkbook workbook = new HSSFWorkbook(Fs);
		
		File outF = new File(outfilepath);
		FileOutputStream outfile = new FileOutputStream(outF);
		HSSFWorkbook outworkbook = new HSSFWorkbook();
		
		Sheet readSheet =workbook.getSheet("Sheet1");
		Sheet outputSheet = outworkbook.createSheet("outputData");
		
		int userRows = readSheet.getPhysicalNumberOfRows();
		for (int i=0;i<userRows;i++)
		{
			Row eachRow =readSheet.getRow(i);
			Row newRow = outputSheet.createRow(i);
			int usedColumn = eachRow.getLastCellNum();
			for(int j=0;j<usedColumn;j++)
			{
				Cell eachCell = eachRow.getCell(j);
				Cell outeachCell = newRow.createCell(j);
				outeachCell.setCellValue(eachCell.getStringCellValue());
			}
		}
		outworkbook.write(outfile);
		outfile.close();
		outworkbook.close();
		System.out.println("Done");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFileReadandWrite E = new ExcelFileReadandWrite();
		E.ReadandWrite();
	}

}

