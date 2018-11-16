package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Common.SeleniumHelper;
import Common.TestBase;
import Common.Variables;

public class demo extends TestBase 
{
	
	@Test
	public void samp() throws InterruptedException {
		
	List<WebElement> ele=driver.findElements(By.tagName("a"));
	for (WebElement lin:ele) {
		System.out.println(lin.getText());
	}
   
			}
			
			
			
			
		
   		
   		
   		
   		
   		
   		

		

}