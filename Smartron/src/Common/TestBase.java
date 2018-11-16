package Common;

import java.io.File;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;





public class TestBase {
	
	protected static SeleniumHelper helper = new SeleniumHelper();
	

	protected static MethodsCalling method=new MethodsCalling();
	public static WebDriver driver;
	protected static Variables var=new Variables();
	
	@BeforeClass
	public void setUp() throws Exception {
		StaticSetup();
	}
	
	//	to perform default operation (login) through static method
	public static void StaticSetup() throws InterruptedException
	{
		
			
			helper.init("Chrome");
	Thread.sleep(3000);
	
			
		} 
	
	
	@AfterClass
	public void tearDown() throws Exception {
   helper.quit();
	}
}
