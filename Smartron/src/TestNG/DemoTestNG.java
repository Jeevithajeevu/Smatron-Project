package TestNG;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;


import Common.MethodsCalling;
import Common.SeleniumHelper;
import Common.TestBase;

	

public class DemoTestNG {
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.gecko.driver", "/home/ubuntu2/geckodriver");
	  
	  DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	  FirefoxOptions options = new FirefoxOptions();
		
	  options.addPreference("log", "{level: trace}");
	  capabilities.setCapability("marionette", false);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://www.smartron.com");
		driver.quit();
		
		
  }
}
