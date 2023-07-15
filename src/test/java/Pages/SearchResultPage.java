package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Commons.CommonWebElements;

public class SearchResultPage extends CommonWebElements {
	
	WebDriver driver;
	
	public SearchResultPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void WaitAndClickOnOKGotItPopup()
	{
		WaitForElementToBeClickable(driver,By.xpath("//*[text()='OKAY, GOT IT!']"),60);
		clickOnButton(driver.findElement(By.xpath("//*[text()='OKAY, GOT IT!']")));
		
	}
	
	public String GetSearchResultValue()
	{
		String text =GetTextOfelement(driver.findElement(By.xpath("//*[contains(@class,'journey-title')]")));
		System.out.println(text);
		return text;
	}

	public String expectedString(String from , String to)
	{
	
		String expected = "Flights from "+from+" to "+to;
		return expected;
	}
}
