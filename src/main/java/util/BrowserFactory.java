package util;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
			
	   public void selectFromDropdown(WebElement element,String visibleText) {
			 Select sel = new Select(element);
			 sel.selectByVisibleText(visibleText);
		     }
	   
	   public int generateRandomNumber() {
		   Random rnd = new Random();
		int generatedNum  = rnd.nextInt();
		   		return generatedNum;
		   
	   }
	
	
	

}
