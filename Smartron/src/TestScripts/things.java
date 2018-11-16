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

public class things extends TestBase {
	
	@Test(priority=1,description="Getting all section names in the  page")
	public void test_Tthingsoverview_WSDK141() throws InterruptedException, IOException {
		Reporter.log("Getting all section names in the Tthingsoverview page",true);
		method.ClickOnTthingsHeader();
		
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> section=bodylinks.findElements(By.tagName("Section"));
		Reporter.log("Number of sections in Tthing:"+section.size(),true);
		
		for (WebElement sec : section)
		{
			Reporter.log(sec.getAttribute("data-section-name"),true);
			
		}
		try {
			method.ScrollSectionWise(Variables.Section1);
			Reporter.log("Section 1 found", true);
			try {
				helper.Sleep();
			method.screenshot("TthingsSection1");
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
				method.screenshot("TthingsSection2");
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
				method.screenshot("TthingsSection3");
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
				method.screenshot("TthingsSection4");
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
				method.screenshot("TthingsSection5");
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
				method.screenshot("TthingsSection6");
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
				method.screenshot("TthingsSection7");
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
	
	@Test (priority=2,description="Checking For slickdots in t.things page")
	public void test_slickDotsinTthingsPage_WSDK142() {
		Reporter.log("Checking For slickdots in t.things page",true);
		try {
			WebElement bodylinks1=SeleniumHelper.driver.findElement(By.xpath(Variables.Section1));
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
	
	@Test (priority=3,description="Spell check in Tthings Page")		
	public void test_SpellcheckinTthingsPage_WSDK143() {
		Reporter.log("Spell check in Tthings Page", true);
		method.SpellCheck();
		}	
	
	@Test (priority=4,description="Getting Background Images in the Tthings page")		
	public void test_GettingBackgroundImageOfTthingsPage_WSDK144() {
		
		Reporter.log("Getting Background Images in the Tthings page", true);
		
		 method.backgroundimageOfsection1("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection2("xhtml:html/xhtml:body/xhtml:img");
		 method.BackGroundImageOfSection3("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection4("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection5("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection6("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection7("xhtml:html/xhtml:body/xhtml:img");
		
		
	}
	@Test (priority=4,description="Checking Tthings Header and Footer CSS")
	public void test_TthingsHeaderAndFooterCSS_WSDK145() throws InterruptedException, IOException {
		Reporter.log("Checking For Tthings Header and Footer CSS",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=5,description="Getting Font-size and Font-family of all headings and paragraph in the Tthings page")		
	public void test_GettingCSSOFHeadingAndParagraphInTthings_WSDK146() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the Tthings page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	@Test (priority=6,description="Getting all Images in the Tthings Page")
	public void test_CheckingForimagesIntheTthingsPage_WSDK147() {
		Reporter.log("Getting Images in the Tthings Page", true);
		
		
		method.ImagesOfsection1("xhtml:html/xhtml:body/xhtml:img");
		method.ImagesOfSection2("xhtml:html/xhtml:body/xhtml:img");
		method.ImagesOfSection3("xhtml:html/xhtml:body/xhtml:img");
		method.ImagesOfSection4("xhtml:html/xhtml:body/xhtml:img");
		method.ImagesOfSection5("xhtml:html/xhtml:body/xhtml:img");
		method.ImagesOfSection6("xhtml:html/xhtml:body/xhtml:img");
		method.ImagesOfSection7("xhtml:html/xhtml:body/xhtml:img");
	}
	
	@Test (priority=7,description="Checking For header links in the Tthings page")
	public void test_TthingsHeader_WSDK148() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the Tthings page", true);
		method.CommonHeader();
}

	@Test (priority=8,description="Checking For footer links in the Tthings page")
	public void test_Tthingsfooter_WSDK149() throws IOException, InterruptedException {
		Reporter.log("Checking For footer links in the Tthings page", true);
		method.CommonFooter();
}
	@Test (priority=9,description="Checking subscription email details in Tthings page")
	public void test_CheckingsubscriptionemaildetailsinTthingsPage_WSDK150() throws InterruptedException, IOException {
		Reporter.log("Checking subscription email details in Tthings page",true);
		
		WebElement sec=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> header_allLinks =sec.findElements(By.tagName("span"));	
		for (WebElement bodylinks : header_allLinks) {
			String data=bodylinks.getText();
			Reporter.log("subscription email details Found in Tthings page as:"+" "+data,true);
	}
}
}	
	
	


