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

public class tbook extends TestBase {
		
	@Test(priority=1,description="Getting all section names in the tbookoverview page")
	public void test_tbookoverview_WSDK124() throws InterruptedException, IOException {
		Reporter.log("Getting all section names in the tbookoverview page",true);
		method.ClickOntbookHeaderLink();
		
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> section=bodylinks.findElements(By.tagName("Section"));
		Reporter.log("Number of sections in tbookoverview:"+section.size(),true);
		
		for (WebElement sec : section)
		{
			Reporter.log(sec.getAttribute("data-section-name"),true);
			
		}
		try {
			method.ScrollSectionWise(Variables.Section1);
			Reporter.log("Section 1 found", true);
			try {
				helper.Sleep();
			method.screenshot("tbookOverviewSection1");
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
				method.screenshot("tbookOverviewSection2");
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
				method.screenshot("tbookOverviewSection3");
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
				method.screenshot("tbookOverviewSection4");
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
				method.screenshot("tbookOverviewSection5");
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
				method.screenshot("tbookOverviewSection6");
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
				method.screenshot("tbookOverviewSection7");
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
	
	
	
	
	@Test(priority=2,description="click on spec at glance in the tbookoverview page")
	public void test_ClickOnSpecAtGlanceLinkintbookoverviewPage_WSDK125() throws InterruptedException, IOException {
		Reporter.log("click on spec at glance in the tbookoverview page",true);
		WebElement bodylink=SeleniumHelper.driver.findElement(By.xpath(Variables.Section1));
		List<WebElement> section=bodylink.findElements(By.tagName("a"));
		
		for (WebElement link : section)
		{
			if(link.getAttribute("href").equalsIgnoreCase("https://www.smartron.com/tbook-specifications.html")) {
				
				link.click();
				String url=SeleniumHelper.driver.getCurrentUrl();
		    	Reporter.log(" when clicked on spec at glance link in the tbook page it is navigated to url="+url, true);
		    	helper.NavigateBack();
				break;
			
		}
		 

		}	
		 
	}
	@Test (priority=3,description="Spell check in tbook OverView Page")		
	public void test_SpellcheckintbookOverviewPage_WSDK126() throws InterruptedException {
		Reporter.log("Spell check in tbook OverView Page",true);
		Thread.sleep(8000);
		
		method.SpellCheck();
		
		 

		}	
			
	@Test (priority=4,description="Getting Background Images in the tbook overview page")		
	public void test_GettingBackgroundImageOftbookOverviewPage_WSDK127() {
		
		Reporter.log("Getting Background Images in the tbook overview page", true);
		
		 method.backgroundimageOfsection1("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection2("xhtml:html/xhtml:body/xhtml:img");
		 method.BackGroundImageOfSection3("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection4("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection5("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection6("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection7("xhtml:html/xhtml:body/xhtml:img");
		
		
	}
	
	@Test (priority=5,description="Checking tbook Header and Footer CSS")
	public void test_tbookOverviewHeaderAndFooterCSS_WSDK128() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=6,description="Getting Font-size and Font-family of all headings and paragraph in the tbook overview page")		
	public void test_GettingCSSOFHeadingAndParagraphIntbookOverviewPage_WSDK129() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the tbook overview page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	@Test (priority=7,description="Getting all Images in the tbook OverviewPage")
	public void test_CheckingForimagesInthetbookOverviewPage_WSDK130() {
		Reporter.log("Getting Images in the tbook OverviewPage", true);
		
		
		method.SpanbackgroundimageOfsection1("xhtml:html/xhtml:body/xhtml:img");
		method.spanBackgroundImageOfSection2("xhtml:html/xhtml:body/xhtml:img");
		method.spanBackGroundImageOfSection3("xhtml:html/xhtml:body/xhtml:img");
		method.spanBackgroundImageOfSection4("xhtml:html/xhtml:body/xhtml:img");
		method.spanBackgroundImageOfSection5("xhtml:html/xhtml:body/xhtml:img");
		method.spanBackgroundImageOfSection6("xhtml:html/xhtml:body/xhtml:img");
		method.spanBackgroundImageOfSection7("xhtml:html/xhtml:body/xhtml:img");
	}
	
	@Test (priority=8,description="Checking For header links in the tbook Overview page")
	public void test_tbookOverviewHeader_WSDK131() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the tbook Overview page", true);
		method.test_Header_WSDK007();
		method.test_Header_WSDK008();
		method.test_Header_WSDK009();
		method.test_Header_WSDK010();
		method.ClickOntbookHeaderLink();
		method.test_Header_WSDK011();
		method.test_Header_WSDK012();
		method.test_Header_WSDK013();
		method.test_Header_WSDK014();
		method.test_Header_WSDK015();
		method.test_Header_WSDK016();
}
	@Test (priority=9,description="Checking For Footer links in the tbook Overview page")
	public void test_tbookOverviewFooter_WSDK132() throws IOException, InterruptedException {
		Reporter.log("Checking For Footer links in the tbook Overview page", true);
		method.test_Footer_WSDK017();
		method.test_Footer_WSDK018();
		method.test_Footer_WSDK019();
		method.ClickOntbookHeaderLink();
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
	
	@Test (priority=10,description="Verifying the specification details in the tbook specification page")		
	public void test_GettingDataIntbookSpecificationPage_WSDK133() throws InterruptedException {
		Reporter.log("Verifying the specification details in the tbook specification page", true);
		method.ClickOntbookHeaderLink();
		method.ClickOntbookSpecifications();

		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("html/body/div[1]/section/div/div/div/ul"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for(int i=0;i<liList.size();i++)
		{ 
			String labels=liList.get(i).findElement(By.xpath("div[1]/label")).getText(); 
			
			String imagesrc=liList.get(i).findElement(By.xpath("div[1]/div/img")).getAttribute("src");
			
			String Details=liList.get(i).findElement(By.xpath("div[2]")).getText();
			
			Reporter.log("For"+" "+labels+" "+"label"+" "+"image icon src is"+" "+imagesrc+" "+"and specfication details mentioned is:"+" "+"\n"+Details,true); 
			Reporter.log("---------------------------------------------------------------------------",true); 
			}
		
		}
	
	
	
	@Test (priority=11,description="Checking For header links in the tbook Specifications page")
	public void test_tbookSpecificationsHeader_WSDK134() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the tbook Specifications page", true);
		method.CommonHeader();
}

	@Test (priority=12,description="Checking For footer links in the tbook Specifications page")
	public void test_tbookSpecificationsfooter_WSDK135() throws IOException, InterruptedException {
		Reporter.log("Checking For footer links in the tbook Specifications page", true);
		method.CommonFooter();
}
	@Test (priority=13,description="Checking Header and Footer CSS in tbook Specification page")
	public void test_HeaderAndFooterCSSIntbookSpecPage_WSDK136() throws InterruptedException, IOException {
		Reporter.log("Checking Header and Footer CSS in tbook Specification page",true);
		
		method.HeaderAndFooterCSS();
	}
	@Test (priority=14,description="Getting all Images in the tbook SpecificationsPage")
	public void test_CheckingForimagesInthetbookSpecificationsPage_WSDK137() {
		Reporter.log("Getting Images in the tbook SpecificationsPage", true);
		
		
		method.CheckImagesInThePage();
	}
	
	@Test (priority=15,description="Getting Font-size and Font-family of all headings and paragraph in the tbook Specification page")		
	public void test_GettingCSSOFHeadingAndParagraphIntbookSpecPage_WSDK138() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the tbook Specification page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	
	@Test (priority=16,description="Spell check in tbook Specifications Page")		
	public void test_SpellcheckintbookSpecificationsPage_WSDK139() {
		Reporter.log("Spell check in tbook Specifications Page", true);
		method.SpellCheck();
		}	
	


	@Test (priority=17	,description="Click on BUY button in tbook Page and check for Navigation")		
	public void test_BUYintbookPhonePage_WSDK140() throws InterruptedException {
		Reporter.log("Click on BUY button in tbook and check for Navigation", true);
		method.ClickOntbookBuy();
		}	
	
}
