package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ValidationPages;
import util.BrowserFactory;

public class ValidationTest {

	 WebDriver driver;
	ValidationPages validationpages;

	String categoryname = "Rachana12";
	String categoryname2 = "Rachana12";
	String monthname = "Jan";
	String monthname2 = "Feb";
	String monthname3 = "Mar";
	String monthname4 = "Apr";
	String monthname5 = "May";
	String monthname6 = "Jun";
	String monthname7 = "Jul";
	String monthname8 = "Aug";
	String monthname9 = "Sep";
	String monthname10 = "Oct";
	String monthname11 = "Nov";
	String monthname12 = "Dec";
	
	@BeforeTest
	public void beforerun() {
		driver = BrowserFactory.init();
		validationpages = PageFactory.initElements(driver, ValidationPages.class);
	}
	@AfterTest
	  public void tearDown() {
		  driver.close();
		  driver.quit();
	  }

	@Test(priority=1)
	public void userAbleToAddCategory() {

		//driver = BrowserFactory.init();
		
		validationpages.insertCategory(categoryname);
		validationpages.clickOnAddCategory();
		validationpages.validationofcategory();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
		
         @Test(priority=2)
		public void usernotabletodublicatecategory() {
			
		validationpages.insertCategory2(categoryname2);
		validationpages.clickOnAddCategory2();
		validationpages.validationofdublicatecategory();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
         @Test(priority=3)
		public void userAbleToDropDownMonths() {

		validationpages.dueMonthDropdown(monthname);
		System.out.println(monthname);

		validationpages.dueMonthDropdown(monthname2);
		System.out.println(monthname2);

		validationpages.dueMonthDropdown(monthname3);
		System.out.println(monthname3);

		validationpages.dueMonthDropdown(monthname4);
		System.out.println(monthname4);

		validationpages.dueMonthDropdown(monthname5);
		System.out.println(monthname5);

		validationpages.dueMonthDropdown(monthname6);
		System.out.println(monthname6);

		validationpages.dueMonthDropdown(monthname7);
		System.out.println(monthname7);

		validationpages.dueMonthDropdown(monthname8);
		System.out.println(monthname8);

		validationpages.dueMonthDropdown(monthname9);
		System.out.println(monthname9);

		validationpages.dueMonthDropdown(monthname10);
		System.out.println(monthname10);

		validationpages.dueMonthDropdown(monthname11);
		System.out.println(monthname11);

		validationpages.dueMonthDropdown(monthname12);
		System.out.println(monthname12);
	}
	

}
