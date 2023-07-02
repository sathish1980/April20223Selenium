package sel.April2023Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	WebDriver driver;
	public void webtableImplementation(String expectedCountryName) throws InterruptedException
	{
		driver = new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml");
		List<WebElement> pagination = driver.findElements(By.xpath("//*[@class='ui-paginator-pages']//a"));
		for(int j=1;j<=pagination.size();j++)
		{
		WebElement eachElement = driver.findElement(By.xpath("//*[@class='ui-paginator-pages']//a["+j+"]"));
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		eachElement.click();
		Thread.sleep(2000);
		List<WebElement> allRows = driver.findElements(By.xpath("//*[@id='form:j_idt89_data']//tr"));
		for(int i=1;i<allRows.size();i++)
		{
			 String CountryName = driver.findElement(By.xpath("//*[@id='form:j_idt89_data']//tr["+i+"]//td[2]//span[3]")).getText();
			 System.out.println(CountryName);
			 if(expectedCountryName.equalsIgnoreCase(CountryName))
			 {
				String name = driver.findElement(By.xpath("//*[@id='form:j_idt89_data']//tr["+i+"]//td[1]")).getText(); 
				String Representative = driver.findElement(By.xpath("//*[@id='form:j_idt89_data']//tr["+i+"]//td[3]//span[2]")).getText();
				String date = driver.findElement(By.xpath("//*[@id='form:j_idt89_data']//tr["+i+"]//td[4]")).getText();
				System.out.println(name + " "+Representative+" "+date);
			 }
		}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebTable wt = new WebTable();
		wt.webtableImplementation("France");

	}

}
