package TestScripts;



import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import Common.SeleniumHelper;
import Common.TestBase;
import Common.Variables;


public class HomePage extends TestBase{
		
	@Test (priority=1,description="Getting all section names in the HomePage")
	public void test_GettingAllSectionNames_WSDK001() throws Exception {
		Reporter.log("Getting all section names in the HomePage",true);
		method.ScrollandTakeSectionWiseScreenShots();
		method.CheckForBrokenLink();
	}
	
	@Test (priority=2,description="Checking For FlipkartBanner in the HomePage")
	public void test_FlipKartSale_WSDK002() throws Exception {
		Reporter.log("Checking For FlipkartBanner in the HomePage",true);
		method.ClickOnFlipKartLink();
	
	}
	
	@Test (priority=3,description="Checking For ytp video content in the HomePage")
	public void test_ytpvideo_WSDK003() throws InterruptedException {
		
		Reporter.log("Checking For ytp video content in the HomePage",true);
		
		method.YTPvideo();
	}
	
	@Test (priority=4,description="Checking For Watchdemovideo under tronX in the HomePage")
		public void test_WatchDemoUndertronX_WSDK004() throws IOException, InterruptedException, AWTException {
		
		Reporter.log("Checking For Watchdemovideo under tronX in the HomePage",true);	
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> section=bodylinks.findElements(By.tagName("Section"));
		List<WebElement> allLinks = bodylinks.findElements(By.tagName("a"));
		
		
	 System.out.println("Number of sections in HomePage:"+section.size());
	 
	/*for (WebElement sec : section)	{*/
		for (WebElement link : allLinks)
			
		{
			
			String reference=link.getText();
			try {
		if(reference.equalsIgnoreCase("WATCH DEMO"))
		{
			Reporter.log("watch Demo video link was found in the homepage", true);
			try {
			link.click();
			
			Reporter.log("watch demo video source"+link.getAttribute("href"),true);
			//Reporter.log(sec.getAttribute("data-section-name"),true);
			boolean exitButtonPresence = SeleniumHelper.driver.findElement(By.className(Variables.closebutton)).isDisplayed();
			boolean exitButtonEnabled = SeleniumHelper.driver.findElement(By.className(Variables.closebutton)).isEnabled();
			if(exitButtonPresence==true&&exitButtonEnabled==true)
			{
				helper.ClickByClassName("mfp-close");
				Reporter.log("close button found to close watch demo video",true);
				
			}
			}
			catch(Exception e) {
				Reporter.log("close button not found to close watch demo video",true);
				Assert.assertTrue(false);
			}
			break;
	}
			}
		
		catch(Exception e) {
			Reporter.log("Watch demo video link not found in Home page",true);
			Assert.assertTrue(false);
		}
	 }
	
	
	}
	@Test (priority=5,description="Checking For Learn More link Undertcare in the HomePage")
	public void test_LearnMoreUndertcare_WSDK005() throws InterruptedException{
		Reporter.log("Checking For Learn More link Undertcare in the HomePage",true);
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> section=bodylinks.findElements(By.tagName("Section"));
		List<WebElement> allLinks = bodylinks.findElements(By.tagName("a"));
		
		
	
	
	
		for (WebElement link : allLinks)
			
		{
			
		try {	
		if(link.getAttribute("href").contains("tcare.html"))
		{
			Reporter.log("Learn more link found in Home page",true);
			try {
			helper.Sleep();
			method.Scroll();
			link.click();
			
			helper.Sleep();
			String url=SeleniumHelper.driver.getCurrentUrl();
	    	
	    	Reporter.log(" when clicked on Learn more link in the home page it is navigated to url="+url, true);
	    	helper.NavigateBack();
	    	break;
			}
			
			catch(Exception e) {
				Reporter.log("Learn more link is not clickable",true);
				Assert.assertTrue(false);
			}

		
	}
		
		}	
		
		catch(Exception e) {
			Reporter.log("Learn more link not found in Home page",true);
			Assert.assertTrue(false);
		}
		
	 }
		
		
	}
	
	@Test (priority=6,description="Checking For slickdots in the tcare section in the HomePage")
	public void test_slickDotsinHomePage_WSDK006() {
		Reporter.log("Checking For slickdots in the tcare section in the HomePage",true);
		try {
			WebElement bodylinks1=SeleniumHelper.driver.findElement(By.xpath(Variables.Section6));
			List<WebElement> links=bodylinks1.findElements(By.tagName("li"));
			
			
			for (WebElement lin: links)
			{
				
				Reporter.log(lin.getAttribute("id")+""+"found",true);
			
				
				try {
				lin.click();
				Reporter.log(lin.getAttribute("id")+""+"is clickable",true);
				}
				catch(Exception e) {
					Reporter.log("Unable to click "+""+lin.getAttribute("id"),true);
					Assert.assertTrue(false);
				}
				helper.Sleep();
				
				       	
				
	}
			}
			catch(Exception e) {
				Reporter.log("slickdots not found",true);
				Assert.assertTrue(false);
			}
}
	@Test (priority=7,description="Checking For tphoneP header in the HomePage")
	public void test_Header_WSDK007() throws InterruptedException, IOException {
		Reporter.log("Checking For tphoneP header in the HomePage",true);
		
		method.test_Header_WSDK007();
		
		
		
		Reporter.log("--------------------------------------", true);
		Reporter.log(" ", true);
		
	}
	@Test (priority=8,description="Checking For srtphone header in the HomePage")
	public void test_Header_WSDK008() throws InterruptedException, IOException {
		Reporter.log("Checking For srtphone header in the HomePage",true);
		
		method.test_Header_WSDK008();
		
		
		
		Reporter.log("--------------------------------------", true);
		Reporter.log(" ", true);
		
	}
	@Test (priority=9,description="Checking For tphone header in the HomePage")
	public void test_Header_WSDK009() throws InterruptedException, IOException {
		Reporter.log("Checking For tphone header in the HomePage",true);
		
		method.test_Header_WSDK009();
		
		
		
		Reporter.log("--------------------------------------", true);
		Reporter.log(" ", true);
		
	}
	@Test (priority=10,description="Checking For tbook header in the HomePage")
	public void test_Header_WSDK010() throws InterruptedException, IOException {
		Reporter.log("Checking For tbook header in the HomePage",true);
		
		method.test_Header_WSDK010();
		
		
		
		Reporter.log("--------------------------------------", true);
		Reporter.log(" ", true);
		
	}
	@Test (priority=11,description="Checking For tstore header in the HomePage")
	public void test_Header_WSDK011() throws InterruptedException, IOException {
		
		Reporter.log("Checking For tstore header in the HomePage",true);
		method.test_Header_WSDK011();
		
	
		
		Reporter.log("--------------------------------------", true);
		Reporter.log(" ", true);
		
	}
	@Test (priority=12,description="Checking For things header in the HomePage")
	public void test_Header_WSDK012() throws InterruptedException, IOException {
		Reporter.log("Checking For things header in the HomePage",true);
		
		method.test_Header_WSDK012();
		
	
		
		Reporter.log("--------------------------------------", true);
		Reporter.log(" ", true);
		
	}
	@Test (priority=13,description="Checking For tronX header in the HomePage")
	public void test_Header_WSDK013() throws InterruptedException, IOException {
		Reporter.log("Checking For tronX header in the HomePage",true);
		
		method.test_Header_WSDK013();
		
		
		
		Reporter.log("--------------------------------------", true);
		Reporter.log(" ", true);
		
	}
	@Test (priority=14,description="Checking For IOT header in the HomePage")
	public void test_Header_WSDK014() throws InterruptedException, IOException {
		
		Reporter.log("Checking For IOT header in the HomePage",true);
		method.test_Header_WSDK014();
		
	
		
		Reporter.log("--------------------------------------", true);
		Reporter.log(" ", true);
		
	}
	
	@Test (priority=15,description="Checking For tcare header in the HomePage")
	public void test_Header_WSDK015() throws InterruptedException, IOException {
		
		Reporter.log("Checking For tcare header in the HomePage",true);
		method.test_Header_WSDK015();
		
	
		
		Reporter.log("--------------------------------------", true);
		Reporter.log(" ", true);
		
	}
	
	@Test (priority=16,description="Checking For company header in the HomePage")
	public void test_Header_WSDK0016() throws InterruptedException, IOException {
		Reporter.log("Checking For company header in the HomePage",true);
		method.test_Header_WSDK016();
		
		
		
		Reporter.log("--------------------------------------", true);
		Reporter.log(" ", true);
		
	}
	@Test (priority=17,description="Checking For tphoneP Footer in the HomePage")
	public void test_Footer_WSDK017() throws InterruptedException, IOException {
		Reporter.log("Checking For tphoneP Footer in the HomePage",true);
		//**********t.phoneP*************
		method.test_Footer_WSDK017();
		Reporter.log("--------------------------------------", true);
		Reporter.log(" ", true);
	}
	@Test (priority=18,description="Checking For srtphone Footer in the HomePage")
		public void test_Footer_WSDK018() throws InterruptedException, IOException {
		Reporter.log("Checking For srtphone Footer in the HomePage",true);
		//**********srt.phone***********
			method.test_Footer_WSDK018();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********t.book***********
	@Test (priority=19,description="Checking For tbook Footer in the HomePage")
		public void test_Footer_WSDK019() throws InterruptedException, IOException {
		Reporter.log("Checking For tbook Footer in the HomePage",true);
			method.test_Footer_WSDK019();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********t.phone***********
	@Test (priority=20,description="Checking For tphone Footer in the HomePage")
		public void test_Footer_WSDK020() throws InterruptedException, IOException {
		Reporter.log("Checking For tphone Footer in the HomePage",true);
			method.test_Footer_WSDK020();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********tronX***********
	@Test (priority=21,description="Checking For tronX Footer in the HomePage")
		public void test_Footer_WSDK021() throws InterruptedException, IOException {
		Reporter.log("Checking For tronX Footer in the HomePage",true);
			method.test_Footer_WSDK021();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********t.care***********
	@Test (priority=22,description="Checking For tcare Footer in the HomePage")
		public void test_Footer_WSDK022() throws InterruptedException, IOException {
		Reporter.log("Checking For tcare Footer in the HomePage",true);
			method.test_Footer_WSDK022();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********t.store***********
	@Test (priority=23,description="Checking For t.store Footer in the HomePage")
		public void test_Footer_WSDK023() throws InterruptedException, IOException {
		Reporter.log("Checking For t.store Footer in the HomePage",true);
			method.test_Footer_WSDK023();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********about us***********
	@Test (priority=24,description="Checking For about us Footer in the HomePage")
		public void test_Footer_WSDK024() throws InterruptedException, IOException {
		Reporter.log("Checking For about us Footer in the HomePage",true);
			method.test_Footer_WSDK024();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********people***********
	@Test (priority=25,description="Checking For people Footer in the HomePage")
		public void test_Footer_WSDK025() throws InterruptedException, IOException {
		Reporter.log("Checking For people Footer in the HomePage",true);
			method.test_Footer_WSDK025();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********ambassador***********
	@Test (priority=26,description="Checking For ambassador Footer in the HomePage")
		public void test_Footer_WSDK026() throws InterruptedException, IOException {
		Reporter.log("Checking For ambassador Footer in the HomePage",true);
			method.test_Footer_WSDK026();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********careers***********
	@Test (priority=27,description="Checking For careers Footer in the HomePage")
		public void test_Footer_WSDK027() throws InterruptedException, IOException {
		Reporter.log("Checking For careers Footer in the HomePage",true);
			method.test_Footer_WSDK027();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********press***********
	@Test (priority=28,description="Checking For press Footer in the HomePage")
		public void test_Footer_WSDK028() throws InterruptedException, IOException {
		Reporter.log("Checking For press Footer in the HomePage",true);
			method.test_Footer_WSDK028();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********contactUs***********
	@Test (priority=29,description="Checking For contactus Footer in the HomePage")
		public void test_Footer_WSDK029() throws InterruptedException, IOException {
		Reporter.log("Checking For contactus Footer in the HomePage",true);
			method.test_Footer_WSDK029();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********community***********
	@Test (priority=30,description="Checking For community Footer in the HomePage")
		public void test_Footer_WSDK030() throws InterruptedException, IOException {
		Reporter.log("Checking For community Footer in the HomePage",true);
			method.test_Footer_WSDK030();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********studentOffer***********
	@Test (priority=31,description="Checking For studentoffer Footer in the HomePage")
		public void test_Footer_WSDK031() throws InterruptedException, IOException {
		Reporter.log("Checking For studentoffer Footer in the HomePage",true);
			method.test_Footer_WSDK031();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********serviceCentres***********
	@Test (priority=32,description="Checking For serviceCentres Footer in the HomePage")
		public void test_Footer_WSDK032() throws InterruptedException, IOException {
		Reporter.log("Checking For serviceCentres Footer in the HomePage",true);
			method.test_Footer_WSDK032();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********WarrantyPolicy***********
	@Test (priority=33,description="Checking For WarrantyPolicy Footer in the HomePage")
		public void test_Footer_WSDK033() throws InterruptedException, IOException {
		Reporter.log("Checking For WarrantyPolicy Footer in the HomePage",true);
			method.test_Footer_WSDK033();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********TermsandConditions***********
	@Test (priority=34,description="Checking For TermsandConditions Footer in the HomePage")
		public void test_Footer_WSDK034() throws InterruptedException, IOException {
		Reporter.log("Checking For TermsandConditions Footer in the HomePage",true);
			method.test_Footer_WSDK034();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		
		//**********RefundPolicy***********
	@Test (priority=35,description="Checking For RefundPolicy Footer in the HomePage")
		public void test_Footer_WSDK035() throws InterruptedException, IOException {
		Reporter.log("Checking For RefundPolicy Footer in the HomePage",true);
			method.test_Footer_WSDK035();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********External Links***********
		//**********facebookLink***********
	@Test (priority=36,description="Checking For facebookLink Footer in the HomePage")
		public void test_Footer_WSDK036() throws InterruptedException, IOException {
		Reporter.log("Checking For facebookLink Footer in the HomePage",true);
			method.test_Footer_WSDK036();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********instagramLink***********
	@Test (priority=37,description="Checking For instagramLink Footer in the HomePage")
		public void test_Footer_WSDK037() throws InterruptedException, IOException {
		Reporter.log("Checking For instagramLink Footer in the HomePage",true);
			method.test_Footer_WSDK037();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********LinkedinLink***********
	@Test (priority=38,description="Checking For LinkedinLink Footer in the HomePage")
		public void test_Footer_WSDK038() throws InterruptedException, IOException {
		Reporter.log("Checking For LinkedinLink Footer in the HomePage",true);
			method.test_Footer_WSDK038();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********twitterLink***********
	@Test (priority=39,description="Checking For twitterLink Footer in the HomePage")
		public void test_Footer_WSDK039() throws InterruptedException, IOException {
		Reporter.log("Checking For twitterLink Footer in the HomePage",true);
			method.test_Footer_WSDK039();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//**********youtubeLink***********
	@Test (priority=40,description="Checking For youtubeLink Footer in the HomePage")
		public void test_Footer_WSDK040() throws InterruptedException, IOException {
		Reporter.log("Checking For youtubeLink Footer in the HomePage",true);
			method.test_Footer_WSDK040();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
		//*******************************************************************************************	
		
		//**********check for the copyright*************
	@Test (priority=41,description="Checking For copyright in the HomePage")
		public void test_Footer_WSDK041() throws InterruptedException, IOException {
		Reporter.log("Checking For copyright in the HomePage",true);
			method.test_Footer_WSDK041();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		}
//*******************************************************************************************	
		
		//**********Smartron text in footer*************
	@Test (priority=42,description="Checking For Smartron text in footer in the HomePage")
		public void test_Footer_WSDK042() throws InterruptedException, IOException {
		Reporter.log("Checking For Smartron text in footer in the HomePage",true);
			method.test_Footer_WSDK042();
			Reporter.log("--------------------------------------", true);
			Reporter.log(" ", true);
		
	}
	
	@Test (priority=43,description="Checking For Header and Footer CSS")
	public void test_Footer_WSDK043() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS",true);
		method.HeaderAndFooterCSS();
		Reporter.log("--------------------------------------", true);
		Reporter.log(" ", true);
	
}
	@Test (priority=44,description="Checking For HeadPhone image in the tcare section")
	public void test_HeadPhone_Image_WSDK044() throws InterruptedException, IOException {
		Reporter.log("Checking For HeadPhone image in the tcare section",true);
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> allLinks = bodylinks.findElements(By.tagName("img"));
		
		
		// System.out.println("Number of sections in HomePage:"+section.size());
			
			for (WebElement link : allLinks)
			{
	
			
//Reporter.log(link.getAttribute("src"),true);
try {
if(link.getAttribute("src").equalsIgnoreCase(Variables.Headphoneimagesrc)) {
	Reporter.log("HeadPhone image was found in the tcare section", true);
	Reporter.log("Source of HeadPhone image in tcare section is:"+link.getAttribute("src"), true);
	break;
	}
}


catch(Exception e) {
	Reporter.log("HeadPhone image was not found in the tcare section", true);
	Assert.assertTrue(false);
}
}
			
	}			
			
	@Test (priority=45,description="Getting Background Images of all sections in the HomePage")		
	public void test_GettingBackgroundImageOfHomePage_WSDK045() {
		
		WebElement bodylink=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> section=bodylink.findElements(By.tagName("Section"));
		Reporter.log("Number of sections in HomePage:"+section.size(),true);
		 
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.Section1));
		
		String data=bodylinks.getCssValue("background-image");
		String good=data.split("\"")[1];
		
		try {
		if(data!="") {
			Reporter.log("Background image of section1:"+data, true);
			try {
			SeleniumHelper.driver.get(good);
			
			method.Check_imageLoadedOrNot("/html/body/img");
			helper.NavigateBack();
			}
			catch(Exception e) {
				Reporter.log("Unable to check background image loading",true);
				Assert.assertTrue(false);
			}
			
		
		}
		}
		catch(Exception e) {
			Reporter.log("Background image not found for section1", true);
			Assert.assertTrue(false);
		}
		
		
		
WebElement bodylinks1=SeleniumHelper.driver.findElement(By.xpath(Variables.Section2));
		
		String data1=bodylinks1.getCssValue("background-image");
		String good1=data.split("\"")[1];
	try {
		if(data1!="") {
			Reporter.log("Background image of section2:"+data1, true);	
			try {
				SeleniumHelper.driver.get(good1);
				
				method.Check_imageLoadedOrNot("/html/body/img");
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
				
		}
	}
		catch(Exception e){
			Reporter.log("Background image not found for section2", true);
		}
		
WebElement bodylinks3=SeleniumHelper.driver.findElement(By.xpath(Variables.Section3));
		
		String data3=bodylinks3.getCssValue("background-image");
		String good3=data.split("\"")[1];
		try {
		if(data3!="") {
			Reporter.log("Background image of section3:"+data3, true);	
			try {
				SeleniumHelper.driver.get(good3);
				
				method.Check_imageLoadedOrNot("/html/body/img");
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		}
		catch(Exception e) {
			Reporter.log("Background image not found for section3", true);
			Assert.assertTrue(false);
		}
		
		
	WebElement bodylinks4=SeleniumHelper.driver.findElement(By.xpath(Variables.Section4));
	
	String data4=bodylinks4.getCssValue("background-image");
	String good4=data.split("\"")[1];
	try {
	if(data4!="") {
		Reporter.log("Background image of section4:"+data4, true);	
		try {
			SeleniumHelper.driver.get(good4);
			
			method.Check_imageLoadedOrNot("/html/body/img");
			helper.NavigateBack();
			}
			catch(Exception e) {
				Reporter.log("Unable to check background image loading",true);
				Assert.assertTrue(false);
			}
	}
	}
	catch(Exception e) {
		Reporter.log("Background image not found for section4", true);
		Assert.assertTrue(false);
	}
	
WebElement bodylinks5=SeleniumHelper.driver.findElement(By.xpath(Variables.Section5));
	
	String data5=bodylinks5.getCssValue("background-image");
	String good5=data.split("\"")[1];
	try {
	if(data5!="") {
		Reporter.log("Background image of section5:"+data5, true);	
		try {
			SeleniumHelper.driver.get(good5);
			
			method.Check_imageLoadedOrNot("/html/body/img");
			helper.NavigateBack();
			}
			catch(Exception e) {
				Reporter.log("Unable to check background image loading",true);
				Assert.assertTrue(false);
			}
	}
	}
	catch(Exception e) {
		Reporter.log("Background image not found for section5", true);
		Assert.assertTrue(false);
	}
WebElement bodylinks6=SeleniumHelper.driver.findElement(By.xpath(Variables.Section6));
	
	String data6=bodylinks6.getCssValue("background-image");
	String good6=data.split("\"")[1];
	try {
	if(data6!="") {
		Reporter.log("Background image of section6:"+data6, true);	
		try {
			SeleniumHelper.driver.get(good6);
			
			method.Check_imageLoadedOrNot("/html/body/img");
			helper.NavigateBack();
			}
			catch(Exception e) {
				Reporter.log("Unable to check background image loading",true);
				Assert.assertTrue(false);
			}
	}
	}
	catch(Exception e) {
		Reporter.log("Background image not found for section6", true);
		Assert.assertTrue(false);
	}
	
	
WebElement bodylinks7=SeleniumHelper.driver.findElement(By.xpath(Variables.Section7));
	
	String data7=bodylinks7.getCssValue("background-image");
	String good7=data.split("\"")[1];
	try {
	if(data6!="") {
		Reporter.log("Background image of section7:"+data7, true);	
		try {
			SeleniumHelper.driver.get(good7);
			
			method.Check_imageLoadedOrNot("/html/body/img");
			helper.NavigateBack();
			}
			catch(Exception e) {
				Reporter.log("Unable to check background image loading",true);
				Assert.assertTrue(false);
			}
	}
	}
	catch(Exception e) {
		Reporter.log("Background image not found for section7", true);
		Assert.assertTrue(false);
	}
		
			
			
			
	}
	
	@Test (priority=46,description="Getting Font-size and Font-family of all headings and paragraph in the HomePage")		
	public void test_GettingCSSOFHeadingAndParagraph_WSDK046() {
		
		method.getCSSofHeadingandParagraph();
	}
	
	
	@Test (priority=47,description="Spell check in HomePage")		
	public void test_SpellcheckinHomePage_WSDK047() {
		
		method.SpellCheck();
		}
}

