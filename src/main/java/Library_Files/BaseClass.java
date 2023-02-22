package Library_Files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClass 
{
	
	public WebDriver driver;
	
	
	public void InitializeBrowser() 
	{
		//Step-I:
				//Parameter-I: Name of the Browser
				//Parameter-II:Path of ChromeDriver.exe file
						
		System.setProperty("webdriver.chrome.driver", "C:\\Mayuri\\Installations\\chromedriver.exe");

				//Step-II:Create object of ChromeDriver class by providing reference of WebDriver(Interface)
		driver=new ChromeDriver();        //Upcasting
					               				       
				//To Enter URL
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
					
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 

		
	}

}