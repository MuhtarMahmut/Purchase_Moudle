package PurchaseMoudle;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;
import MyUtilities.*;
import static PurchaseMoudle.NeededElements.*;

import java.util.List;

public class MuhtarsCases extends testbase1 {
	public MuhtarsCases() {
		PageFactory.initElements(Driver.getDriver(), NeededElements.class);	
	}
	
	@BeforeMethod
	public void settingup() {
		new MuhtarsCases();
		loginAsManager();	
		mylib.sleeps(2);
	}

		public void loginAsManager() {
			driver.get("http:52.39.162.23/web/login");
			firstClick.click();
			email.sendKeys(credentials.getManagerEmail());	       
			password.sendKeys(credentials.getManagerPassword());	       	    
			singinButton.click();  mylib.sleeps(2);
			purchaseMoudle.click();
		}
		
		@Test
	    public  void Test1() {
	 	 CreateButton.click();		SaveButton.click();   
		Assert.assertTrue(VendorErrorMessage.getText().contains("The following fields are invalid"));  
	    }
		
	    @Test
		public void Test2() {
			   CreateButton.click();
			OrderDateBox.click();		
		}
		
		@Test
		public void Test3() {
			  CreateButton.click();    AddanItem.click(); 
			WebElement subtotal=driver.findElement(By.xpath("span[@name='price_subtotal']"));
			Assert.assertTrue(subtotal.isDisplayed());	
		}
		
		@Test
		public void Test4() {
	   CreateButton.click();  AddanItem.click();  mylib.sleeps(1); 
			ProductDropDownBox.click();
			new Actions(driver).moveToElement(RandomElementInProduct).click().perform();
			Assert.assertTrue( UnitPrice.getText().isEmpty());
		}
		
		@Test
		public void Test5() {
			CreateButton.click();		AddanItem.click();	
			mylib.sleeps(1);   ProductDropDownBox.click();
			new Actions(driver).moveToElement(RandomElementInProduct).click().perform();
	WebElement AA=driver.findElement(By.xpath(".*[@class=\"o_field_float o_field_number o_field_widget o_input o_required_modifier\" and @name='product_qty']"));
			Assert.assertTrue(AA.isDisplayed());		
		}
		
		@Test
		public void Test6() {
			CreateButton.click();		AddanItem.click();	  
			mylib.sleeps(1);   ProductDropDownBox.click();
		new Actions(driver).moveToElement(RandomElementInProduct).click().perform();  DeleteTheAddedItem.click();	
		}
		
		@Test
		public void Test7() {
		CreateButton.click();		AddanItem.click();	  mylib.sleeps(1);       ProductDropDownBox.click();
			new Actions(driver).moveToElement(RandomElementInProduct).click().perform();   
			UnitPrice.sendKeys( Keys.CONTROL+"A"+Keys.BACK_SPACE);     UnitPrice.sendKeys("200");  
			wait.until(ExpectedConditions.textToBePresentInElement(Total, "200.00"));
			Assert.assertTrue(Total.getText().equals("200.00"));	
		}
		
		@Test
		public void Test8() {
			CreateButton.click();		AddanItem.click();	  mylib.sleeps(1);       ProductDropDownBox.click();
			new Actions(driver).moveToElement(RandomElementInProduct).click().perform();   
			UnitPrice.sendKeys( Keys.CONTROL+"A"+Keys.BACK_SPACE);     UnitPrice.sendKeys("200");  
			wait.until(ExpectedConditions.textToBePresentInElement(Total, "200.00"));
		double subtota=new Double(Subtotal.getText()),  Taxesamnt= new Double(TaxesAmount.getText());
			Assert.assertTrue(new Double(Total.getText())==(subtota+Taxesamnt));
		}
		
		@Test
		public void Test9() {
			CreateButton.click();		AddanItem.click();	  mylib.sleeps(1);       ProductDropDownBox.click();
			new Actions(driver).moveToElement(RandomElementInProduct).click().perform(); 
			List<WebElement> myele=driver.findElements(By.xpath(".*[@class='o_input ui-autocomplete-input' and @autocomplete='off']"));
			myele.get(0).click();
			RandomElementInVendor.click();
			SaveButton.click();
			RequestForQuota.click();
			
			}
		
		
	    public static void Userlogin() {
	    	driver.get("http:52.39.162.23/web/login");
	    	firstClick.click();
	    	email.sendKeys(credentials.getUserEmail());  
	    	password.sendKeys(credentials.getUserPassword());  
	    	singinButton.click();
	    	purchaseMoudle.click();
	    }
	    
	    
}
