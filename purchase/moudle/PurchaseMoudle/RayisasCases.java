package PurchaseMoudle;

import static Pages.RayisasElemnts.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import MyUtilities.*;
import Pages.RayisasElemnts;

public class RayisasCases extends testbase1{
			
	public RayisasCases() {
		PageFactory.initElements(Driver.getDriver(), RayisasElemnts.class);	
	}
	@BeforeMethod
	public void settingup() {
		new RayisasCases();
		loginAsManager();	
	}

	@Test(priority= 1)
	public void Test1() {
		wait.until(ExpectedConditions.titleContains("Requests for Qu"));
		Assert.assertTrue(driver.getTitle().contains("Requests for Qu"));
	}

	@Test(priority= 2 )
	public void Test2() {
		Assert.assertTrue(driver.getTitle().contains(headerText.getText()));
	}

	@Test(priority= 3)
	public void Test3() {
		purchaseOrder.click();
		wait.until(ExpectedConditions.titleContains("Purchase Orders"));
		Assert.assertTrue(driver.getTitle().contains("Purchase Orders"));
	}

	@Test(priority= 4)
	public void Test4() {
		Test3();
		Assert.assertTrue(driver.getTitle().contains(headerText.getText()));
	}

	@Test(priority= 5)
	public void Test5() {
		VendorPage.click();
		wait.until(ExpectedConditions.titleContains("Vendors"));
		Assert.assertTrue(driver.getTitle().contains("Vendors"));
	}

	@Test(priority= 6)
	public void Test6() {
		Test5();
		Assert.assertTrue(driver.getTitle().contains(headerText.getText()));
	}

	@Test(priority= 7)
	public void Test7() {
		ProductsPage.click();
		wait.until(ExpectedConditions.titleContains("Produc"));
		Assert.assertTrue(driver.getTitle().contains("Produc"));
	}

	@Test(priority= 8)
	public void Test8() {
		Test7();
		Assert.assertTrue(driver.getTitle().contains(headerText.getText()));
	}

	@Test(priority= 9)
	public void Test9() {
		IncomingProducts.click();
		wait.until(ExpectedConditions.titleContains("Incoming Produc"));
		Assert.assertTrue(driver.getTitle().contains("Incoming Produc"));
	}

	@Test(priority= 10)
	public void Test10() {
		Test9();
		Assert.assertTrue(driver.getTitle().contains(headerText.getText()));
	}

	@Test(priority= 11)
	public void Test11() {
		VendorBillsPage.click();
		wait.until(ExpectedConditions.titleContains("Vendor Bil"));
		Assert.assertTrue(driver.getTitle().contains("Vendor Bil"));
	}

	@Test(priority= 12)
	public void Test12() {
		Test11();
		Assert.assertTrue(driver.getTitle().contains("Vendor Bil"));
	}
	

}