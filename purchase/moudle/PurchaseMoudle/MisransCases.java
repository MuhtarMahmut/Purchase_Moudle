package PurchaseMoudle;

import static Pages.MisransElements.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import MyUtilities.*;
import Pages.MisransElements;

public class MisransCases extends testbase1{
	
	@BeforeMethod
	public void settingup() {
		new MisransElements();
		loginAsManager();
	}
	
	
	

		
	
	

}
