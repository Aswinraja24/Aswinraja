package miniproject_01;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v131.filesystem.model.File;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
public static WebDriver driver;


	public void LaunchingChromeBrowser() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }
	
	public static void openurl(String url) {
		driver.get(url);
		}
	public void Maximize() {
		driver.manage().window().maximize();
	}
	public static void Close() {
		driver.close();
	}
	public static void click (WebElement element) {
		element.click();
	}
	
	public static void refresh () {
		driver.navigate().refresh();
	}
	public static WebElement LocateByID(String ID) {
		return driver.findElement(By.id(ID));
	}
	public static WebElement LocateByxpath(String Path) {
		return driver.findElement(By.xpath(Path));
	}
	public static WebElement SendValue(WebElement element, String value) {
		element.sendKeys(value);
		return element;
	}
	public String screenShot (String name)  {
	
		TakesScreenshot screenshot = (TakesScreenshot) driver;
        java.io.File src = screenshot.getScreenshotAs(OutputType.FILE);

        // Define the destination path and filename
        String destPath = "C:\\Users\\Tommy\\eclipse-workspace\\MiniProject_01_Version_01\\Screenshots\\miniprojectScreenshots_" + name + ".jpg";
        File dest = new File(destPath, null, null, destPath);
		return destPath;
	}
}
