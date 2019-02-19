package PurchaseMoudle;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import MyUtilities.*;
import Pages.MuhtarsElements;
import static Pages.MuhtarsElements.*;
import java.util.List;

public class MuhtarsCases extends testbase1 {
	

	@BeforeMethod
	public void settingup() {
		new MuhtarsElements();
		loginAsManager();
	}

	 
	 @Test(priority=1)
	public void Test1() {
		CreateButton.click();
		AddanItem.click();
		ProductDropDownBox.click();
		new Actions(driver).moveToElement(RandomElementInProduct).click().perform();
		mylib.sleeps(2);
		List<WebElement> myele = driver.findElements(By.xpath(".//*[@class='o_input ui-autocomplete-input' and @autocomplete='off']"));
		myele.get(0).click();
		RandomElementInVendor.click();
		SaveButton.click();
	}

	 @Test(priority=2)
	public void Test2() {
		 Test6();
		AddanItem.click();
	}

	 @Test(priority=3)
	public void Test3() {
		purchaseOrder.click();
		wait.until(ExpectedConditions.titleContains("Purchase Orders"));
		CreateButton.click();
		AddanItem.click();
		Assert.assertTrue(new Double(TaxesAmount.getText()) == 0);
	}

	 @Test(priority=4)
	public void Test4() {
		 Test6();
		Assert.assertTrue(QuantityBox.getText().isEmpty());
	}

	 @Test(priority=5)
	public void Test5() {
		Test6();
		Assert.assertTrue(new Double(RecievedQuantity.getText()) == 0);
		Assert.assertTrue(new Double(BilledQuantity.getText()) == 0);
	}

	 @Test(priority=6)
	public void Test6() {
		purchaseOrder.click();
		wait.until(ExpectedConditions.titleContains("Purchase Orders"));
		CreateButton.click();
		AddanItem.click();
		ProductDropDownBox.click();
		new Actions(driver).moveToElement(RandomElementInProduct).click().perform();
		Assert.assertTrue(new Double(BilledQuantity.getText()) == 0);
	}

	 @Test(priority=7)
	public void Test7() {
		Test6();
		UnitPrice.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);
		UnitPrice.sendKeys("200");
		wait.until(ExpectedConditions.textToBePresentInElement(Total, "200.00"));
		double taxrate = 0, subtotal = 0, TotalTax = 0;
		if (!TaxesDropDownBox.getText().isEmpty())
			taxrate = new Double(TaxesDropDownBox.getText());
		if (!Subtotal.getText().isEmpty())
			subtotal = new Double(Subtotal.getText());
		if (!TaxesAmount.getText().isEmpty())
			TotalTax = new Double(TaxesAmount.getText());
		Assert.assertTrue(TotalTax == (subtotal * taxrate));
	}

	 @Test(priority=8)
	public void Test8() {
		 Test6();
		UnitPrice.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);
		UnitPrice.sendKeys("200");
		wait.until(ExpectedConditions.textToBePresentInElement(Total, "200.00"));
		Assert.assertTrue(
				new Double(Total.getText()) == (new Double(Subtotal.getText()) + new Double(TaxesAmount.getText())));
	}

	 @Test(priority=9)
	 public void Test9() {
		 Test6();
			List<WebElement> myele = driver.findElements(By.xpath(".//*[@class='o_input ui-autocomplete-input' and @autocomplete='off']"));
			myele.get(0).click();
			RandomElementInVendor.click();
			SaveButton.click(); mylib.sleeps(3);
			String AA=productNameAfterSave.getText();
			Assert.assertTrue(context.getText().contains(AA)); 
	 }
	 
	 @Test(priority=10)
	 public void Test10() {
		 purchaseOrder.click();
			wait.until(ExpectedConditions.titleContains("Purchase Orders"));
			String AA=TotalPriceOnPurchaseOrderPage.getText();
			CreateButton.click();			AddanItem.click();
			ProductDropDownBox.click();
			new Actions(driver).moveToElement(RandomElementInProduct).click().perform();
			UnitPrice.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);		UnitPrice.sendKeys("200");
			wait.until(ExpectedConditions.textToBePresentInElement(Total, "200.00"));
			List<WebElement> myele = driver.findElements(By.xpath(".//*[@class='o_input ui-autocomplete-input' and @autocomplete='off']"));
			myele.get(0).click();
			RandomElementInVendor.click();
			SaveButton.click();			mylib.sleeps(2);
			purchaseOrder.click();
			wait.until(ExpectedConditions.titleContains("Purchase Orders"));
			Assert.assertTrue(TotalPriceOnPurchaseOrderPage.getText().equals(AA));
	 }
	 
	 @Test(priority=11)
		public void Test11() {
			purchaseOrder.click();
			wait.until(ExpectedConditions.titleContains("Purchase Orders"));
			CreateButton.click();			AddanItem.click();
			ProductDropDownBox.click();
			new Actions(driver).moveToElement(RandomElementInProduct).click().perform();
			UnitPrice.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);		UnitPrice.sendKeys("200");
			wait.until(ExpectedConditions.textToBePresentInElement(Total, "200.00"));
			List<WebElement> myele = driver.findElements(By.xpath(".//*[@class='o_input ui-autocomplete-input' and @autocomplete='off']"));
			myele.get(0).click();		RandomElementInVendor.click();			CancelButton.click();
			Assert.assertTrue(  CancelButton.isDisplayed()  );
	 }
	

	 
}