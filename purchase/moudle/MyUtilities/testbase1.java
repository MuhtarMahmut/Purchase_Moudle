package MyUtilities;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class testbase1 {
	
	public static WebDriverWait wait;
    public static WebDriver driver;
    public static Faker faker;
    public static myLibrary mylib;

    @BeforeMethod
    public void beforeEachTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        faker = new Faker();
        mylib=new myLibrary(driver);
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        

    }

    @AfterMethod
    public void afterEachTest() {
    	
    	if (driver != null) {
        	try {
        		Thread.sleep(5000);
        	} catch(Exception e) {
        		e.getStackTrace();
        	}
            driver.quit();
        }
        
    }
}