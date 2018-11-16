package TestScripts;

import java.io.IOException;
import java.util.List;
import java.util.Random;

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

public class companyPage extends TestBase {
	
	Random r=new Random();
	String Name="test"+r.nextInt(10);
	String email="test"+r.nextInt()+"@gmail.com";
	String email1="test"+r.nextInt();
	long phone=(long)(Math.random()*9999999999L);
	long phone1=(long)(Math.random()*100000+3333000000L);
	String phoneNumber=Long.toString(phone);
	String phoneNumber1=Long.toString(phone1);
	String enquiry="about"+r.nextInt(100);
	String company="smartron"+r.nextInt(20);
	
	@Test (priority=1,description="Spell check in AboutUs Page")		
	public void test_SpellcheckinAboutUsPage_WSDK224() throws InterruptedException, IOException {
		Reporter.log("Spell check in AboutUs Page", true);
		method.ClickOnCompanyheaderLink();
		method.SpellCheck();
		}
	
	@Test (priority=2,description="Getting Background Images in the AboutUs page")		
	public void test_GettingBackgroundImageinAboutUspage_WSDK225() {
		
		Reporter.log("Getting Background Images in the AboutUs page", true);
		
WebElement bodylinks=SeleniumHelper.driver.findElement(By.tagName("section"));
		
		String data=bodylinks.getCssValue("background-image");
		
		
		
		if(data.startsWith("url")) {
			Reporter.log("Background image of AboutUs page:"+" "+data, true);
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
				Reporter.log("Unable to check background image loading in AboutUs page",true);
				
			}
			
		
		}
		
	else{
			Reporter.log("Background image not found in AboutUs page", true);
			
		}
}
	@Test (priority=3,description="Checking AboutUs Header and Footer CSS")
	public void test_AboutUsHeaderAndFooterCSS_WSDK226() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=4,description="Getting Font-size and Font-family of all headings and paragraph in the AboutUs page")		
	public void test_GettingCSSOFHeadingAndParagraphInAboutUsPage_WSDK227() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the AboutUs page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	@Test (priority=5,description="Checking For header links in the AboutUs page")
	public void test_AboutUsHeader_WSDK228() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the AboutUs page", true);
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
		method.ClickOnCompanyheaderLink();
}
	@Test (priority=6,description="Checking For Footer links in the AboutUs page")
	public void test_AboutUsFooter_WSDK229() throws IOException, InterruptedException {
		Reporter.log("Checking For Footer links in the AboutUs page", true);
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
		method.ClickOnCompanyheaderLink();
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
	@Test (priority=7,description="Get all section names of People page in company header")
	public void test_People_WSDK230() throws InterruptedException, IOException {
		Reporter.log("Get all section names of People page in company header",true);
		
		method.ClickOnpeoplesubheader();
		helper.DeepSleep();
		WebElement bodylinks=SeleniumHelper.driver.findElement(By.xpath(Variables.body));
		List<WebElement> section=bodylinks.findElements(By.tagName("Section"));
		Reporter.log("Number of sections in People:"+section.size(),true);
		
		for (WebElement sec : section)
		{
			Reporter.log(sec.getAttribute("data-section-name"),true);
			
		}
		try {
			method.ScrollSectionWise(Variables.Section1);
			Reporter.log("Section 1 found", true);
			try {
				helper.Sleep();
			method.screenshot("PeopleSection1");
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
				method.screenshot("PeopleSection2");
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
				method.screenshot("PeopleSection3");
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
				method.screenshot("PeopleSection4");
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
				method.screenshot("PeopleSection5");
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
			
			
		
}
	@Test (priority=8,description="Spell check in People Page")		
	public void test_SpellcheckinPeoplePage_WSDK231() throws InterruptedException {
		Reporter.log("Spell check in People  Page",true);
		Thread.sleep(8000);
		
		method.SpellCheck();
		
		 

		}	
	
	@Test (priority=9,description="Getting Background Images in the People page")		
	public void test_GettingBackgroundImageOfPeoplePage_WSDK232() {
		
		Reporter.log("Getting Background Images in the People page", true);
		
		 method.backgroundimageOfsection1("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection2("xhtml:html/xhtml:body/xhtml:img");
		 method.BackGroundImageOfSection3("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection4("xhtml:html/xhtml:body/xhtml:img");
		 method.BackgroundImageOfSection5("xhtml:html/xhtml:body/xhtml:img");
		
		
		
	}
	@Test (priority=10,description="Checking tbook Header and Footer CSS")
	public void test_PeopleHeaderAndFooterCSS_WSDK233() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=11,description="Getting Font-size and Font-family of all headings and paragraph in the People page")		
	public void test_GettingCSSOFHeadingAndParagraphInPeoplePage_WSDK234() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the People page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	@Test (priority=12,description="Getting all Images in the PeoplePage")
	public void test_CheckingForimagesInthePeoplePage_WSDK235() {
		Reporter.log("Getting Images in the PeoplePage", true);
		
		
		method.ImagesOfsection1("xhtml:html/xhtml:body/xhtml:img");
		method.ImagesOfSection2("xhtml:html/xhtml:body/xhtml:img");
		method.ImagesOfSection3("xhtml:html/xhtml:body/xhtml:img");
		method.ImagesOfSection4("xhtml:html/xhtml:body/xhtml:img");
		method.ImagesOfSection5("xhtml:html/xhtml:body/xhtml:img");
		
	}
	@Test (priority=13,description="Checking For header links in the People page")
	public void test_PeopleHeader_WSDK236() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the People page", true);
		method.CommonHeader();
}

	@Test (priority=14,description="Checking For footer links in the People page")
	public void test_Peoplefooter_WSDK237() throws IOException, InterruptedException {
		Reporter.log("Checking For footer links in the People page", true);
		method.CommonFooter();
}	
	
	@Test (priority=15,description="Spell check in Ambassador Page")		
	public void test_SpellcheckinAmbassadorPage_WSDK238() throws InterruptedException, IOException {
		Reporter.log("Spell check in Ambassador  Page",true);
		
		method.ClickOnAmbassadorsubheader();
		helper.DeepSleep();
		
		method.SpellCheck();
		
		 

		}	
	
	
	@Test (priority=16,description="Checking tbook Header and Footer CSS")
	public void test_AmbassadorHeaderAndFooterCSS_WSDK239() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=17,description="Getting Font-size and Font-family of all headings and paragraph in the Ambassador page")		
	public void test_GettingCSSOFHeadingAndParagraphInAmbassadorPage_WSDK240() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the Ambassador page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	@Test (priority=18,description="Getting all Images in the AmbassadorPage")
	public void test_CheckingForimagesIntheAmbassadorPage_WSDK241() {
		Reporter.log("Getting Images in the AmbassadorPage", true);
		
		try {
			WebElement sec=SeleniumHelper.driver.findElement(By.xpath(".//*[@class='main-wrapper vi-hidden js-main-wrapper']/section[1]/div[2]"));
		List<WebElement> header_allLinks =sec.findElements(By.tagName("img"));	
		for (WebElement bodylinks : header_allLinks) {
			String data=bodylinks.getAttribute("src");
			
			
			
			if(data.startsWith("https")) {
				Reporter.log("Image of sachin:"+data, true);
				try {
					helper.Sleep();
					
				SeleniumHelper.driver.get(data);
				helper.Sleep();
				
				method.Check_imageLoadedOrNot("xhtml:html/xhtml:body/xhtml:img");
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check image loading",true);
					
				}
				
			
			}
			
			
			
		}
		}
		catch(Exception e) {
			Reporter.log("sachin Image not found for Ambassador Page", true);
		}
	
		try {
			WebElement sec=SeleniumHelper.driver.findElement(By.xpath(".//*[@class='main-wrapper vi-hidden js-main-wrapper']/section[1]/div[3]"));
		List<WebElement> header_allLinks =sec.findElements(By.tagName("img"));	
		for (WebElement bodylinks : header_allLinks) {
			String data=bodylinks.getAttribute("src");
			
			
			
			if(data.startsWith("https")) {
				Reporter.log("Image of Anirban:"+data, true);
				try {
					helper.Sleep();
					
				SeleniumHelper.driver.get(data);
				helper.Sleep();
				
				method.Check_imageLoadedOrNot("xhtml:html/xhtml:body/xhtml:img");
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check image loading",true);
					
				}
				
			
			}
			
			
			
		}
		}
		catch(Exception e) {
			Reporter.log("Anirban Image not found for Ambassador Page", true);
		}
	
	}
	@Test (priority=19,description="Checking For header links in the Ambassador page")
	public void test_AmbassadorHeader_WSDK242() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the Ambassador page", true);
		method.CommonHeader();
}

	@Test (priority=20,description="Checking For footer links in the Ambassador page")
	public void test_Ambassadorfooter_WSDK243() throws IOException, InterruptedException {
		Reporter.log("Checking For footer links in the Ambassador page", true);
		method.CommonFooter();
}	
	
	@Test (priority=21,description="Get background images in Careers Page")		
	public void test_GetbackgroundimagesCareersPage_WSDK244() throws InterruptedException, IOException {
		Reporter.log("Get background images in Careers  Page",true);
		
		method.ClickOnCareerssubheader();
		helper.DeepSleep();
		WebElement bodylinks5=SeleniumHelper.driver.findElement(By.xpath(".//*[@class='main-wrapper vi-hidden js-main-wrapper']/div[2]"));
		
		String data5=bodylinks5.getCssValue("background-image");
		
		
		if(data5.startsWith("url")) {
			Reporter.log("Background image of CareerSubWay:"+data5, true);	
			try {
				String good5=data5.split("\"")[1];
				SeleniumHelper.driver.get(good5);
				
				method.Check_imageLoadedOrNot("xhtml:html/xhtml:body/xhtml:img");
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
		else{
			Reporter.log("Background image not found for CareerSubWay", true);
			
		}
		
WebElement bodylinks=SeleniumHelper.driver.findElement(By.className("career__left"));
		
		String data=bodylinks.getCssValue("background-image");
		
		
		if(data.startsWith("url")) {
			Reporter.log("Background image of CareerScrollLeft:"+data, true);	
			try {
				String good=data.split("\"")[1];
				SeleniumHelper.driver.get(good);
				
				method.Check_imageLoadedOrNot("xhtml:html/xhtml:body/xhtml:img");
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
		else{
			Reporter.log("Background image not found for CareerscrollLeft", true);
			
		}
		
WebElement bodylinks1=SeleniumHelper.driver.findElement(By.className("career__right"));
		
		String data1=bodylinks1.getCssValue("background-image");
		
		
		if(data1.startsWith("url")) {
			Reporter.log("Background image of CareerScrollRight:"+data1, true);	
			try {
				String good1=data1.split("\"")[1];
				SeleniumHelper.driver.get(good1);
				
				method.Check_imageLoadedOrNot("xhtml:html/xhtml:body/xhtml:img");
				helper.NavigateBack();
				}
				catch(Exception e) {
					Reporter.log("Unable to check background image loading",true);
					Assert.assertTrue(false);
				}
		}
		
		else{
			Reporter.log("Background image not found for CareerscrollRight", true);
			
		}
		
}
	
	
	@Test (priority=22,description="Spell check in Careers Page")		
	public void test_SpellcheckinCareersPage_WSDK245() throws InterruptedException {
		Reporter.log("Spell check in Careers OverView Page",true);
		Thread.sleep(8000);
		
		method.SpellCheck();
		
		 

		}	
	
	
	@Test (priority=23,description="Checking Careers Header and Footer CSS")
	public void test_CareersHeaderAndFooterCSS_WSDK246() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=24,description="Getting Font-size and Font-family of all headings and paragraph in the Careers overview page")		
	public void test_GettingCSSOFHeadingAndParagraphInCareersPage_WSDK247() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the Careers overview page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	
	@Test (priority=25,description="Checking For header links in the Careers page")
	public void test_CareersHeader_WSDK248() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the Careers page", true);
		method.CommonHeader();
}

	@Test (priority=26,description="Checking For footer links in the Careers page")
	public void test_Careersfooter_WSDK249() throws IOException, InterruptedException {
		Reporter.log("Checking For footer links in the Careers page", true);
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
		method.ClickOnCareerssubheader();
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
	@Test (priority=27,description="clicked on View All Positions link in Careers Page")		
	public void test_ClickOnViewAllpositionsLinkInCareersPage_WSDK250() throws InterruptedException, IOException {
		Reporter.log("clicked on View All Positions link in Careers  Page",true);
		
		method.ClickOnCareerssubheader();
		helper.DeepSleep();
		
		List<WebElement> header_allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
		
		for (WebElement link1 : header_allLinks) {
			 
			
			
			 
			try {
				if(link1.getAttribute("href").equalsIgnoreCase("https://www.linkedin.com/jobs/search/?f_C=10324917&locationType=Y&trk=biz-guest-topcard-see-jobs")) 
					{
					
					try {
						
					link1.click();
					method.SwitchToLastWindow();
				String url=SeleniumHelper.driver.getCurrentUrl();
		    	Reporter.log(" when clicked on View All Positions link in the careers page it is navigated to url="+url, true);
		    	SeleniumHelper.driver.close();
				method.SwitchToPreviousWindow();
					}
					catch(Exception e) {
						Reporter.log("unable to click View All Positions link in the careers page ", true);
					}
				
					
				break;
				
				}
			
			}
		catch(Exception e) {
			Reporter.log("unable to find View All Positions link in the careers page", true);
		}
				
}
	}
	
	
	@Test (priority=28,description="clicked on View link in Press Page")		
	public void test_ClickpresswidgetviewLinkInPressPage_WSDK251() throws InterruptedException, IOException {
		Reporter.log("clicked on press widget view link in Press  Page",true);
		
		method.ClickOnPressSubheader();
		helper.DeepSleep();
		WebElement body=SeleniumHelper.driver.findElement(By.className("press-container"));
		List<WebElement> header_allLinks = body.findElements(By.tagName("a"));
		
		for (WebElement link1 : header_allLinks) {
			 
		try {
				link1.click();
					method.SwitchToLastWindow();
				String url=SeleniumHelper.driver.getCurrentUrl();
		    	Reporter.log(" when clicked on view links in press page it is navigated to url="+url, true);
		    	//helper.DeepSleep();
		    	SeleniumHelper.driver.close();
				method.SwitchToPreviousWindow();
					}
					catch(Exception e) {
						Reporter.log("unable to click on view in the Press page ", true);
					}
				
					
				
				
				}
			
			}
	
	@Test (priority=29,description="Getting all Images in the PressPage")
	public void test_CheckingForimagesInthePressPage_WSDK252() {
		Reporter.log("Getting Images in the PressPage", true);
		
		try {
			WebElement sec=SeleniumHelper.driver.findElement(By.className("press-container"));
		List<WebElement> header_allLinks =sec.findElements(By.tagName("img"));	
		for(int i=0;i<header_allLinks.size();i++)
		{ 
			String data=header_allLinks.get(i).getAttribute("src");
			
			Reporter.log("Images in press page:"+data, true);
				
	}
			
			}
		catch(Exception e) {
			Reporter.log("Image not found for PressPage", true);
		}
				
}
	
	
	@Test (priority=30,description="Spell check in Press Page")		
	public void test_SpellcheckinPressPage_WSDK253() throws InterruptedException {
		Reporter.log("Spell check in Press  Page",true);
		Thread.sleep(8000);
		
		method.SpellCheck();
		
		 

		}	
	
	
	@Test (priority=31,description="Checking Press Header and Footer CSS")
	public void test_PressHeaderAndFooterCSS_WSDK254() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=32,description="Getting Font-size and Font-family of all headings and paragraph in the Press overview page")		
	public void test_GettingCSSOFHeadingAndParagraphInPressPage_WSDK255() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the Press overview page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	
	@Test (priority=33,description="Checking For header links in the Press page")
	public void test_PressHeader_WSDK256() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the Press page", true);
		method.CommonHeader();
}

	@Test (priority=34,description="Checking For footer links in the Press page")
	public void test_Pressfooter_WSDK257() throws IOException, InterruptedException {
		Reporter.log("Checking For footer links in the Press page", true);
		method.CommonFooter();
}
	@Test (priority=35,description="Get support mail ids in ContactUs Page")		
	public void test_ClickContactUsInContactUsPage_WSDK258() throws InterruptedException, IOException {
		Reporter.log("Get support mail ids in ContactUs Page",true);
		method.ClickOnCompanyheaderLink();
		method.ClickOnContactUsSubheader();
		helper.DeepSleep();
		WebElement body=SeleniumHelper.driver.findElement(By.className("contact__mailwrap"));
		List<WebElement> header_allLinks = body.findElements(By.tagName("a"));
		
		for (WebElement link1 : header_allLinks) {
			 
		try {
				String mail=link1.getText();
					
		    	Reporter.log("mail ids in contactUs page="+mail, true);
		    	
					}
					catch(Exception e) {
						Reporter.log("unable to get mail ids in the ContactUs page ", true);
					}
				
					
				
				
				}
			
			}
	
	@Test (priority=36,description="Spell check in contactUs Page")		
	public void test_SpellcheckinContactUsPage_WSDK259() {
		Reporter.log("Spell check in contactUs Page", true);
		method.SpellCheck();
		try {
			List<WebElement> Heading2=SeleniumHelper.driver.findElements(By.tagName("address"));
			
		
				
			
			for(WebElement head1:Heading2)
			{
				String Data1=head1.getText();
			
			System.out.println(Data1);
				MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
				
				String Dat1 = spellChecker.doCorrection(Data1);
				if(Dat1!=Data1) {
					
					Reporter.log("Before Correction : "+Data1);
				Reporter.log("After  Correction : "+Dat1, true);
				}
				
				}
			}
			catch(Exception e) {
				Reporter.log("address not found", true);
				Reporter.log("--------------------------------------", true);
				Reporter.log("--------------------------------------", true);
				Assert.assertTrue(true);
				
			}
		
		try {
			List<WebElement> Heading=SeleniumHelper.driver.findElements(By.tagName("label"));
			
		
				
			
			for(WebElement head:Heading)
			{
				String Data=head.getText();
			
			System.out.println(Data);
				MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
				
				String Dat = spellChecker.doCorrection(Data);
				if(Dat!=Data) {
					
					Reporter.log("Before Correction : "+Data);
				Reporter.log("After  Correction : "+Dat, true);
				}
				
				}
			}
			catch(Exception e) {
				Reporter.log("label not found", true);
				Reporter.log("--------------------------------------", true);
				Reporter.log("--------------------------------------", true);
				Assert.assertTrue(true);
				
			}
				
		}	
	@Test (priority=37,description="Checking For header links in the contactUs page")
	public void test_contactUsHeader_WSDK260() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the contactUs page", true);
		method.CommonHeader();
}

	@Test (priority=38,description="Checking For footer links in the contactUs page")
	public void test_contactUsfooter_WSDK261() throws IOException, InterruptedException {
		Reporter.log("Checking For footer links in the contactUs page", true);
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
		method.ClickOnContactUsSubheader();
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
	@Test (priority=39,description="Checking ContactUs Header and Footer CSS")
	public void test_ContactUsHeaderAndFooterCSS_WSDK262() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=40,description="Getting Font-size and Font-family of all headings and paragraph in the ContactUs page")		
	public void test_GettingCSSOFHeadingAndParagraphInContactUsPage_WSDK263() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the ContactUs  page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	@Test (priority=41,description="Enter correct input in enquiryform in ContactUs Page")		
	public void test_EnterallValidDataInEnquiryDetails_WSDK264() throws Exception {
		Reporter.log("Enter correct input in enquiryform in ContactUs Page",true);
		
		helper.DeepSleep();
		
		
		
		
		
		List<WebElement> totalTextboxes=SeleniumHelper.driver.findElements(By.xpath("//input[@type='text']"));
		
		for (WebElement textbox :totalTextboxes) {
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("name")) 
					{
					textbox.sendKeys(Name);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat name textbox not found", true);
			}
			helper.Sleep();
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("company")) 
					{
					textbox.sendKeys(company);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("phone")) 
					{
					textbox.sendKeys(phoneNumber);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat contact textbox not found", true);
			}
		
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("email")) 
					{
					textbox.sendKeys(email);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("phone")) 
					{
					textbox.sendKeys(phoneNumber);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat contact textbox not found", true);
			}
		}
		
		WebElement totalarea=SeleniumHelper.driver.findElement(By.tagName("textarea"));
			
			try {
				if(totalarea.getAttribute("name").equalsIgnoreCase("enquiry")) 
					{
					totalarea.sendKeys(enquiry);
					helper.Sleep();
					helper.DeepSleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat message textbox not found", true);
			}
			WebElement captcha=SeleniumHelper.driver.findElement(By.tagName("iframe"));
			captcha.click();
			helper.DeepSleep();
			
			helper.ClickByXpath("html/body/div[1]/div/div/div[1]/div/div/section[2]/form/div[6]/div/input");
			method.ScrollUp();
			helper.DeepSleep();
			method.screenshot("enquiry");
			helper.DeepSleep();
			helper.PageRefresh();
			helper.DeepSleep();
	}
	
	@Test (priority=42,description="Click on submit without giving required field details in enquiryform in ContactUs Page")		
	public void test_WithoutEnteringDataInRequiredFieldsInEnquiryDetails_WSDK265() throws Exception {
		Reporter.log("Click on submit without giving required field details in enquiryform in ContactUs Page",true);
		helper.ClickByXpath("html/body/div[1]/div/div/div[1]/div/div/section[2]/form/div[6]/div/input");
		method.ScrollUp();
		helper.DeepSleep();
		method.screenshot("WithoutGivingRequiredFieldsInenquiryForm");
		helper.DeepSleep();
		helper.PageRefresh();
		helper.DeepSleep();
	}
	
	@Test (priority=43,description="Give more than 10 numbers in phone field in enquiryform in ContactUs Page")		
	public void test_GiveMorethan10digitsphoneNumberInEnquiryDetails_WSDK266() throws Exception {
		Reporter.log("Give more than 10 numbers in phone field in enquiryform in ContactUs Page",true);
		
		WebElement Bodylinks=SeleniumHelper.driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div/section[2]"));
		List<WebElement> totalTextboxes=Bodylinks.findElements(By.xpath("//input[@type='text']"));
		
		for (WebElement textbox :totalTextboxes) {
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("name")) 
					{
					textbox.sendKeys(Name);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat name textbox not found", true);
			}
			helper.Sleep();
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("company")) 
					{
					textbox.sendKeys(company);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("phone")) 
					{
					textbox.sendKeys(phoneNumber1);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat contact textbox not found", true);
			}
		
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("email")) 
					{
					textbox.sendKeys(email);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
		}
		WebElement totalarea=SeleniumHelper.driver.findElement(By.tagName("textarea"));
			
			try {
				if(totalarea.getAttribute("name").equalsIgnoreCase("enquiry")) 
					{
					totalarea.sendKeys(enquiry);
					helper.Sleep();
					helper.DeepSleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat message textbox not found", true);
			}
		
			WebElement captcha=Bodylinks.findElement(By.tagName("iframe"));
			captcha.click();
			helper.DeepSleep();
			try {
			helper.ClickByXpath("html/body/div[1]/div/div/div[1]/div/div/section[2]/form/div[6]/div/input");
			}
			catch(Exception e) {
				Reporter.log("unable to click on submit button", true);
			}
			method.ScrollUp();
			helper.DeepSleep();
			method.screenshot("EnterMoreThan10digitsInphoneTab");
			helper.DeepSleep();
			helper.PageRefresh();
			helper.DeepSleep();
}
	@Test (priority=44,description="Give wrong email in enquiryform in ContactUs Page")		
	public void test_GiveWrongEmailInEnquiryDetails_WSDK267() throws Exception {
		Reporter.log("Give wrong email in enquiryform in ContactUs Page",true);
		

		WebElement Bodylinks=SeleniumHelper.driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div/section[2]"));
		List<WebElement> totalTextboxes=Bodylinks.findElements(By.xpath("//input[@type='text']"));
		
		for (WebElement textbox :totalTextboxes) {
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("name")) 
					{
					textbox.sendKeys(Name);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat name textbox not found", true);
			}
			helper.Sleep();
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("company")) 
					{
					textbox.sendKeys(company);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("phone")) 
					{
					textbox.sendKeys(phoneNumber1);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat contact textbox not found", true);
			}
		
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("email")) 
					{
					textbox.sendKeys(email1);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
		}
		WebElement totalarea=SeleniumHelper.driver.findElement(By.tagName("textarea"));
			
			try {
				if(totalarea.getAttribute("name").equalsIgnoreCase("enquiry")) 
					{
					totalarea.sendKeys(enquiry);
					helper.Sleep();
					helper.DeepSleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat message textbox not found", true);
			}
		
			WebElement captcha=Bodylinks.findElement(By.tagName("iframe"));
			captcha.click();
			helper.DeepSleep();
			helper.ClickByXpath("html/body/div[1]/div/div/div[1]/div/div/section[2]/form/div[6]/div/input");
			method.ScrollUp();
			helper.DeepSleep();
			method.screenshot("GiveWrongmailId");
			helper.DeepSleep();
			helper.PageRefresh();
			helper.DeepSleep();
		}
	@Test (priority=45,description="Click on submit without clicking on captcha in enquiryform in ContactUs Page")		
	public void test_WithoutclickingCaptchaInEnquiryDetails_WSDK268() throws Exception {
		Reporter.log("Click on submit without clicking on captcha in enquiryform in ContactUs Page",true);
		method.ClickOnCompanyheaderLink();
		method.ClickOnContactUsSubheader();

		WebElement Bodylinks=SeleniumHelper.driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div/section[2]"));
		List<WebElement> totalTextboxes=Bodylinks.findElements(By.xpath("//input[@type='text']"));
		
		for (WebElement textbox :totalTextboxes) {
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("name")) 
					{
					textbox.sendKeys(Name);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat name textbox not found", true);
			}
			helper.Sleep();
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("company")) 
					{
					textbox.sendKeys(company);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("phone")) 
					{
					textbox.sendKeys(phoneNumber1);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat contact textbox not found", true);
			}
		
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("email")) 
					{
					textbox.sendKeys(email);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
		}
		WebElement totalarea=SeleniumHelper.driver.findElement(By.tagName("textarea"));
			
			try {
				if(totalarea.getAttribute("name").equalsIgnoreCase("enquiry")) 
					{
					totalarea.sendKeys(enquiry);
					helper.Sleep();
					helper.DeepSleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat message textbox not found", true);
			}
		
			
			helper.DeepSleep();
			helper.ClickByXpath("html/body/div[1]/div/div/div[1]/div/div/section[2]/form/div[6]/div/input");
			method.ScrollUp();
			
			helper.DeepSleep();
			method.screenshot("withoutClickingCaptcha");
			helper.DeepSleep();
			helper.PageRefresh();
			helper.DeepSleep();
		}
	
	@Test (priority=46,description="Enter Valid Data In News letter subscription in ContactUs Page")		
	public void test_EnterValidDataInNewslettersubscription_WSDK269() throws Exception {
		Reporter.log("Enter Valid Data In News letter subscription in ContactUs Page",true);
		method.ClickOnCompanyheaderLink();
		method.ClickOnContactUsSubheader();

		WebElement Bodylinks=SeleniumHelper.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/section/form"));
		List<WebElement> totalTextboxes=Bodylinks.findElements(By.xpath("//input[@type='text']"));
		
		for (WebElement textbox :totalTextboxes) {
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("name")) 
					{
					textbox.sendKeys(Name);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat name textbox not found", true);
			}
			helper.Sleep();
			
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("email")) 
					{
					textbox.sendKeys(email);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
		}
		
		
			
			helper.DeepSleep();
			helper.ClickByXpath("html/body/div[1]/div/div/div[2]/div/div/section/form/div[3]/div/input");
			helper.DeepSleep();
			method.screenshot("newslettersubscribtionwithvalidDetails");
			helper.DeepSleep();
			helper.PageRefresh();
			helper.DeepSleep();
		}
	
	@Test (priority=47,description="Enter InValid email details In News letter subscription in ContactUs Page")		
	public void test_EnterInValidemailInNewslettersubscription_WSDK270() throws Exception {
		Reporter.log("Enter InValid email details In News letter subscription in ContactUs Page",true);
		method.ClickOnCompanyheaderLink();
		method.ClickOnContactUsSubheader();

		WebElement Bodylinks=SeleniumHelper.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/section/form"));
		List<WebElement> totalTextboxes=Bodylinks.findElements(By.xpath("//input[@type='text']"));
		
		for (WebElement textbox :totalTextboxes) {
			 
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("name")) 
					{
					textbox.sendKeys(Name);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat name textbox not found", true);
			}
			helper.Sleep();
			
			try {
				if(textbox.getAttribute("name").equalsIgnoreCase("email")) 
					{
					textbox.sendKeys(email1);
					helper.Sleep();
					}
			}
			catch(Exception e) {
				Reporter.log("chat email textbox not found", true);
			}
			
		}
		
		
			
			helper.DeepSleep();
			helper.ClickByXpath("html/body/div[1]/div/div/div[2]/div/div/section/form/div[3]/div/input");
			helper.DeepSleep();
			method.screenshot("newslettersubscribtionwithInvalidEmailDetails");
			helper.DeepSleep();
			helper.PageRefresh();
			helper.DeepSleep();
		}
		
	@Test (priority=48,description="checking T&C in ContactUs Page")		
	public void test_CheckingTandCInContactUsPage_WSDK271() throws InterruptedException, IOException {
		Reporter.log("checking T&C in ContactUs Page",true);
		method.ClickOnCompanyheaderLink();
		method.ClickOnContactUsSubheader();

		
		WebElement body=SeleniumHelper.driver.findElement(By.className("contact__mailwrap"));
		List<WebElement> header_allLinks = body.findElements(By.tagName("span"));
		
		for (WebElement link1 : header_allLinks) {
			String mail=link1.getText();
		
		
		try {
			if(link1.getText().equalsIgnoreCase("T&C"))
				
			{
		    	Reporter.log("T&C found in mail wrap in contactUs page", true);
		    	method.ScrollSectionWise("html/body/div[1]/div/div/div[1]/div/div/section[1]/div");
		    	helper.DeepSleep();
		    	
				Actions ToolTip1 = new Actions(SeleniumHelper.driver);
			    WebElement googleLogo = SeleniumHelper.driver.findElement(By.xpath(".//*[@id='tclink']"));

			  

			    ToolTip1.clickAndHold(googleLogo).perform();
			    helper.DeepSleep();
			    helper.DeepSleep();
				WebElement para=SeleniumHelper.driver.findElement(By.xpath(".//*[@id='tclink']"));
				String load=para.getText();
		    	Reporter.log(load, true);
		    	
					}
			
		}
					catch(Exception e) {
						Reporter.log("unable to find T&C in mail wrap in contactUs page ", true);
						
					}
				
					
				
				
				}
			
		}
}
