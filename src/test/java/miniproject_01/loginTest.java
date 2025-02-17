package miniproject_01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest extends baseclass {
	@BeforeClass
	public void setup() {
		LaunchingChromeBrowser();
		openurl ("https://www.demoblaze.com/");
	}
	@Test
	public void login() throws Exception {
		
		Thread.sleep(6000);
		WebElement Log = LocateByID("login2");
		click(Log);
		Thread.sleep(3000);
		WebElement LGusername = LocateByID("loginusername");
		SendValue(LGusername,"Siva24@gmail.com");
		Thread.sleep(3000);
		WebElement LGpassword = LocateByID("loginpassword");
		SendValue(LGpassword,"12345");
		Thread.sleep(3000);
		WebElement LGButton = LocateByxpath("//button[text()='Log in']");
		click(LGButton);
	}
	@AfterClass
	
	void closingbrowser() throws Exception {
		Thread.sleep(3000);
		Close();
	}
	

}
