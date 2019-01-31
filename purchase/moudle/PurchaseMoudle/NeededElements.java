package PurchaseMoudle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import MyUtilities.Driver;
import MyUtilities.testbase1;

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
	
	static @FindBy(css="#o_field_input_91")   WebElement   VendorDropDown;
	//*[@id="o_field_input_152"]
	
	static @FindBy(linkText="234")     WebElement RandomElementInVendor;
	
	static @FindBy(css="#modal_125 > div > div > div.modal-footer > button.btn.btn-sm.btn-primary")  WebElement confirmTheSave;
	
	
	 
	
	
}
