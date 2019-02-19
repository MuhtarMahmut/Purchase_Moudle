package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import MyUtilities.*;

public class ShehlasElements extends testbase1{
	public ShehlasElements() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	public static @FindBy(xpath = "html/body/div[1]/div/div[2]/a[2]") 
	WebElement firstClick;

	public static @FindBy(xpath = ".//*[@id='login']") 
	WebElement email;

	public static @FindBy(xpath = ".//*[@id='password']") 
	WebElement password;

	public static @FindBy(xpath = ".//*[@id='wrapwrap']/main/div/form/div[4]/button") 
	WebElement singinButton;

	public static @FindBy(xpath = "//span[contains(text(),'Purchases')]") 
	WebElement purchaseMoudle;

	public static @FindBy(xpath = "//span[contains(text(),'Purchase Orders')]") 
	WebElement purchaseOrder;

	public static @FindBy(xpath = "//button[contains(text(),'Create')]") 
	WebElement CreateButton;

	public static @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[@type='button'][contains(text(),'Save')]") 
	WebElement SaveButton;
	
	public static @FindBy(xpath = ".//*[@class='o_datepicker_input o_input']") 
	WebElement OrderDateBox;
	
	public static @FindBy(xpath = "//div[@class='o_notification_title']") 
	WebElement VendorErrorMessage;
	
	public static @FindBy(linkText = "Add an item")  
	WebElement AddanItem; 
	
	public static @FindBy(xpath = "//span[@name='price_subtotal']") 
	WebElement Subtotal;
	
	public static @FindBy(xpath = "//div[@name='product_id']//input[@type='text']") 
	WebElement ProductDropDownBox;
	
	public static @FindBy(partialLinkText = "Ice") 
	WebElement RandomElementInProduct;
	
	public static @FindBy(xpath = "//input[@name='price_unit']") 
	WebElement UnitPrice;
	
	public static @FindBy(xpath = "//td[@class='o_list_record_delete']") 
	WebElement DeleteTheAddedItem;
	
	public static @FindBy(xpath = "//span[@name='amount_total']") 
	WebElement Total;
	
	public static @FindBy(linkText = "234") 
	WebElement RandomElementInVendor;
	
	public static @FindBy(xpath = "//span[@name='amount_tax']") 
	WebElement TaxesAmount;
	
	
	
	
	
	
	
	
	
	public static void loginAsManager() {
		driver.get("http:52.39.162.23/web/login");
		firstClick.click();
		email.sendKeys(credentials.getManagerEmail());
		password.sendKeys(credentials.getManagerPassword());
		singinButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(purchaseMoudle));
		purchaseMoudle.click();
		wait.until(ExpectedConditions.visibilityOf(CreateButton));
	}
}
