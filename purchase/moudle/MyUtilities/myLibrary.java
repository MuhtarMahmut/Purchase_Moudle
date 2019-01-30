package MyUtilities;

import java.util.NoSuchElementException;
import org.openqa.selenium.*;
import org.testng.Assert;

public class myLibrary {
	private WebDriver driver;
	private boolean isDemoMode= true;
	
	public myLibrary(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public void sendkeys(By by, String input) {
		
		try{
			WebElement element = driver.findElement(by);
		element.sendKeys(input);
		
		}catch(Exception e) {
			e.printStackTrace();
			Assert.fail();     // Assert.assertFalse();
		}
		
	}
	
	public void sendKeys(WebElement b, String c) {
		try {
		b.sendKeys(c);
		} catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	public void sleeps(double a) {
		try {
		Thread.sleep((long)(a*1000));
		} catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void highLightElement(By by) {

        WebElement element = null;
        if (isDemoMode) {
            try {
                for (int i = 0; i < 10; i++) {
                    element = driver.findElement(by);
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    
                    js.executeScript( "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",   element);
                    sleeps(0.3);
                    
                    js.executeScript( "arguments[0].setAttribute('style', 'background: red; border: 2px solid yellow;');", element);
                    sleeps(0.3);
                    
                    js.executeScript( "arguments[0].setAttribute('style', 'background: white; border: 2px solid white;');",  element);
                    sleeps(0.3);
                }
            } catch (Exception e) {
                Assert.fail();
            }
        }
    }
	
	public void highLightElement(WebElement element) {
        if (isDemoMode) {
            try {
                for (int i = 0; i < 10; i++) {
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript(
                            "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                            element);
                    sleeps(0.3);
                    js.executeScript(
                            "arguments[0].setAttribute('style', 'background: red; border: 2px solid yellow;');",
                            element);
                    sleeps(0.3);
                    js.executeScript(
                            "arguments[0].setAttribute('style', 'background: white; border: 2px solid white;');",
                            element);
                    sleeps(0.3);
                }
            } catch (Exception e) {
                Assert.fail();
            }
        }
    }

    public void clear(WebElement element) {

        try {
            
            element.clear();
            
        } catch (NoSuchElementException | StaleElementReferenceException e) {
            
            e.printStackTrace();
            Assert.fail();
        }
    }
	
    public void myclick(String a) {
    	driver.findElement(By.xpath(a)).click();
    	sleeps(1.5);
    }
    public void myclick(WebElement e) {
    	e.click();
    	sleeps(1.5);
    }
    
    public void ScreenMax() {
    	driver.manage().window().maximize();
    }
    public void SendKeys(String xpaths, String WhatToSend) {
    	driver.findElement(By.xpath(xpaths)).sendKeys(WhatToSend);
    }
    public void scroll(int a, int b) {
    	 JavascriptExecutor je=(JavascriptExecutor)driver;
         je.executeScript("scroll("+(a*100)+","+(b*100)+")");  // (1000, 1000)
         sleeps(1);
    }
	
}