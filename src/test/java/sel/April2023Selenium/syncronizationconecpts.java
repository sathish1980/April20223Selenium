package sel.April2023Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syncronizationconecpts {
	
	
	public void Fblaunch() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//implict wait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		//Explicit wait
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
		
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("sathish");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		syncronizationconecpts s = new syncronizationconecpts();
		s.Fblaunch();
	}

}
