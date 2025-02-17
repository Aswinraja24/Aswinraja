package miniproject_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PurchaseTest extends baseclass {
	@BeforeClass
	public void setup() {
		LaunchingChromeBrowser();
		openurl ("https://www.demoblaze.com/");
	}
	
	@Test
	public void login() throws Exception {
		Thread.sleep(3000);
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
	public void AddCart() throws Exception {
		Thread.sleep(3000);
		WebElement Product1 = LocateByxpath("//a[text()='Samsung galaxy s6']");
		click(Product1);
		Thread.sleep(3000);
		WebElement AddCart = LocateByxpath("//a[text()='Add to cart']");
		click(AddCart);
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		WebElement Cart = LocateByID("cartur");
		click(Cart);
		Thread.sleep(3000);
		WebElement home = LocateByxpath("//a[text()='Home ']");		
		click(home);
		Thread.sleep(3000);
		WebElement Product2 = LocateByxpath("//a[text()='Nokia lumia 1520']");
		click(Product2);
		Thread.sleep(3000);
		WebElement AddCart1 = LocateByxpath("//a[text()='Add to cart']");
		click(AddCart1);
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(3000);
		WebElement Cart1 = LocateByID("cartur");
		click(Cart1);
	}
	
	@Test
	public void Purchase() throws Exception {
		Thread.sleep(3000);
		WebElement order = LocateByxpath("//button[text()='Place Order']");
		click(order);
		Thread.sleep(3000);
		WebElement Name = LocateByID("name");
		SendValue(Name,"Aswin");
		Thread.sleep(3000);
		WebElement Country = LocateByID("country");
		SendValue(Country,"INDIA");
		Thread.sleep(3000);
		WebElement City = LocateByID("city");
		SendValue(City,"Vellore");
		Thread.sleep(3000);
		WebElement CreditCard = LocateByID("card");
		SendValue(CreditCard,"hdfc");
		Thread.sleep(3000);
		WebElement Month = LocateByID("month");
		SendValue(Month,"october");
		Thread.sleep(3000);
		WebElement Year = LocateByID("year");
		SendValue(Year,"2000");
		Thread.sleep(3000);
		WebElement purchase1 = LocateByxpath("//button[text()='Purchase']");
		click(purchase1);
		Thread.sleep(5000);
		WebElement done = LocateByxpath("//button[text()='OK']");
		click(done);
	}
	/*	@Test
		public void ConfirmationPopup() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(5000);
			WebElement done = LocateByxpath("//button[text()='OK']");
			click(done);
			WebElement purchaseID =LocateByxpath("//p[contains(text(),'Id: 9189654')]/text()[1]");
			System.out.println(purchaseID.getText());
			
		}*/
		
		
	
	@AfterClass
	void closingbrowser() {
	Close();
	}

}

