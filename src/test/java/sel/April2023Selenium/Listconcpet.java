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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listconcpet L = new Listconcpet();
		L.listimplementation("India");
	}

}
