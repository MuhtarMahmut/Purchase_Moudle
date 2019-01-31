package PurchaseMoudle;
import static PurchaseMoudle.NeededElements.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import MyUtilities.*;

public class ZohrasCases extends testbase1{
	public ZohrasCases() {
		PageFactory.initElements(Driver.getDriver(), NeededElements.class);	
	}
	@BeforeMethod
	public void settingup() {
		new ZohrasCases();
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
