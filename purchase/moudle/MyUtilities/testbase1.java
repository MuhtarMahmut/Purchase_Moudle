package MyUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class testbase1 {
	
	public static WebDriverWait wait;
    public static WebDriver driver;
    public static myLibrary mylib;

    @BeforeMethod
    public void beforeEachTest() {
        driver = Driver.getDriver();
        mylib=new myLibrary(driver);
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver, 1000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        

    }

    @AfterMethod
    public void afterEachTest() {
    		 mylib.sleeps(3);
    	  Driver.closeDriver();
    	  mylib.sleeps(2);
    }
}