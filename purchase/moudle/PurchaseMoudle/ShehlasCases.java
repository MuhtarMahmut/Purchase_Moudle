package PurchaseMoudle;

import static PurchaseMoudle.NeededElements.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import MyUtilities.Driver;

public class ShehlasCases {
	public ShehlasCases() {
		PageFactory.initElements(Driver.getDriver(), NeededElements.class);	
	}
	@BeforeMethod
	public void settingup() {
		new ShehlasCases();
		loginAsManager();	
	}

		public void loginAsManager() {
			driver.get("http://52.39.162.23/web/login");
			firstClick.click();
			email.sendKeys(credentials.getManagerEmail());	       
			password.sendKeys(credentials.getManagerPassword());	       	    
			singinButton.click();  mylib.sleeps(2);
			purchaseMoudle.click();
		}
		
		@Test
		public void Test1() {
			
		}
		
		@Test
		public void Test2() {
			
		}
		@Test
		public void Test3() {
			
		}

}
