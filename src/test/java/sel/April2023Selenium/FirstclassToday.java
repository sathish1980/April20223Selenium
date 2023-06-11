package sel.April2023Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstclassToday {
	
	public void launch()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		/*driver.navigate().to("https://www.gmail.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		//WebElement username = driver.findElement(By.id("email"));
		
	    //WebElement username = driver.findElement(By.name("email"));
		
		//WebElement username = driver.findElement(By.className("inputtext _55r1 _6luy"));
		
		//username.sendKeys("kumar");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("pass")).click();
		// driver.findElement(By.cssSelector("input#email")).sendKeys("sathish");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("kumar");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		//driver.close();
		//driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstclassToday F = new FirstclassToday();
		F.launch();
	}

}
