package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BrowserDriver.BrowserLaunch;
import Commons.CommonWebElements;
import Pages.SearchPage;
import Pages.SearchResultPage;
import Utils.ExcelReadData;
import Utils.PropertyReadData;

public class MakeMytripSearch extends BrowserLaunch
{
	CommonWebElements c= new CommonWebElements();
	@BeforeSuite
	public void BrowserStart()
	{
		Launch();	
	}
	
	@BeforeTest
	public void EnterUrl()
	{
		String url = PropertyReadData.propreaddata().getProperty("url");
		driver.get(url);
	}
	
	@BeforeClass
	public void ClearPopup() throws InterruptedException
	{
	
	Thread.sleep(5000);
	c.BrowserRefresh(driver);
	Thread.sleep(5000);
	//c.ClickIfElementExist(driver,"//*[@class='close']");
	//c.ClickOnAddClose(driver);
		
	}
	
	@Test(priority=0,dataProvider="ReadSearchData",dataProviderClass=DataProvidercheck.class)
	public void ValidFlightSearch(String fromLocation, String toLocation, String flyDate)
	{
			SearchPage sp=  new SearchPage(driver);
			String Fromlocation = sp.ClickAndSelectFromValue(fromLocation);
		  	String Tolocation = sp.ClickAndSelectToValue(toLocation);
		  	sp.SelectDepatureDate(flyDate);
		  	sp.ClickOnSearch();
		  	SearchResultPage srp = new SearchResultPage(driver);
		  	srp.WaitAndClickOnOKGotItPopup();
		  	String actualSearchResult = srp.GetSearchResultValue();
		  	String ExpectedSearchResult = srp.expectedString(Fromlocation , Tolocation);
		  	System.out.println(ExpectedSearchResult);
		  	Assert.assertEquals(actualSearchResult, ExpectedSearchResult);
		  	c.ClickOnBrowserBackButton(driver);
	}
	
	@Test(priority=1, dataProvider="InvalidReadSearchData",dataProviderClass=DataProvidercheck.class)
	public void InValidFromAndToSearch(String fromLocation, String toLocation, String flyDate)
	{
		SearchPage sp=  new SearchPage(driver);
			
			String Fromlocation = sp.ClickAndSelectFromValue(fromLocation);
		  	String Tolocation = sp.ClickAndSelectToValue(toLocation);
		  	String ExpectedSearchResult= "From & To airports cannot be the same";
		  	Assert.assertEquals(sp.GetErrorMessage(), ExpectedSearchResult);
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
}
