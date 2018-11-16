package TestScripts;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Common.MySpellChecker;
import Common.SeleniumHelper;
import Common.TestBase;
import Common.Variables;

public class IotPage extends TestBase {
	
	@Test (priority=1,description="Checking For Watchdemovideo under in the IoTPage")
	public void test_WatchDemoVideoInIoTPage_WSDK160() throws IOException, InterruptedException, AWTException {
	
	Reporter.log("Checking For Watchdemovideo under in the IoTPage",true);	
	method.ClickOnIoTHeader();
	
	List<WebElement> allLinks = SeleniumHelper.driver.findElements(By.tagName("a"));
	
	for (WebElement link : allLinks)
		
	{
		
		String reference=link.getAttribute("href");
		try {
	if(reference.equalsIgnoreCase(Variables.WatchDemoVideoLink))
	{
		Reporter.log("watch Demo video link was found in the IoTPage", true);
		try {
		link.click();
		
		Reporter.log("watch demo video source"+" "+link.getAttribute("href"),true);
		
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
		Reporter.log("Watch demo video link not found in IoT page",true);
		Assert.assertTrue(false);
	}

	}
	}

	@Test (priority=2,description="Checking For gifImage In IoT page ")
	public void test_GifImageInIoTPage_WSDK161() throws IOException, InterruptedException, AWTException {
	
	Reporter.log("Checking For gifImage In IoT page ",true);	
	
	List<WebElement> allLinks = SeleniumHelper.driver.findElements(By.tagName("img"));
	
	for (WebElement link : allLinks)
		
	{
	String reference=link.getAttribute("src");
		try {
	if(reference.equalsIgnoreCase("https://www.smartron.com/images/tronx/tronX_mov_.gif"))
	{
		Reporter.log("Gif image was found in the IoTPage and its source found is"+" "+reference, true);
		try {
			
			
			SeleniumHelper.driver.get(reference);
			helper.Sleep();
			
			method.Check_imageLoadedOrNot("xhtml:html/xhtml:body/xhtml:img");
			helper.NavigateBack();
			
		}
			catch(Exception e) {
				Reporter.log("unable to check gif image loaded or not",true);
				Assert.assertTrue(false);
			}
			break;
	}
			}
		
		catch(Exception e) {
			Reporter.log("unable to finf gif image",true);
			Assert.assertTrue(false);
		}
				
			
		}

	
}
	@Test (priority=3,description="Spell check in IoT Page")		
	public void test_SpellcheckinIoTPage_WSDK162() {
		Reporter.log("Spell check in IoT Page",true);	
		try {
			WebElement Heading2=SeleniumHelper.driver.findElement(By.className("iot-section-main"));
			String Data1=Heading2.getText();
			
			
				MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
				
				String Dat1 = spellChecker.doCorrection(Data1);
				if(Dat1!=Data1) {
					
				Reporter.log("Before Correction : "+Data1,true);
				Reporter.log("After  Correction : "+Dat1, true);
				}
				
				}
			
			catch(Exception e) {
				Reporter.log("--------------------------------------", true);
				Reporter.log("--------------------------------------", true);
				Assert.assertTrue(true);
				
			}
				
			
		}
	@Test (priority=4,description="Checking Header and Footer CSS in Iot page")
	public void test_HeaderAndFooterCSSInIotPage_WSDK163() throws InterruptedException, IOException {
		Reporter.log("Checking Header and Footer CSS in IoT page",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=5,description="Checking For header links in the IoT page")
	public void test_TphoneOverviewHeader_WSDK164() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the IoT page", true);
		method.test_Header_WSDK007();
		method.test_Header_WSDK008();
		method.test_Header_WSDK009();
		method.test_Header_WSDK010();
		method.test_Header_WSDK011();
		method.test_Header_WSDK012();
		method.test_Header_WSDK013();
		method.test_Header_WSDK014();
		method.ClickOnIoTHeader();
		method.test_Header_WSDK015();
		method.test_Header_WSDK016();
}
	@Test (priority=6,description="Checking For Footer links in the IoT page")
	public void test_TphoneOverviewFooter_WSDK165() throws IOException, InterruptedException {
		Reporter.log("Checking For Footer links in the IoT page", true);
		method.CommonFooter();
	}
	
	@Test (priority=7,description="Checking For tronxHome image In IoT Home page ")
	public void test_tronxHomeImageInIoTHomePage_WSDK166() throws IOException, InterruptedException, AWTException {
		method.ClickOnIoTHeader();
		method.ClickOnIotHome();
	Reporter.log("Checking For tronxHome image In IoT Home page",true);	
	
	List<WebElement> allLinks = SeleniumHelper.driver.findElements(By.tagName("img"));
	
	for (WebElement link : allLinks)
		
	{
	String reference=link.getAttribute("src");
		try {
	if(reference.equalsIgnoreCase("https://www.smartron.com/images/tronx/tronX%20Home.svg"))
	{
		Reporter.log("tronxHome image was found in the IoT Home page and its source found is"+" "+reference, true);
		try {
			
			
			SeleniumHelper.driver.get(reference);
			String width=SeleniumHelper.driver.findElement(By.cssSelector("#Layer_1 > rect")).getAttribute("width");
			Reporter.log("width of the tronxHome image is"+" "+width,true);
			String Height=SeleniumHelper.driver.findElement(By.cssSelector("#Layer_1 > rect")).getAttribute("height");
			Reporter.log("Height of the tronxHome image is"+" "+Height,true);
			helper.NavigateBack();
			
		}
			catch(Exception e) {
				Reporter.log("unable to check tronxHome image loaded or not",true);
				Assert.assertTrue(false);
			}
			break;
	}
			}
		
		catch(Exception e) {
			Reporter.log("unable to find gif tronxHome image in Iot Page",true);
			Assert.assertTrue(false);
		}
				
			
		}
	
}
	@Test (priority=8,description="Spell check in IoT Home Page")		
	public void test_SpellcheckinIoTHomePage_WSDK167() {
		Reporter.log("Spell check in IoT Home Page",true);	
		try {
			WebElement Heading2=SeleniumHelper.driver.findElement(By.className("iot-section"));
			String Data1=Heading2.getText();
			
			
				MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
				
				String Dat1 = spellChecker.doCorrection(Data1);
				if(Dat1!=Data1) {
					
				Reporter.log("Before Correction : "+Data1,true);
				Reporter.log("After  Correction : "+Dat1, true);
				}
				
				}
			
			catch(Exception e) {
				Reporter.log("--------------------------------------", true);
				Reporter.log("--------------------------------------", true);
				Assert.assertTrue(true);
				
			}
				
			
		}
	@Test (priority=9,description="Checking Header and Footer CSS in IotHome page")
	public void test_HeaderAndFooterCSSInIotHomePage_WSDK168() throws InterruptedException, IOException {
		Reporter.log("Checking Header and Footer CSS in IoTHome page",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=10,description="Checking For header links in the IoT Home page")
	public void test_IoTHomepageHeader_WSDK169() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the IoT Home page", true);
		method.CommonHeader();
}
	@Test (priority=11,description="Checking For Footer links in the IoT page")
	public void test_IoTHomepageFooter_WSDK170() throws IOException, InterruptedException {
		Reporter.log("Checking For Footer links in the IoT Home page", true);
		method.CommonFooter();
	}
	@Test (priority=12,description="Checking For tronxHealth image In IoTHealth page ")
	public void test_tronxHealthImageInIoTHealthPage_WSDK171() throws IOException, InterruptedException, AWTException {
		method.ClickOnIoTHeader();
		method.ClickOnIotHealth();
	Reporter.log("Checking For tronxHealth image In IoTHealth page",true);	
	
	List<WebElement> allLinks = SeleniumHelper.driver.findElements(By.tagName("img"));
	
	for (WebElement link : allLinks)
		
	{
	String reference=link.getAttribute("src");
		try {
	if(reference.equalsIgnoreCase("https://www.smartron.com/images/tronx/tronX%20Health.svg"))
	{
		Reporter.log("tronxHealth image was found in the IoTHealth page and its source found is"+" "+reference, true);
		try {
			
			
			SeleniumHelper.driver.get(reference);
			String width=SeleniumHelper.driver.findElement(By.cssSelector("#Layer_1 > rect")).getAttribute("width");
			Reporter.log("width of the tronxHealth image is"+" "+width,true);
			String Height=SeleniumHelper.driver.findElement(By.cssSelector("#Layer_1 > rect")).getAttribute("height");
			Reporter.log("Height of the tronxHealth image is"+" "+Height,true);
			helper.NavigateBack();
			
		}
			catch(Exception e) {
				Reporter.log("unable to check tronxHealth image loaded or not",true);
				Assert.assertTrue(false);
			}
			break;
	}
			}
		
		catch(Exception e) {
			Reporter.log("unable to find gif tronxHealth image in Iot Page",true);
			Assert.assertTrue(false);
		}
				
			
		}
	
}
	@Test (priority=13,description="Spell check in IoTHealth Page")		
	public void test_SpellcheckinIoTHealthPage_WSDK172() {
		Reporter.log("Spell check in IoTHealth Page",true);	
		try {
			WebElement Heading2=SeleniumHelper.driver.findElement(By.className("iot-section"));
			String Data1=Heading2.getText();
			
			
				MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
				
				String Dat1 = spellChecker.doCorrection(Data1);
				if(Dat1!=Data1) {
					
				Reporter.log("Before Correction : "+Data1,true);
				Reporter.log("After  Correction : "+Dat1, true);
				}
				
				}
			
			catch(Exception e) {
				Reporter.log("--------------------------------------", true);
				Reporter.log("--------------------------------------", true);
				Assert.assertTrue(true);
				
			}
				
			
		}
	
	@Test (priority=14,description="Checking Header and Footer CSS in IoTHealth page")
	public void test_HeaderAndFooterCSSInIoTHealthPage_WSDK173() throws InterruptedException, IOException {
		Reporter.log("Checking Header and Footer CSS in Tphone Specification page",true);
		
		method.HeaderAndFooterCSS();
	}
	@Test (priority=15,description="Checking For header links in the IoTHealth page")
	public void test_IoTHealthpageHeader_WSDK174() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the IoTHealth page", true);
		method.CommonHeader();
}
	@Test (priority=16,description="Checking For Footer links in the IoT page")
	public void test_IoTHealthpageFooter_WSDK175() throws IOException, InterruptedException {
		Reporter.log("Checking For Footer links in the IoTHealth page", true);
		method.CommonFooter();
	}
	@Test (priority=17,description="Checking For tronxEDU image In IoTEDU page ")
	public void test_tronxEDUImageInIoTEDUPage_WSDK176() throws IOException, InterruptedException, AWTException {
		method.ClickOnIoTHeader();
		method.ClickOnIotEDU();
	Reporter.log("Checking For tronxEDU image In IoTEDU page",true);	
	
	List<WebElement> allLinks = SeleniumHelper.driver.findElements(By.tagName("img"));
	
	for (WebElement link : allLinks)
		
	{
	String reference=link.getAttribute("src");
		try {
	if(reference.equalsIgnoreCase("https://www.smartron.com/images/tronx/tronX%20education.svg"))
	{
		Reporter.log("tronxEDU image was found in the IoTEDU page and its source found is"+" "+reference, true);
		try {
			
			
			SeleniumHelper.driver.get(reference);
			
			helper.NavigateBack();
			
		}
			catch(Exception e) {
				Reporter.log("unable to check tronxEDU image loaded or not",true);
				Assert.assertTrue(false);
			}
			break;
	}
			}
		
		catch(Exception e) {
			Reporter.log("unable to find gif tronxEDU image in Iot Page",true);
			Assert.assertTrue(false);
		}
				
			
		}
	
}
	@Test (priority=18,description="Spell check in IoTEDU Page")		
	public void test_SpellcheckinIoTEDUPage_WSDK177() {
		Reporter.log("Spell check in IoTEDU Page",true);	
		try {
			WebElement Heading2=SeleniumHelper.driver.findElement(By.className("iot-section"));
			String Data1=Heading2.getText();
			
			
				MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
				
				String Dat1 = spellChecker.doCorrection(Data1);
				if(Dat1!=Data1) {
					
				Reporter.log("Before Correction : "+Data1,true);
				Reporter.log("After  Correction : "+Dat1, true);
				}
				
				}
			
			catch(Exception e) {
				Reporter.log("--------------------------------------", true);
				Reporter.log("--------------------------------------", true);
				Assert.assertTrue(true);
				
			}
				
			
		}
	@Test (priority=19,description="Checking Header and Footer CSS in IoTEDU page")
	public void test_HeaderAndFooterCSSInIoTEDUPage_WSDK178() throws InterruptedException, IOException {
		Reporter.log("Checking Header and Footer CSS in Tphone Specification page",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=20,description="Checking For header links in the IoTEDU page")
	public void test_IoTEDUpageHeader_WSDK179() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the IoTEDU page", true);
		method.CommonHeader();
}
	@Test (priority=21,description="Checking For Footer links in the IoT page")
	public void test_IoTEDUpageFooter_WSDK180() throws IOException, InterruptedException {
		Reporter.log("Checking For Footer links in the IoTEDU page", true);
		method.CommonFooter();
	}
	
	@Test (priority=22,description="Checking For tronxInfra image In IoTInfra page ")
	public void test_tronxInfraImageInIoTInfraPage_WSDK181() throws IOException, InterruptedException, AWTException {
		method.ClickOnIoTHeader();
		method.ClickOnIotINFRA();
	Reporter.log("Checking For tronxInfra image In IoTInfra page",true);	
	
	List<WebElement> allLinks = SeleniumHelper.driver.findElements(By.tagName("img"));
	
	for (WebElement link : allLinks)
		
	{
	String reference=link.getAttribute("src");
		try {
	if(reference.equalsIgnoreCase("https://www.smartron.com/images/tronx/tronX%20Infra.svg"))
	{
		Reporter.log("tronxInfra image was found in the IoTInfra page and its source found is"+" "+reference, true);
		try {
			
			
			SeleniumHelper.driver.get(reference);
			String width=SeleniumHelper.driver.findElement(By.cssSelector("#Layer_1 > rect")).getAttribute("width");
			Reporter.log("width of the tronxInfra image is"+" "+width,true);
			String Height=SeleniumHelper.driver.findElement(By.cssSelector("#Layer_1 > rect")).getAttribute("height");
			Reporter.log("Height of the tronxInfra image is"+" "+Height,true);
			helper.NavigateBack();
			
		}
			catch(Exception e) {
				Reporter.log("unable to check tronxInfra image loaded or not",true);
				Assert.assertTrue(false);
			}
			break;
	}
			}
		
		catch(Exception e) {
			Reporter.log("unable to find gif tronxInfra image in Iot Page",true);
			Assert.assertTrue(false);
		}
				
			
		}
	
}
	@Test (priority=23,description="Spell check in IoTInfra Page")		
	public void test_SpellcheckinIoTInfraPage_WSDK182() {
		Reporter.log("Spell check in IoTInfra Page",true);	
		try {
			WebElement Heading2=SeleniumHelper.driver.findElement(By.className("iot-section"));
			String Data1=Heading2.getText();
			
			
				MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
				
				String Dat1 = spellChecker.doCorrection(Data1);
				if(Dat1!=Data1) {
					
				Reporter.log("Before Correction : "+Data1,true);
				Reporter.log("After  Correction : "+Dat1, true);
				}
				
				}
			
			catch(Exception e) {
				Reporter.log("--------------------------------------", true);
				Reporter.log("--------------------------------------", true);
				Assert.assertTrue(true);
				
			}
				
			
		}
	@Test (priority=24,description="Checking Header and Footer CSS in IoTInfra page")
	public void test_HeaderAndFooterCSSInIoTInfraPage_WSDK183() throws InterruptedException, IOException {
		Reporter.log("Checking Header and Footer CSS in Tphone Specification page",true);
		
		method.HeaderAndFooterCSS();
	}
	@Test (priority=25,description="Checking For header links in the IoTInfra page")
	public void test_IoTInfrapageHeader_WSDK184() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the IoTInfra page", true);
		method.CommonHeader();
}
	@Test (priority=26,description="Checking For Footer links in the IoT page")
	public void test_IoTInfrapageFooter_WSDK185() throws IOException, InterruptedException {
		Reporter.log("Checking For Footer links in the IoTInfra page", true);
		method.CommonFooter();
	}
	
	@Test (priority=27,description="Checking For tronxEnterprise image In IoTEnterprise page ")
	public void test_tronxEnterpriseImageInIoTEnterprisePage_WSDK186() throws IOException, InterruptedException, AWTException {
		method.ClickOnIoTHeader();
		method.ClickOnIotEnterprise();
	Reporter.log("Checking For tronxEnterprise image In IoTEnterprise page",true);	
	
	List<WebElement> allLinks = SeleniumHelper.driver.findElements(By.tagName("img"));
	
	for (WebElement link : allLinks)
		
	{
	String reference=link.getAttribute("src");
		try {
	if(reference.equalsIgnoreCase("https://www.smartron.com/images/tronx/tronX%20enterprise.svg"))
	{
		Reporter.log("tronxEnterprise image was found in the IoTEnterprise page and its source found is"+" "+reference, true);
		try {
			
			
			SeleniumHelper.driver.get(reference);
			
			helper.NavigateBack();
			
		}
			catch(Exception e) {
				Reporter.log("unable to check tronxEnterprise image loaded or not",true);
				Assert.assertTrue(false);
			}
			break;
	}
			}
		
		catch(Exception e) {
			Reporter.log("unable to find gif tronxEnterprise image in Iot Page",true);
			Assert.assertTrue(false);
		}
				
			
		}
	
}
	@Test (priority=28,description="Spell check in IoTEnterprise Page")		
	public void test_SpellcheckinIoTEnterprisePage_WSDK187() {
		Reporter.log("Spell check in IoTEnterprise Page",true);	
		try {
			WebElement Heading2=SeleniumHelper.driver.findElement(By.className("iot-section"));
			String Data1=Heading2.getText();
			
			
				MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
				
				String Dat1 = spellChecker.doCorrection(Data1);
				if(Dat1!=Data1) {
					
				Reporter.log("Before Correction : "+Data1,true);
				Reporter.log("After  Correction : "+Dat1, true);
				}
				
				}
			
			catch(Exception e) {
				Reporter.log("--------------------------------------", true);
				Reporter.log("--------------------------------------", true);
				Assert.assertTrue(true);
				
			}
				
			
		}
	@Test (priority=29,description="Checking Header and Footer CSS in Tphone Specification page")
	public void test_HeaderAndFooterCSSInTphoneSpecPage_WSDK188() throws InterruptedException, IOException {
		Reporter.log("Checking Header and Footer CSS in Tphone Specification page",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=30,description="Checking For header links in the IoTEnterprise page")
	public void test_IoTEnterprisepageHeader_WSDK189() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the IoTEnterprise page", true);
		method.CommonHeader();
}
	@Test (priority=31,description="Checking For Footer links in the IoT page")
	public void test_IoTEnterprisepageFooter_WSDK190() throws IOException, InterruptedException {
		Reporter.log("Checking For Footer links in the IoTEnterprise page", true);
		method.CommonFooter();
	}
			}

