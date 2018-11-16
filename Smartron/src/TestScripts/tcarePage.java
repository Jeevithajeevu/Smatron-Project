package TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Common.MySpellChecker;
import Common.SeleniumHelper;
import Common.TestBase;
import Common.Variables;

public class tcarePage extends TestBase{
	
	@Test (priority=1,description="Spell check in tcareCustomerCare Page")		
	public void test_SpellcheckintcareCustomerCarePage_WSDK191() throws InterruptedException, IOException {
		Reporter.log("Spell check in tcareCustomerCare Page",true);
		
		method.ClickOntcareheaderLink();
		method.SpellCheck();
		
		 

		}	
	
	@Test (priority=2,description="Contact us information in tcareCustomerCare Page")		
	public void test_ContactUsInformationintcareCustomerCarePage_WSDK192() throws InterruptedException, IOException {
		Reporter.log("Contact us information in tcareCustomerCare Page",true);
		String header=SeleniumHelper.driver.findElement(By.className("contact-info")).getText();
		Reporter.log(header,true);
		MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
		
		String Dat1 = spellChecker.doCorrection(header);
		if(Dat1!=header) {
			
			Reporter.log("Before Correction : "+header);
		Reporter.log("After  Correction : "+Dat1, true);
		}
		
	
	}
	@Test (priority=3,description="Getting Background Images in the tcareCustomerCare page")		
	public void test_GettingBackgroundImageintcareCustomerCarepage_WSDK193() {
		
		Reporter.log("Getting Background Images in the tcareCustomerCare page", true);
		
WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("tcare-spotlight"));
		
		String data=bodylinks.getCssValue("background-image");
		
		
		
		if(data.startsWith("url")) {
			Reporter.log("Background image of tcareCustomerCare page:"+" "+data, true);
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
				Reporter.log("Unable to check background image loading in tcareCustomerCare page",true);
				
			}
			
		
		}
		
	else{
			Reporter.log("Background image not found in tcareCustomerCare page", true);
			
		}
}
	
	@Test (priority=4,description="Chat with us in tcareCustomercare page")		
	public void test_chatwithusintcareCustomerCarePage_WSDK194() throws InterruptedException, IOException {
		Reporter.log("Chat with us in tcareCustomercare page",true);
		helper.DeepSleep();
		helper.ClickByXpath(".//*[@id='kapchat-togglebtn']");
		helper.DeepSleep();
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("chat-body"));
		List<WebElement> totalTextboxes=bodylinks.findElements(By.tagName("input"));
		
		for (WebElement textbox :totalTextboxes) {
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("kapture_chat_name")) 
					{
					textbox.sendKeys("hema");
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat name textbox not found", true);
			}
			helper.Sleep();
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("kapture_chat_email")) 
					{
					textbox.sendKeys("hema@gmail.com");
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("kapture_chat_contact")) 
					{
					textbox.sendKeys("6467576678");
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat contact textbox not found", true);
			}
		}
		WebElement totalarea=bodylinks.findElement(By.tagName("textarea"));
			
			try {
				if(totalarea.getAttribute("name").equalsIgnoreCase("kapture_chat_message")) 
					{
					totalarea.sendKeys("hello");
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat message textbox not found", true);
			}
			
			try {
			helper.ClickByXpath(".//*[@id='kapture_chat_register']");
			helper.DeepSleep();
			helper.DeepSleep();
			}
			catch(Exception e) {
				Reporter.log("unable to click on chat submit button ", true);
			}
	
	try {
		SeleniumHelper.driver.findElement(By.xpath("//*[@id=\"kapture-chatbox-flyout\"]/div/div[2]/form/div[2]/textarea")).sendKeys("hi smartron testing");
			helper.DeepSleep();
			helper.DeepSleep();
			helper.ClickByXpath(".//*[@id='kapture-chatbox-flyout']/div/div[2]/form/div[3]/a/i");
			}
	
	catch(Exception e) {
		Reporter.log("chat message textbox not found", true);
	}
	
	
	method.ScrollDown();
	Thread.sleep(10000);
	helper.ClickByXpath(".//*[@id='kapture-chatbox-flyout']/div/div[1]/a[1]/i");
	Alert aalt=SeleniumHelper.driver.switchTo().alert();
      aalt.accept();
		helper.DeepSleep();
	}
	@Test (priority=5,description="check Required field in chat withus in tcare CustomerCare Page")		
	public void test_checkRequiredfieldinchatwithusintcareCustomerCarePage_WSDK195() throws InterruptedException, IOException {
		Reporter.log("check Required field in chat withus in tcare CustomerCare Page",true);
		
		helper.DeepSleep();
		helper.ClickByXpath(".//*[@id='kapchat-togglebtn']");
		helper.DeepSleep();
		try {
			helper.ClickByXpath(".//*[@id='kapture_chat_register']");
			helper.DeepSleep();
			method.screenshot("RequiredFieldChatbox");
			helper.DeepSleep();
			}
			catch(Exception e) {
				Reporter.log("unable to click on chat submit button ", true);
			}
		helper.PageRefresh();
		}
		
	@Test (priority=6,description="check contact details tab in chat with us in tcare CustomerCare Page")		
	public void test_checkcontactdetailstabinchatwithusintcareCustomerCarePage_WSDK196() throws Exception {
		Reporter.log("check contact details tab in chat with us in tcare CustomerCare Page",true);
		
		helper.DeepSleep();
		helper.ClickByXpath(".//*[@id='kapchat-togglebtn']");
		helper.DeepSleep();
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("chat-body"));
		List<WebElement> totalTextboxes=bodylinks.findElements(By.tagName("input"));
		
		for (WebElement textbox :totalTextboxes) {
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("kapture_chat_name")) 
					{
					textbox.sendKeys("hema");
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat name textbox not found", true);
			}
			helper.Sleep();
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("kapture_chat_email")) 
					{
					textbox.sendKeys("hema@gmail.com");
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("kapture_chat_contact")) 
					{
					Reporter.log("Entering less than 10 digits in contact details", true);
					textbox.sendKeys("64675766");
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat contact textbox not found", true);
			}
		}
		WebElement totalarea=bodylinks.findElement(By.tagName("textarea"));
			
			try {
				if(totalarea.getAttribute("name").equalsIgnoreCase("kapture_chat_message")) 
					{
					totalarea.sendKeys("hello");
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat message textbox not found", true);
			}
			
			try {
			helper.ClickByXpath(".//*[@id='kapture_chat_register']");
			helper.DeepSleep();
			
			}
			catch(Exception e) {
				Reporter.log("unable to click on chat submit button ", true);
			}
	method.screenshot("lessThan10didgitscontactdetails");
	helper.DeepSleep();
	helper.PageRefresh();
		}
		
	@Test (priority=7,description="check email id tab by entering wrong email id in chat with us in tcare CustomerCare Page")		
	public void test_checkemailidtabinchatwithusintcareCustomerCarePage_WSDK197() throws Exception {
		Reporter.log("check email id tab by entering wrong email id in chat with us in tcare CustomerCare Page",true);
		
		helper.DeepSleep();
		helper.ClickByXpath(".//*[@id='kapchat-togglebtn']");
		helper.DeepSleep();
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("chat-body"));
		List<WebElement> totalTextboxes=bodylinks.findElements(By.tagName("input"));
		
		for (WebElement textbox :totalTextboxes) {
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("kapture_chat_name")) 
					{
					textbox.sendKeys("hema");
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat name textbox not found", true);
			}
			helper.Sleep();
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("kapture_chat_email")) 
					{
					textbox.sendKeys("heksju");
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("kapture_chat_contact")) 
					{
					Reporter.log("Entering less than 10 digits in contact details", true);
					textbox.sendKeys("6467576612");
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat contact textbox not found", true);
			}
		}
		WebElement totalarea=bodylinks.findElement(By.tagName("textarea"));
			
			try {
				if(totalarea.getAttribute("name").equalsIgnoreCase("kapture_chat_message")) 
					{
					totalarea.sendKeys("hello");
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat message textbox not found", true);
			}
			
			try {
			helper.ClickByXpath(".//*[@id='kapture_chat_register']");
			helper.DeepSleep();
			
			}
			catch(Exception e) {
				Reporter.log("unable to click on chat submit button ", true);
			}
	method.screenshot("enterinvalidmailid");
	helper.DeepSleep();
	helper.PageRefresh();
		}	
		
		
	@Test (priority=8,description="Checking For header links in the tcareCustomerCare page")
	public void test_tcareCustomerCareHeader_WSDK198() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the tcareCustomerCare page", true);
		method.test_Header_WSDK007();
		
		method.test_Header_WSDK008();
		method.test_Header_WSDK009();
		method.test_Header_WSDK010();
		method.test_Header_WSDK011();
		method.test_Header_WSDK012();
		method.test_Header_WSDK013();
		method.test_Header_WSDK014();
		method.test_Header_WSDK015();
		method.ClickOntcareheaderLink();
		method.test_Header_WSDK016();
}
	@Test (priority=9,description="Checking For Footer links in the tcareCustomerCare page")
	public void test_tcareCustomerCareFooter_WSDK199() throws IOException, InterruptedException {
		Reporter.log("Checking For Footer links in the tcareCustomerCare page", true);
		method.test_Footer_WSDK017();
		method.test_Footer_WSDK018();
		method.test_Footer_WSDK019();
		method.test_Footer_WSDK020();
	    method.test_Footer_WSDK021();
		method.test_Footer_WSDK022();
		method.ClickOntcareheaderLink();
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
		
	@Test (priority=10,description="Getting Font-size and Font-family of all headings and paragraph in the tcareCustomerCare page")		
	public void test_GettingCSSOFHeadingAndParagraphIntcareCustomerCare_WSDK200() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the tcareCustomerCare page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	@Test (priority=11,description="Checking tcareCustomerCare Header and Footer CSS")
	public void test_tcareCustomerCareHeaderAndFooterCSS_WSDK201() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS in tcareCustomerCare page",true);
		
		method.HeaderAndFooterCSS();
	}
	@Test (priority=12,description="check service centres In Bengaluru in tcare service centres Page")		
	public void test_checkserviceCentresInBengaluru_WSDK202() throws Exception {
		Reporter.log("check service centres In Bengaluru in tcare service centres Page",true);
		
		method.ClickOntcareServices();
		helper.DeepSleep();//WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("card-container container"));
		helper.ClickByXpath("html/body/div[4]/div[1]/div[1]/button");
		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/ul"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for (WebElement dd :liList)
		{ 
			
		if(dd.getText().equalsIgnoreCase("Laptop")) {
			dd.click();
			
		}
		}
			WebElement totalTextboxes=SeleniumHelper.driver.findElement(By.xpath("//input[@type='text']"));
			try {
			totalTextboxes.sendKeys("Bengaluru");
			helper.DeepSleep();
			}
			catch(Exception e) {
				
				Reporter.log("<font color=\"red\"><b>"+ "unable to enter city name"+"</b></font><br/>",true);
				Assert.assertTrue(false);
			}
	
			WebElement Mainpage1=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='centre-cards']"));
			List<WebElement>liList1=Mainpage1.findElements(By.className("card")); 
			Reporter.log("Number of Bengaluru laptop Service centres cards displayed="+" "+liList1.size(),true);
			Reporter.log("Bengaluru laptop Service centres displayed in cards",true);
			Reporter.log("-------------------------------------------------",true);
			for(int i=0;i<liList1.size();i++)
			{ 
				String labels=liList1.get(i).getText(); 
				
				
				
				
				Reporter.log(labels,true);
				Reporter.log("-------------------------------------------------",true);
				
				}
			
			WebElement location=SeleniumHelper.driver.findElement(By.xpath("//*[@id='map']/div/div/div[1]/div[3]/div[2]/div[3]"));

			List<WebElement> locationlist=location.findElements(By.tagName("div"));
			
			 
			for(int i=0;i<locationlist.size();i++)
			{ 

				WebElement image =locationlist.get(i).findElement(By.tagName("img"));
				try {
				if(image.isDisplayed()) {
					
				image.click();
				helper.DeepSleep();
				helper.DeepSleep();
		}	}
catch(Exception e) {
					
				}
				
		
		

		}
			
			String Data=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='map']/div/div/div[1]/div[3]")).getText();

			
			Reporter.log("Service centres displayed in Map",true);
			Reporter.log("-------------------------------------------------",true);
			Reporter.log(Data,true);
			Reporter.log("-------------------------------------------------",true);
			helper.PageRefresh();
			
}
	@Test (priority=13,description="check service centres In Kanpur in tcare service centres Page")		
	public void test_checkserviceCentresInKanpur_WSDK203() throws Exception {
		Reporter.log("check service centres In Kanpur in tcare service centres Page",true);
		
		helper.DeepSleep();//WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("card-container container"));
		helper.ClickByXpath("html/body/div[4]/div[1]/div[1]/button");
		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/ul"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for (WebElement dd :liList)
		{ 
			
		if(dd.getText().equalsIgnoreCase("All")) {
			dd.click();
			
		}
		}
			WebElement totalTextboxes=SeleniumHelper.driver.findElement(By.xpath("//input[@type='text']"));
			try {
			totalTextboxes.sendKeys("Kanpur");
			helper.DeepSleep();
			}
			catch(Exception e) {
				
				Reporter.log("<font color=\"red\"><b>"+ "unable to enter city name"+"</b></font><br/>",true);
				Assert.assertTrue(false);
			}
	
			WebElement Mainpage1=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='centre-cards']"));
			List<WebElement>liList1=Mainpage1.findElements(By.className("card")); 
			Reporter.log("Number of Kanpur All Service centres cards displayed="+" "+liList1.size(),true);
			Reporter.log("Kanpur All Service centres displayed in cards",true);
			Reporter.log("-------------------------------------------------",true);
			for(int i=0;i<liList1.size();i++)
			{ 
				String labels=liList1.get(i).getText(); 
				
				
				
				
				Reporter.log(labels,true);
				Reporter.log("-------------------------------------------------",true);
				
				}
			
			WebElement location=SeleniumHelper.driver.findElement(By.xpath("//*[@id='map']/div/div/div[1]/div[3]/div[2]/div[3]"));

			List<WebElement> locationlist=location.findElements(By.tagName("div"));
			
			 
			for(int i=0;i<locationlist.size();i++)
			{ 

				WebElement image =locationlist.get(i).findElement(By.tagName("img"));
				try {
				if(image.isDisplayed()) {
					
				image.click();
				
				helper.DeepSleep();
				
		}	
				}
catch(Exception e) {
					
				}
				
		
		

		}
			
			String Data=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='map']/div/div/div[1]/div[3]")).getText();

			
			Reporter.log("Kanpur All Service centres displayed in Map",true);
			Reporter.log("-------------------------------------------------",true);
			Reporter.log(Data,true);
			Reporter.log("-------------------------------------------------",true);
			helper.PageRefresh();
			}	
	@Test (priority=14,description="check service centres In Chennai in tcare service centres Page")		
	public void test_checkserviceCentresInChennai_WSDK204() throws Exception {
		Reporter.log("check service centres In Chennai in tcare service centres Page",true);
		
		helper.DeepSleep();//WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("card-container container"));
		helper.ClickByXpath("html/body/div[4]/div[1]/div[1]/button");
		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/ul"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for (WebElement dd :liList)
		{ 
			
		if(dd.getText().equalsIgnoreCase("Mobile Phones")) {
			dd.click();
			
		}
		}
			WebElement totalTextboxes=SeleniumHelper.driver.findElement(By.xpath("//input[@type='text']"));
			try {
			totalTextboxes.sendKeys("Chennai");
			helper.DeepSleep();
			}
			catch(Exception e) {
				
				Reporter.log("<font color=\"red\"><b>"+ "unable to enter city name"+"</b></font><br/>",true);
				Assert.assertTrue(false);
			}
	
			
			
				helper.DeepSleep();	
			WebElement Mainpage1=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='centre-cards']"));
			List<WebElement>liList1=Mainpage1.findElements(By.className("card")); 
			Reporter.log("Number of Chennai Mobile Phones Service centres cards displayed="+" "+liList1.size(),true);
			Reporter.log("Chennai Mobile Phones Service centres displayed in cards",true);
			Reporter.log("-------------------------------------------------",true);
			for(int i=0;i<liList1.size();i++)
			{ 
				String labels=liList1.get(i).getText(); 
				
				
				
				
				Reporter.log(labels,true);
				Reporter.log("-------------------------------------------------",true);
				
				}
			
			WebElement location=SeleniumHelper.driver.findElement(By.xpath("//*[@id='map']/div/div/div[1]/div[3]/div[2]/div[3]"));

			List<WebElement> locationlist=location.findElements(By.tagName("div"));
				 
			for(int i=0;i<locationlist.size();i++)
			{ 

				WebElement image =locationlist.get(i).findElement(By.tagName("img"));
				try {
				if(image.isDisplayed()) {
					
				image.click();
				
				helper.DeepSleep();
				helper.DeepSleep();
				
		}	}
catch(Exception e) {
					
				}
				
		
		

		}
			
			String Data=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='map']/div/div/div[1]/div[3]")).getText();

			
			Reporter.log("Chennai Mobile Phones Service centres displayed in Map",true);
			Reporter.log("-------------------------------------------------",true);
			Reporter.log(Data,true);
			Reporter.log("-------------------------------------------------",true);
			helper.PageRefresh();
			
}	
	@Test (priority=15,description="check service centres In Hyderabad in tcare service centres Page")		
	public void test_checkserviceCentresInHyderabad_WSDK205() throws Exception {
		Reporter.log("check service centres In Hyderabad in tcare service centres Page",true);
		
		helper.DeepSleep();//WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("card-container container"));
		helper.ClickByXpath("html/body/div[4]/div[1]/div[1]/button");
		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/ul"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for (WebElement dd :liList)
		{ 
			
		if(dd.getText().equalsIgnoreCase("Laptop")) {
			dd.click();
			
		}
		}
			WebElement totalTextboxes=SeleniumHelper.driver.findElement(By.xpath("//input[@type='text']"));
			try {
			totalTextboxes.sendKeys("Hyderabad");
			helper.DeepSleep();
			}
			catch(Exception e) {
				
				Reporter.log("<font color=\"red\"><b>"+ "unable to enter city name"+"</b></font><br/>",true);
				Assert.assertTrue(false);
			}
	
			
			


				helper.DeepSleep();	
			WebElement Mainpage1=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='centre-cards']"));
			List<WebElement>liList1=Mainpage1.findElements(By.className("card")); 
			Reporter.log("Number of Hyderabad Laptop Service centres cards displayed="+" "+liList1.size(),true);
			Reporter.log("Hyderabad Laptop Service centres displayed in cards",true);
			Reporter.log("-------------------------------------------------",true);
			for(int i=0;i<liList1.size();i++)
			{ 
				String labels=liList1.get(i).getText(); 
				
				
				
				
				Reporter.log(labels,true);
				Reporter.log("-------------------------------------------------",true);
				
				}
			
			WebElement location=SeleniumHelper.driver.findElement(By.xpath("//*[@id='map']/div/div/div[1]/div[3]/div[2]/div[3]"));

			List<WebElement> locationlist=location.findElements(By.tagName("div"));
				 
			for(int i=0;i<locationlist.size();i++)
			{ 

				WebElement image =locationlist.get(i).findElement(By.tagName("img"));
				try {
				if(image.isDisplayed()) {
					
				image.click();
				
				helper.DeepSleep();
				helper.DeepSleep();
				
		}	}
catch(Exception e) {
					
				}
				
		
		

		}
			
			String Data=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='map']/div/div/div[1]/div[3]")).getText();

			
			Reporter.log("Hyderabad Laptop Service centres displayed in Map",true);
			Reporter.log("-------------------------------------------------",true);
			Reporter.log(Data,true);
			Reporter.log("-------------------------------------------------",true);
			helper.PageRefresh();
			
				
				
			

			
}	
	
	@Test (priority=16,description="check service centres In Pune in tcare service centres Page")		
	public void test_checkserviceCentresInPune_WSDK206() throws Exception {
		Reporter.log("check service centres In Pune in tcare service centres Page",true);
		
		helper.DeepSleep();//WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("card-container container"));
		helper.ClickByXpath("html/body/div[4]/div[1]/div[1]/button");
		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/ul"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for (WebElement dd :liList)
		{ 
			
		if(dd.getText().equalsIgnoreCase("Mobile Phones")) {
			dd.click();
			
		}
		}
		
			WebElement totalTextboxes=SeleniumHelper.driver.findElement(By.xpath("//input[@type='text']"));
			try {
			totalTextboxes.sendKeys("Pune");
			helper.DeepSleep();
			}
			catch(Exception e) {
				
				Reporter.log("<font color=\"red\"><b>"+ "unable to enter city name"+"</b></font><br/>",true);
				Assert.assertTrue(false);
			}
	
			
			
			


				helper.DeepSleep();	
			WebElement Mainpage1=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='centre-cards']"));
			List<WebElement>liList1=Mainpage1.findElements(By.className("card")); 
			Reporter.log("Number of Pune Mobile Phones Service centres cards displayed="+" "+liList1.size(),true);
			Reporter.log("Pune Mobile Phones Service centres displayed in cards",true);
			Reporter.log("-------------------------------------------------",true);
			for(int i=0;i<liList1.size();i++)
			{ 
				String labels=liList1.get(i).getText(); 
				
				
				
				
				Reporter.log(labels,true);
				Reporter.log("-------------------------------------------------",true);
				
				}
			
			WebElement location=SeleniumHelper.driver.findElement(By.xpath("//*[@id='map']/div/div/div[1]/div[3]/div[2]/div[3]"));

			List<WebElement> locationlist=location.findElements(By.tagName("div"));
				 
			for(int i=0;i<locationlist.size();i++)
			{ 

				WebElement image =locationlist.get(i).findElement(By.tagName("img"));
				try {
				if(image.isDisplayed()) {
					
				image.click();
				
				
				
				
				helper.DeepSleep();
				helper.DeepSleep();
				
		}	}
catch(Exception e) {
					
				}
				
		
		

		}
			
			String Data=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='map']/div/div/div[1]/div[3]")).getText();

			
			Reporter.log("Pune Mobile Phones Service centres displayed in Map",true);
			Reporter.log("-------------------------------------------------",true);
			Reporter.log(Data,true);
			Reporter.log("-------------------------------------------------",true);
			helper.PageRefresh();
			
				}	
	@Test (priority=17,description="check service centres In Mumbai in tcare service centres Page")		
	public void test_checkserviceCentresInMumbai_WSDK207() throws Exception {
		Reporter.log("check service centres In Mumbai in tcare service centres Page",true);
		
		helper.DeepSleep();//WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("card-container container"));
		helper.ClickByXpath("html/body/div[4]/div[1]/div[1]/button");
		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/ul"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for (WebElement dd :liList)
		{ 
			
		if(dd.getText().equalsIgnoreCase("All")) {
			dd.click();
			
		}
		}
		
			WebElement totalTextboxes=SeleniumHelper.driver.findElement(By.xpath("//input[@type='text']"));
			try {
			totalTextboxes.sendKeys("Mumbai");
			helper.DeepSleep();
			}
			catch(Exception e) {
				
				Reporter.log("<font color=\"red\"><b>"+ "unable to enter city name"+"</b></font><br/>",true);
				Assert.assertTrue(false);
			}
	
			


				helper.DeepSleep();	
			WebElement Mainpage1=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='centre-cards']"));
			List<WebElement>liList1=Mainpage1.findElements(By.className("card")); 
			Reporter.log("Number of Mumbai All Service centres cards displayed="+" "+liList1.size(),true);
			Reporter.log("Mumbai All Service centres displayed in cards",true);
			Reporter.log("-------------------------------------------------",true);
			for(int i=0;i<liList1.size();i++)
			{ 
				String labels=liList1.get(i).getText(); 
				
				
				
				
				Reporter.log(labels,true);
				Reporter.log("-------------------------------------------------",true);
				
				}
			
			WebElement location=SeleniumHelper.driver.findElement(By.xpath("//*[@id='map']/div/div/div[1]/div[3]/div[2]/div[3]"));

			List<WebElement> locationlist=location.findElements(By.tagName("div"));
				 
			for(int i=0;i<locationlist.size();i++)
			{ 

				WebElement image =locationlist.get(i).findElement(By.tagName("img"));
				try {
				if(image.isDisplayed()) {
					
				image.click();
				
				
				
				
				helper.DeepSleep();
				helper.DeepSleep();
				
		}	}
				catch(Exception e) {
					
				}
				
		

		}
			
			String Data=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='map']/div/div/div[1]/div[3]")).getText();

			
			Reporter.log("Mumbai All Service centres displayed in Map",true);
			Reporter.log("-------------------------------------------------",true);
			Reporter.log(Data,true);
			Reporter.log("-------------------------------------------------",true);
			helper.PageRefresh();
			
				
				
			

			
}	
	@Test (priority=18,description="check service centres In Patna in tcare service centres Page")		
	public void test_checkserviceCentresInPatna_WSDK208() throws Exception {
		Reporter.log("check service centres In Patna in tcare service centres Page",true);
		
		helper.DeepSleep();//WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("card-container container"));
		helper.ClickByXpath("html/body/div[4]/div[1]/div[1]/button");
		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/ul"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for (WebElement dd :liList)
		{ 
			
		if(dd.getText().equalsIgnoreCase("All")) {
			dd.click();
			
		}
		}
		
			WebElement totalTextboxes=SeleniumHelper.driver.findElement(By.xpath("//input[@type='text']"));
			try {
			totalTextboxes.sendKeys("Patna");
			helper.DeepSleep();
			}
			catch(Exception e) {
				
				Reporter.log("<font color=\"red\"><b>"+ "unable to enter city name"+"</b></font><br/>",true);
				Assert.assertTrue(false);
			}
	
			


				helper.DeepSleep();	
			WebElement Mainpage1=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='centre-cards']"));
			List<WebElement>liList1=Mainpage1.findElements(By.className("card")); 
			Reporter.log("Number of Patna All Service centres cards displayed="+" "+liList1.size(),true);
			Reporter.log("Patna All Service centres displayed in cards",true);
			Reporter.log("-------------------------------------------------",true);
			for(int i=0;i<liList1.size();i++)
			{ 
				String labels=liList1.get(i).getText(); 
				
				
				
				
				Reporter.log(labels,true);
				Reporter.log("-------------------------------------------------",true);
				
				}
			
			WebElement location=SeleniumHelper.driver.findElement(By.xpath("//*[@id='map']/div/div/div[1]/div[3]/div[2]/div[3]"));

			List<WebElement> locationlist=location.findElements(By.tagName("div"));
				 
			for(int i=0;i<locationlist.size();i++)
			{ 

				WebElement image =locationlist.get(i).findElement(By.tagName("img"));
				try {
				if(image.isDisplayed()) {
					
				image.click();
				
			
				
				helper.DeepSleep();
				helper.DeepSleep();
				
		}	}
				catch(Exception e) {
					
				}
				
		

		}
			
			String Data=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='map']/div/div/div[1]/div[3]")).getText();

			
			Reporter.log("Patna All Service centres displayed in Map",true);
			Reporter.log("-------------------------------------------------",true);
			Reporter.log(Data,true);
			Reporter.log("-------------------------------------------------",true);
			helper.PageRefresh();
			
				
				
			

			
}	
	
	@Test (priority=19,description="check service centres In Vishakapatnam in tcare service centres Page")		
	public void test_checkserviceCentresInVishakapatnam_WSDK209() throws Exception {
		Reporter.log("check service centres In Vishakapatnam in tcare service centres Page",true);
		
		helper.DeepSleep();//WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("card-container container"));
		helper.ClickByXpath("html/body/div[4]/div[1]/div[1]/button");
		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/ul"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for (WebElement dd :liList)
		{ 
			
		if(dd.getText().equalsIgnoreCase("All")) {
			dd.click();
			
		}
		}
		
			WebElement totalTextboxes=SeleniumHelper.driver.findElement(By.xpath("//input[@type='text']"));
			try {
			totalTextboxes.sendKeys("Vishakapatnam");
			helper.DeepSleep();
			}
			catch(Exception e) {
				
				Reporter.log("<font color=\"red\"><b>"+ "unable to enter city name"+"</b></font><br/>",true);
				Assert.assertTrue(false);
			}
	
			


				helper.DeepSleep();	
			WebElement Mainpage1=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='centre-cards']"));
			List<WebElement>liList1=Mainpage1.findElements(By.className("card")); 
			Reporter.log("Number of Vishakapatnam All Service centres cards displayed="+" "+liList1.size(),true);
			Reporter.log("Vishakapatnam All Service centres displayed in cards",true);
			Reporter.log("-------------------------------------------------",true);
			for(int i=0;i<liList1.size();i++)
			{ 
				String labels=liList1.get(i).getText(); 
				
				
				
				
				Reporter.log(labels,true);
				Reporter.log("-------------------------------------------------",true);
				
				}
			
			WebElement location=SeleniumHelper.driver.findElement(By.xpath("//*[@id='map']/div/div/div[1]/div[3]/div[2]/div[3]"));

			List<WebElement> locationlist=location.findElements(By.tagName("div"));
				 
			for(int i=0;i<locationlist.size();i++)
			{ 

				WebElement image =locationlist.get(i).findElement(By.tagName("img"));
				try {
				if(image.isDisplayed()) {
					
				image.click();
				
				
				
				
				helper.DeepSleep();
				helper.DeepSleep();
				
		}	}
				catch(Exception e) {
					
				}
				
		

		}
			
			String Data=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='map']/div/div/div[1]/div[3]")).getText();

			
			Reporter.log("Vishakapatnam All Service centres displayed in Map",true);
			Reporter.log("-------------------------------------------------",true);
			Reporter.log(Data,true);
			Reporter.log("-------------------------------------------------",true);
			helper.PageRefresh();
			
				}	
	@Test (priority=20,description="check service centres In Ahmedabad in tcare service centres Page")		
	public void test_checkserviceCentresInAhmedabad_WSDK210() throws Exception {
		Reporter.log("check service centres In Ahmedabad in tcare service centres Page",true);
		method.ClickOntcareheaderLink();
		method.ClickOntcareServices();
		helper.DeepSleep();//WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("card-container container"));
		helper.ClickByXpath("html/body/div[4]/div[1]/div[1]/button");
		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/ul"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for (WebElement dd :liList)
		{ 
			
		if(dd.getText().equalsIgnoreCase("Laptop")) {
			dd.click();
			
		}
		}
		
			WebElement totalTextboxes=SeleniumHelper.driver.findElement(By.xpath("//input[@type='text']"));
			try {
			totalTextboxes.sendKeys("Ahmedabad");
			helper.DeepSleep();
			}
			catch(Exception e) {
				
				Reporter.log("<font color=\"red\"><b>"+ "unable to enter city name"+"</b></font><br/>",true);
				Assert.assertTrue(false);
			}
	
			


				helper.DeepSleep();	
			WebElement Mainpage1=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='centre-cards']"));
			List<WebElement>liList1=Mainpage1.findElements(By.className("card")); 
			Reporter.log("Number of Ahmedabad Laptop Service centres cards displayed="+" "+liList1.size(),true);
			Reporter.log("Ahmedabad Laptop Service centres displayed in cards",true);
			Reporter.log("-------------------------------------------------",true);
			for(int i=0;i<liList1.size();i++)
			{ 
				String labels=liList1.get(i).getText(); 
				
				
				
				
				Reporter.log(labels,true);
				Reporter.log("-------------------------------------------------",true);
				
				}
			
			WebElement location=SeleniumHelper.driver.findElement(By.xpath("//*[@id='map']/div/div/div[1]/div[3]/div[2]/div[3]"));

			List<WebElement> locationlist=location.findElements(By.tagName("div"));
				 
			for(int i=0;i<locationlist.size();i++)
			{ 

				WebElement image =locationlist.get(i).findElement(By.tagName("img"));
				try {
				if(image.isDisplayed()) {
					
				image.click();
				
			
				
				helper.DeepSleep();
				helper.DeepSleep();
				
		}	}
				catch(Exception e) {
					
				}
				
		

		}
			
			String Data=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='map']/div/div/div[1]/div[3]")).getText();

			
			Reporter.log("Ahmedabad Laptop Service centres displayed in Map",true);
			Reporter.log("-------------------------------------------------",true);
			Reporter.log(Data,true);
			Reporter.log("-------------------------------------------------",true);
			helper.PageRefresh();
			
				}	
	
	@Test (priority=21,description="check service centres In Kolkata in tcare service centres Page")		
	public void test_checkserviceCentresInKolkata_WSDK211() throws Exception {
		Reporter.log("check service centres In Kolkata in tcare service centres Page",true);
		
		helper.DeepSleep();//WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("card-container container"));
		helper.ClickByXpath("html/body/div[4]/div[1]/div[1]/button");
		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/ul"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for (WebElement dd :liList)
		{ 
			
		if(dd.getText().equalsIgnoreCase("Mobile Phones")) {
			dd.click();
			
		}
		}
		
			WebElement totalTextboxes=SeleniumHelper.driver.findElement(By.xpath("//input[@type='text']"));
			try {
			totalTextboxes.sendKeys("Kolkata");
			helper.DeepSleep();
			}
			catch(Exception e) {
				
				Reporter.log("<font color=\"red\"><b>"+ "unable to enter city name"+"</b></font><br/>",true);
				Assert.assertTrue(false);
			}
	
			


				helper.DeepSleep();	
			WebElement Mainpage1=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='centre-cards']"));
			List<WebElement>liList1=Mainpage1.findElements(By.className("card")); 
			Reporter.log("Number of Kolkata Mobile Phones Service centres cards displayed="+" "+liList1.size(),true);
			Reporter.log("Kolkata Mobile Phones Service centres displayed in cards",true);
			Reporter.log("-------------------------------------------------",true);
			for(int i=0;i<liList1.size();i++)
			{ 
				String labels=liList1.get(i).getText(); 
				
				
				
				
				Reporter.log(labels,true);
				Reporter.log("-------------------------------------------------",true);
				
				}
			
			WebElement location=SeleniumHelper.driver.findElement(By.xpath("//*[@id='map']/div/div/div[1]/div[3]/div[2]/div[3]"));

			List<WebElement> locationlist=location.findElements(By.tagName("div"));
				 
			for(int i=0;i<locationlist.size();i++)
			{ 

				WebElement image =locationlist.get(i).findElement(By.tagName("img"));
				try {
				if(image.isDisplayed()) {
					
				image.click();
				
			
				
				helper.DeepSleep();
				helper.DeepSleep();
				
		}	}
				catch(Exception e) {
					
				}
				
		

		}
			
			String Data=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='map']/div/div/div[1]/div[3]")).getText();

			
			Reporter.log("Kolkata Mobile Phones Service centres displayed in Map",true);
			Reporter.log("-------------------------------------------------",true);
			Reporter.log(Data,true);
			Reporter.log("-------------------------------------------------",true);
			helper.PageRefresh();
			
				
				
			

			
}	
	
	@Test (priority=22,description="Checking For header links in the serviceCentres page")
	public void test_serviceCentresHeader_WSDK212() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the serviceCentres page", true);
		method.CommonHeader();
}

	@Test (priority=23,description="Checking For footer links in the serviceCentres page")
	public void test_serviceCentresfooter_WSDK213() throws IOException, InterruptedException {
		Reporter.log("Checking For footer links in the serviceCentres page", true);
		method.CommonFooter();
}	
	@Test (priority=24,description="Getting Font-size and Font-family of all headings and paragraph in the serviceCentres page")		
	public void test_GettingCSSOFHeadingAndParagraphInserviceCentres_WSDK214() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the serviceCentres page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	@Test (priority=25,description="Checking serviceCentres Header and Footer CSS")
	public void test_serviceCentresHeaderAndFooterCSS_WSDK215() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS in serviceCentres page",true);
		
		method.HeaderAndFooterCSS();
	}	
	@Test (priority=26,description="click on every card button and check it is clickable in tcare WarrantyInformation Page")		
	public void test_clickOnWarrantyInformationCardsintcareWarrantyInformationPage_WSDK216() throws Exception {
		Reporter.log("click on every card button and check it is clickable in tcare WarrantyInformation Page",true);
		method.ScrollUp();
		method.ClickOntcareheaderLink();
		method.ClickOntcareWarrantyInformation();
		WebElement lock=SeleniumHelper.driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[1]"));
		List<WebElement>liList=lock.findElements(By.tagName("button")); 
		
		for (WebElement dd :liList)
		{ 
		
			dd.click();
			helper.Sleep();
			
				
			}
		try {
			WebElement Heading2=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='collapseOne']/div"));
			
		
				
			
		
				String Data1=Heading2.getText();
			
		
				MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
				
				String Dat1 = spellChecker.doCorrection(Data1);
				if(Dat1!=Data1) {
					
					Reporter.log("Before Correction : "+Data1);
				Reporter.log("After  Correction : "+Dat1, true);
				}
				
				}
			
			catch(Exception e) {
				Reporter.log("unable to check spell of tphone warranty information ", true);
				Reporter.log("--------------------------------------", true);
				Reporter.log("--------------------------------------", true);
				Assert.assertTrue(true);
				
			}
				
		helper.PageRefresh();
		method.ScrollUp();
		method.ClickOntbookInWarrantyInformation();
		helper.DeepSleep();
		WebElement lock1=SeleniumHelper.driver.findElement(By.xpath("html/body/section/div[2]/div[3]/div[2]"));
		List<WebElement>liList1=lock1.findElements(By.tagName("button")); 
		
		for (WebElement dd1 :liList1)
		{ 
		
			dd1.click();
			helper.Sleep();
			
				
			}
		try {
			WebElement Heading2=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='collapseBookOne']/div"));
			
		
				
			
		
				String Data1=Heading2.getText();
			
		
				MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
				
				String Dat1 = spellChecker.doCorrection(Data1);
				if(Dat1!=Data1) {
					
					Reporter.log("Before Correction : "+Data1);
				Reporter.log("After  Correction : "+Dat1, true);
				}
				
				}
			
			catch(Exception e) {
				Reporter.log("unable to check spell of tphone warranty information ", true);
				Reporter.log("--------------------------------------", true);
				Reporter.log("--------------------------------------", true);
				Assert.assertTrue(true);
				
			}
		helper.PageRefresh();
		method.ScrollUp();
		method.ClickOntphoneInWarrantyInformation();
		helper.DeepSleep();
			
}	
		
	@Test (priority=27,description="check background images in tcare WarrantyInformation Page")		
	public void test_checkBackgroundImagesintcareWarrantyInformationPage_WSDK217() throws Exception {
		Reporter.log("check background images in tcare WarrantyInformation Page",true);
WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath("html/body/section/div[1]"));
		
		String data=bodylinks.getCssValue("background-image");
		
		
		
		if(data.startsWith("url")) {
			Reporter.log("Background image of WarrantyInformation page:"+" "+data, true);
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
				Reporter.log("Unable to check background image loading in tcareWarrantyInformation page",true);
				
			}
			
		
		}
		
	else{
			Reporter.log("Background image not found in tcareWarrantyInformation page", true);
			
		}	
		
		}	
	@Test (priority=28,description="Spell check in tcareWarrantyInformation Page")		
	public void test_SpellcheckintcareWarrantyInformationPage_WSDK218() throws InterruptedException, IOException {
		Reporter.log("Spell check in tcareWarrantyInformation Page",true);
		
		method.SpellCheck();
		method.ClickOntbookInWarrantyInformation();
		method.SpellCheck();	
			}	
	@Test (priority=29,description="Checking For header links in the tcareWarrantyInformation page")
	public void test_tcareWarrantyInformationHeader_WSDK219() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the tcareWarrantyInformation page", true);
		method.CommonHeader();
}

	@Test (priority=30,description="Checking For footer links in the tcareWarrantyInformation page")
	public void test_tcareWarrantyInformationfooter_WSDK220() throws IOException, InterruptedException {
		Reporter.log("Checking For footer links in the tcareWarrantyInformation page", true);
		method.CommonFooter();
}
	@Test (priority=31,description="Getting Font-size and Font-family of all headings and paragraph in the tcareWarrantyInformation page")		
	public void test_GettingCSSOFHeadingAndParagraphIntcareWarrantyInformation_WSDK221() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the tcareWarrantyInformation page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	@Test (priority=32,description="Checking tcareWarrantyInformation Header and Footer CSS")
	public void test_tcareWarrantyInformationHeaderAndFooterCSS_WSDK222() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS in tcareWarrantyInformation page",true);
		
		method.HeaderAndFooterCSS();
	}	
	@Test (priority=33,description="click on community in tcare page")
	public void test_communityIntcarepage_WSDK223() throws InterruptedException, IOException {
		Reporter.log("click on community in tcare page",true);
		
		method.ClickOnCommunityIntcare();
		
		helper.DeepSleep();
	}	
		
	}

