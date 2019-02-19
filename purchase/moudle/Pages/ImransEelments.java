package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import MyUtilities.*;

public class ImransEelments extends testbase1 {
	public ImransEelments() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	public static @FindBy(xpath = "html/body/div[1]/div/div[2]/a[2]") 
	WebElement firstClick;
	
	public static @FindBy(xpath = "//span[contains(text(),'Requests for Quotation')]") 
	WebElement RequestForQuota;
	
	public static @FindBy(xpath = ".//*[@id='login']") 
	WebElement email;

	public static @FindBy(xpath = ".//*[@id='password']") 
	WebElement password;

	public static @FindBy(xpath = ".//*[@id='wrapwrap']/main/div/form/div[4]/button") 
	WebElement singinButton;

	public static @FindBy(xpath = "//span[contains(text(),'Purchases')]") 
	WebElement purchaseMoudle;

	public static @FindBy(xpath = "//div[@class='o_sub_menu_content']//div[9]//ul[2]//li[2]//a[1]") 
	WebElement Vendor_Bills;

	public static @FindBy(xpath = "//th/div/input[@type='checkbox']") 
	WebElement Ref_CheckBox;

	public static @FindBy(xpath = "(//td/div/input[@type='checkbox'])[2]") 
	WebElement Select_anyProduct1;

	public static @FindBy(xpath = "//td[contains(text(),'PO00106')]") 
	WebElement Click_anyProduct1;

	public static @FindBy(xpath = "//tbody[@class='ui-sortable']//tr[2]//td[8]//span[1]") WebElement TotalUntaxed_onPage;

	public static @FindBy(xpath = "//span[@name='amount_untaxed']") 
	WebElement subTotalUntaxed_onReceipt;

	public static @FindBy(xpath = "//tbody[@class='ui-sortable']//tr[2]//td[4]") 
	WebElement Vendor_onPage;

	public static @FindBy(xpath = "//body[@class='o_web_client']/div[@class='o_main']/div[@class='o_main_content']/div[@class="
			+ "'o_content']/div[@class='o_view_manager_content']/div/div[@class='o_form_view o_form_readonly']"
			+ "/div[@class='o_form_sheet_bg']/div[@class='o_form_sheet']/div[@class='o_group']/table[1]/tbody[1]/tr[1]/td[2]")
	 WebElement Vendor_onReceipt;

	public static @FindBy(xpath = "//tbody[@class='ui-sortable']//tr[2]//td[8]//span[1]") 
	WebElement TotalBalance_onPage;

	public static @FindBy(xpath = "//span[@name='amount_total']") 
	WebElement TotalBalance_onReceipt;

	public static @FindBy(xpath = "//tbody[@class='ui-sortable']//tr[2]//td[8]//span[1]") 
	WebElement Total_onPage;

	public static @FindBy(xpath = "//span[@name='amount_total']") 
	WebElement Total_onReceipt;

	public static @FindBy(xpath = "//td[@title='Total amount']") 
	WebElement eachProductPrice;
	
	public static @FindBy(xpath = "//button[contains(text(),'Create')]") 
	WebElement CreateButton;
	
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
