package miniproject_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartFuctionality extends baseclass {
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
	public void AddCart() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Product1 = LocateByxpath("//a[text()='Samsung galaxy s6']");
		click(Product1);
		int SamsungPrice = 360;
		System.out.println("the price of samsung is "+SamsungPrice);
		WebElement AddCart = LocateByxpath("//a[text()='Add to cart']");
		click(AddCart);
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement Cart = LocateByID("cartur");
		click(Cart);
		System.out.println("The Samsung phone is added to the Cart");
		WebElement home = LocateByxpath("//a[text()='Home ']");		
		click(home);
		WebElement Product2 = LocateByxpath("//a[text()='Nokia lumia 1520']");
		click(Product2);
		int NokiaPrice = 820;
		System.out.println("the price of the nokia is " +NokiaPrice);
		WebElement AddCart1 = LocateByxpath("//a[text()='Add to cart']");
		click(AddCart1);
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		WebElement Cart1 = LocateByID("cartur");
		click(Cart1);
		System.out.println("The Nokia phone is added to the cart");
		int TotalAmountM = NokiaPrice + SamsungPrice;
		System.out.println("The total amount of the cart is "+ TotalAmountM);
	
    }
	private void screenshot() {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void DeleteItem() throws Exception {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement home1 = LocateByxpath("//a[text()='Home ']");		
	click(home1);
	WebElement Cart2 = LocateByID("cartur");
	click(Cart2);
	WebElement delete = LocateByxpath("//a[text()='Delete']");
	click(delete);
	Thread.sleep(5000);
	System.out.println("The Samsung phone is deleted from the Cart");
	WebElement TotalpriceElement = LocateByxpath("//div[@class='panel-heading']");
	String CurrentCartPrice = TotalpriceElement.getText();
	System.out.println("The Price of the Current Cart is :" +CurrentCartPrice);
	System.out.println("The Clearing product from the cart is reflecting in the UI");
	
	
	
	}
	
	@AfterClass
	void closingbrowser() {
	Close();
	}


}
