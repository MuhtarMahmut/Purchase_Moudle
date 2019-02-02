package PurchaseMoudle;

import static PurchaseMoudle.NeededElements.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import MyUtilities.*;

public class IhtiparsCases extends testbase1{
	public IhtiparsCases() {
		PageFactory.initElements(Driver.getDriver(), NeededElements.class);	
	}
//	@BeforeMethod
	// public void settingup() {
	//	new IhtiparsCases();
	//	loginAsManager();	
	//  }

		
		@Test
		public void Test1() {
			new IhtiparsCases();
			loginAsManager();
			CreateButton.click();
			
		}
		
	//	@Test
		public void Test2() {
			
		}
	//	@Test
		public void Test3() {
			
		}
	
	
	

}
