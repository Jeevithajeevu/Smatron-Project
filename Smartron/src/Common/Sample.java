package Common;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;




import Common.SeleniumHelper;
import Common.TestBase;
import Common.Variables;



public class Sample extends TestBase{
	private static String[] links = null;
	private static String[] name=null;
	private static int linksCount = 0;
	@Test (priority=1,description="Getting all section names in the HomePage")
		public void test_GettingAllSectionNames_WSDK001() throws Exception {
		helper.GetURL(Variables.WebsiteURL);
		method.ClickOntbikeHeaderLink();
		method.ClickOntbikeDemo();

		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("/html/body/div[1]/section/div/ul"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for(int i=0;i<liList.size();i++)
		{ 
			try {
			String labels=liList.get(i).findElement(By.tagName("h4")).getText(); 
			
			//String imagesrc=liList.get(i).findElement(By.xpath("div[1]/div/img")).getAttribute("src");
			
			String Details=liList.get(i).findElement(By.xpath("/ul/li/div/div")).getText();
			
			Reporter.log("For"+" "+labels+" "+"label"+" "+"details mentioned is:"+" "+"\n"+Details,true); 
			Reporter.log("---------------------------------------------------------------------------",true); 
			}
			catch(Exception e) {
				
			}
		}
		
		}
}
		
	

		

   		
                      
		
			
	




				
				
			
			

			







			
			

	


		

		
		


		
		
	
				
				

	



		




