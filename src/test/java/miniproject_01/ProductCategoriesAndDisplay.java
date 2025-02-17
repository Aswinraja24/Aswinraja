package miniproject_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductCategoriesAndDisplay extends baseclass {
	
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
	
      @Test
      public void MenuVerifications() {
    	  
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement homeMenu = LocateByxpath("//a[text()='Home ']"); 
	     WebElement aboutusMenu = LocateByxpath("//a[text()='About us']");
	    Assert.assertTrue(homeMenu.isDisplayed(), "Home menu is not displayed");
	    Assert.assertTrue(aboutusMenu.isDisplayed(), "About menu is not displayed");
	    System.out.println("Home menu is displayed: " + homeMenu.isDisplayed());
	    System.out.println("About menu is displayed: " + aboutusMenu.isDisplayed());
	    WebElement Lap  = LocateByxpath("//a[text()='Laptops']");
	    Assert.assertTrue(Lap.isDisplayed(),"The Laptop is not present under the Category");
	    System.out.println("Laptop is displayed under the Category : " +Lap.isDisplayed());
	    WebElement Phone  = LocateByxpath("//a[text()='Phones']");
	    Assert.assertTrue(Phone.isDisplayed(),"The Phone is not present under the Category");
	    System.out.println("Phone is displayed under the Category : " + Phone.isDisplayed());
	    WebElement Monitor  = LocateByxpath("//a[text()='Monitors']");
	    Assert.assertTrue(Monitor.isDisplayed(),"The Monitor is not present under the Category");
	    System.out.println("Monitor is displayed under the Category : " + Monitor.isDisplayed());
	    WebElement logo = LocateByID("nava");
	    if (logo.isDisplayed()) {
	        System.out.println("Logo is visible on the page.");
	    } else {
	        System.out.println("Logo is not visible.");
	    }

	    
	    }
	@AfterClass
	void closingbrowser() {
		Close();
	}
	
}
