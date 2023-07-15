package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BrowserDriver.BrowserLaunch;
import Commons.CommonWebElements;
import Pages.SearchPage;
import Pages.SearchResultPage;
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
	//c.ClickIfElementExist(driver,"//*[@class='close']");
	//c.ClickOnAddClose(driver);
		
	}
	
	@Test(priority=0)
	public void ValidFlightSearch()
	{
			SearchPage sp=  new SearchPage(driver);
			String Fromlocation = sp.ClickAndSelectFromValue("MAA");
		  	String Tolocation = sp.ClickAndSelectToValue("PNQ");
		  	sp.SelectDepatureDate("25");
		  	sp.ClickOnSearch();
		  	SearchResultPage srp = new SearchResultPage(driver);
		  	srp.WaitAndClickOnOKGotItPopup();
		  	String actualSearchResult = srp.GetSearchResultValue();
		  	String ExpectedSearchResult = srp.expectedString(Fromlocation , Tolocation);
		  	System.out.println(ExpectedSearchResult);
		  	Assert.assertEquals(actualSearchResult, ExpectedSearchResult);
	}
	
	@Test(priority=1)
	public void InValidFromAndToSearch()
	{
		SearchPage sp=  new SearchPage(driver);
			c.ClickOnBrowserBackButton(driver);
			String Fromlocation = sp.ClickAndSelectFromValue("MAA");
		  	String Tolocation = sp.ClickAndSelectToValue("MAA");
		  	String ExpectedSearchResult= "From & To airports cannot be the same";
		  	Assert.assertEquals(sp.GetErrorMessage(), ExpectedSearchResult);
	}
	
	
	
	
}
