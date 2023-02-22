package Module1_Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceBroker_Login
{

	//POM-I
	
	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
		
		@FindBy(id="email")  private  WebElement Email;  //private WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		
		@FindBy(xpath="//input[@id='password']")  private  WebElement Password;  //private WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		
		@FindBy(xpath="//input[@name='submit']")   private   WebElement Loginbtn; //private WebElement Loginbtn=driver.findElement(By.xpath("//input[@name='submit']"));

		//2. Initialize within a constructor with access level public using pagefactory

		public InsuranceBroker_Login(WebDriver driver)
		{
			PageFactory.initElements(driver , this);
		}
		
		//3. Utilize within a method with access level public
		
		public void EnterEmail(String EmailAddress) //saradeg41@gmail.com 
		{
			Email.sendKeys(EmailAddress);   //saradeg41@gmail.com 
		}	
		
		public void EnterPassowrd(String Pass)    //Sai@1117 
		{
			Password.sendKeys(Pass);  //Sai@1117 
		}	
		
		public void ClickLoginBtn() 
		{
			Loginbtn.click();
		}

	
	                                       
	
}
