package miniproject_01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class signingupTest extends baseclass {
	
	@BeforeClass
	public void setup() {
		LaunchingChromeBrowser();
		openurl ("https://www.demoblaze.com/");
	}
	@Test
	public void signup() throws Exception {
		Thread.sleep(6000);
		WebElement signup = LocateByID("signin2");
		click(signup);
		Thread.sleep(6000);
		WebElement UserName = LocateByID("sign-username");
		SendValue(UserName,"Siva1234567@gmail.com");
		Thread.sleep(3000);
		WebElement Password = LocateByID("sign-password");
		SendValue(Password,"12345");
		Thread.sleep(3000);
		WebElement SIButton = LocateByxpath("//button[text()='Sign up']");
		click(SIButton);
		Thread.sleep(3000);
		Alert alert = driver.switchTo() .alert();
		alert.accept();
}
	@AfterClass
	void closingbrowser() {
		Close();
	}
	    
}