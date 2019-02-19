package PurchaseMoudle;

import static Pages.ImransEelments.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import MyUtilities.*;
import Pages.ImransEelments;

public class ImransCases extends testbase1{
	
	@BeforeMethod
	public void settingup() {
		new ImransEelments();
		loginAsManager();	
	}


	    /**
	     * 1. Vendor bills page should be clickable and accessible
	     */
	    @Test
	    public void Test1() {

	        Vendor_Bills.click();
	        Assert.assertTrue(Vendor_Bills.isDisplayed());

	    }

	    /**
	     *2. Header¡¯s of Vendor bills page and selected link¡¯s name has to match
	     */
	    @Test
	    public void Test2() {
	        Vendor_Bills.click();
	        mylib.sleeps(3);
	        String header = Vendor_Bills.getText();
	        Assert.assertEquals(header,"Vendor Bills");

	    }

	    /**
	     *3. Reference check-box should be able to select all products
	     */
	    @Test
	    public void Test3() {
	        mylib.sleeps(3);
	        RequestForQuota.click();
	        wait.until(ExpectedConditions.visibilityOf(Ref_CheckBox));
	        Ref_CheckBox.click();
	        Assert.assertTrue(Ref_CheckBox.isSelected());
	    }


	    /**
	     *4. Reference check-box should be able to deselect all selected products
	     */
	    @Test
	    public void Test4() {
	        mylib.sleeps(3);
	        RequestForQuota.click();
	        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
	        wait.until(ExpectedConditions.visibilityOf(Ref_CheckBox));
	        Ref_CheckBox.click();
	        Ref_CheckBox.click();
	        Assert.assertFalse(Ref_CheckBox.isSelected());

	    }

	    /**
	     *5. Each products should be selectable separately
	     */
	    @Test
	    public void Test5() {
	        RequestForQuota.click();
	        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
	        wait.until(ExpectedConditions.visibilityOf(Select_anyProduct1));
	        Select_anyProduct1.click();
	        Assert.assertTrue(Select_anyProduct1.isSelected());

	    }

	    /**
	     *6. Untaxed balance of any product shown on the
	     *   table should be equal to total balance of that product
	     *   shown on the receipt page.
	     */
	    @Test
	    public void Test6() {

	        RequestForQuota.click();
	        mylib.sleeps(3);
	        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
	        wait.until(ExpectedConditions.visibilityOf(Click_anyProduct1));
	        Click_anyProduct1.click();

	        String totalOnPage = Total_onPage.getText();
	        String totalOnReceipt = Total_onReceipt.getText();
	        Assert.assertEquals(totalOnPage,totalOnReceipt);


	    }

	    /**
	     *7. Total balance of all products should be matched with the prices of per item
	     */
	    @Test
	    public void Test7() {
	        RequestForQuota.click();

	        for (int i = 1; i <= 56 ; i++) {

	            List<WebElement> eachPrice = driver.findElements(By.xpath("//tbody[@class='ui-sortable']//tr["+i+"]//td[8]//span[1]"));

	            System.out.println(Integer.toString(eachPrice.size()));

	            for (WebElement el : eachPrice) {
	                System.out.println( el.getText());
	            }
	        }



	    }


	    /**
	     *8. Each product¡¯s recipe should accessible.
	     */
	    @Test
	    public void Test8() {
	        RequestForQuota.click();
	        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
	        wait.until(ExpectedConditions.visibilityOf(Click_anyProduct1));
	        Click_anyProduct1.click();
	        Assert.assertTrue(Click_anyProduct1.isDisplayed());

	    }

	    /**
	     *9. Total balance shown on table and receipt has to match.
	     */
	    @Test
	    public void Test9() {

	        RequestForQuota.click();
	        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
	        wait.until(ExpectedConditions.visibilityOf(Click_anyProduct1));
	        Click_anyProduct1.click();

	        String totalBalaneOnPage = TotalBalance_onPage.getText();
	        String totalBalanceOnReceipt = TotalBalance_onReceipt.getText();
	        Assert.assertEquals(totalBalaneOnPage,totalBalanceOnReceipt);


	    }

	    /**
	     *10. subtotal on the receipt has to match with the untaxed amount on the receipt.
	     */
	    @Test
	    public void Test10() {
	        RequestForQuota.click();
	        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
	        wait.until(ExpectedConditions.visibilityOf(Click_anyProduct1));
	        Click_anyProduct1.click();
	        String totalOnPage = TotalUntaxed_onPage.getText();
	        String totalOnReceipt = subTotalUntaxed_onReceipt.getText();
	        Assert.assertEquals(totalOnPage,totalOnReceipt);

	    }

	    /**
	     *11. Vendors¡¯ name on the table should be same with vendor¡¯ name on the receipt.
	     */
	    @Test
	    public void Test11() {

	        RequestForQuota.click();
	        mylib.sleeps(3);
	        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
	        wait.until(ExpectedConditions.visibilityOf(Click_anyProduct1));

	        Click_anyProduct1.click();
	        String vendorOnPage = Vendor_onPage.getText();
	        String vendorOnReceipt = Vendor_onReceipt.getText();
	        Assert.assertEquals(vendorOnPage,vendorOnReceipt);

	    }
	


}
