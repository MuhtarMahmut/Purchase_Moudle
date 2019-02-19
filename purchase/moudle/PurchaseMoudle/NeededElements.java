package PurchaseMoudle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import MyUtilities.*;

public class NeededElements extends testbase1 {
	public NeededElements() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
    static @FindBy(xpath = "html/body/div[1]/div/div[2]/a[2]") 
	WebElement firstClick;

	static @FindBy(xpath = ".//*[@id='login']") 
	WebElement email;

	static @FindBy(xpath = ".//*[@id='password']") 
	WebElement password;

	static @FindBy(xpath = ".//*[@id='wrapwrap']/main/div/form/div[4]/button") 
	WebElement singinButton;

	static @FindBy(xpath = "//span[contains(text(),'Purchases')]") 
	WebElement purchaseMoudle;

	static @FindBy(xpath = "//span[contains(text(),'Purchase Orders')]") 
	WebElement purchaseOrder;

	static @FindBy(xpath = "//button[contains(text(),'Create')]") 
	WebElement CreateButton;

	static @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[@type='button'][contains(text(),'Save')]") 
	WebElement SaveButton;

	static @FindBy(xpath = "//div[@class='o_notification_title']") 
	WebElement VendorErrorMessage;

	static @FindBy(xpath = ".//*[@class='o_datepicker_input o_input']") 
	WebElement OrderDateBox;

	static @FindBy(linkText = "Add an item")  
	WebElement AddanItem; 

	static @FindBy(xpath = "//div[@name='product_id']//input[@type='text']") 
	WebElement ProductDropDownBox;
	
	static @FindBy(xpath = "//td[@class='o_list_record_delete']") 
	WebElement DeleteTheAddedItem;
	
	static @FindBy(xpath = "//input[@name='price_unit']") 
	WebElement UnitPrice;
	
	static @FindBy(xpath = "//span[@name='amount_tax']") 
	WebElement TaxesAmount;

	static @FindBy(partialLinkText = "Ice") 
	WebElement RandomElementInProduct;
	
	static @FindBy(xpath = "//span[@name='price_subtotal']") 
	WebElement Subtotal;

	static @FindBy(xpath = "//span[contains(text(),'Requests for Quotation')]") 
	WebElement RequestForQuota;

	static @FindBy(xpath = "//span[@name='amount_total']") 
	WebElement Total;

	static @FindBy(xpath = "//button[contains(text(),'Discard')]") 
	WebElement Discard;

	static @FindBy(xpath = "//span[@name='amount_untaxed']") 
	WebElement UntaxedAmount;

	static @FindBy (xpath="//th[@class='o_list_record_selector']//input[@type='checkbox']")
	WebElement productCheckBox;

	static @FindBy(linkText = "234") 
	WebElement RandomElementInVendor;

	static @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/h1/span") 
	WebElement productNameAfterSave;
	
	
	
	// Muhtar:
	static @FindBy(xpath="//input[@name='product_qty']")
	WebElement QuantityBox;
	
	static @FindBy(xpath="//span[@name='qty_received']")
	WebElement RecievedQuantity;
	
	static @FindBy(xpath="//span[@name='qty_invoiced']")
	WebElement BilledQuantity;
	
	static @FindBy(xpath="//div[@name='taxes_id']//input[@type='text']")
	WebElement TaxesDropDownBox;
	
	static @FindBy(css="#o_field_input_138")
	WebElement VendorDropDownBox;
	
	static @FindBy(xpath="html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/h1")
	WebElement context;
	
	static @FindBy(xpath="//td[@title='Total amount']")
	WebElement TotalPriceOnPurchaseOrderPage;
	
	static @FindBy(className="btn btn-sm btn-primary")
	WebElement ConfirmTheSave;
	
	static @FindBy(xpath="//button[contains(text(),'Cancel')]")
	WebElement CancelButton;
	
	
	
	
	
	
	
	
	static @FindBy(linkText="Incoming Products")
	WebElement IncomingProducts;
	
	static @FindBy(xpath="//button[contains(text(),'Action')]")
	WebElement ActionButton;
	
	static @FindBy(linkText="Delete")
	WebElement DeleteFromActionButton;
	
	static @FindBy(xpath="//div[@class='modal-body']")
	WebElement confirmTheDelete;
	
	
	
	
	
	// Rayisa:
	static @FindBy(xpath="//ol[@class='breadcrumb']")
	WebElement headerText;
	
	static @FindBy(xpath="//span[contains(text(),'Vendors')]")
	WebElement VendorPage;
	
	static @FindBy(xpath="//div[@class='o_sub_menu_content']//div[9]//ul[1]//li[4]//a[1]//span[1]")
	WebElement ProductsPage;
	
	static @FindBy(xpath="//span[contains(text(),'Vendor Bills')]")
	WebElement VendorBillsPage;
	
	
	
	
	
	
	
	
	
	
	
	
	

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
