package Common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;








public class MethodsCalling extends TestBase {
	private static String[] links = null;
	private static int linksCount = 0;
	public void TakeScreenShot(String FileName) throws IOException {
		
			File scrFile = ((TakesScreenshot) SeleniumHelper.driver).getScreenshotAs(OutputType.FILE);
			Files.copy(scrFile, new File(Variables.PassedScreenShotsFilePath + FileName + ".png"));
			Reporter.log(" File Name : "+Variables.PassedScreenShotsFilePath+FileName, true);
		}
	public void TakeFailedScreenShot(String FileName) throws IOException {
		
		File scrFile = ((TakesScreenshot) SeleniumHelper.driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File(Variables.FailedScreenshotsFilePath + FileName + ".png"));
		Reporter.log(" File Name : "+Variables.FailedScreenshotsFilePath+FileName, true);
	}
	public void screenshot(String filename )
			throws Exception {
		File scrFile = ((TakesScreenshot)SeleniumHelper.driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File(Variables.PassedScreenShotsFilePath+filename));
		Reporter.log("<img src=\"file:///" + Variables.PassedScreenShotsFilePath+filename + "\" alt=\"\"/><br/>");
	}
	
	public void Failedscreenshot(String filename )
			throws Exception {
		File scrFile = ((TakesScreenshot)SeleniumHelper.driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File(Variables.FailedScreenshotsFilePath+filename));
		Reporter.log("<img src=\"file:///" + Variables.FailedScreenshotsFilePath+filename + "\" alt=\"\"/><br/>");
	}
	
	
	public void ScrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor)SeleniumHelper.driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
	public void ScrollUp() {
		JavascriptExecutor jse = (JavascriptExecutor)SeleniumHelper.driver;
		jse.executeScript("window.scrollTo(document.body.scrollHeight,0)", "");
		
	}
	public void Scrollquarter() {
		JavascriptExecutor jse = (JavascriptExecutor)SeleniumHelper.driver;
		jse.executeScript("window.scrollTo(0,950)", "");
	}
	public void ScrollMiddle() {
		JavascriptExecutor jse = (JavascriptExecutor)SeleniumHelper.driver;
		jse.executeScript("window.scrollTo(0,2500)", "");
		
	}
	public void Scroll() {
		JavascriptExecutor jse = (JavascriptExecutor)SeleniumHelper.driver;
		jse.executeScript("window.scrollTo(0,3700)", "");
	}
	
	public void EscapeKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}
	
	
	public String SwitchToLastWindow() {
		String[] wins = SeleniumHelper.driver.getWindowHandles().toArray(new String[0]);
		String target = wins[wins.length - 1];
		SeleniumHelper.driver.switchTo().window(target);
		return wins[0];
}
	public String SwitchToPreviousWindow() {
		String[] wins = SeleniumHelper.driver.getWindowHandles().toArray(new String[0]);
		String target = wins[wins.length-1];
		SeleniumHelper.driver.switchTo().window(target);
		return wins[0];
	}
	public  void Check_imageLoadedOrNot(String path) {
		WebElement image1 = SeleniumHelper.driver.findElement(By.xpath(path)); 
		Boolean imageLoaded1 = (Boolean)((JavascriptExecutor)SeleniumHelper.driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0", image1); 
        if (!imageLoaded1) 
        {
            Reporter.log("Image is not loaded",true);
            SeleniumHelper.driver.close();
        }
       
	}
	
	public void getCSSofHeadingandParagraph() {
		
		List<WebElement> Heading2=SeleniumHelper.driver.findElements(By.tagName("h2"));
		
	//	Reporter.log("Number of Heading1:"+Heading1.size(), true);
		
			
		
			try {
		for(WebElement head1:Heading2)
		{
			
			if(head1.getCssValue("font-family").equalsIgnoreCase(Variables.FontFamilyOfHeading2))
			{
				
				
			}
			else {
			Reporter.log("Font family of Heading2 is different it is:"+head1.getCssValue("font-family"), true);		
			System.out.println(head1.getText());;
		}
		

					
					if(head1.getCssValue("font-size").equalsIgnoreCase(Variables.FontSizeOfHeading2))
					{
						
					}
					else {
					Reporter.log("Font family of Heading2 is different it is:"+head1.getCssValue("font-size"), true);		
					System.out.println(head1.getText());;
				}
				break;	
				}
				
			
				
					}
					catch(Exception e) {
						Reporter.log("heading 2 not found in the page",true);
					}
			
			
			
			
			
			

			try {
				List<WebElement> Heading3=SeleniumHelper.driver.findElements(By.tagName("h3"));
		for(WebElement head2:Heading3)
		{
			
			if(head2.getCssValue("font-family").equalsIgnoreCase(Variables.FontFamilyOfHeading3))
			{
				
				
			}
			else {
			Reporter.log("Font family of Heading3 is different it is:"+head2.getCssValue("font-family"), true);		
			System.out.println(head2.getText());;
		}
		

					
					if(head2.getCssValue("font-size").equalsIgnoreCase(Variables.FontSizeOfHeading3))
					{
						
					}
					else {
					Reporter.log("Font family of Heading3 is different it is:"+head2.getCssValue("font-size"), true);		
					System.out.println(head2.getText());;
				}
				break;	
				}
				
			
				
					}
					catch(Exception e) {
						Reporter.log("heading 3 not found in the page",true);
					}
			
			
			
			
			
			try {
				List<WebElement> Heading4=SeleniumHelper.driver.findElements(By.tagName("h4"));
		for(WebElement head4:Heading4)
		{
			
			if(head4.getCssValue("font-family").equalsIgnoreCase(Variables.FontFamilyOfHeading4))
			{
				
				
			}
			else {
			Reporter.log("Font family of Heading4 is different it is:"+head4.getCssValue("font-family"), true);		
			System.out.println(head4.getText());;
		}
		

					
					if(head4.getCssValue("font-size").equalsIgnoreCase(Variables.FontSizeOfHeading4))
					{
						
					}
					else {
					Reporter.log("Font family of Heading4 is different it is:"+head4.getCssValue("font-size"), true);		
					System.out.println(head4.getText());;
				}
				break;	
				}
				
			
				
					}
					catch(Exception e) {
						Reporter.log("heading 4 not found in the page",true);
					}
			
			
			
			
			try {
				List<WebElement> Heading5=SeleniumHelper.driver.findElements(By.tagName("h5"));
		for(WebElement head5:Heading5)
		{
			
			if(head5.getCssValue("font-family").equalsIgnoreCase(Variables.FontFamilyOfHeading5))
			{
				
				
			}
			else {
			Reporter.log("Font family of Heading5 is different it is:"+head5.getCssValue("font-family"), true);		
			System.out.println(head5.getText());
		}
		

					
					if(head5.getCssValue("font-size").equalsIgnoreCase(Variables.FontSizeOfHeading5))
					{
						
					}
					else {
					Reporter.log("Font family of Heading5 is different it is:"+head5.getCssValue("font-size"), true);		
					System.out.println(head5.getText());
				}
				break;	
				}
				
			
				
					}
					catch(Exception e) {
						Reporter.log("heading 5 not found in the page",true);
					}
			
			
			
			
			try {
				List<WebElement> Heading6=SeleniumHelper.driver.findElements(By.tagName("h6"));
		for(WebElement head6:Heading6)
		{
			
			if(head6.getCssValue("font-family").equalsIgnoreCase(Variables.FontFamilyOfHeading6))
			{
				
				
			}
			else {
			Reporter.log("Font family of Heading 6 is different it is:"+head6.getCssValue("font-family"), true);		
			System.out.println(head6.getText());
		}
		

					
					if(head6.getCssValue("font-size").equalsIgnoreCase(Variables.FontSizeOfHeading6))
					{
						
					}
					else {
					Reporter.log("Font family of Heading6 is different it is:"+head6.getCssValue("font-size"), true);		
					System.out.println(head6.getText());
				}
				break;	
				}
				
			
				
					}
					catch(Exception e) {
						Reporter.log("heading 6 not found in the page",true);
					}
			
			
			
			
			
			try {
				List<WebElement> paragraph1=SeleniumHelper.driver.findElements(By.tagName("p"));
		for(WebElement para1:paragraph1)
		{
			
			if((para1.getCssValue("font-family").equalsIgnoreCase(Variables.FontFamilyOfParagraph1))||(para1.getCssValue("font-family").equalsIgnoreCase(Variables.FontFamilyOfParagraph2)))
			{
				
				
			}
			else {
			Reporter.log("Font family of paragraph is different it is:"+para1.getCssValue("font-family"), true);		
			System.out.println(para1.getText());
		}
		

					
					if((para1.getCssValue("font-size").equalsIgnoreCase(Variables.FontSizeOfParagraph1))||(para1.getCssValue("font-size").equalsIgnoreCase(Variables.FontSizeOfParagraph2)) )
					{
						
					}
					else {
					Reporter.log("Font family of paragraph is different it is:"+para1.getCssValue("font-size"), true);		
					System.out.println(para1.getText());;
				}
				break;	
				}
				
			
				
					}
					catch(Exception e) {
						Reporter.log("paragraph not found in the page",true);
					}
	}
	
public void test_Header_WSDK007() throws InterruptedException, IOException {
	WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
	List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
	System.out.println("header links:");
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.tphonePhref)) 
				{
				Reporter.log(" tphoneP header link found", true);
				try {
				WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.tphoneInHeader));
				Actions actions1= new Actions(SeleniumHelper.driver);
				actions1.moveToElement(menu1).perform();
				link1.click();
				
			
			String url=SeleniumHelper.driver.getCurrentUrl();
	    	Reporter.log(" when clicked on tphoneP header it is navigated to url="+url, true);
			helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log(" unable to click t-phoneP link in the header", true);
				}
			
			break;
			
			}
		}
		catch(Exception e)
		{
			
		Reporter.log("unable to find t-phoneP header", true);
			
		}
		}
}
		public void test_Header_WSDK008() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.srtPhonehref)) 
						{
						Reporter.log(" srtphone header link found", true);
						try {
						WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.tphoneInHeader));
						Actions actions1= new Actions(SeleniumHelper.driver);
						actions1.moveToElement(menu1).perform();
						link1.click();
					
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on srt.phone header it is navigated to url="+url, true);
					helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("unable to click on srt,phone header link", true);
							
						}
					
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find srt.phone header", true);
			}
					
	}
		}
		public void test_Header_WSDK009() throws InterruptedException, IOException {
			
			WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.tphonehref)) 
						{
						Reporter.log(" tphone header link found", true);
						try {
						WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.tphoneInHeader));
						Actions actions1= new Actions(SeleniumHelper.driver);
						actions1.moveToElement(menu1).perform();
						link1.click();
					
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on tphone subheader header it is navigated to url="+url, true);
					helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("unable to click on tphone link in the header", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find tphone subheader ", true);
			}
					
	}
		}
			//*******************************************************************************************	
					
					//**********t.book sub menus*************	
		public void test_Header_WSDK010() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.tbookhref)) 
						{
						Reporter.log(" tbook header link found", true);
						try {
						
						WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.tbookInHeader));
						Actions actions1= new Actions(SeleniumHelper.driver);
						actions1.moveToElement(menu1).perform();
						link1.click();
					
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on tbook header it is navigated to url="+url, true);
					helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log(" Unable to click tbook header link", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find tbook header", true);
			}
					
	}
		}
//*******************************************************************************************	
					
					//**********t.store*************	
		public void test_Header_WSDK011() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.tstorehref)) 
						{
						Reporter.log("tstore header link found", true);
						try {
							SeleniumHelper.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
						link1.click();
						method.SwitchToLastWindow();
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on tstore header it is navigated to url="+url, true);
			    	SeleniumHelper.driver.close();
					method.SwitchToPreviousWindow();
						}
						catch(Exception e) {
							Reporter.log("unable to click tstore header link ", true);
						}
					
						
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find tstore header", true);
			}
					
	}
		}
//*******************************************************************************************	
					
					//**********things*************	
		public void test_Header_WSDK012() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.thingshref)) 
						{
						Reporter.log("things header link found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on things header it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("unable to click things header link", true);
							
					}
						
					break;
						
				
				}
				}
			catch(Exception e) {
				Reporter.log("unable to find things header", true);
			}
					
	}
		}
//*******************************************************************************************	
					
					//**********tronX*************	
		public void test_Header_WSDK013() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.tronXhref)) 
						{
						Reporter.log("tronX header link found", true);
						try {
							SeleniumHelper.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on tronX header it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("tronX header link is not clickable", true);
						}
					
					break;
						}	
				
				}
			catch(Exception e) {
				Reporter.log("unable to find tronX header", true);
			}
					
	}
		}
//*******************************************************************************************	
					
					//**********iot*************	
		public void test_Header_WSDK014() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.IOThref)) 
						{
						Reporter.log("IOT header link found", true);
						try {
							
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on IOT header it is navigated to url="+url, true);
			    	helper.Sleep();
					helper.Sleep();
			    	helper.NavigateBack();
						}
						catch(Exception e){
							Reporter.log("IOT header link is not clickable", true);
					
					}
						
					break;
						}	
				
				}
			catch(Exception e) {
				Reporter.log("unable to find IOT header", true);
			}
					
	}
		}
//*******************************************************************************************	
					
					//**********tcare*************	
		
		
		
		public void test_Header_WSDK015() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.tcarehref)) 
						{
						
						Reporter.log("tcare header link found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on tcare header it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("tcare header link not clickable", true);
						}
						
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find tcare header", true);
			}
					
	}
}
		public void test_Header_WSDK016() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.AboutUshref)) 
						{
						Reporter.log("Comapany header link found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on company header it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e){
							Reporter.log("company header link not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find company header", true);
			}
					
	}

					
	}

	public void test_Footer_WSDK017() throws InterruptedException, IOException {
		WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
		List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
		System.out.println("Footer links:");
		for (WebElement link1 : header_allLinks) {
			 
			try {
				if(link1.getAttribute("href").equalsIgnoreCase(Variables.tphonePhref)) 
					{
					
					Reporter.log("tphoneP footer link found", true);
					try {
					link1.click();
					
				String url=SeleniumHelper.driver.getCurrentUrl();
		    	Reporter.log(" when clicked on tphoneP footer it is navigated to url="+url, true);
		    	helper.NavigateBack();
					}
					catch(Exception e) {
						Reporter.log("tphoneP footer link is not clickable ", true);
					}
				break;
				
				}
			
			}
		catch(Exception e) {
			Reporter.log("unable to find tphoneP footer", true);
		}
				
}
	}
		public void test_Footer_WSDK018() throws InterruptedException, IOException {
		//**********srt.phone***********
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.srtPhonehref)) 
						{
						Reporter.log("srtphone footer link found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on srtphone footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
			    	catch(Exception e) {
						Reporter.log("srtphone footer link not clickable", true);
					}
					break;
						}
						
					
					}
				
				
			catch(Exception e) {
				Reporter.log("unable to find srtphone footer", true);
			}
					
	}
		}
		//**********t.book***********
		public void test_Footer_WSDK019() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.tbookhref)) 
						{
						Reporter.log("tbook footer link found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on tbook footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("tbook footer link not clickable", true);
						}
						
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find tbook footer", true);
			}
					
	}
		}
		//**********t.phone***********
		public void test_Footer_WSDK020() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.tphonehref)) 
						{
						Reporter.log("tphone footer link found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on tphone footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("tphone footer link is not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find tphone footer", true);
			}
					
	}
		}
		//**********tronX***********
		public void test_Footer_WSDK021() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.tronXhref)) 
						{
						Reporter.log("tronX footer link found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on tronXfooter it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("tronX footer link not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find tronX footer", true);
			}
					
	}
		}
		//**********t.care***********
		public void test_Footer_WSDK022() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.tcarehref)) 
						{
						Reporter.log("tcarefooter link found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on tcare footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("tcare footer link not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find tcare footer", true);
			}
					
	}
		}
		//**********t.store***********
		public void test_Footer_WSDK023() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.tstorehref)) 
						{
						Reporter.log("tstore footer link found", true);
						try {
						link1.click();
						method.SwitchToLastWindow();	
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on tstore footer it is navigated to url="+url, true);
			    	SeleniumHelper.driver.close();
					method.SwitchToPreviousWindow();
						}
						catch(Exception e) {
							Reporter.log("tstore footer link not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find tstore footer", true);
			}
					
	}
		}
		//**********about us***********
		public void test_Footer_WSDK024() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.AboutUshref)) 
						{
						Reporter.log("aboutUs footer link found", true);
						link1.click();
						try {
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on aboutUs footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e){
							Reporter.log("aboutus footer link not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find aboutUs footer", true);
			}
					
	}
		}
		//**********people***********
		public void test_Footer_WSDK025() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.Peoplehref)) 
						{
						Reporter.log("people footer link found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on people footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("people footer link not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find people footer", true);
			}
					
	}
		}
		//**********ambassador***********
		public void test_Footer_WSDK026() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.Ambassadorshref)) 
						{
						Reporter.log("Ambassadors footer link found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on ambassadors footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("Ambassadors footer link not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find ambassadors footer", true);
			}
					
	}
		}
		//**********careers***********
		public void test_Footer_WSDK027() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.Careershref)) 
						{
						Reporter.log("careers footer link found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on careers footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("careers footer link not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find careers footer", true);
			}
					
	}
		}
		//**********press***********
		public void test_Footer_WSDK028() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.Presshref)) 
						{
						Reporter.log("press footer was found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on press footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("unable to click press footer", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find press footer", true);
			}
			}
		}
		//**********contactUs***********
		public void test_Footer_WSDK029() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.ContactUshref)) 
						{
						Reporter.log("contactus footer was found", true);
						link1.click();
						try {
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on contactUs footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("unable to click contactus footer", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find contactUs footer", true);
			}
					
	}
		}
		//**********community***********
		public void test_Footer_WSDK030() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.Communityhref)) 
						{
						Reporter.log("community footer was found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on community footer it is navigated to url="+url, true);
			    	
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("community footer not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find community footer", true);
			}
					
	}
		}
		//**********studentOffer***********
		public void test_Footer_WSDK031() throws InterruptedException, IOException {
			
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.StudentOfferhref)) 
						{
						Reporter.log("offer footer was found", true);
						try {
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on students offer footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("offer footer not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find students offer footer", true);
			}
					
	}
		}
		//**********serviceCentres***********
		public void test_Footer_WSDK032() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.ServiceCentreshref)) 
						{
						Reporter.log("service-centres footer was found", true);
						try {
						
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on service-centres footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("service-centres footer not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find service-centres footer", true);
			}
					
	}
		}
		//**********WarrantyPolicy***********
		public void test_Footer_WSDK033() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.warrantyhref)) 
						{
						Reporter.log("warranty footer was found", true);
						try {
						
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on warranty footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("warranty footer not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find warranty footer", true);
			}
					
	}
		}
		//**********TermsandConditions***********
		public void test_Footer_WSDK034() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.TermsAndConditionhref)) 
						{
						Reporter.log("TermsAndConditions footer was found", true);
						try {
						
						link1.click();
						method.SwitchToLastWindow();	
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on TermsAndConditions footer it is navigated to url="+url, true);
			    	SeleniumHelper.driver.close();
					method.SwitchToPreviousWindow();
						}
						catch(Exception e) {
							Reporter.log("TermsAndConditions footer not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find TermsAndConditions footer", true);
			}
					
	}
		}
		
		//**********RefundPolicy***********
		public void test_Footer_WSDK035() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.refundPolicyhref)) 
						{
						Reporter.log("refund policy footer was found", true);
						try {
						
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on refund policy footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("refund policy footer not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find refund policy footer", true);
			}
					
	}
		}
		//**********External Links***********
		//**********facebookLink***********
		public void test_Footer_WSDK036() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.Facebookhref)) 
						{
						Reporter.log("facebook footer was found", true);
						try {
						
						link1.click();
						method.SwitchToLastWindow();	
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on facebook link in footer it is navigated to url="+url, true);
			    	helper.Sleep();
			    	SeleniumHelper.driver.close();
					method.SwitchToPreviousWindow();
						}
						
						
						
						catch(Exception e) {
							Reporter.log("facebook footer not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find facebook link in footer", true);
			}
					
	}
		}
		//**********instagramLink***********
		public void test_Footer_WSDK037() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.Instagramhref)) 
						{
						Reporter.log("instagram footer was found", true);
						try {
						
						link1.click();
						method.SwitchToLastWindow();
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on instagram link in footer it is navigated to url="+url, true);
			    	helper.DeepSleep();
			    	SeleniumHelper.driver.close();
					method.SwitchToPreviousWindow();
						}
						catch(Exception e) {
							Reporter.log("instagram footer not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find instagram link in footer", true);
			}
					
	}
		}
		//**********LinkedinLink***********
		public void test_Footer_WSDK038() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.linkedInhref)) 
						{
						Reporter.log("linkedin footer was found", true);
						try {
						link1.click();
						method.SwitchToLastWindow();
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on linkedin link in footer it is navigated to url="+url, true);
			    	helper.Sleep();
			    	SeleniumHelper.driver.close();
					method.SwitchToPreviousWindow();
						}
						catch(Exception e) {
							Reporter.log("linkedin footer not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find linkedin link in footer", true);
			}
					
	}
		}
		//**********twitterLink***********
		public void test_Footer_WSDK039() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.Twitterhref)) 
						{
						Reporter.log("twitter footer was found", true);
						try {
						
						link1.click();
						//helper.DeepSleep();
						
						method.SwitchToLastWindow();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on twitter link in footer it is navigated to url="+url, true);
			    	helper.Sleep();
			    	SeleniumHelper.driver.close();
					method.SwitchToPreviousWindow();
						}
						catch(Exception e) {
							Reporter.log("twitter footer not clickable", true);
							
							helper.quit();
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find twitter link in footer", true);
			}
					
	}
		}
		//**********youtubeLink***********
		public void test_Footer_WSDK040() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.Youtubehref)) 
						{
						Reporter.log("youtube footer was found", true);
						try {
						
						link1.click();
						method.SwitchToLastWindow();
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on youtube link in footer it is navigated to url="+url, true);
			    	helper.DeepSleep();
			    	SeleniumHelper.driver.close();
					method.SwitchToPreviousWindow();
						}
						catch(Exception e) {
							Reporter.log("youtube footer not clickable", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find youtube link in footer", true);
			}
					
	}
		}
		//*******************************************************************************************	
		
		//**********check for the copyright*************
		public void test_Footer_WSDK041() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("p"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getText().equalsIgnoreCase("Smartron Copyright © 2018")) 
						{
						Reporter.log("smartron copyright found in the footer it is written as:"+link1.getText(), true);
						}
				}
						catch(Exception e) {
							Reporter.log("smartron copyright found in the footer", true);
						}
					
				
				}
		}
//*******************************************************************************************	
		
		//**********Smartron text in footer*************
		public void test_Footer_WSDK042() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.SmartronHomePage)) 
						{
						Reporter.log("smartron footer was found", true);
						try {
						
						link1.click();
						
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	Reporter.log(" when clicked on smartron link in footer it is navigated to url="+url, true);
			    	helper.NavigateBack();
						}
					catch(Exception e) {
						Reporter.log("unable to click smartronlink in footer", true);
					}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find smartronlink in footer", true);
			}
					
	}
	
			
}
		public void HeaderAndFooterCSS() throws InterruptedException {
			
			try{
				WebElement ele = SeleniumHelper.driver.findElement(By.cssSelector("body > header"));
				
				
				Reporter.log("Height of main header:"+ele.getSize().getHeight(), true);
				Reporter.log("Width of main header:"+ele.getSize().getWidth(),true);
				Reporter.log("colour of main header:"+ele.getCssValue("color"), true);
			}
			catch(Exception e) {
				Reporter.log("Main header not found", true);
			}
			
			
			try {
				WebElement ele1 = SeleniumHelper.driver.findElement(By.cssSelector("body > footer > div"));
						
						
						Reporter.log("Height of main Footer:"+ele1.getSize().getHeight(), true);
						Reporter.log("Width of main Footer:"+ele1.getSize().getWidth(),true);
						Reporter.log("colour of main Footer:"+ele1.getCssValue("color"), true);
						
					}
					catch(Exception e) {
						Reporter.log("Footer not found", true);
					}
			
			
			
		}
		
		public void ScrollSectionWise(String id) {
			WebElement element = SeleniumHelper.driver.findElement(By.xpath(id));
			((JavascriptExecutor) SeleniumHelper.driver).executeScript("arguments[0].scrollIntoView(true);", element);
			
		}
		
		public void SpellCheck() {
			try {
				List<WebElement> Heading2=SeleniumHelper.driver.findElements(By.tagName("h2"));
				
			
					
				
				for(WebElement head1:Heading2)
				{
					String Data1=head1.getText();
				
				System.out.println(Data1);
					MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
					
					String Dat1 = spellChecker.doCorrection(Data1);
					if(Dat1!=Data1) {
						
						Reporter.log("Before Correction : "+Data1,true);
					Reporter.log("After  Correction : "+Dat1, true);
					}
					
					}
				}
				catch(Exception e) {
					Reporter.log("Heading2 not found", true);
					Reporter.log("--------------------------------------", true);
					Reporter.log("--------------------------------------", true);
					Assert.assertTrue(true);
					
				}
					
				
				
				
				try {
				List<WebElement> Heading3=SeleniumHelper.driver.findElements(By.tagName("h3"));
				
				for(WebElement head2:Heading3)
				{
					String Data2=head2.getText();
					System.out.println(Data2);
				
					MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
					
					String Dat2 = spellChecker.doCorrection(Data2);
					if(Dat2!=Data2) {
						
						Reporter.log("Before Correction : "+Data2, true);
					Reporter.log("After  Correction : "+Dat2, true);
					Reporter.log("--------------------------------------", true);
					Reporter.log("--------------------------------------", true);
					}
					
				}
				}
				catch(Exception e) {
					Reporter.log("Heading3 not found", true);
				}
				try {	
		List<WebElement> Heading4=SeleniumHelper.driver.findElements(By.tagName("h4"));
				
				for(WebElement head3:Heading4)
				{
					String Data3=head3.getText();
					System.out.println(Data3);
					
					MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
					
					String Dat3 = spellChecker.doCorrection(Data3);
					if(Dat3!=Data3)
					{
						
						Reporter.log("Before Correction : "+Data3, true);
					Reporter.log("After  Correction : "+Dat3, true);
					Reporter.log("--------------------------------------", true);
					Reporter.log("--------------------------------------", true);
					
					}
				}
				}
				catch(Exception e) {
					Reporter.log("Heading4 not found", true);
				}
				try {
		List<WebElement> Heading5=SeleniumHelper.driver.findElements(By.tagName("h5"));
				
				for(WebElement head4:Heading5)
				{
					String Data4=head4.getText();
					System.out.println(Data4);
					
					MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
					
					String Dat4 = spellChecker.doCorrection(Data4);
					if(Dat4!=Data4) {
						Reporter.log("Heading5", true);
						Reporter.log("Before Correction : "+Data4, true);
					Reporter.log("After  Correction : "+Dat4, true);
					Reporter.log("--------------------------------------", true);
					Reporter.log("--------------------------------------", true);
					}
					
				}
				}
				catch(Exception e) {
					Reporter.log("Heading5 not found", true);
				}
				try {
		List<WebElement> Heading6=SeleniumHelper.driver.findElements(By.tagName("h6"));
				
				for(WebElement head5:Heading6)
				{
					String Data5=head5.getText();
					System.out.println(Data5);
					
					MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
					
					String Dat5 = spellChecker.doCorrection(Data5);
					if(Dat5!=Data5) {
						
						Reporter.log("Before Correction : "+Data5, true);
					Reporter.log("After  Correction : "+Dat5, true);
					Reporter.log("--------------------------------------", true);
					Reporter.log("--------------------------------------", true);
					}
					
				}
				}
				catch(Exception e) {
					Reporter.log("Heading6 not found", true);
				}
				try {
		List<WebElement> Paragraph=SeleniumHelper.driver.findElements(By.tagName("p"));
				
				for(WebElement Para:Paragraph)
				{
					String Data6=Para.getText();
					System.out.println(Data6);
				
					MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
					
					String Dat6 = spellChecker.doCorrection(Data6);
					if(Dat6!=Data6) {
						
						Reporter.log("Before Correction : "+Data6, true);
					Reporter.log("After  Correction : "+Dat6, true);
					Reporter.log("--------------------------------------", true);
					Reporter.log("--------------------------------------", true);
					
					}
				}
				}
				catch(Exception e) {
					Reporter.log("paragraph not found", true);
				}
				
				
				try {
					List<WebElement> span=SeleniumHelper.driver.findElements(By.tagName("span"));
							
							for(WebElement span1:span)
							{
								String Data7=span1.getText();
								System.out.println(Data7);
							
								MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
								
								String Dat7 = spellChecker.doCorrection(Data7);
								if(Dat7!=Data7) {
									
									Reporter.log("Before Correction : "+Data7, true);
								Reporter.log("After  Correction : "+Dat7, true);
								Reporter.log("--------------------------------------", true);
								Reporter.log("--------------------------------------", true);
								
								}
							}
							}
							catch(Exception e) {
								Reporter.log("span text not found", true);
							}
				
				
				try {
					List<WebElement> strng=SeleniumHelper.driver.findElements(By.tagName("strong"));
					
				
						
					
					for(WebElement strng1:strng)
					{
						String Data8=strng1.getText();
					
					System.out.println(Data8);
						MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
						
						String Dat8 = spellChecker.doCorrection(Data8);
						if(Dat8!=Data8) {
							
							Reporter.log("Before Correction : "+Data8);
						Reporter.log("After  Correction : "+Dat8, true);
						}
						
						}
					}
					catch(Exception e) {
						Reporter.log("strong heading not found", true);
						Reporter.log("--------------------------------------", true);
						Reporter.log("--------------------------------------", true);
						
						
					}
						
					
					
		}
	public void ScrollandTakeSectionWiseScreenShots() {
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> section=bodylinks.findElements(By.tagName("Section"));
		Reporter.log("Number of sections in HomePage:"+section.size(),true);
		
		for (WebElement sec : section)
		{
			Reporter.log(sec.getAttribute("data-section-name"),true);
			
		}
		try {
			method.ScrollSectionWise(Variables.Section1);
			Reporter.log("Section 1 found", true);
			try {
				helper.Sleep();
			method.screenshot("Section1");
			}
			catch(Exception e) {
				Reporter.log("Unable to take screenshot of section 1", true);
				Assert.assertTrue(false);
			}
			}
			catch(Exception e) {
				Reporter.log("Unable to find section 1", true);
				Assert.assertTrue(false);
			}
			
			
			
			
			try {
				method.ScrollSectionWise(Variables.Section2);
				
				Reporter.log("Section 2 found", true);
				try {
					helper.Sleep();
				method.screenshot("Section2");
				}
				catch(Exception e) {
					Reporter.log("Unable to take screenshot of section 2", true);
					Assert.assertTrue(false);
				}
				}
				catch(Exception e) {
					Reporter.log("Unable to find section 2", true);
					Assert.assertTrue(false);
				}
			
			
			
			
			
			
			
			try {
				method.ScrollSectionWise(Variables.Section3);
				
				Reporter.log("Section 3 found", true);
				try {
					helper.Sleep();
				method.screenshot("Section3");
				}
				catch(Exception e) {
					Reporter.log("Unable to take screenshot of section 3", true);
					Assert.assertTrue(false);
				}
				}
				catch(Exception e) {
					Reporter.log("Unable to find section 3", true);
					Assert.assertTrue(false);
				}
			
			
			
			
			try {
				method.ScrollSectionWise(Variables.Section4);
				
				Reporter.log("Section 4 found", true);
				try {
					helper.Sleep();
				method.screenshot("Section4");
				}
				catch(Exception e) {
					Reporter.log("Unable to take screenshot of section 4", true);
					Assert.assertTrue(false);
				}
				}
				catch(Exception e) {
					Reporter.log("Unable to find section 4", true);
					Assert.assertTrue(false);
				}
			
			
			
			
			try {
				method.ScrollSectionWise(Variables.Section5);
				
				Reporter.log("Section 5 found", true);
				try {
					helper.Sleep();
				method.screenshot("Section5");
				}
				catch(Exception e) {
					Reporter.log("Unable to take screenshot of section 5", true);
					Assert.assertTrue(false);
				}
				}
				catch(Exception e) {
					Reporter.log("Unable to find section 5", true);
					Assert.assertTrue(false);
				}
			
			
			
			try {
				method.ScrollSectionWise(Variables.Section6);
				
				Reporter.log("Section 6 found", true);
				try {
					helper.Sleep();
				method.screenshot("Section6");
				}
				catch(Exception e) {
					Reporter.log("Unable to take screenshot of section 6", true);
					Assert.assertTrue(false);
				}
				}
				catch(Exception e) {
					Reporter.log("Unable to find section 6", true);
					Assert.assertTrue(false);
				}
			
			
			
			
			try {
				method.ScrollSectionWise(Variables.Section7);
				
				Reporter.log("Section 7 found", true);
				try {
					helper.Sleep();
				method.screenshot("Section7");
				}
				catch(Exception e) {
					Reporter.log("Unable to take screenshot of section 7", true);
					Assert.assertTrue(false);
				}
				}
				catch(Exception e) {
					Reporter.log("Unable to find section 7", true);
					Assert.assertTrue(false);
				}
	}
	
	
	
	public void ClickOnTphonePHeaderLink() throws InterruptedException {
		WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
		List<WebElement> linksize = header.findElements(By.tagName("a")); 
		linksCount = linksize.size();
		links= new String[linksCount];
		for(int i=0;i<linksCount;i++)
		{
		links[i] = linksize.get(i).getAttribute("href");
		} 
		for(int i=0;i<linksCount;i++)
		{
			if(links[i].contains("tphoneP")) {
			SeleniumHelper.driver.navigate().to(links[i]);
			Thread.sleep(2000);
			break;
				}
		}
		
}
	public void ClickOnFlipKartLink() {
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> section=bodylinks.findElements(By.tagName("Section"));
		List<WebElement> allLinks = bodylinks.findElements(By.tagName("a"));
		
		
	// System.out.println("Number of sections in HomePage:"+section.size());
		
		for (WebElement link : allLinks)
		{
			try {
		if(link.getAttribute("href").contains("smartron-t-phone-p-gold-32-gb"))
		{
			Reporter.log(" flipkart link was found", true);
			try {
			link.click();
			
			method.SwitchToLastWindow();
	    	String url=SeleniumHelper.driver.getCurrentUrl();
	    	 WebElement ele=SeleniumHelper.driver.findElement(By.tagName("h1"));
      	   Reporter.log("Product name in the flipkart page is"+" "+ele.getText(),true);
      	  
      	   if(ele.getText().contains("Smartron t.phone P (Gold, 32 GB)  (3 GB RAM)"))
      	   {
      	   
         }
      	   else {
      		   Reporter.log("Product name has changed in the flipkart page now it is"+" "+ele.getText(),true);
      	   }
	    	Reporter.log(" when clicked on tphoneP-content it is navigated to url="+url, true);
			SeleniumHelper.driver.close();
			method.SwitchToPreviousWindow();
			}
			catch(Exception e) {
				Reporter.log(" flipkart link was not clickable", true);
				Assert.assertTrue(false);
			}
			break;
		}
		}
		catch(Exception e){
		
			Reporter.log("Flipkart link not found", true);
			Assert.assertTrue(false);
		}
		 }
	}
	
	public void YTPvideo() {
		List<WebElement> iframe=SeleniumHelper.driver.findElements(By.tagName("iframe"));
		for (WebElement element: iframe)
	 {
		 try {
		if(element.getAttribute("src").contains("S-9WhX7WQtk?autoplay=1&rel=0&showinfo=0"))
		{
			
			Reporter.log("ytp video was found", true);
			System.out.println("ytp video source:"+element.getAttribute("src"));
			break;
		}
		 }
		catch(Exception e)
		{
			Reporter.log("ytp video was not found", true);
			Assert.assertTrue(false);
		}
		}
	}
	
	public void CommonHeader() throws InterruptedException, IOException {
		method.test_Header_WSDK007();
		method.test_Header_WSDK008();
		method.test_Header_WSDK009();
		method.test_Header_WSDK010();
		method.test_Header_WSDK011();
		method.test_Header_WSDK012();
		method.test_Header_WSDK013();
		method.test_Header_WSDK014();
		method.test_Header_WSDK015();
		method.test_Header_WSDK016();
	}
	public void CommonFooter() throws InterruptedException, IOException {
		method.test_Footer_WSDK017();
		method.test_Footer_WSDK018();
		method.test_Footer_WSDK019();
		method.test_Footer_WSDK020();
	    method.test_Footer_WSDK021();
		method.test_Footer_WSDK022();
		method.test_Footer_WSDK023();
		method.test_Footer_WSDK024();
		method.test_Footer_WSDK025();
		method.test_Footer_WSDK026();
		method.test_Footer_WSDK027();
		method.test_Footer_WSDK028();
		method.test_Footer_WSDK029();
		method.test_Footer_WSDK030();
		method.test_Footer_WSDK031();
		method.test_Footer_WSDK032();
		method.test_Footer_WSDK033();
		method.test_Footer_WSDK034();
		method.test_Footer_WSDK035();
		method.test_Footer_WSDK036();
		method.test_Footer_WSDK037();
		method.test_Footer_WSDK038();
		method.test_Footer_WSDK039();
		method.test_Footer_WSDK040();
		method.test_Footer_WSDK041();
		method.test_Footer_WSDK042();
		
	}
	
	public void GetallBackgroundImages(String data) {
		
		WebElement bodylink=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> section=bodylink.findElements(By.tagName("Section"));
		Reporter.log("Number of sections in HomePage:"+section.size(),true);
		
for (WebElement link : section)
			
		{
	
	String secname=link.getAttribute("class");
	String image=link.getCssValue("background-image");
	Reporter.log("Background image of"+secname+"is"+image,true);
		}
	}
	
	
	public void backgroundimageOfsection1(String path) {
	WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.Section1));
		
		String data=bodylinks.getCssValue("background-image");
		
		
		
		if(data.startsWith("url")) {
			Reporter.log("Background image of section1:"+data, true);
			try {
				helper.Sleep();
				String good=data.split("\"")[1];
				helper.Sleep();
			SeleniumHelper.driver.get(good);
			helper.Sleep();
			
			method.Check_imageLoadedOrNot(path);
			helper.NavigateBack();
			}
			catch(Exception e) {
				Reporter.log("Unable to check background image loading",true);
				
			}
			
		
		}
		
	else{
			Reporter.log("Background image not found for section1", true);
			
		}
		
	}
	
	public void BackgroundImageOfSection2(String path) {
WebElement bodylinks1=SeleniumHelper.driver.findElement(By.xpath(Variables.Section2));
		
		String data1=bodylinks1.getCssValue("background-image");
		
		
	
		if(data1.startsWith("url")) {
			Reporter.log("Background image of section2:"+data1, true);	
			try {
				String good1=data1.split("\"")[1];
				SeleniumHelper.driver.get(good1);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
				
		}
	
	else{
			Reporter.log("Background image not found for section2", true);
			Assert.assertTrue(true);
		}
	}
	

	public void BackGroundImageOfSection3(String path) {
		
WebElement bodylinks3=SeleniumHelper.driver.findElement(By.xpath(Variables.Section3));
		
		String data3=bodylinks3.getCssValue("background-image");
		
		
		if(data3.startsWith("url")) {
			Reporter.log("Background image of section3:"+data3, true);	
			try {
				String good3=data3.split("\"")[1];
				SeleniumHelper.driver.get(good3);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
	else {
			Reporter.log("Background image not found for section3", true);
			
		}
	}
	public void BackgroundImageOfSection4(String path) {
		
		WebElement bodylinks4=SeleniumHelper.driver.findElement(By.xpath(Variables.Section4));
		
		String data4=bodylinks4.getCssValue("background-image");
		
		
		if(data4.startsWith("url")) {
			Reporter.log("Background image of section4:"+data4, true);	
			try {
				String good4=data4.split("\"")[1];
				SeleniumHelper.driver.get(good4);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
	else {
			Reporter.log("Background image not found for section4", true);
			
		}
	}
	public void BackgroundImageOfSection5(String path) {
		
	WebElement bodylinks5=SeleniumHelper.driver.findElement(By.xpath(Variables.Section5));
		
		String data5=bodylinks5.getCssValue("background-image");
		
		
		if(data5.startsWith("url")) {
			Reporter.log("Background image of section5:"+data5, true);	
			try {
				String good5=data5.split("\"")[1];
				SeleniumHelper.driver.get(good5);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
		else{
			Reporter.log("Background image not found for section5", true);
			
		}
	}
	public void BackgroundImageOfSection6(String path) {
	WebElement bodylinks6=SeleniumHelper.driver.findElement(By.xpath(Variables.Section6));
		
		String data6=bodylinks6.getCssValue("background-image");
		
		
		if(data6.startsWith("url")) {
			Reporter.log("Background image of section6:"+data6, true);	
			try {
				String good6=data6.split("\"")[1];
				SeleniumHelper.driver.get(good6);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
		else {
			Reporter.log("Background image not found for section6", true);
			
		}
	}
	public void BackgroundImageOfSection7(String path) {
		
	WebElement bodylinks7=SeleniumHelper.driver.findElement(By.xpath(Variables.Section7));
		
		String data7=bodylinks7.getCssValue("background-image");
		
		
		if(data7.startsWith("url")) {
			Reporter.log("Background image of section7:"+data7, true);	
			try {
				String good7=data7.split("\"")[1];
				SeleniumHelper.driver.get(good7);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
		else {
			Reporter.log("Background image not found for section7", true);
			
		}
	}
	public void BackgroundImageOfSection8(String path) {
				
	WebElement bodylinks8=SeleniumHelper.driver.findElement(By.xpath(Variables.Section8));
		
		String data8=bodylinks8.getCssValue("background-image");
		
		
		if(data8.startsWith("url")) {
			Reporter.log("Background image of section8:"+data8, true);	
			try {
				String good8=data8.split("\"")[1];
				SeleniumHelper.driver.get(good8);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
		else {
			Reporter.log("Background image not found for section8", true);
			
		}
	}
	public void BackgroundImageOfSection9(String path) {
		
	WebElement bodylinks9=SeleniumHelper.driver.findElement(By.xpath(Variables.Section9));
		
		String data9=bodylinks9.getCssValue("background-image");
		
		
		if(data9.startsWith("url")) {
			Reporter.log("Background image of section9:"+data9, true);	
			try {
				String good9=data9.split("\"")[1];
				SeleniumHelper.driver.get(good9);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
		else {
			Reporter.log("Background image not found for section9", true);
			
		}
	}

	
	public void CheckImagesInThePage(){
		
		List<WebElement> image=SeleniumHelper.driver.findElements(By.tagName("img"));
		
		Reporter.log("Number of images found:"+image.size(),true);
		 if(image.size()>0)
		 {
		for (WebElement lin: image)
		{
			
			Reporter.log("Image source is"+" "+lin.getAttribute("src"),true);
		
		}
		 }
	else 
	{
			 Reporter.log("images not found",true);
		 }
		}
	
public void ClickOnTphonePSpecification() throws InterruptedException {
	
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link : header_allLinks)
		
	{



if(link.getAttribute("href").equalsIgnoreCase("https://www.smartron.com/tphoneP-specifications.html")) {
	
	link.click();
	
	break;
}

}	
	}
public void ClickOnsrtphoneHeaderLink() throws InterruptedException {
	List<WebElement> linksize = SeleniumHelper.driver.findElements(By.tagName("a")); 
	linksCount = linksize.size();
	links= new String[linksCount];
	for(int i=0;i<linksCount;i++)
	{
	links[i] = linksize.get(i).getAttribute("href");
	} 
	for(int i=0;i<linksCount;i++)
	{
		if(links[i].contains("srt-overview.html")) {
		SeleniumHelper.driver.navigate().to(links[i]);
		Thread.sleep(2000);
		break;
			}
	}

}

public void CheckForBrokenLink() {
	String homePage = Variables.WebsiteURL;
    String url = "";
    HttpURLConnection huc = null;
    int respCode = 200;
	 List<WebElement> links = SeleniumHelper.driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty()){
System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
            if(!url.startsWith(homePage)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
            
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    Reporter.log(url+" is a broken link",true);
                }
                else{
                    System.out.println(url+" is a valid link");
                }
                    
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
}



public void ClickOnsrtphonePerformance() throws InterruptedException {
	
	
	
	List<WebElement> linksize = SeleniumHelper.driver.findElements(By.tagName("a")); 
	linksCount = linksize.size();
	links= new String[linksCount];
	for(int i=0;i<linksCount;i++)
	{
	links[i] = linksize.get(i).getAttribute("href");
	} 
	for(int i=0;i<linksCount;i++)
	{
		if(links[i].contains("srt-performance.html")) {
		SeleniumHelper.driver.navigate().to(links[i]);
		Thread.sleep(2000);
		break;
			}
	}
	}


public void ClickOnsrtphoneDesignAndBuild() throws InterruptedException {
	
	
	
	List<WebElement> linksize = SeleniumHelper.driver.findElements(By.tagName("a")); 
	linksCount = linksize.size();
	links= new String[linksCount];
	for(int i=0;i<linksCount;i++)
	{
	links[i] = linksize.get(i).getAttribute("href");
	} 
	for(int i=0;i<linksCount;i++)
	{
		if(links[i].contains("srt-design-build.html")) {
		SeleniumHelper.driver.navigate().to(links[i]);
		Thread.sleep(2000);
		break;
			}
	}
	}
public void ClickOnsrtphoneTechnology() throws InterruptedException {
	
	
	
	List<WebElement> linksize = SeleniumHelper.driver.findElements(By.tagName("a")); 
	linksCount = linksize.size();
	links= new String[linksCount];
	for(int i=0;i<linksCount;i++)
	{
	links[i] = linksize.get(i).getAttribute("href");
	} 
	for(int i=0;i<linksCount;i++)
	{
		if(links[i].contains("srt-technology.html")) {
		SeleniumHelper.driver.navigate().to(links[i]);
		Thread.sleep(2000);
		break;
			}
	}
	}


public void ClickOnsrtphoneSpecifications() throws InterruptedException {
	
	
	
	List<WebElement> linksize = SeleniumHelper.driver.findElements(By.tagName("a")); 
	linksCount = linksize.size();
	links= new String[linksCount];
	for(int i=0;i<linksCount;i++)
	{
	links[i] = linksize.get(i).getAttribute("href");
	} 
	for(int i=0;i<linksCount;i++)
	{
		if(links[i].contains("srt-specifications.html")) {
		SeleniumHelper.driver.navigate().to(links[i]);
		Thread.sleep(2000);
		break;
			}
	}
	}
public void ClickOnsrtphoneBuy() throws InterruptedException {
	
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link : header_allLinks)
		
	{



if(link.getAttribute("href").equalsIgnoreCase("https://tstore.smartron.com/srt-phone.html")) {
	
	link.click();
	
	break;
}

}	
	}
public void ClickOnTthingsHeader() throws InterruptedException {
	
	
	WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
	List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.thingshref)) 
				{
				
				try {
				link1.click();
				
			
				}
				catch(Exception e) {
					Reporter.log("unable to click things header link", true);
					
			}
				
			break;
				
		
		}
		}
	catch(Exception e) {
		Reporter.log("unable to find things header", true);
	}
			
}
	}

public void ClickOntphoneSpecifications() throws InterruptedException {
	
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link : header_allLinks)
		
	{



if(link.getAttribute("href").equalsIgnoreCase("https://www.smartron.com/tphone-specifications.html")) {
	
	link.click();
	
	break;
}

}	
	}
public void ClickOnTphoneHeaderLink() {
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	//System.out.println("header links:");
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.tphonehref)) 
				{
				
				try {
				WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.tphoneInHeader));
				Actions actions1= new Actions(SeleniumHelper.driver);
				actions1.moveToElement(menu1).perform();
				link1.click();
			
				
				
			
				}
				catch(Exception e) {
					Reporter.log(" unable to click t-phone link in the header", true);
				}
			
			break;
			
			}
		}
		catch(Exception e)
		{
			
		Reporter.log("unable to find t-phone header", true);
			
		}
}
	}
public void ClickOntphoneBuy() throws InterruptedException {
	
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link : header_allLinks)
		
	{



if(link.getAttribute("href").equalsIgnoreCase("https://tstore.smartron.com/tphones.html")) {
	
	link.click();
	
	break;
}

}	
}	

public void ClickOntbookBuy() throws InterruptedException {
	
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link : header_allLinks)
		
	{



if(link.getAttribute("href").equalsIgnoreCase("https://tstore.smartron.com/tbooks.html")) {
	
	link.click();
	
	break;
}

}	
}	

public void ClickOntbookHeaderLink() {
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	//System.out.println("header links:");
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.tbookhref)) 
				{
				
				try {
				WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.tphoneInHeader));
				Actions actions1= new Actions(SeleniumHelper.driver);
				actions1.moveToElement(menu1).perform();
				link1.click();
			
				
				
			
				}
				catch(Exception e) {
					Reporter.log(" unable to click t-phone link in the header", true);
				}
			
			break;
			
			}
		}
		catch(Exception e)
		{
			
		Reporter.log("unable to find t-phone header", true);
			
		}
}
	}

public void ClickOntbookSpecifications() throws InterruptedException {
	
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link : header_allLinks)
		
	{



if(link.getAttribute("href").equalsIgnoreCase("https://www.smartron.com/tbook-specifications.html")) {
	
	link.click();
	
	break;
}

}	
	}

public void backgroundimageOfspan(String path) {
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("span"));	
	for (WebElement link1 : header_allLinks) {
		String data=link1.getCssValue("background-image");
		
		System.out.println(data);
		
		if(data.startsWith("url")) {
			Reporter.log("Background image of section1:"+data, true);
			try {
				helper.Sleep();
				String good=data.split("\"")[1];
				helper.Sleep();
			SeleniumHelper.driver.get(good);
			helper.Sleep();
			
			method.Check_imageLoadedOrNot("xhtml:html/xhtml:body/xhtml:img");
			helper.NavigateBack();
			}
			catch(Exception e) {
				Reporter.log("Unable to check background image loading",true);
				
			}
			
		break;
		}
		
	else{
			Reporter.log("Background image not found for section1", true);
			
		}
		
	}
}

public void SpanbackgroundimageOfsection1(String path) {
	WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.Section1));
	try {
	List<WebElement> header_allLinks =menu1.findElements(By.tagName("span"));	
	for (WebElement bodylinks : header_allLinks) {
		String data=bodylinks.getCssValue("background-image");
		
		
		
		if(data.startsWith("url")) {
			Reporter.log("Background image of section1:"+data, true);
			try {
				helper.Sleep();
				String good=data.split("\"")[1];
				helper.Sleep();
			SeleniumHelper.driver.get(good);
			helper.Sleep();
			
			method.Check_imageLoadedOrNot(path);
			helper.NavigateBack();
			}
			catch(Exception e) {
				Reporter.log("Unable to check background image loading",true);
				
			}
			
		
		}
		
	else{
			Reporter.log("Background image not found for section1", true);
			
		}
		
	}
	}
	catch(Exception e) {
		
	}
}
	
	public void spanBackgroundImageOfSection2(String path) {
		WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.Section2));
		try {
		List<WebElement> header_allLinks =menu1.findElements(By.tagName("span"));	
		for (WebElement bodylinks1 : header_allLinks) {
		
		String data1=bodylinks1.getCssValue("background-image");
		
		
	
		if(data1.startsWith("url")) {
			Reporter.log("Background image of section2:"+data1, true);	
			try {
				String good1=data1.split("\"")[1];
				SeleniumHelper.driver.get(good1);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
				
		}
	
	else{
			Reporter.log("Background image not found for section2", true);
			Assert.assertTrue(true);
		}
	}
		}
		catch(Exception e) {
		
		}
	}
	public void spanBackGroundImageOfSection3(String path) {
		
		WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.Section3));
		try {
		List<WebElement> header_allLinks =menu1.findElements(By.tagName("span"));	
		for (WebElement bodylinks3 : header_allLinks) {
		
		String data3=bodylinks3.getCssValue("background-image");
		
		
		if(data3.startsWith("url")) {
			Reporter.log("Background image of section3:"+data3, true);	
			try {
				String good3=data3.split("\"")[1];
				SeleniumHelper.driver.get(good3);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
	else {
			Reporter.log("Background image not found for section3", true);
			
		}
	}
		}
		catch(Exception e) {
			
		}
	}
	public void spanBackgroundImageOfSection4(String path) {
		
		WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.Section4));
		try {
		List<WebElement> header_allLinks =menu1.findElements(By.tagName("span"));	
		for (WebElement bodylinks4 : header_allLinks) {
		
		String data4=bodylinks4.getCssValue("background-image");
		
		
		if(data4.startsWith("url")) {
			Reporter.log("Background image of section4:"+data4, true);	
			try {
				String good4=data4.split("\"")[1];
				SeleniumHelper.driver.get(good4);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
	else {
			Reporter.log("Background image not found for section4", true);
			
		}
	}
		}
		catch(Exception e) {
			
		}
	
	
	
	}
	public void spanBackgroundImageOfSection5(String path) {
		
		WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.Section5));
		try {
		List<WebElement> header_allLinks =menu1.findElements(By.tagName("span"));	
		for (WebElement bodylinks5 : header_allLinks) {
		
		String data5=bodylinks5.getCssValue("background-image");
		
		
		if(data5.startsWith("url")) {
			Reporter.log("Background image of section5:"+data5, true);	
			try {
				String good5=data5.split("\"")[1];
				SeleniumHelper.driver.get(good5);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
		else{
			Reporter.log("Background image not found for section5", true);
			
		}
		}
		}
		catch(Exception e) {
			
		}
	}
	public void spanBackgroundImageOfSection6(String path) {
		WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.Section6));
		try {
		List<WebElement> header_allLinks =menu1.findElements(By.tagName("span"));	
		for (WebElement bodylinks6 : header_allLinks) {
		
		String data6=bodylinks6.getCssValue("background-image");
		
		
		if(data6.startsWith("url")) {
			Reporter.log("Background image of section6:"+data6, true);	
			try {
				String good6=data6.split("\"")[1];
				SeleniumHelper.driver.get(good6);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
		else {
			Reporter.log("Background image not found for section6", true);
			
		}
		}
	}
		catch(Exception e) {
			
		}
	
	}
	public void spanBackgroundImageOfSection7(String path) {
		
		WebElement menu1= SeleniumHelper.driver.findElement(By.xpath(Variables.Section7));
		try {
		List<WebElement> header_allLinks =menu1.findElements(By.tagName("span"));	
		for (WebElement bodylinks7 : header_allLinks) {
		
		String data7=bodylinks7.getCssValue("background-image");
		
		
		if(data7.startsWith("url")) {
			Reporter.log("Background image of section7:"+data7, true);	
			try {
				String good7=data7.split("\"")[1];
				SeleniumHelper.driver.get(good7);
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
		else {
			Reporter.log("Background image not found for section7", true);
			
		}
	}

}
	
		catch(Exception e) {
			
		}
	}
	
	
	
	public void ImagesOfsection1(String path) {
		
		try {
			WebElement sec=SeleniumHelper.driver.findElement(By.xpath(Variables.Section1));
		List<WebElement> header_allLinks =sec.findElements(By.tagName("img"));	
		for (WebElement bodylinks : header_allLinks) {
			String data=bodylinks.getAttribute("src");
			
			
			
			if(data.startsWith("https")) {
				Reporter.log("Image of section1:"+data, true);
				try {
					helper.Sleep();
					
				SeleniumHelper.driver.get(data);
				helper.Sleep();
				
				method.Check_imageLoadedOrNot(path);
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check image loading",true);
					
				}
				
			
			}
			
			else{
				Reporter.log("Image not found for section1", true);
				
			}
			
		}
		}
		catch(Exception e) {
			Reporter.log("Image not found for section1", true);
		}
	}
		
		public void ImagesOfSection2(String path) {
			try {
				WebElement sec=SeleniumHelper.driver.findElement(By.xpath(Variables.Section2));
				List<WebElement> header_allLinks =sec.findElements(By.tagName("img"));	
				for (WebElement bodylinks : header_allLinks) {
					String data=bodylinks.getAttribute("src");
					
					
					
					if(data.startsWith("https")) {
						Reporter.log("Image of section2:"+data, true);
						try {
							helper.Sleep();
							
						SeleniumHelper.driver.get(data);
						helper.Sleep();
						
						method.Check_imageLoadedOrNot(path);
						helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("Unable to check image loading",true);
							
						}
						
					
					}
					
				else{
						Reporter.log("Image not found for section2", true);
						
					}
					
				}
				}
				catch(Exception e) {
					
				}
		}
		public void ImagesOfSection3(String path) {
			
			try {
				WebElement sec=SeleniumHelper.driver.findElement(By.xpath(Variables.Section3));
				List<WebElement> header_allLinks =sec.findElements(By.tagName("img"));		
				for (WebElement bodylinks : header_allLinks) {
					String data=bodylinks.getAttribute("src");
					
					
					
					if(data.startsWith("https")) {
						Reporter.log("Image of section3:"+data, true);
						try {
							helper.Sleep();
							
						SeleniumHelper.driver.get(data);
						helper.Sleep();
						
						method.Check_imageLoadedOrNot(path);
						helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("Unable to check image loading",true);
							
						}
						
					
					}
					
				else{
						Reporter.log("Image not found for section3", true);
						
					}
					
				}
				}
				catch(Exception e) {
					
				}
		}
		public void ImagesOfSection4(String path) {
			
			try {
				WebElement sec=SeleniumHelper.driver.findElement(By.xpath(Variables.Section4));
				List<WebElement> header_allLinks =sec.findElements(By.tagName("img"));	
				for (WebElement bodylinks : header_allLinks) {
					String data=bodylinks.getAttribute("src");
					
					
					
					if(data.startsWith("https")) {
						Reporter.log("Image of section4:"+data, true);
						try {
							helper.Sleep();
							
						SeleniumHelper.driver.get(data);
						helper.Sleep();
						
						method.Check_imageLoadedOrNot(path);
						helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("Unable to check image loading",true);
							
						}
						
					
					}
					
				else{
						Reporter.log("Image not found for section4", true);
						
					}
					
				}
				}
				catch(Exception e) {
					
				}
		
		
		}
		public void ImagesOfSection5(String path) {
			
			try {
				WebElement sec=SeleniumHelper.driver.findElement(By.xpath(Variables.Section5));
				List<WebElement> header_allLinks =sec.findElements(By.tagName("img"));		
				for (WebElement bodylinks : header_allLinks) {
					String data=bodylinks.getAttribute("src");
					
					
					
					if(data.startsWith("https")) {
						Reporter.log("Image of section5:"+data, true);
						try {
							helper.Sleep();
							
						SeleniumHelper.driver.get(data);
						helper.Sleep();
						
						method.Check_imageLoadedOrNot(path);
						helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("Unable to check image loading",true);
							
						}
						
					
					}
					
				else{
						Reporter.log("Image not found for section5", true);
						
					}
					
				}
				}
				catch(Exception e) {
					
				}
		}
		public void ImagesOfSection6(String path) {
			try {
				WebElement sec=SeleniumHelper.driver.findElement(By.xpath(Variables.Section6));
				List<WebElement> header_allLinks =sec.findElements(By.tagName("img"));		
				for (WebElement bodylinks : header_allLinks) {
					String data=bodylinks.getAttribute("src");
					
					
					
					if(data.startsWith("https")) {
						Reporter.log("Image of section6:"+data, true);
						try {
							helper.Sleep();
							
						SeleniumHelper.driver.get(data);
						helper.Sleep();
						
						method.Check_imageLoadedOrNot(path);
						helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("Unable to check image loading",true);
							
						}
						
					
					}
					
				else{
						Reporter.log("Image not found for section6", true);
						
					}
					
				}
				}
				catch(Exception e) {
					
				}
		
		}
		public void ImagesOfSection7(String path) {
			
			try {
				WebElement sec=SeleniumHelper.driver.findElement(By.xpath(Variables.Section7));
				List<WebElement> header_allLinks =sec.findElements(By.tagName("img"));		
				for (WebElement bodylinks : header_allLinks) {
					String data=bodylinks.getAttribute("src");
					
					
					
					if(data.startsWith("https")) {
						Reporter.log("Image of section7:"+data, true);
						try {
							helper.Sleep();
							
						SeleniumHelper.driver.get(data);
						helper.Sleep();
						
						method.Check_imageLoadedOrNot(path);
						helper.NavigateBack();
						}
						catch(Exception e) {
							Reporter.log("Unable to check image loading",true);
							
						}
						
					
					}
					
				else{
						Reporter.log("Image not found for section7", true);
						
					}
					
				}
				}
				catch(Exception e) {
					
				}
}
		public void ClickOntronXHeader() throws InterruptedException, IOException {
			WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
			List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.tronXhref)) 
						{
						
						try {
							SeleniumHelper.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
						link1.click();
						
				
						}
						catch(Exception e) {
							Reporter.log("tronX header link is not clickable", true);
						}
					
					break;
						}	
				
				}
			catch(Exception e) {
				Reporter.log("unable to find tronX header", true);
			}
					
	}
	}
		
		
		public void ClickOnIoTHeader() throws InterruptedException, IOException {
			List<WebElement> linksize = SeleniumHelper.driver.findElements(By.tagName("a")); 
			linksCount = linksize.size();
			links= new String[linksCount];
			for(int i=0;i<linksCount;i++)
			{
			links[i] = linksize.get(i).getAttribute("href");
			} 
			for(int i=0;i<linksCount;i++)
			{
				if(links[i].contains("iot.html")) {
				SeleniumHelper.driver.navigate().to(links[i]);
				Thread.sleep(2000);
				break;
					}
			}
		}
		
		
public void ClickOnIotHome() throws InterruptedException, IOException {
			
			
			List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
			
			for (WebElement link1 : header_allLinks) {
				 
				try {
					if(link1.getAttribute("href").equalsIgnoreCase(Variables.IoTHomePage)) 
						{
						
						try {
						
						link1.click();
					
					
						}
						catch(Exception e) {
							Reporter.log("unable to click on IoT Home subheader", true);
						}
					break;
					
					}
				
				}
			catch(Exception e) {
				Reporter.log("unable to find IoT Home subheader ", true);
			}
					
	}
		}

public void ClickOnIotHealth() throws InterruptedException, IOException {
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.IoTHealthPage)) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on IoT Home subheader", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find IoT Home subheader ", true);
	}
			
}
}
public void ClickOnIotEDU() throws InterruptedException, IOException {
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.IoTeduPage)) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on IoT Home subheader", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find IoT Home subheader ", true);
	}
			
}
}

public void ClickOnIotINFRA() throws InterruptedException, IOException {
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.IoTinfraPage)) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on IoT Home subheader", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find IoT Home subheader ", true);
	}
			
}
}

public void ClickOnIotEnterprise() throws InterruptedException, IOException {
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.IoTenterprisePage)) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on IoT Home subheader", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find IoT Home subheader ", true);
	}
			
}
}
public void ClickOntcareheaderLink() throws InterruptedException, IOException {
	
	WebElement header=SeleniumHelper.driver.findElement(By.xpath(Variables.Header));
	List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.tcarehref)) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on IoT Home subheader", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find IoT Home subheader ", true);
	}
			
}
}


public void ClickOntcareServices() throws InterruptedException, IOException {
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.tcareservices)) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on tcareServices ", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find tcareServices  ", true);
	}
			
}
}
public void ClickOntcareWarrantyInformation() throws InterruptedException, IOException {
	WebElement head=SeleniumHelper.driver.findElement(By.className("container"));
	List<WebElement> header_allLinks = head.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.tcareWarrantyInformation)) 
				{
				
				try {
				
				link1.click();
				
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on tcareWarranty ", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find tcareWarranty  ", true);
	}
			
}
}
	
public void ClickOnCommunityIntcare() throws InterruptedException, IOException {
	
	WebElement head=SeleniumHelper.driver.findElement(By.className("container"));
	List<WebElement> header_allLinks = head.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.tcareCommunity)) 
				{
				
				try {
				
				link1.click();
				method.SwitchToLastWindow();	
				String url=SeleniumHelper.driver.getCurrentUrl();
		    	Reporter.log(" when clicked on Community in tcare page it is navigated to url="+url, true);
		    	SeleniumHelper.driver.close();
				method.SwitchToPreviousWindow();
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on tcarecommunity ", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find tcarecommunity  ", true);
	}
			
}
}
public void ClickOntbookInWarrantyInformation() throws InterruptedException, IOException {
	
	WebElement node=SeleniumHelper.driver.findElement(By.className("warranty"));
	List<WebElement> header_allLinks = node.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			
			if(link1.getText().equalsIgnoreCase("t·book")) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on tbook in WarrantyInformation ", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find tbook in WarrantyInformation  ", true);
	}
			
}
}
public void ClickOntphoneInWarrantyInformation() throws InterruptedException, IOException {
	
	WebElement node=SeleniumHelper.driver.findElement(By.className("warranty"));
	List<WebElement> header_allLinks = node.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			
			if(link1.getText().equalsIgnoreCase("t·phone")) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on t·phone in WarrantyInformation ", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find t·phone in WarrantyInformation  ", true);
	}
			
}
}


public void ClickOnCompanyheaderLink() throws InterruptedException, IOException {
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.AboutUshref)) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on comapany header", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find comapany header ", true);
	}
			
}
}


public void ClickOnpeoplesubheader() throws InterruptedException, IOException {
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.Peoplehref)) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on peoplesubheader ", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find peoplesubheader  ", true);
	}
			
}
}



public void ClickOnAmbassadorsubheader() throws InterruptedException, IOException {
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.Ambassadorshref)) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on Ambassadorsubheader ", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find Ambassadorsubheader  ", true);
	}
			
}
}


public void ClickOnCareerssubheader() throws InterruptedException, IOException {
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.Careershref)) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on Careerssubheader ", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find Careerssubheader  ", true);
	}
			
}
}


public void ClickOnPressSubheader() throws InterruptedException, IOException {
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.Presshref)) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on PressSubheader ", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find PressSubheader  ", true);
	}
			
}
}


public void ClickOnContactUsSubheader() throws InterruptedException, IOException {
	
	
	List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link1 : header_allLinks) {
		 
		try {
			if(link1.getAttribute("href").equalsIgnoreCase(Variables.ContactUshref)) 
				{
				
				try {
				
				link1.click();
			
			
				}
				catch(Exception e) {
					Reporter.log("unable to click on ContactUsSubheader ", true);
				}
			break;
			
			}
		
		}
	catch(Exception e) {
		Reporter.log("unable to find ContactUsSubheader  ", true);
	}
			
}
	
	
}

public void UploadImage(String path) throws AWTException{
	 StringSelection ss = new StringSelection(path);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, ss); //copy the above string to clip board     
    Robot robot;
    robot = new Robot();
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.delay(2000); 
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
  robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL); 
    robot.delay(2000); 
   robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
helper.Sleep();
}
public void dropdown(String path,String text) throws AWTException{
Select oSelect = new Select(SeleniumHelper.driver.findElement(By.xpath(path)));

oSelect.selectByVisibleText(text);

		}

public void ClickOntbikeHeaderLink() throws InterruptedException {

	List<WebElement> linksize = SeleniumHelper.driver.findElements(By.tagName("a")); 
	linksCount = linksize.size();
	links= new String[linksCount];
	for(int i=0;i<linksCount;i++)
	{
	links[i] = linksize.get(i).getAttribute("href");
	} 
	for(int i=0;i<linksCount;i++)
	{
		if(links[i].contains("tbike.html")) {
		SeleniumHelper.driver.navigate().to(links[i]);
		helper.Sleep();
		break;
			}
	}
}

public void ClickOntbikeSpecifications() throws InterruptedException {

	List<WebElement> linksize = SeleniumHelper.driver.findElements(By.tagName("a")); 
	linksCount = linksize.size();
	links= new String[linksCount];
	for(int i=0;i<linksCount;i++)
	{
	links[i] = linksize.get(i).getAttribute("href");
	} 
	for(int i=0;i<linksCount;i++)
	{
		if(links[i].contains("tbike-specifications.html")) {
		SeleniumHelper.driver.navigate().to(links[i]);
		helper.Sleep();
		break;
			}
	}
}
public void ClickOntbikeDemo() throws InterruptedException {

	List<WebElement> linksize = SeleniumHelper.driver.findElements(By.tagName("a")); 
	linksCount = linksize.size();
	links= new String[linksCount];
	for(int i=0;i<linksCount;i++)
	{
	links[i] = linksize.get(i).getAttribute("href");
	} 
	for(int i=0;i<linksCount;i++)
	{
		if(links[i].contains("tbike-centers.html")) {
		SeleniumHelper.driver.navigate().to(links[i]);
		helper.Sleep();
		break;
			}
	}
}
}




































































