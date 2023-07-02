package sel.April2023Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {
	
	WebDriver driver;
	public void framesimplementation() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[contains(@style,'#ff7295')]")).click();
		
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		
		for(int i=0;i<allFrames.size();i++)
		{
			driver.switchTo().frame(i);
			List<WebElement> mywebelement =driver.findElements(By.xpath("//button[contains(@style,'#ff7295')]"));
			if(mywebelement.size()>0)
			{
				driver.findElement(By.xpath("//button[contains(@style,'#ff7295')]")).click();
				driver.switchTo().defaultContent();
					
			}
		}
		
	}
	
	public void framesinsideofFrameimplementation() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[contains(@style,'#ff7295')]")).click();
		
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
			
		for(int i=0;i<allFrames.size();i++)
		{
			driver.switchTo().frame(i);
			List<WebElement> insideallFrames = driver.findElements(By.tagName("iframe"));
			
		for(int j=0;j<insideallFrames.size();j++)
			{
			if(insideallFrames.size()>0)
			{
				driver.switchTo().frame(j);
					List<WebElement> mywebelement =driver.findElements(By.xpath("//button[contains(@style,'#4b7ecf')]"));
					if(mywebelement.size()>0)
					{
						driver.findElement(By.xpath("//button[contains(@style,'#4b7ecf')]")).click();
						driver.switchTo().defaultContent();
						break;	
					}
					driver.switchTo().defaultContent();	
			}
			driver.switchTo().defaultContent();	
		}
		driver.switchTo().defaultContent();	
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		IFrames I = new IFrames();
		I.framesinsideofFrameimplementation();
	}

}
