package sel.April2023Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Listconcpet {
	
	WebDriver driver;
	public void listimplementation(String expectedCountry)
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		driver.findElement(By.xpath("//*[@id='j_idt87:country']//div[contains(@class,'ui-selectonemenu-trigger')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='j_idt87:country_panel']//ul//li[1]")));
		
		List<WebElement> allcountries = driver.findElements(By.xpath("//*[@id='j_idt87:country_panel']//ul//li"));
		for(WebElement eachcountry : allcountries)
		{
			String actualCountry = eachcountry.getText();
			System.out.println(actualCountry);
			if(expectedCountry.equalsIgnoreCase(actualCountry))
			{
				eachcountry.click();
				break;
			}
		}
	}
	
	
	public void listmultipleselect() throws InterruptedException
	{
		String[] searchValue = {"Paris","Rome"};
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-trigger')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='ui-selectcheckboxmenu-filter-container']//input"))));
		for(String eachvalue : searchValue)
		{
		driver.findElement(By.xpath("//*[@class='ui-selectcheckboxmenu-filter-container']//input")).clear();
			
		driver.findElement(By.xpath("//*[@class='ui-selectcheckboxmenu-filter-container']//input")).sendKeys(eachvalue);
		List<WebElement> country = driver.findElements(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-items')]//li"));
		
		for(WebElement eachCountry : country)
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-items')]//li[1]")));
			// Thread.sleep(1000);
			String value = eachCountry.getAttribute("data-item-value");
			if(value.equalsIgnoreCase(eachvalue))
			{
				eachCountry.findElement(By.cssSelector("div[class*='ui-chkbox-box']")).click();
				
				break;
			}
		}
		}
		driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-close')]")).click();
	String[] expectedValue =ValueFromTextBox();
	CompareSringarray(searchValue , expectedValue);
	
	}
	
	public void CompareSringarray(String[] actual , String[] expected)
	{
		for(String eachactualValue : actual)
		{
			for(String eachexpectedValue : expected)
			{
				if(eachactualValue.equalsIgnoreCase(eachexpectedValue))
				{
					System.out.println("Both values are mathced: "+eachexpectedValue);
					break;
				}
			}
		}
		
	}
	public String[] ValueFromTextBox()
	{
		String[] allvalue = new String[2];
		int count= 0;
		List<WebElement> allValues = driver.findElements(By.xpath("//*[@data-label='Cities']//li"));
		for(WebElement eachValue : allValues)
		{
			allvalue[count]=eachValue.getAttribute("data-item-value");
			count=count+1;
		}
		
		return allvalue;
	}

	
	public void Disabledceckbox()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		
		WebElement checkbox =driver.findElement(By.xpath("//*[@id='j_idt87:j_idt102']//div[2]"));
		String enabledorDisabled = checkbox.getAttribute("class");
		if(enabledorDisabled.contains("disabled"))
		{
			System.out.println("It is disabled and the class attribute is : " +enabledorDisabled);
		}
		else
		{
			checkbox.click();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Listconcpet L = new Listconcpet();
		// L.listimplementation("India");
		L.Disabledceckbox();
	}

}
