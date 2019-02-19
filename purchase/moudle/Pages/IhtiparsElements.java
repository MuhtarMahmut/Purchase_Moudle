package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import MyUtilities.*;

public class IhtiparsElements extends testbase1{
	public IhtiparsElements() {
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
	
	public static @FindBy(linkText="Incoming Products")
	WebElement IncomingProducts;
	
	public static @FindBy(xpath="//button[contains(text(),'Action')]")
	WebElement ActionButton;
	
	public static @FindBy(linkText="Delete")
	WebElement DeleteFromActionButton;
	
	public static @FindBy(xpath="//div[@class='modal-body']")
	WebElement confirmTheDelete;

	
	
	public static @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[9]/ul[1]/li[4]/a/span")
    WebElement ProductsBtn;
	
    public static @FindBy(xpath = "//span[contains(text(),'Apple Wireless Keyboard')]")
    WebElement productName;
    
    public static @FindBy(xpath = "//span[contains(text(),'$ 47.00')]")
    WebElement productPrice;
    
    public static @FindBy(xpath = "//span[contains(text(),'32.000')]")
    WebElement productInventory;
    
    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/img")
    WebElement productBox;
    
    public static @FindBy(xpath = "//span[@name='name']")
    WebElement itemDiscription;
    
    public static @FindBy(xpath = "//span[contains(text(),'Apple Wireless Keyboard')]")
    WebElement productonpage;
    
    public static @FindBy(xpath ="//button[contains(text(),'Edit')]" )
    WebElement editButton;
    
    public static @FindBy(xpath = "//*[@class='o_input' and @type='text']")
    WebElement salesPriceBox;
    
    public static @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[@type='button'][contains(text(),'Save')]")
    WebElement saveButton;
    
    public static @FindBy(xpath = "//input[@placeholder ='Product Name']")
    WebElement ProductNameBox;
    
    public static @FindBy(xpath = "//div[@class='o_row']/div/input")
    WebElement costBoxModify;
    
    public static @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    WebElement ProductsCreateBox;
    
    public static@FindBy(xpath = "//input[@placeholder='Search...']")
    WebElement SearchBox;
    
    public static @FindBy(xpath = "//div[@class='o_kanban_view o_kanban_ungrouped']/div")
    WebElement GermanBread;
	
	
	
	
	
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
