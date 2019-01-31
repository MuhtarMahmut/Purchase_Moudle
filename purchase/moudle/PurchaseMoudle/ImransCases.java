package PurchaseMoudle;

import static PurchaseMoudle.NeededElements.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import MyUtilities.*;

public class ImransCases extends testbase1{
	public ImransCases() {
		PageFactory.initElements(Driver.getDriver(), NeededElements.class);	
	}
	@BeforeMethod
	public void settingup() {
		new ImransCases();
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
