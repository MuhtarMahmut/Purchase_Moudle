package PurchaseMoudle;


import static Pages.IhtiparsElements.*;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import MyUtilities.*;
import Pages.IhtiparsElements;

public class IhtiparsCases extends testbase1{
	
	@BeforeMethod
	public void settingup() {
	new IhtiparsElements();
	loginAsManager();	
	  }

	
	
	 @Test
	    public void verifyProductInfo() {
	        wait.until(ExpectedConditions.visibilityOf(ProductsBtn));
	        /*mylib.highLightElement(ProductsBtn);*/
	        ProductsBtn.click();
	        /*mylib.highLightElement(productName);*/
	        String actualProductName = productName.getText();
	        String expectedProductName = "Apple Wireless Keyboard";
	        Assert.assertEquals(actualProductName, expectedProductName);
	        String actualProductPrice = productPrice.getText();
	        String expectedProductPrice = "$ 47.00";
	        Assert.assertEquals(actualProductPrice,expectedProductPrice);
	        String actualProductInventory = productInventory.getText();
	        String expectedProductInventory = "32.000";
	        Assert.assertEquals(actualProductInventory,expectedProductInventory);
	    }
	        @Test
	    public void ProductShouldMatchWithInfosShownOnmanProductPage()  {
	        wait.until(ExpectedConditions.visibilityOf(ProductsBtn));
	        /*mylib.highLightElement(ProductsBtn);*/
	        ProductsBtn.click();
	        mylib.sleeps(3);
	        /*mylib.highLightElement(productName);*/
	        productBox.click();
	        String name1=itemDiscription.getText();
	            System.out.println(name1);
	        driver.navigate().back();
	            System.out.println(productonpage.getText());
	            Assert.assertTrue(productonpage.getText().equals(name1));
	    }
	        @Test
	    public void SalesPriceCanBeUpdatedByTheManeger() {
	        wait.until(ExpectedConditions.visibilityOf(ProductsBtn));
	        /*mylib.highLightElement(ProductsBtn);*/
	        ProductsBtn.click();
	        mylib.sleeps(3);
	        /*mylib.highLightElement(productName);*/
	        productBox.click();
	        editButton.click();
	        salesPriceBox.click();
	        for (int i=0; i<10;i++)
	        salesPriceBox.sendKeys(Keys.BACK_SPACE);
	        salesPriceBox.sendKeys("700.00");
	        saveButton.click();
	            driver.navigate().back();
	    }
	        @Test
	    public void ManagerCanCreateProduct(){
	            wait.until(ExpectedConditions.visibilityOf(ProductsBtn));
	            /*mylib.highLightElement(ProductsBtn);*/
	            ProductsBtn.click();
	            wait.until(ExpectedConditions.visibilityOf(ProductsCreateBox));
	            ProductsCreateBox.click();
	            wait.until(ExpectedConditions.visibilityOf(ProductNameBox));
	            ProductNameBox.sendKeys("German Bread");
	            costBoxModify.click();
	            for (int i = 0; i<10; i++)
	                costBoxModify.sendKeys(Keys.BACK_SPACE);
	            costBoxModify.sendKeys("0.64");
	            saveButton.click();
	            ProductsBtn.click();
	            wait.until(ExpectedConditions.visibilityOf(SearchBox));
	            SearchBox.sendKeys("German Bread" + Keys.ENTER);
	            try {
	                Thread.sleep(5000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            String expected = "German Bread";
	            String actual = driver.findElement(By.xpath("//strong[@class= 'o_kanban_record_title']/span")).getText();
	            Assert.assertEquals(expected, actual);
	        }
	        @Test
	    public void ManagerCanOnlyDeleteTheProductsHeCreated(){
	            wait.until(ExpectedConditions.visibilityOf(ProductsBtn));
	            ProductsBtn.click();
	            wait.until(ExpectedConditions.visibilityOf(ProductsCreateBox));
	            SearchBox.sendKeys("German Bread" + Keys.ENTER);
	           mylib.sleeps(3);
	            driver.findElement(By.xpath("//strong[@class= 'o_kanban_record_title']/span")).click();
	           mylib.sleeps(5);
	        }
	
	
	
	@Test(priority=6)
	public void Test6() {
		IncomingProducts.click();
		wait.until(ExpectedConditions.titleContains("Incoming Pro"));
		String AA = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[";
		for (int i = 1; i < 15; i++) {
			WebElement x = driver.findElement(By.xpath(AA + i + "]/td[6]"));
			String expec = x.getText();
			x.click();
			WebElement QuantityOnRecipe = driver.findElement(By.xpath("//span[@name='product_uom_qty']"));
			String actual = QuantityOnRecipe.getText();
			Assert.assertTrue(expec.equals(actual));
			IncomingProducts.click();
			wait.until(ExpectedConditions.titleContains("Incoming Pro"));
		}
	}

	@Test(priority=7)
	public void Test7() {
		IncomingProducts.click();
		wait.until(ExpectedConditions.titleContains("Incoming Pro"));
		WebElement ExpectedDateCheckBox = driver
				.findElement(By.xpath("//th[@class='o_list_record_selector']//input[@type='checkbox']"));
		ExpectedDateCheckBox.click();
		List<WebElement> all = driver.findElements(By.xpath("//tbody//tr//td[1]//div[1]//input[1]"));
		all.forEach(p -> {Assert.assertTrue(p.isSelected());});
	}

	@Test(priority = 8)
	public void Test8() {
		IncomingProducts.click();
		wait.until(ExpectedConditions.titleContains("Incoming Pro"));
		WebElement randomelement = driver.findElement(By.xpath("//tbody//tr[2]//td[1]//div[1]//input[1]"));
		randomelement.click();
		ActionButton.click();
		DeleteFromActionButton.click();
		Assert.assertTrue(confirmTheDelete.isDisplayed());
	}

}
