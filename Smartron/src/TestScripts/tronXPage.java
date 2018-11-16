package TestScripts;

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

public class tronXPage extends TestBase {

	@Test(priority=1,description="Getting all section names in the tronX page")
	public void test_tronXoverview_WSDK151() throws InterruptedException, IOException {
		Reporter.log("Getting all section names in the tronX page",true);
		method.ClickOntronXHeader();
		
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> section=bodylinks.findElements(By.tagName("Section"));
		Reporter.log("Number of sections in tronX:"+section.size(),true);
		
		for (WebElement sec : section)
		{
			Reporter.log(sec.getAttribute("data-section-name"),true);
			
		}
		try {
			method.ScrollSectionWise(Variables.Section1);
			Reporter.log("Section 1 found", true);
			try {
				helper.Sleep();
			method.screenshot("tronXSection1");
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
				method.screenshot("tronXSection2");
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
				method.screenshot("tronXSection3");
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
				method.screenshot("tronXSection4");
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
				method.screenshot("tronXSection5");
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
				method.screenshot("tronXSection6");
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
				method.screenshot("tronXSection7");
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
			
			
			
		method.ScrollUp();
		
		
		
	}
	@Test (priority=2,description="Checking For slickdots in tronX page")
	public void test_slickDotsintronXPage_WSDK152() throws InterruptedException {
		Reporter.log("Checking For slickdots in tronX page",true);
		method.ScrollDown();
		helper.Sleep();
		method.ScrollUp();
		helper.Sleep();
		method.ScrollSectionWise(Variables.Section6);
		helper.DeepSleep();
		
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

	
	@Test (priority=3,description="Spell check in tronX Page")		
	public void test_SpellcheckintronXPage_WSDK153() {
		Reporter.log("Spell check in tronX Page", true);
		method.SpellCheck();
		}	
	
	@Test (priority=4,description="Getting Background Images in the tronX page")		
	public void test_GettingBackgroundImageOftronXPage_WSDK154() {
		
		Reporter.log("Getting Background Images in the tronX page", true);
		
		 method.backgroundimageOfsection1("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection2("xhtml:html/xhtml:body/xhtml:img");
		 method.BackGroundImageOfSection3("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection4("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection5("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection6("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection7("xhtml:html/xhtml:body/xhtml:img");
		
		
	}
	@Test (priority=4,description="Checking tronX Header and Footer CSS")
	public void test_tronXHeaderAndFooterCSS_WSDK155() throws InterruptedException, IOException {
		Reporter.log("Checking For tronX Header and Footer CSS",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=5,description="Getting Font-size and Font-family of all headings and paragraph in the tronX page")		
	public void test_GettingCSSOFHeadingAndParagraphIntronX_WSDK156() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the tronX page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	
	
	@Test (priority=6,description="Checking For header links in the tronX page")
	public void test_tronXHeader_WSDK157() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the tronX page", true);
		method.test_Header_WSDK007();
		method.test_Header_WSDK008();
		method.test_Header_WSDK009();
		method.test_Header_WSDK010();
		method.test_Header_WSDK011();
		method.test_Header_WSDK012();
		method.test_Header_WSDK013();
		method.ClickOntronXHeader();
		method.test_Header_WSDK014();
		method.test_Header_WSDK015();
		method.test_Header_WSDK016();
}

	@Test (priority=7,description="Checking For footer links in the tronX page")
	public void test_tronXfooter_WSDK158() throws IOException, InterruptedException {
		Reporter.log("Checking For footer links in the tronX page", true);
		method.test_Footer_WSDK017();
		method.test_Footer_WSDK018();
		method.test_Footer_WSDK019();
		method.test_Footer_WSDK020();
	    method.test_Footer_WSDK021();
	    method.ClickOntronXHeader();
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
	@Test (priority=8,description="Checking subscription email details in tronX page")
	public void test_CheckingsubscriptionemaildetailsintronXPage_WSDK159() throws InterruptedException, IOException {
		Reporter.log("Checking subscription email details in tronX page",true);
		method.ScrollDown();
		try {
			WebElement totalTextboxes=SeleniumHelper.driver.findElement(By.xpath("//input[@type='text']"));
			try {
			totalTextboxes.sendKeys(Variables.CorrectsubscribeEmail);
			}
			catch(Exception e) {
				Reporter.log("unable to enter correct email id",true);
				Assert.assertTrue(false);
			}
			try {
			helper.ClickByXpath(Variables.subcribeButton);
			helper.DeepSleep();
			}
			catch(Exception e) {
				Reporter.log("unable to click on submit button after entering correct email id",true);
				Assert.assertTrue(false);
			}
			method.screenshot("subscribewithCorrectemail");
			helper.DeepSleep();
			try {
			totalTextboxes.sendKeys(Variables.InCorrectsubscribeEmail);
			helper.DeepSleep();
			}
			catch(Exception e) {
				Reporter.log("unable to enter Incorrect email id",true);
				Assert.assertTrue(false);
			}
			try {
			helper.ClickByXpath(Variables.subcribeButton);
			helper.DeepSleep();
			}
			catch(Exception e) {
				Reporter.log("unable to click on submit button after entering Incorrect email id",true);
				Assert.assertTrue(false);
			}
			helper.DeepSleep();
			method.screenshot("subscribewithInCorrectemail");		
			helper.Sleep();		
			}
			catch(Exception e) {
				Reporter.log("subscribe textbox not found",true);
				Assert.assertTrue(false);
			}
		}
	}

	

