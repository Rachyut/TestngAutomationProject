package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import util.BrowserFactory;

 
public class ValidationPages extends BrowserFactory{
	
	WebDriver driver;
	
	public   ValidationPages(WebDriver driver) {
		this.driver = driver;}
		
	
	@FindBy(how = How.XPATH, using = "//input[@name=\"categorydata\"]")WebElement CreateCategory_Element;
	@FindBy(how = How.XPATH, using = "//input[@value=\"Add category\"]")WebElement AddCategory_Element;
	
	@FindBy(how = How.XPATH, using = "//input[@name=\"categorydata\"]")WebElement CreateCategory2_Element;
		@FindBy(how = How.XPATH, using = "//input[@value=\"Add category\"]")WebElement AddCategory2_Element;
		
		@FindBy(how = How.XPATH, using = "//select[@name=\"due_month\"]")WebElement MonthDropdown_Element;
		
		public void insertCategory(String categoryname) {
			CreateCategory_Element.sendKeys(categoryname + generateRandomNumber());
			
		}
		public void clickOnAddCategory() {
			AddCategory_Element.click();}
		
		public void validationofcategory() {
			
			Assert.assertTrue(AddCategory_Element.isDisplayed(),"No new category is added");
		}
		
		//Second number validation
		public void insertCategory2(String categoryname2) {
			CreateCategory2_Element.sendKeys(categoryname2 );
			
		}
		public void clickOnAddCategory2() {
			AddCategory2_Element.click();}
		
		public void validationofdublicatecategory() {
			Assert.assertTrue(AddCategory2_Element.isDisplayed()," The category you want to add already exists:categoryname2");
			
		}
		
				
		public void dueMonthDropdown(String monthname) {
			selectFromDropdown(MonthDropdown_Element,monthname);
		}
	 
	
	
}
	
     

