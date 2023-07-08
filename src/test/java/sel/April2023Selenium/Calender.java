package sel.April2023Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	WebDriver driver;
	String EventName = "Selenium Session";
	String identified = "No";
	public void calenderImplementation(String selectionDate) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/calendar.xhtml");
		List<WebElement> TotatRows = driver.findElements(By.xpath("//*[@class='fc-scrollgrid-sync-table']//tbody//tr"));
		for(int i=1;i<TotatRows.size();i++)
		{
			List<WebElement> TotalColumns = driver.findElements(By.xpath("//*[@class='fc-scrollgrid-sync-table']//tbody//tr["+i+"]//td"));
			for(WebElement eachElement :TotalColumns)
			{
				String ClassName =eachElement.getAttribute("class");
				String actaulDate = eachElement.getAttribute("data-date");
				if (!ClassName.endsWith("fc-day-other") && actaulDate.equalsIgnoreCase(selectionDate))
				{
					eachElement.click();
					WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
					wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='j_idt87:title']")));
					driver.findElement(By.xpath("//*[@id='j_idt87:title']")).sendKeys(EventName);
					System.out.println("Entered name");
					wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt87:addButton")));	
					driver.findElement(By.id("j_idt87:addButton")).click();
					System.out.println("clicked add button");
					Thread.sleep(2000);
					String actualEventName = eachElement.findElement(By.cssSelector("div.fc-event-title")).getText();
					System.out.println("retrived actual name");
					System.out.println(actualEventName);
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ui-icon ui-icon-closethick']")));	
					
					driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-closethick']")).click();
					identified="Yes";
					break;
				}
			}
			if(identified.equals("Yes"))
			{
				break;
			}
			
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Calender c = new Calender();
		c.calenderImplementation("2023-07-20");
	}

}
