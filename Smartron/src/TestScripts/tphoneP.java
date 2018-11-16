package TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Common.MySpellChecker;
import Common.SeleniumHelper;
import Common.TestBase;
import Common.Variables;


/**
 * @author ubuntu2
 *
 */
public class tphoneP extends TestBase{

	
	@Test (priority=1,description="Getting all section names in the tphoneP page")
	public void test_tphonePoverviewGettingAllSections_WSDK048() throws IOException, InterruptedException {
		Reporter.log("---------------------------------------------------------------------",true);
		Reporter.log("----------------------------------------------------------------------",true);
		Reporter.log("-------------------------------TphoneP Page-------------------------",true);
		Reporter.log("Getting all section names in the tphoneP page",true);
		method.ClickOnTphonePHeaderLink();Reporter.log("Getting all section names in the tphoneP page",true);
		method.ClickOnTphonePHeaderLink();
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
			method.screenshot("TphonePSection1");
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
				method.screenshot("TphonePSection2");
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
				method.screenshot("TphonePSection3");
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
				method.screenshot("TphonePSection4");
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
				method.screenshot("TphonePSection5");
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
				method.screenshot("TphonePSection6");
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
				method.screenshot("TphonePSection7");
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
			
			try {
				method.ScrollSectionWise(Variables.Section8);
				
				Reporter.log("Section 8 found", true);
				try {
					helper.Sleep();
				method.screenshot("TphonePSection8");
				}
				catch(Exception e) {
					Reporter.log("Unable to take screenshot of section 8", true);
					Assert.assertTrue(false);
				}
				}
				catch(Exception e) {
					Reporter.log("Unable to find section 8", true);
					Assert.assertTrue(false);
				}
			
			try {
				method.ScrollSectionWise(Variables.Section9);
				
				Reporter.log("Section 9 found", true);
				try {
					helper.Sleep();
				method.screenshot("TphonePSection9");
				}
				catch(Exception e) {
					Reporter.log("Unable to take screenshot of section 9", true);
					Assert.assertTrue(false);
				}
				}
				catch(Exception e) {
					Reporter.log("Unable to find section 9", true);
					Assert.assertTrue(false);
				}
		method.ScrollUp();
	}
	@Test (priority=2,description="Checking For ytp video content in the tphoneP page")
		public void test_tphonePOverviewCheckingForytpvideo_WSDK049() throws IOException, InterruptedException {
		Reporter.log("Checking For ytp video content in the tphoneP page",true);
		
		method.YTPvideo();
		 
	}
	@Test (priority=3,description="Checking For header links in the tphoneP Overview page")
	public void test_tphonePOverviewHeader_WSDK050() throws IOException, InterruptedException {
		//method.ClickOnTphonePHeaderLink();
		method.test_Header_WSDK007();
		method.ClickOnTphonePHeaderLink();
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
	@Test (priority=4,description="Checking For Footer links in the tphoneP Overview page")
	public void test_tphonePOverviewFooter_WSDK051() throws IOException, InterruptedException {
		method.ClickOnTphonePHeaderLink();
		method.test_Footer_WSDK017();
		method.ClickOnTphonePHeaderLink();
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
	@Test (priority=5,description="Checking tphoneP Header and Footer CSS")
	public void test_TphonePOverviewHeaderAndFooterCSS_WSDK052() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS",true);
		//method.ClickOnTphonePHeaderLink();
		method.HeaderAndFooterCSS();
	}
	@Test (priority=6,description="Getting Background Images in the TphoneP overview page")		
	public void test_GettingBackgroundImageOfTphonePOverviewPage_WSDK053() {
		
		Reporter.log("Getting Background Images of all sections in the TphoneP OverviewPage", true);
		WebElement bodylink=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> section=bodylink.findElements(By.tagName("Section"));
		Reporter.log("Number of sections in TphoneP OverviewPage:"+section.size(),true);
		 method.backgroundimageOfsection1("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection2("xhtml:html/xhtml:body/xhtml:img");
		 method.BackGroundImageOfSection3("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection4("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection5("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection6("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection7("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection8("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection9("xhtml:html/xhtml:body/xhtml:img");
		
	}

	@Test (priority=7,description="Getting Font-size and Font-family of all headings and paragraph in the TphoneP overview page")		
	public void test_GettingCSSOFHeadingAndParagraphInTphonePOverviewPage_WSDK054() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the TphoneP overview page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	
	
	@Test (priority=8,description="Getting all Images in the TphoneP OverviewPage")
	public void test_CheckingForimagesIntheTphonepOverviewPage_WSDK055() {
		Reporter.log("Getting Images in the TphoneP OverviewPage", true);
		
		
		method.CheckImagesInThePage();
	}
	
	@Test (priority=9,description="Spell check in TphoneP OverView Page")		
	public void test_SpellcheckinTphonePOverviewPage_WSDK056() {
		
		method.SpellCheck();
		}
	
	@Test (priority=10,description="Verifying the specification details in the tphoneP specification page")		
	public void test_GettingDataInTphonePSpecificationPage_WSDK057() throws InterruptedException {
		method.ClickOnTphonePSpecification();

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
	
	
	
	@Test (priority=11,description="Checking For header links in the tphoneP Specifications page")
	public void test_tphonePSpecificationsHeader_WSDK058() throws IOException, InterruptedException {
		
		method.CommonHeader();
}

	@Test (priority=12,description="Checking For footer links in the tphoneP Specifications page")
	public void test_tphonePSpecificationsfooter_WSDK059() throws IOException, InterruptedException {
		
		method.CommonFooter();
}
	@Test (priority=13,description="Checking Header and Footer CSS in tphoneP Specification page")
	public void test_HeaderAndFooterCSSIntphonePSpecPage_WSDK060() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS",true);
		
		method.HeaderAndFooterCSS();
	}
	@Test (priority=14,description="Getting all Images in the TphoneP SpecificationsPage")
	public void test_CheckingForimagesIntheTphonepSpecificationsPage_WSDK061() {
		Reporter.log("Getting Images in the TphoneP SpecificationsPage", true);
		
		
		method.CheckImagesInThePage();
	}
	
	@Test (priority=15,description="Getting Font-size and Font-family of all headings and paragraph in the TphoneP Specification page")		
	public void test_GettingCSSOFHeadingAndParagraphInTphoneSpecPage_WSDK062() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the TphoneP Specification page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	
	@Test (priority=16,description="Spell check in TphoneP Specifications Page")		
	public void test_SpellcheckinTphonePSpecificationsPage_WSDK063() {
		
		method.SpellCheck();
		}	
	
	
}
