package PurchaseMoudle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import MyUtilities.*;

public class NeededElements extends testbase1{
	public NeededElements() {
		 PageFactory.initElements(Driver.getDriver(), this);
	} 
	static @FindBy(xpath = "html/body/div[1]/div/div[2]/a[2]") WebElement firstClick;

	static @FindBy(xpath = ".//*[@id='login']")		WebElement email;

	static @FindBy(xpath = ".//*[@id='password']")		WebElement password;

	static @FindBy(xpath = ".//*[@id='wrapwrap']/main/div/form/div[4]/button")		WebElement singinButton;

	static @FindBy(xpath = "//span[contains(text(),'Purchases')]")			WebElement purchaseMoudle;

	static @FindBy(xpath = "//span[contains(text(),'Purchase Orders')]")		WebElement purchaseOrder;

	static @FindBy(xpath = "//button[contains(text(),'Create')]")			WebElement CreateButton;

	static @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[@type='button'][contains(text(),'Save')]")		WebElement SaveButton;

	static @FindBy(xpath = "//div[@class='o_notification_title']")			WebElement VendorErrorMessage;

	static @FindBy(xpath = ".//*[@class='o_datepicker_input o_input']")		WebElement OrderDateBox;

	static @FindBy(xpath = "//a[contains(text(),'Add an item')]")			WebElement AddanItem;

	static @FindBy(xpath = "//div[@name='product_id']//input[@type='text']")			WebElement ProductDropDownBox;

	static @FindBy(partialLinkText = "Computer Case")					WebElement RandomElementInProduct;

	static @FindBy(xpath = "//td[@class='o_list_record_delete']")				WebElement DeleteTheAddedItem;

	static @FindBy(xpath = "//input[@name='price_unit']")				WebElement UnitPrice;

	static @FindBy(xpath = ".//*[@id='notebook_page_27']/div[1]/div[2]/table/tbody/tr[1]/td[7]/div")		
				WebElement TaxesDropDownBox;
	
	static @FindBy(xpath="//span[@name='amount_total']")      WebElement Total;

	static @FindBy(xpath = "//button[contains(text(),'Discard')]")			WebElement Discard;
	
	static @FindBy(xpath="//span[@name='amount_untaxed']")         WebElement UntaxedAmount;
	
	static @FindBy(xpath="//span[@name='amount_tax']")			WebElement TaxesAmount;
	
	static @FindBy(xpath="//span[@name='price_subtotal']")       WebElement Subtotal;
	
	static @FindBy(xpath="//span[contains(text(),'Requests for Quotation')]")   WebElement RequestForQuota;
	
	static @FindBy(linkText="234")     WebElement RandomElementInVendor;
	
	static @FindBy(xpath="//*[@id=\"modal_141\"]/div/div/div[3]/button[1]")  WebElement confirmTheSave;
	
	static @FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/h1/span")  WebElement savedproductTags;
	
	public static void loginAsManager() {
		driver.get("http://52.39.162.23/web/login");
		firstClick.click();
		email.sendKeys(credentials.getManagerEmail());	       
		password.sendKeys(credentials.getManagerPassword());	       	    
		singinButton.click();  mylib.sleeps(2);
		purchaseMoudle.click();
	}

	
	
}
