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

public class srtphone extends TestBase {

	@Test(priority=1,description="Getting all section names in the SrtPhoneoverview page")
	public void test_SrtPhoneoverviewGettingAllSections_WSDK064() throws InterruptedException, IOException {
		Reporter.log("Getting all section names in the SrtPhoneoverview page",true);
		Reporter.log("---------------------------------------------------------------------------",true); 
		Reporter.log("---------------------------------------------------------------------------",true); 
		
		method.ClickOnsrtphoneHeaderLink();
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> section=bodylinks.findElements(By.tagName("Section"));
		Reporter.log("Number of sections in SrtPhoneoverview:"+section.size(),true);
		
		for (WebElement sec : section)
		{
			Reporter.log(sec.getAttribute("data-section-name"),true);
			
		}
		try {
			method.ScrollSectionWise(Variables.Section1);
			Reporter.log("Section 1 found", true);
			try {
				helper.Sleep();
			method.screenshot("SrtOverviewSection1");
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
				method.screenshot("SrtOverviewSection2");
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
				method.screenshot("SrtOverviewSection3");
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
				method.screenshot("SrtOverviewSection4");
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
				method.screenshot("SrtOverviewSection5");
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
				method.screenshot("SrtOverviewSection6");
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
				method.screenshot("SrtOverviewSection7");
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
				method.screenshot("SrtOverviewSection8");
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
			
			
		method.ScrollUp();
		
	}
	@Test (priority=2,description="Click on the links in the SrtphoneOverview page and check for navigation")
	public void test_clickingOnLinksinsrtphoneOverviewpage_WSDK065() throws IOException, InterruptedException {
		Reporter.log("Click on the links in the SrtphoneOverview page and check for navigation",true);
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.Section1));
		
		List<WebElement> allLinks = bodylinks.findElements(By.tagName("a"));
for (WebElement link : allLinks)
			
		{
			
			String reference=link.getAttribute("href");
			System.out.println(reference);
			try {
		if(reference.equalsIgnoreCase("https://tstore.smartron.com/srt-phone.html"))
		{
			Reporter.log("Buy now link was found in the srtphone overview page", true);
			try {
			link.click();
			method.SwitchToLastWindow();
			helper.Sleep();
			String url=SeleniumHelper.driver.getCurrentUrl();
			helper.DeepSleep();
	    	Reporter.log(" when clicked on Buy now link in the home page it is navigated to url="+url, true);
	    	SeleniumHelper.driver.close();
	    	helper.Sleep();
			method.SwitchToPreviousWindow();
	    	helper.Sleep();
			}
			catch(Exception e) {
				Reporter.log("unable to click buy now link",true);
				Assert.assertTrue(false);
			}
			
	
		}
			}
		
		catch(Exception e) {
			Reporter.log("Buy now link was not found in the srtphone overview page",true);
			Assert.assertTrue(false);
		}
			
			
			
			try {
			if(reference.equalsIgnoreCase("https://www.smartron.com/srt-specifications.html"))
				{
					System.out.println("123");
					Reporter.log("view specs link was found in the srtphone overview page", true);
					try {
					link.click();
					
					helper.Sleep();
					String url=SeleniumHelper.driver.getCurrentUrl();
			    	
			    	Reporter.log(" when clicked on view specs link in the home page it is navigated to url="+url, true);
			    	helper.NavigateBack();
			    	break;
					}
					catch(Exception e) {
						Reporter.log("unable to click view specs link",true);
						Assert.assertTrue(false);
					}
					break;
			}
					}
				
				catch(Exception e) {
					Reporter.log("view specs link was not found in the srtphone overview page",true);
					Assert.assertTrue(false);
				}
		}
	}
	
@Test (priority=3,description="Checking For header links in the srtphone overview page")
public void test_srtphoneoverviewHeader_WSDK066() throws IOException, InterruptedException {
	Reporter.log("Checking For header links in the srtphone overview page",true);
	method.test_Header_WSDK007();
	method.test_Header_WSDK008();
	method.ClickOnsrtphoneHeaderLink();
	method.test_Header_WSDK009();
	method.test_Header_WSDK010();
	method.test_Header_WSDK011();
	method.test_Header_WSDK012();
	method.test_Header_WSDK013();
	method.test_Header_WSDK014();
	method.test_Header_WSDK015();
	method.test_Header_WSDK016();
}

@Test (priority=4,description="Checking For footer links in the srtphone overview page")
public void test_srtphoneoverviewfooter_WSDK067() throws IOException, InterruptedException {
	Reporter.log("Checking For footer links in the srtphone overview page",true);
	method.test_Footer_WSDK017();
	method.test_Footer_WSDK018();
	method.ClickOnsrtphoneHeaderLink();
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
@Test (priority=5,description="Checking srtphone overview page Header and Footer CSS")
public void test_srtphoneverviewHeaderAndFooterCSS_WSDK068() throws InterruptedException, IOException {
	Reporter.log("Checking For Header and Footer CSS in srtphone overview page",true);
	
	method.HeaderAndFooterCSS();
}
@Test (priority=6,description="Getting Background Images in the srtphone overview page")		
public void test_GettingBackgroundImageOfsrtphoneOverviewPage_WSDK069() {
	
	Reporter.log("Getting Background Images of all sections in the srtphone OverviewPage", true);
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
	
	
}	
@Test (priority=7,description="Getting Font-size and Font-family of all headings and paragraph in the srtphone overview page")		
public void test_GettingCSSOFHeadingAndParagraphInsrtphonePOverviewPage_WSDK070() {
	Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the srtphone overview page", true);
	
	method.getCSSofHeadingandParagraph();
}
@Test (priority=8,description="Getting all Images in the srtphone OverviewPage")
public void test_CheckingForimagesInthesrtphoneOverviewPage_WSDK071() {
	Reporter.log("Getting Images in the srtphone OverviewPage", true);
	
	
	method.CheckImagesInThePage();
}

@Test (priority=9,description="Spell check in srtphone OverView Page")		
public void test_SpellcheckinsrtphoneOverviewPage_WSDK072() {
	Reporter.log("Spell check  in the srtphone OverviewPage", true);
	method.SpellCheck();
	}	

@Test(priority=10,description="Getting all section names in the SrtPhonePerformance page")
public void test_SrtPhonePerformanceGettingAllSections_WSDK073() throws InterruptedException, IOException {
	Reporter.log("Getting all section names in the SrtPhonePerformance page",true);
	Reporter.log("---------------------------------------------------------------------------",true); 
	Reporter.log("---------------------------------------------------------------------------",true); 
	method.ClickOnsrtphonePerformance();
	WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
	List<WebElement> section=bodylinks.findElements(By.tagName("Section"));
	Reporter.log("Number of sections in SrtPhonePerformance:"+section.size(),true);
	
	for (WebElement sec : section)
	{
		Reporter.log(sec.getAttribute("data-section-name"),true);
		
	}
	try {
		method.ScrollSectionWise(Variables.Section1);
		Reporter.log("Section 1 found", true);
		try {
			helper.Sleep();
		method.screenshot("SrtPhonePerformanceSection1");
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
			method.screenshot("SrtPhonePerformanceSection2");
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
			method.screenshot("SrtPhonePerformanceSection3");
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
			method.screenshot("SrtPhonePerformanceSection4");
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
			method.screenshot("SrtPhonePerformanceSection5");
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
			method.screenshot("SrtPhonePerformanceSection6");
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
			method.screenshot("SrtPhonePerformanceSection7");
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
@Test (priority=11,description="Click on the graph links in the SrtphonePerformance page and check for graphs")
public void test_clickingOnLinksinsrtphonePerformancepage_WSDK074() throws IOException, InterruptedException {
	Reporter.log("Click on the graph links in the SrtphonePerformance page and check for graphs",true);
	helper.ClickByXpath(".//*[@class='main-wrapper vi-hidden js-main-wrapper']/section[3]/div/div/div/div/div/div/div[1]");
	String graph=helper.GetAttributeByXpath("html/body/div[1]/section[3]/div/div/div/div[2]/div/img[1]", "class");
	Reporter.log("when clicked on 3D MARK GRAPHICS TEST image displayed is"+graph, true);
	helper.ClickByXpath(".//*[@class='main-wrapper vi-hidden js-main-wrapper']/section[3]/div/div/div/div/div/div/div[2]");
	String graph1=helper.GetAttributeByXpath("html/body/div[1]/section[3]/div/div/div/div[2]/div/img[1]", "class");
	Reporter.log("when clicked on 3D MARK GRAPHICS TEST image displayed is"+graph1, true);
	method.ScrollUp();
	}


@Test (priority=12,description="Checking For header links in the srtphone Performance page")
public void test_srtphonePerformanceHeader_WSDK075() throws IOException, InterruptedException {
	Reporter.log("Checking For header links in the srtphone Performance page",true);
method.CommonHeader();
}

@Test (priority=13,description="Checking For footer links in the srtphone Performance page")
public void test_srtphonePerformancefooter_WSDK076() throws IOException, InterruptedException {
	Reporter.log("Checking For footer links in the srtphone Performance page",true);
method.CommonFooter();
}	
@Test (priority=14,description="Checking srtphone Performance page Header and Footer CSS")
public void test_srtphonePerformanceHeaderAndFooterCSS_WSDK077() throws InterruptedException, IOException {
Reporter.log("Checking srtphone Performance page Header and Footer CSS",true);

method.HeaderAndFooterCSS();
}
@Test (priority=15,description="Getting Background Images in the srtphone Performance page")		
public void test_GettingBackgroundImageOfsrtphonePerformancePage_WSDK078() {

Reporter.log("Getting Background Images in the srtphone Performance page", true);
WebElement bodylink=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
List<WebElement> section=bodylink.findElements(By.tagName("Section"));
Reporter.log("Number of sections in srtphone PerformancePage:"+section.size(),true);
 method.backgroundimageOfsection1("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection2("xhtml:html/xhtml:body/xhtml:img");
 method.BackGroundImageOfSection3("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection4("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection5("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection6("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection7("xhtml:html/xhtml:body/xhtml:img");
 

}	
@Test (priority=16,description="Getting Font-size and Font-family of all headings and paragraph in the srtphone Performance page")		
public void test_GettingCSSOFHeadingAndParagraphInsrtphonePPerformancePage_WSDK079() {
Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the srtphone Performance page", true);

method.getCSSofHeadingandParagraph();
}
@Test (priority=17,description="Getting all Images in the srtphone PerformancePage")
public void test_CheckingForimagesInthesrtphonePerformancePage_WSDK080() {
Reporter.log("Getting Images in the srtphone PerformancePage", true);


method.CheckImagesInThePage();
}

@Test (priority=18,description="Spell check in srtphone Performance Page")		
public void test_SpellcheckinsrtphonePerformancePage_WSDK081() {
Reporter.log("Spell check  in the srtphone PerformancePage", true);
method.SpellCheck();
}	


@Test(priority=19,description="Getting all section names in the SrtPhoneDesignAndBuild page")
public void test_SrtPhoneDesignAndBuildGettingAllSections_WSDK082() throws InterruptedException, IOException {
	Reporter.log("Getting all section names in the SrtPhoneDesignAndBuild page",true);
	Reporter.log("---------------------------------------------------------------------------",true); 
	Reporter.log("---------------------------------------------------------------------------",true); 
	method.ClickOnsrtphoneDesignAndBuild();
	WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
	List<WebElement> section=bodylinks.findElements(By.tagName("Section"));
	Reporter.log("Number of sections in SrtPhoneDesignAndBuild:"+section.size(),true);
	
	for (WebElement sec : section)
	{
		Reporter.log(sec.getAttribute("data-section-name"),true);
		
	}
	try {
		method.ScrollSectionWise(Variables.Section1);
		Reporter.log("Section 1 found", true);
		try {
			helper.Sleep();
		method.screenshot("SrtPhoneDesignAndBuildSection1");
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
			method.screenshot("SrtPhoneDesignAndBuildSection2");
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
			method.screenshot("SrtPhoneDesignAndBuildSection3");
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
			method.screenshot("SrtPhoneDesignAndBuildSection4");
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
			method.screenshot("SrtPhoneDesignAndBuildSection5");
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
		
		
		
		
		
	method.ScrollUp();
	
}


@Test (priority=20,description="Checking For header links in the srtphone DesignAndBuild page")
public void test_srtphoneDesignAndBuildHeader_WSDK083() throws IOException, InterruptedException {
	Reporter.log("Checking For header links in the srtphone DesignAndBuild page",true);
method.CommonHeader();
}

@Test (priority=21,description="Checking For footer links in the srtphone DesignAndBuild page")
public void test_srtphoneDesignAndBuildfooter_WSDK084() throws IOException, InterruptedException {
	Reporter.log("Checking For footer links in the srtphone DesignAndBuild page",true);
method.CommonFooter();
}	
@Test (priority=22,description="Checking srtphone DesignAndBuild page Header and Footer CSS")
public void test_srtphoneDesignAndBuildHeaderAndFooterCSS_WSDK085() throws InterruptedException, IOException {
Reporter.log("Checking srtphone DesignAndBuild page Header and Footer CSS",true);

method.HeaderAndFooterCSS();
}
@Test (priority=23,description="Getting Background Images in the srtphone DesignAndBuild page")		
public void test_GettingBackgroundImageOfsrtphoneDesignAndBuildPage_WSDK086() {

Reporter.log("Getting Background Images of all sections in the srtphone DesignAndBuildPage", true);
WebElement bodylink=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
List<WebElement> section=bodylink.findElements(By.tagName("Section"));
Reporter.log("Number of sections in TphoneP DesignAndBuildPage:"+section.size(),true);
 method.backgroundimageOfsection1("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection2("xhtml:html/xhtml:body/xhtml:img");
 method.BackGroundImageOfSection3("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection4("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection5("xhtml:html/xhtml:body/xhtml:img");


}	
@Test (priority=24,description="Getting Font-size and Font-family of all headings and paragraph in the srtphone DesignAndBuild page")		
public void test_GettingCSSOFHeadingAndParagraphInsrtphonePDesignAndBuildPage_WSDK087() {
Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the srtphone DesignAndBuild page", true);

method.getCSSofHeadingandParagraph();
}
@Test (priority=25,description="Getting all Images in the srtphone DesignAndBuildPage")
public void test_CheckingForimagesInthesrtphoneDesignAndBuildPage_WSDK088() {
Reporter.log("Getting Images in the srtphone DesignAndBuildPage", true);


method.CheckImagesInThePage();
}

@Test (priority=26,description="Spell check in srtphone DesignAndBuild Page")		
public void test_SpellcheckinsrtphoneDesignAndBuildPage_WSDK089() {
Reporter.log("Spell check  in the srtphone DesignAndBuildPage", true);
method.SpellCheck();
}	

@Test(priority=27,description="Getting all section names in the SrtPhoneTechnology page")
public void test_SrtPhoneTechnologyGettingAllSections_WSDK090() throws InterruptedException, IOException {
	Reporter.log("Getting all section names in the SrtPhoneTechnology page",true);
	Reporter.log("---------------------------------------------------------------------------",true); 
	Reporter.log("---------------------------------------------------------------------------",true); 
	method.ClickOnsrtphoneTechnology();
	WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
	List<WebElement> section=bodylinks.findElements(By.tagName("Section"));
	Reporter.log("Number of sections in SrtPhoneTechnology:"+section.size(),true);
	
	for (WebElement sec : section)
	{
		Reporter.log(sec.getAttribute("data-section-name"),true);
		
	}
	try {
		method.ScrollSectionWise(Variables.Section1);
		Reporter.log("Section 1 found", true);
		try {
			helper.Sleep();
		method.screenshot("SrtPhoneTechnologySection1");
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
			method.screenshot("SrtPhoneTechnologySection2");
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
			method.screenshot("SrtPhoneTechnologySection3");
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
			method.screenshot("SrtPhoneTechnologySection4");
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
			method.screenshot("SrtPhoneTechnologySection5");
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
			method.screenshot("SrtPhoneTechnologySection6");
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
			method.screenshot("SrtPhoneTechnologySection7");
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


@Test (priority=28,description="Checking For header links in the srtphone Technology page")
public void test_srtphoneTechnologyHeader_WSDK091() throws IOException, InterruptedException {
	Reporter.log("Checking For header links in the srtphone Technology page", true);
method.CommonHeader();
}

@Test (priority=29,description="Checking For footer links in the srtphone Technology page")
public void test_srtphoneTechnologyfooter_WSDK092() throws IOException, InterruptedException {
	Reporter.log("Checking For footer links in the srtphone Technology page", true);
method.CommonFooter();
}	
@Test (priority=30,description="Checking srtphone Technology page Header and Footer CSS")
public void test_srtphoneTechnologyHeaderAndFooterCSS_WSDK093() throws InterruptedException, IOException {
Reporter.log("Checking srtphone Technology page Header and Footer CSS",true);

method.HeaderAndFooterCSS();
}
@Test (priority=31,description="Getting Background Images in the srtphone Technology page")		
public void test_GettingBackgroundImageOfsrtphoneTechnologyPage_WSDK094() {

Reporter.log("Getting Background Images of all sections in the srtphone TechnologyPage", true);
WebElement bodylink=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
List<WebElement> section=bodylink.findElements(By.tagName("Section"));
Reporter.log("Number of sections in TphoneP TechnologyPage:"+section.size(),true);
 method.backgroundimageOfsection1("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection2("xhtml:html/xhtml:body/xhtml:img");
 method.BackGroundImageOfSection3("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection4("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection5("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection6("xhtml:html/xhtml:body/xhtml:img");
 method.BackgroundImageOfSection7("xhtml:html/xhtml:body/xhtml:img");


}	
@Test (priority=32,description="Getting Font-size and Font-family of all headings and paragraph in the srtphone Technology page")		
public void test_GettingCSSOFHeadingAndParagraphInsrtphonePTechnologyPage_WSDK095() {
Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the srtphone Technology page", true);

method.getCSSofHeadingandParagraph();
}
@Test (priority=33,description="Getting all Images in the srtphone TechnologyPage")
public void test_CheckingForimagesInthesrtphoneTechnologyPage_WSDK096() {
Reporter.log("Getting Images in the srtphone TechnologyPage", true);


method.CheckImagesInThePage();
}

@Test (priority=34,description="Spell check in srtphone Technology Page")		
public void test_SpellcheckinsrtphoneTechnologyPage_WSDK097() {
Reporter.log("Spell check  in the srtphone TechnologyPage", true);
method.SpellCheck();
}	

@Test (priority=35,description="Verifying the specification details in the SrtPhone specification page")		
public void test_GettingDataInSrtPhoneSpecificationPage_WSDK098() throws InterruptedException {
	method.ClickOnsrtphoneSpecifications();
	Reporter.log("Verifying the specification details in the SrtPhone specification page", true);
	Reporter.log("---------------------------------------------------------------------------",true); 
	Reporter.log("---------------------------------------------------------------------------",true); 
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



@Test (priority=36,description="Checking For header links in the SrtPhone Specifications page")
public void test_SrtPhoneSpecificationsHeader_WSDK099() throws IOException, InterruptedException {
	Reporter.log("Checking For header links in the SrtPhone Specifications page", true);
	method.CommonHeader();
}

@Test (priority=37,description="Checking For footer links in the SrtPhone Specifications page")
public void test_SrtPhoneSpecificationsfooter_WSDK100() throws IOException, InterruptedException {
	Reporter.log("Checking For footer links in the SrtPhone Specifications page", true);
	method.CommonFooter();
}
@Test (priority=38,description="Checking Header and Footer CSS in SrtPhone Specification page")
public void test_HeaderAndFooterCSSInSrtPhoneSpecPage_WSDK101() throws InterruptedException, IOException {
	Reporter.log("Checking Header and Footer CSS in SrtPhone Specification page",true);
	
	method.HeaderAndFooterCSS();
}
@Test (priority=39,description="Getting all Images in the SrtPhone SpecificationsPage")
public void test_CheckingForimagesIntheSrtPhoneSpecificationsPage_WSDK102() {
	Reporter.log("Getting all Images in the SrtPhone SpecificationsPage", true);
	
	
	method.CheckImagesInThePage();
}

@Test (priority=40,description="Getting Font-size and Font-family of all headings and paragraph in the SrtPhone Specification page")		
public void test_GettingCSSOFHeadingAndParagraphInTphoneSpecPage_WSDK103() {
	Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the SrtPhone Specification page", true);
	
	method.getCSSofHeadingandParagraph();
}


@Test (priority=41,description="Spell check in SrtPhone Specifications Page")		
public void test_SpellcheckinSrtPhoneSpecificationsPage_WSDK104() {
	Reporter.log("Spell check in SrtPhone Specifications Page", true);
	method.SpellCheck();
	}			
		
@Test (priority=42,description="Click on BUY button in srtPhone Page and check for Navigation")		
public void test_BUYinSrtPhonePage_WSDK105() throws InterruptedException {
	Reporter.log("Click on BUY button in srtPhone Page and check for Navigation", true);
	method.ClickOnsrtphoneBuy();
	}	
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

