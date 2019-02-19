package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import MyUtilities.*;

public class RayisasElemnts extends testbase1{

	public RayisasElemnts() {
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

	public static @FindBy(xpath="//ol[@class='breadcrumb']")
	WebElement headerText;
	
	public static @FindBy(xpath="//span[contains(text(),'Vendors')]")
	WebElement VendorPage;
	
	public static @FindBy(xpath="//div[@class='o_sub_menu_content']//div[9]//ul[1]//li[4]//a[1]//span[1]")
	WebElement ProductsPage;
	
	public static @FindBy(xpath="//span[contains(text(),'Vendor Bills')]")
	WebElement VendorBillsPage;
	
	public static @FindBy(linkText="Incoming Products")
	WebElement IncomingProducts;
	
	
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
