package sel.April2023Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	
	public void dropdownimplementation() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='first']")));
		dropdown.selectByVisibleText("Iphone");
		
		Select dropdownanimal = new Select(driver.findElement(By.xpath("//select[@id='animals']")));
		dropdownanimal.selectByIndex(2);
		
		Select multidropdown = new Select(driver.findElement(By.xpath("//select[@id='second']")));
		if(multidropdown.isMultiple())
		{
			multidropdown.selectByValue("burger");
			multidropdown.selectByIndex(0);
			multidropdown.selectByVisibleText("Donut");
			Thread.sleep(2000);
			multidropdown.deselectByIndex(0);
			Thread.sleep(2000);
			multidropdown.deselectAll();
			
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Dropdown D = new Dropdown();
		D.dropdownimplementation();
	}

}
