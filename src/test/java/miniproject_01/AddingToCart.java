package miniproject_01;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddingToCart extends baseclass {
	@BeforeClass
	public void setup() {
		LaunchingChromeBrowser();
		openurl ("https://www.demoblaze.com/");
	}
	@Test
	public void login() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Log = LocateByID("login2");
		click(Log);
		WebElement LGusername = LocateByID("loginusername");
		SendValue(LGusername,"Siva24@gmail.com");
		WebElement LGpassword = LocateByID("loginpassword");
		SendValue(LGpassword,"12345");
		WebElement LGButton = LocateByxpath("//button[text()='Log in']");
		click(LGButton);
	}
	@Test
	public void AddCart() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Product1 = LocateByxpath("//a[text()='Samsung galaxy s6']");
		click(Product1);
		System.out.println("The Page is redirected to the Samsung galaxy s6 details page");
		WebElement price = LocateByxpath("//h3[@class='price-container']");
		String pricetext = price.getText();
		System.out.println("The price of the Samsung is : " +pricetext);
		String ExpectedSamsungPrice = "$360 *includes tax";
		Assert.assertEquals(pricetext,ExpectedSamsungPrice,"The product prices is not matching");
		WebElement AddCart = LocateByxpath("//a[text()='Add to cart']");
		click(AddCart);
		Thread.sleep(2000); 
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement Cart = LocateByID("cartur");
		click(Cart);
		System.out.println("The Samsung phone is added to the cart");
		WebElement home = LocateByxpath("//a[text()='Home ']");		
		click(home);
		WebElement Product2 = LocateByxpath("//a[text()='Nokia lumia 1520']");
		click(Product2);
		System.out.println("The Page is redirected to the Nokia lumia 1520 details page");
		WebElement price1 = LocateByxpath("//h3[@class='price-container']");
		String price1text = price1.getText();
		System.out.println("The price of the nokia lumia is : " +price1text);
		String ExpectedNokiaPrice = "$820 *includes tax";
		Assert.assertEquals(price1text,ExpectedNokiaPrice,"The product prices is not matching");
		WebElement AddCart1 = LocateByxpath("//a[text()='Add to cart']");
		click(AddCart1);
		Thread.sleep(2000); 
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		WebElement Cart1 = LocateByID("cartur");
		click(Cart1);
		System.out.println("The Nokia phone is added to the cart");
		System.out.println("The Product count is increamented ");
  }
	@AfterClass
	void closingbrowser() {
	Close();
	}

}
