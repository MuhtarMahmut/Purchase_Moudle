package PurchaseMoudle;

import static Pages.ShehlasElements.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import MyUtilities.*;
import Pages.ShehlasElements;

public class ShehlasCases extends testbase1{
	public ShehlasCases() {
		PageFactory.initElements(Driver.getDriver(), ShehlasElements.class);	
	}
	
	@BeforeMethod
	public void settingup() {
		new ShehlasCases();
		loginAsManager();
		wait.until(ExpectedConditions.visibilityOf(CreateButton));
	}

	 @Test(priority=1)
	public void Test1() {
		CreateButton.click();
		SaveButton.click();
		Assert.assertTrue(VendorErrorMessage.getText().contains("The following fields are invalid"));

	}

	 @Test(priority=2)
	public void Test2() {
		CreateButton.click();
		OrderDateBox.sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM/dd/y");
		String b=formatter.format(LocalDate.now());
		OrderDateBox.sendKeys(b+Keys.ENTER);
		Assert.assertTrue(  OrderDateBox.isEnabled() );
	}

	 @Test(priority=3)
	public void Test3() {
		CreateButton.click();
		AddanItem.click();
		Assert.assertTrue(Subtotal.isDisplayed());
	}

	 @Test(priority=4)
	public void Test4() {
		CreateButton.click();
		AddanItem.click();
		ProductDropDownBox.click();
		new Actions(driver).moveToElement(RandomElementInProduct).click().perform();
		Assert.assertTrue(UnitPrice.getText().isEmpty());
	}

	 @Test(priority=5)
	public void Test5() {
		CreateButton.click();
		AddanItem.click();
		ProductDropDownBox.click();
		new Actions(driver).moveToElement(RandomElementInProduct).click().perform();
		WebElement AA = driver.findElement(By.xpath(
				".//*[@class='o_field_float o_field_number o_field_widget o_input o_required_modifier' and @name='product_qty']"));
		Assert.assertTrue(AA.isDisplayed());
	}

	 @Test(priority=6)
	public void Test6() {
		CreateButton.click();
		AddanItem.click();
		ProductDropDownBox.click();
		new Actions(driver).moveToElement(RandomElementInProduct).click().perform();
		DeleteTheAddedItem.click();
	}

	 @Test(priority=7)
	public void Test7() {
		CreateButton.click();
		AddanItem.click();
		ProductDropDownBox.click();
		new Actions(driver).moveToElement(RandomElementInProduct).click().perform();
		UnitPrice.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);
		UnitPrice.sendKeys("200");
		wait.until(ExpectedConditions.textToBePresentInElement(Total, "200"));
		Assert.assertTrue(Total.getText().equals("200.00"));
	}

	 @Test(priority=8)
	public void Test8() {
		CreateButton.click();
		AddanItem.click();
		ProductDropDownBox.click();
		new Actions(driver).moveToElement(RandomElementInProduct).click().perform();
		UnitPrice.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);
		UnitPrice.sendKeys("200");
		wait.until(ExpectedConditions.textToBePresentInElement(Total, "200.00"));
		double subtota = new Double(Subtotal.getText()), Taxesamnt = new Double(TaxesAmount.getText());
		Assert.assertTrue(new Double(Total.getText()) == (subtota + Taxesamnt));
	}
	 	
	 @Test(priority=9)
		public void Test9() {
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

}
