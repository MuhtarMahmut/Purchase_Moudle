package BGroup_2;

public class Seleniums {

	public static void main(String[] args) {
		/*
		  8 locators: 
		  		 id, tagname, name, classname, xpath, css, linkedtext, partiallinktext.
		  		 
		  		 when do we use xpath: when we dont have unique id, name....
		  		 
		  		 Abs xpth vs rel xpath: abs xpath checks from the root of html , starts with /
		  		 						rl xpath checks from randow area of the page,  //.
		  		 						
		  		 		abs xpth can handle dynamic elemnts.
		  		 		
		  		 		//tagname[@value='''   and @value='''];   
		  		 		 * 
		  		 		 * 
		  		 		 * 
		  		 		
		  		 		
		  		 		Selenium exceptions: no such ele,   timeouts, webdriver, elemnt not visible.
		  		 		
		  		 		close vs quite: 
		  		 			close will close the current tab.
		  		 			quite will close the entoire browse. 
		  		 			
		  		 			
		  		 Navigate: 
		  		 		driver.navigate.refresh   ==> refresh.
		  		 		driver.navigate.back   ==> goes back.
		  		 		driver.navigate.forwar .
		  		 		driver.navigate.to(URL)  ==> opens the nwe website. 
		  		 		
		  		 		
		  		 		get vs navigate.to:
		  		 				navigae is faster ( does not wait the page fully uploaded).
		  		 				
		  		 
		  		 Mouse-hover: 
		  		 		new Actions(driver).moveToElement( elemnt).perform();
		  		 		
		  		 Actions:  combination of mouse and keybord
		  		 
		  		 implicity wait:we only delace once.  applies to FindElement(s).
		  		 	findElement vs findElements:
		  		 			findElement returns single elemnt.  (WebElement).
		  		 			findElements returns multiple elemnts. (List)
		  		 			
		  		 	driver.manage().timeouts().implicityWait( num, TimeUnit).
		  		 
		  		 ExplicityWai: waits for certain conditions, (will have declare everytime.)
		  		 		WebDriverwait wait=WebDriverWait(driver, num);
		  		 			
		 	if dropdown box has SelectTag: 
		 			new Select(Element).  SelectByIndex(Num);
		 							     SelectByVisibleText("")    most secure;/. 
		 							     SelectByValue();
		  
		 
		 		Keys.Enter.
		 		
		 		if the popU
		 		new Action(driver).click().perform();
		 		driver.SwitchTO().alert().dismiss();
		 		
		 		// how to handle multiWindows:
		 		 		
		 		List<String> allwindows = driver.getWindowHandles();
		 				to switch between browsers.:
		 			driver.switchTo().widonws( allwidnows.get(index num) );
		 		
		 		
		 		
		 		Assert.asserttrue( )  if the condition false, test will stop.
		 		
		 		!isSelcated() == isDeselected
		 		
		 		@Test
		 		
		 		
		 		Scanario syntax: given, when, and, then, but, * 
		 		
		 		
		 
		 
		 */
	}

}
