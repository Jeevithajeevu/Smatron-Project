package TestScripts;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Common.MySpellChecker;
import Common.SeleniumHelper;
import Common.TestBase;
import Common.Variables;

public class StudentOffer extends TestBase{
	
	
	Random r=new Random();
	String Name="test"+r.nextInt(10);
	String email="test"+r.nextInt()+"@gmail.com";
	String email1="test"+r.nextInt();
	long phone1=(long)(Math.random()*100000+3333000000000000L);
	String phoneNumber1=Long.toString(phone1);
	long phone=(long)(Math.random()*9999999999L);
	String phoneNumber=Long.toString(phone);
	String enquiry="about"+r.nextInt(100);
	String company="smartron"+r.nextInt(20);
	
	
	@Test (priority=1,description="Spell check in StudentOffer Page")		
	public void test_SpellcheckinStudentOfferPage_WSDK272() throws InterruptedException, IOException {
		Reporter.log("Spell check in StudentOffer Page", true);
		WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
		List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
		
		for (WebElement link1 : header_allLinks) {
			 
			try {
				if(link1.getAttribute("href").equalsIgnoreCase(Variables.StudentOfferhref)) 
					{
					
					try {
					link1.click();
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
	
		helper.DeepSleep();
		method.SpellCheck();
		
		WebElement Mainpage=SeleniumHelper.driver.findElement(By.xpath("html/body/div[1]/div/div/div/section[2]/ul[1]"));
		List<WebElement>liList=Mainpage.findElements(By.tagName("li")); 
		for(int i=0;i<liList.size();i++)
		{ 
			String labels=liList.get(i).getText();
			MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
			System.out.println(labels);
			String Dat1 = spellChecker.doCorrection(labels);
			if(Dat1!=labels) {
				
				Reporter.log("Before Correction : "+labels,true);
			Reporter.log("After  Correction : "+Dat1, true);
			}
}
		WebElement Mainpage1=SeleniumHelper.driver.findElement(By.xpath("html/body/div[1]/div/div/div/section[2]/ul[2]"));
		List<WebElement>liList1=Mainpage1.findElements(By.tagName("li")); 
		for(int i=0;i<liList1.size();i++)
		{ 
			String labels1=liList1.get(i).getText();
			MySpellChecker spellChecker = new MySpellChecker(Variables.SpellCheckDictionaryPath);
			System.out.println(labels1);
			String Dat11 = spellChecker.doCorrection(labels1);
			if(Dat11!=labels1) {
				
				Reporter.log("Before Correction : "+labels1,true);
			Reporter.log("After  Correction : "+Dat11, true);
			}
}
	}

	@Test (priority=2,description="Enter correct input StudentOffer page")		
	public void test_EnterallValidDataStudentOfferPage_WSDK273() throws Exception {
		
		WebElement captcha=SeleniumHelper.driver.findElement(By.tagName("iframe"));
		captcha.click();
List<WebElement> totalTextboxes=SeleniumHelper.driver.findElements(By.tagName("input"));
		
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
				if(textbox.getAttribute("name").equalsIgnoreCase("college")) 
					{
					textbox.sendKeys(company);
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
		
		try {
		method.dropdown(".//*[@id='form-select__state']/select","Karnataka");
	}
	
	catch(Exception e) {
		Reporter.log("unable to select state from dropdown", true);
	}
		
		
		
		try {
		method.dropdown(".//*[@id='form-select__city']/select","Bangalore North");
	}
	
	catch(Exception e) {
		Reporter.log("unable to select city from dropdown", true);
	}	
	
		

	List<WebElement> fileupload=SeleniumHelper.driver.findElements(By.xpath("//input[@type='file']"));
	
	for (WebElement file :fileupload) {
		try {
if(file.getAttribute("name").equalsIgnoreCase("govtPhotoId")) {
	method.Scrollquarter();
	helper.DeepSleep();
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[7]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

		}
catch(Exception e) {
	Reporter.log("unable to upload govtPhotoId", true);
}
	}
		for (WebElement file1 :fileupload) {
try {
if(file1.getAttribute("name").equalsIgnoreCase("collPhotoId")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[8]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

}

catch(Exception e) {
Reporter.log("unable to upload collPhotoId", true);
}
		}
		
		for (WebElement file2 :fileupload) {
try {
if(file2.getAttribute("name").equalsIgnoreCase("marksheet")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[9]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

}

catch(Exception e) {
Reporter.log("unable to upload marksheet", true);
}
		}
for (WebElement file3 :fileupload) {
try {
if(file3.getAttribute("name").equalsIgnoreCase("admissionLetter")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[10]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");

}
break;
}

catch(Exception e) {
Reporter.log("unable to upload admissionLetter", true);
}
}
	

	try {	
		helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[12]/div[2]/div[1]");
		helper.DeepSleep();
		}
catch(Exception e) {
Reporter.log("unable to check termsAndConditions", true);
}
	


			
			helper.DeepSleep();
			//helper.ClickByXpath(".//*[@id='rc-imageselect-target']/table/tbody/tr[2]/td[2]/div/div[1]/img");
			helper.DeepSleep();
			helper.ClickByXpath(".//*[@id='loader-student']");
			helper.DeepSleep();
			helper.DeepSleep();
			method.screenshot("StudentOfferRightDetails");
			helper.DeepSleep();
			helper.PageRefresh();
			helper.DeepSleep();
	

	}				
			
	@Test (priority=3,description="Check for mandatory fields in StudentOffer Page")		
	public void test_mandatoryFieldsInStudentOffer_WSDK274() throws Exception {
		
		

	try {	
		helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[12]/div[2]/div[1]");
		helper.DeepSleep();
		}
catch(Exception e) {
Reporter.log("unable to check termsAndConditions", true);
}
	
	WebElement captcha=SeleniumHelper.driver.findElement(By.tagName("iframe"));
	captcha.click();
helper.DeepSleep();
			//helper.ClickByXpath(".//*[@id='rc-imageselect-target']/table/tbody/tr[2]/td[2]/div/div[1]/img");
			helper.DeepSleep();
			helper.ClickByXpath(".//*[@id='loader-student']");
			helper.DeepSleep();
			helper.DeepSleep();
			method.screenshot("MandatoryFieldsInStudentOfferPage");
			helper.DeepSleep();
			helper.PageRefresh();
			helper.DeepSleep();
	

	}	
	
	@Test (priority=4,description="Give invalid mail id in StudentOffer Page")		
	public void test_GiveInvalidMailIdinStudentOffer_WSDK275() throws Exception {
List<WebElement> totalTextboxes=SeleniumHelper.driver.findElements(By.tagName("input"));
		
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
				if(textbox.getAttribute("name").equalsIgnoreCase("college")) 
					{
					textbox.sendKeys(company);
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
		}
		
		try {
		method.dropdown(".//*[@id='form-select__state']/select","Karnataka");
	}
	
	catch(Exception e) {
		Reporter.log("unable to select state from dropdown", true);
	}
		
		
		
		try {
		method.dropdown(".//*[@id='form-select__city']/select","Bangalore North");
	}
	
	catch(Exception e) {
		Reporter.log("unable to select city from dropdown", true);
	}	
	
		WebElement captcha=SeleniumHelper.driver.findElement(By.tagName("iframe"));
		captcha.click();

	List<WebElement> fileupload=SeleniumHelper.driver.findElements(By.xpath("//input[@type='file']"));
	
	for (WebElement file :fileupload) {
		try {
if(file.getAttribute("name").equalsIgnoreCase("govtPhotoId")) {
	method.Scrollquarter();
	helper.DeepSleep();
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[7]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

		}
catch(Exception e) {
	Reporter.log("unable to upload govtPhotoId", true);
}
	}
		for (WebElement file1 :fileupload) {
try {
if(file1.getAttribute("name").equalsIgnoreCase("collPhotoId")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[8]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

}

catch(Exception e) {
Reporter.log("unable to upload collPhotoId", true);
}
		}
		
		for (WebElement file2 :fileupload) {
try {
if(file2.getAttribute("name").equalsIgnoreCase("marksheet")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[9]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

}

catch(Exception e) {
Reporter.log("unable to upload marksheet", true);
}
		}
for (WebElement file3 :fileupload) {
try {
if(file3.getAttribute("name").equalsIgnoreCase("admissionLetter")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[10]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");

}
break;
}

catch(Exception e) {
Reporter.log("unable to upload admissionLetter", true);
}
}
	

	try {	
		helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[12]/div[2]/div[1]");
		helper.DeepSleep();
		}
catch(Exception e) {
Reporter.log("unable to check termsAndConditions", true);
}
	


			
			helper.DeepSleep();
			//helper.ClickByXpath(".//*[@id='rc-imageselect-target']/table/tbody/tr[2]/td[2]/div/div[1]/img");
			helper.DeepSleep();
			helper.ClickByXpath(".//*[@id='loader-student']");
			helper.DeepSleep();
			helper.DeepSleep();
			method.screenshot("InvalidMailIdInStudentOffer");
			helper.DeepSleep();
			helper.PageRefresh();
			helper.DeepSleep();
	
	}
	
	@Test (priority=5,description="Give more than 10 numbers in contact details in StudentOffer Page")		
	public void test_GiveMoreThan10NumbersInContactDetailsinStudentOffer_WSDK276() throws Exception {
List<WebElement> totalTextboxes=SeleniumHelper.driver.findElements(By.tagName("input"));
		
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
				if(textbox.getAttribute("name").equalsIgnoreCase("college")) 
					{
					textbox.sendKeys(company);
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
		}
		
		try {
		method.dropdown(".//*[@id='form-select__state']/select","Karnataka");
	}
	
	catch(Exception e) {
		Reporter.log("unable to select state from dropdown", true);
	}
		
		
		
		try {
		method.dropdown(".//*[@id='form-select__city']/select","Bangalore North");
	}
	
	catch(Exception e) {
		Reporter.log("unable to select city from dropdown", true);
	}	
	
		WebElement captcha=SeleniumHelper.driver.findElement(By.tagName("iframe"));
		captcha.click();

	List<WebElement> fileupload=SeleniumHelper.driver.findElements(By.xpath("//input[@type='file']"));
	
	for (WebElement file :fileupload) {
		try {
if(file.getAttribute("name").equalsIgnoreCase("govtPhotoId")) {
	method.Scrollquarter();
	helper.DeepSleep();
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[7]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

		}
catch(Exception e) {
	Reporter.log("unable to upload govtPhotoId", true);
}
	}
		for (WebElement file1 :fileupload) {
try {
if(file1.getAttribute("name").equalsIgnoreCase("collPhotoId")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[8]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

}

catch(Exception e) {
Reporter.log("unable to upload collPhotoId", true);
}
		}
		
		for (WebElement file2 :fileupload) {
try {
if(file2.getAttribute("name").equalsIgnoreCase("marksheet")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[9]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

}

catch(Exception e) {
Reporter.log("unable to upload marksheet", true);
}
		}
for (WebElement file3 :fileupload) {
try {
if(file3.getAttribute("name").equalsIgnoreCase("admissionLetter")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[10]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");

}
break;
}

catch(Exception e) {
Reporter.log("unable to upload admissionLetter", true);
}
}
	

	try {	
		helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[12]/div[2]/div[1]");
		helper.DeepSleep();
		}
catch(Exception e) {
Reporter.log("unable to check termsAndConditions", true);
}
	


			
			helper.DeepSleep();
			//helper.ClickByXpath(".//*[@id='rc-imageselect-target']/table/tbody/tr[2]/td[2]/div/div[1]/img");
			helper.DeepSleep();
			helper.ClickByXpath(".//*[@id='loader-student']");
			helper.DeepSleep();
			helper.DeepSleep();
			method.screenshot("InvalidContactDetailsInStudentOffer");
			helper.DeepSleep();
			helper.PageRefresh();
			helper.DeepSleep();
	
		
	}
	
	@Test (priority=6,description="Click on submit without accepting terms and condition in StudentOffer Page")		
	public void test_WithoutAcceptingtcinStudentOffer_WSDK277() throws Exception {
List<WebElement> totalTextboxes=SeleniumHelper.driver.findElements(By.tagName("input"));
		
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
				if(textbox.getAttribute("name").equalsIgnoreCase("college")) 
					{
					textbox.sendKeys(company);
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
		
		try {
		method.dropdown(".//*[@id='form-select__state']/select","Karnataka");
	}
	
	catch(Exception e) {
		Reporter.log("unable to select state from dropdown", true);
	}
		
		
		
		try {
		method.dropdown(".//*[@id='form-select__city']/select","Bangalore North");
	}
	
	catch(Exception e) {
		Reporter.log("unable to select city from dropdown", true);
	}	
	
		WebElement captcha=SeleniumHelper.driver.findElement(By.tagName("iframe"));
		captcha.click();

	List<WebElement> fileupload=SeleniumHelper.driver.findElements(By.xpath("//input[@type='file']"));
	
	for (WebElement file :fileupload) {
		try {
if(file.getAttribute("name").equalsIgnoreCase("govtPhotoId")) {
	method.Scrollquarter();
	helper.DeepSleep();
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[7]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

		}
catch(Exception e) {
	Reporter.log("unable to upload govtPhotoId", true);
}
	}
		for (WebElement file1 :fileupload) {
try {
if(file1.getAttribute("name").equalsIgnoreCase("collPhotoId")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[8]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

}

catch(Exception e) {
Reporter.log("unable to upload collPhotoId", true);
}
		}
		
		for (WebElement file2 :fileupload) {
try {
if(file2.getAttribute("name").equalsIgnoreCase("marksheet")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[9]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

}

catch(Exception e) {
Reporter.log("unable to upload marksheet", true);
}
		}
for (WebElement file3 :fileupload) {
try {
if(file3.getAttribute("name").equalsIgnoreCase("admissionLetter")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[10]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");

}
break;
}

catch(Exception e) {
Reporter.log("unable to upload admissionLetter", true);
}
}
	

helper.DeepSleep();
helper.ClickByXpath(".//*[@id='loader-student']");
helper.DeepSleep();
method.screenshot("WithoutAcceptingtcinStudentOffer");
			helper.DeepSleep();
			helper.PageRefresh();
			helper.DeepSleep();
	
	
		
	}
	
	@Test (priority=7,description="Click on submit without verifying captcha in StudentOffer Page")		
	public void test_WithoutVerifyingCaptchainStudentOffer_WSDK278() throws Exception {
List<WebElement> totalTextboxes=SeleniumHelper.driver.findElements(By.tagName("input"));
		
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
				if(textbox.getAttribute("name").equalsIgnoreCase("college")) 
					{
					textbox.sendKeys(company);
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
		
		try {
		method.dropdown(".//*[@id='form-select__state']/select","Karnataka");
	}
	
	catch(Exception e) {
		Reporter.log("unable to select state from dropdown", true);
	}
		
		
		
		try {
		method.dropdown(".//*[@id='form-select__city']/select","Bangalore North");
	}
	
	catch(Exception e) {
		Reporter.log("unable to select city from dropdown", true);
	}	
	
		

	List<WebElement> fileupload=SeleniumHelper.driver.findElements(By.xpath("//input[@type='file']"));
	
	for (WebElement file :fileupload) {
		try {
if(file.getAttribute("name").equalsIgnoreCase("govtPhotoId")) {
	method.Scrollquarter();
	helper.DeepSleep();
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[7]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

		}
catch(Exception e) {
	Reporter.log("unable to upload govtPhotoId", true);
}
	}
		for (WebElement file1 :fileupload) {
try {
if(file1.getAttribute("name").equalsIgnoreCase("collPhotoId")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[8]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

}

catch(Exception e) {
Reporter.log("unable to upload collPhotoId", true);
}
		}
		
		for (WebElement file2 :fileupload) {
try {
if(file2.getAttribute("name").equalsIgnoreCase("marksheet")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[9]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");
	
}

}

catch(Exception e) {
Reporter.log("unable to upload marksheet", true);
}
		}
for (WebElement file3 :fileupload) {
try {
if(file3.getAttribute("name").equalsIgnoreCase("admissionLetter")) {
	helper.ClickByXpath("html/body/div[1]/div/div/div/section[1]/form/div[10]/div[2]/div[1]");
	method.UploadImage("/home/ubuntu2/Pictures/Screenshot.png");

}
break;
}

catch(Exception e) {
Reporter.log("unable to upload admissionLetter", true);
}
}
	

helper.DeepSleep();
helper.ClickByXpath(".//*[@id='loader-student']");
helper.DeepSleep();
method.screenshot("WithoutVerifyingCaptchainStudentOffer");
			helper.DeepSleep();
			helper.PageRefresh();
			helper.DeepSleep();
	
	
		
	}
	@Test (priority=8,description="Getting Background Images in the StudentOffer page")		
	public void test_GettingBackgroundImageinStudentOfferpage_WSDK279() {
		
		Reporter.log("Getting Background Images in the StudentOffer page", true);
		
	
WebElement bodylinks=SeleniumHelper.driver.findElement(By.tagName("section"));
		
		String data=bodylinks.getCssValue("background-image");
		
		
		
		if(data.startsWith("url")) {
			Reporter.log("Background image of StudentOffer page:"+" "+data, true);
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
				Reporter.log("Unable to check background image loading in StudentOffer page",true);
				
			}
			
		
		}
		
	else{
			Reporter.log("Background image not found in StudentOffer page", true);
			
		}
}
	@Test (priority=9,description="Checking StudentOffer Header and Footer CSS")
	public void test_StudentOfferHeaderAndFooterCSS_WSDK280() throws InterruptedException, IOException {
		Reporter.log("Checking For Header and Footer CSS",true);
		
		method.HeaderAndFooterCSS();
	}
	
	@Test (priority=10,description="Getting Font-size and Font-family of all headings and paragraph in the StudentOffer page")		
	public void test_GettingCSSOFHeadingAndParagraphInStudentOfferPage_WSDK281() {
		Reporter.log("Getting Font-size and Font-family of all headings and paragraph in the StudentOffer page", true);
		
		method.getCSSofHeadingandParagraph();
	}
	
	@Test (priority=11,description="Checking For header links in the StudentOffer page")
	public void test_StudentOfferHeader_WSDK282() throws IOException, InterruptedException {
		Reporter.log("Checking For header links in the StudentOffer page", true);
		method.CommonHeader();
		
}
	@Test (priority=12,description="Checking For Footer links in the StudentOffer page")
	public void test_StudentOfferFooter_WSDK283() throws IOException, InterruptedException {
		Reporter.log("Checking For Footer links in the StudentOffer page", true);
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
		WebElement header=SeleniumHelper.driver.findElement(By.className(Variables.Footer));
		List<WebElement> header_allLinks = header.findElements(By.tagName("a"));
		
		for (WebElement link1 : header_allLinks) {
			 
			try {
				if(link1.getAttribute("href").equalsIgnoreCase(Variables.StudentOfferhref)) 
					{
					
					try {
					link1.click();
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
}
