package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commons.CommonWebElements;

public class SearchPage extends CommonWebElements {
	WebDriver driver;
	@FindBy (xpath="//*[@for='fromCity']")
	WebElement fromButton;
	@FindBy (xpath="//input[@id='fromCity']")
	WebElement FromGetAttribute;
	@FindBy (xpath="//*[@for='toCity']")
	WebElement toButton;
	@FindBy (xpath = "//input[@id='toCity']")
	WebElement ToGetAttribute;
	@FindBy (xpath ="//*[@data-cy='submit']//a")
	WebElement submitButton;
	@FindBy (xpath ="//*[@data-cy='sameCityError']")
	WebElement GetErrorMessage;
	
	By fromElement = By.xpath("//*[@for='fromCity']");
	By fromList = By.xpath("//ul[@role='listbox']//li");
	By fromListFirstValue = By.xpath("(//ul[@role='listbox']//li)[1]");
	By errorElement = By.xpath("//*[@data-cy='sameCityError']");
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String ClickAndSelectFromValue(String fromValue)
	 {
		//FluentWait(driver);
		WaitForElementToBeClickable(driver,fromElement , 60);
		//WebElement fromButton = driver.findElement(By.xpath("//*[@for='fromCity']"));
		ClickOnButton(fromButton);
			
			WaitForElementToBeVisible(driver,fromListFirstValue,60);
			SelectTheValueFromList(driver, fromList,fromValue);
			String FromCityName=GetAttributeOfelement(FromGetAttribute,"value");
			return FromCityName;
	}
	
	public String ClickAndSelectToValue(String fromValue)
	 {
		//WebElement toButton = driver.findElement(By.xpath("//*[@for='toCity']"));
		ClickOnButton(toButton);
			
		WaitForElementToBeVisible(driver,fromListFirstValue,60);
		SelectTheValueFromList(driver,fromList,fromValue);
			String FromCityName=GetAttributeOfelement(ToGetAttribute,"value");
			return FromCityName;
	}

	public void SelectDepatureDate(String date)
	{
		SelectValueinCalender(driver,date);
	  	
	}
	
	public void ClickOnSearch()
	{
		clickOnButton(submitButton);
	  	
	}
	
	public String GetErrorMessage()
	{
		WaitForElementToBeVisible(driver,errorElement , 60);
		return GetTextOfelement(GetErrorMessage);
	}
	

}
