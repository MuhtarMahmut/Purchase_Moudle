package PurchaseMoudle;

import static Pages.ZohrasElements.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import MyUtilities.*;
import Pages.ZohrasElements;

public class ZohrasCases extends testbase1{
	
	public ZohrasCases() {
		PageFactory.initElements(Driver.getDriver(), ZohrasElements.class);	
	}
	
	@BeforeMethod
	public void settingup() {
		new ZohrasCases();
		loginAsManager();	
	}
	
	
	@Test(priority=1)
	public void Test1() {
		ReferenceCheckbox.click();
		String xpath1="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]/div[1]/input[1]";
		List<WebElement> allcheckboxes=Driver.getDriver().findElements(By.xpath(xpath1));
		allcheckboxes.forEach(p -> {Assert.assertTrue(p.isSelected());});
	}
	
	@Test(priority=2)
	public void Test2() {
		Test1();
		ReferenceCheckbox.click();
		String xpath1="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]/div[1]/input[1]";
		List<WebElement> allcheckboxes=Driver.getDriver().findElements(By.xpath(xpath1));
		allcheckboxes.forEach(p -> {Assert.assertFalse(p.isSelected());});
	}
	
	@Test(priority=3)
	public void Test3() {
		String AA="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr";
		List<WebElement> allcheckboxes=Driver.getDriver().findElements(By.xpath(AA+"/td[1]/div[1]/input[1]"));
		allcheckboxes.forEach(p->{mylib.sleeps(0.2);p.click(); Assert.assertTrue(p.isSelected());});
	}
	
	@Test(priority=4)
	public void Test4() {
		String tota="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr";
		
		List<WebElement> untaxted=driver.findElements(By.xpath(tota+"/td[7]"));
		String b=totalUntaxtedAmount.getText().replace(",","");
		double B=new Double(b);
		double total=0;
		for(int i=0; i<untaxted.size();i++) {
			String a=untaxted.get(i).getText().replace("$ ", "").replace(",","");
			double A=new Double(a);
			total+=A;
		}
		Assert.assertTrue(total==B);
	}
	
	
	@Test(priority=5)
	public void Test5() {
	// Verify that Vendors¡¯ name on the table should be same with vendor¡¯ name on the receipt.
		String x = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[";
		for (int i = 1; i < 15; i++) {
			WebElement VendorNameOnTable = driver.findElement(By.xpath(x + i + "]/td[4]"));
			String ExpectedName = VendorNameOnTable.getText();
			VendorNameOnTable.click();
			WebElement VendorNameOnRecipe = driver.findElement(By.xpath("//a[@name='partner_id']"));
			Assert.assertTrue(ExpectedName.contains(VendorNameOnRecipe.getText()));
			purchaseMoudle.click();
			wait.until(ExpectedConditions.visibilityOf(CreateButton));
		}
	}

	@Test(priority = 6)
	public void Test6() {
		// Verify that Total balance shown on table and receipt has to match.
		String y = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[";
		for (int i = 1; i < 10; i++) {
			WebElement TotalPriceOfProductOnTable = driver.findElement(By.xpath(y + "" + i + "]/td[7]"));
			TotalPriceOfProductOnTable.click();
			wait.until(ExpectedConditions.visibilityOf(Total));
			mylib.sleeps(2);
			Assert.assertTrue(Total.isDisplayed());
			purchaseMoudle.click();
			wait.until(ExpectedConditions.visibilityOf(CreateButton));
			mylib.sleeps(2);
		}
	}

	@Test(priority=7)
	public void Test7() {
		// Verify that Each product¡¯s recipe should accessible.
		for (int i = 1; i <= 16; i++) {
			WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/"
					+ "div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i+ "]/td[2]"));
			String pagetitle = ele.getText().substring(0, ele.getText().length() - 4);
			ele.click();
			mylib.sleeps(1);
			wait.until(ExpectedConditions.titleContains(pagetitle));
			Assert.assertTrue(driver.getTitle().contains(pagetitle));
			purchaseMoudle.click();
			wait.until(ExpectedConditions.visibilityOf(CreateButton));
		}
	}

	@Test(priority = 8)
	public void Test8() {
		purchaseOrder.click();
		wait.until(ExpectedConditions.titleContains("Purchase Orders"));
		CreateButton.click();
		SaveButton.click();
		Assert.assertTrue(VendorErrorMessage.getText().contains("The following fields are invalid"));
	}

	@Test(priority = 9)
	public void Test9() {
		purchaseOrder.click();
		wait.until(ExpectedConditions.titleContains("Purchase Orders"));
		CreateButton.click();
		OrderDateBox.click();
		OrderDateBox.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/y");
		String b = formatter.format(LocalDate.now());
		OrderDateBox.sendKeys(b + Keys.ENTER);
		Assert.assertTrue(OrderDateBox.isEnabled());
	}

}
