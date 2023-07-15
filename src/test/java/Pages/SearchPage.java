package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Commons.CommonWebElements;

public class SearchPage extends CommonWebElements {
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String ClickAndSelectFromValue(String fromValue)
	 {
		WaitForElementToBeClickable(driver, By.xpath("//*[@for='fromCity']"), 60);
		WebElement fromButton = driver.findElement(By.xpath("//*[@for='fromCity']"));
		ClickOnButton(driver.findElement(By.xpath("//*[@for='fromCity']")));
			
			WaitForElementToBeVisible(driver,By.xpath("(//ul[@role='listbox']//li)[1]"),60);
			SelectTheValueFromList(driver, By.xpath("//ul[@role='listbox']//li"),fromValue);
			String FromCityName=GetAttributeOfelement(driver.findElement(By.xpath("//input[@id='fromCity']")),"value");
			return FromCityName;
	}
	
	public String ClickAndSelectToValue(String fromValue)
	 {
		WebElement fromButton = driver.findElement(By.xpath("//*[@for='toCity']"));
		ClickOnButton(driver.findElement(By.xpath("//*[@for='toCity']")));
			
		WaitForElementToBeVisible(driver,By.xpath("(//ul[@role='listbox']//li)[1]"),60);
		SelectTheValueFromList(driver, By.xpath("//ul[@role='listbox']//li"),fromValue);
			String FromCityName=GetAttributeOfelement(driver.findElement(By.xpath("//input[@id='toCity']")),"value");
			return FromCityName;
	}

	public void SelectDepatureDate(String date)
	{
		SelectValueinCalender(driver,date);
	  	
	}
	
	public void ClickOnSearch()
	{
		clickOnButton(driver.findElement(By.xpath("//*[@data-cy='submit']//a")));
	  	
	}
	
	public String GetErrorMessage()
	{
		WaitForElementToBeVisible(driver, By.xpath("//*[@data-cy='sameCityError']"), 60);
		return GetTextOfelement(driver.findElement(By.xpath("//*[@data-cy='sameCityError']")));
	}
	

}
