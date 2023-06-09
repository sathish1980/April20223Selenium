package BrowserDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import Utils.PropertyReadData;


public class BrowserLaunch {
	
	public static WebDriver driver;
	
	public void Launch()
	{
		String browserName = PropertyReadData.propreaddata().getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			//test.log(LogStatus.INFO, browserName);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--disable-Notifications");
			//options.addArguments("--incognito");
			driver= new ChromeDriver(options);
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			//test.log(LogStatus.INFO, browserName);
			EdgeOptions options = new EdgeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--disable-Notifications");
			options.addArguments("--incognito");
			driver= new EdgeDriver(options);
		}
		else
		{
			System.out.println("Please provide the valid Browser name");
		}
			
	}

}
