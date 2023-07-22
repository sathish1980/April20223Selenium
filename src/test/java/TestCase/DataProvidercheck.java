package TestCase;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utils.ExcelReadData;

public class DataProvidercheck {
	
	@DataProvider
	public Object[][] ReadSearchData() throws IOException
	{
		ExcelReadData E = new ExcelReadData();
		return E.ExcelRead("MakemyTripInput.xls", "Input");
	}
	
	@DataProvider
	public Object[][] InvalidReadSearchData() throws IOException
	{
		ExcelReadData E = new ExcelReadData();
		return E.ExcelRead("MakemyTripInput.xls", "inValidData");
	}

}
