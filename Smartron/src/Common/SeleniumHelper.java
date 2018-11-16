package Common;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import com.smartron.website.Variables;



public class SeleniumHelper {
	public static WebDriver driver;
	
public void init(String Browser) throws InterruptedException {
		
		if(Browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(Variables.WebsiteURL);
			Sleep();
					}
		else if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver=new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.get(Variables.WebsiteURL);
			Sleep();
		}
		else if(Browser.equalsIgnoreCase("Opera")) {
			
			System.setProperty("webdriver.opera.driver", "/usr/local/bin/operadriver");
		  OperaOptions options = new OperaOptions();
		    options.setBinary(new File("/usr/bin/opera"));
		     driver = new OperaDriver(options);
		    driver.manage().window().maximize();

		driver.get(Variables.WebsiteURL);
			Sleep();
		}
		else {
			System.out.println("Input Browser not existed in list");
		}
		
		
	}
	
	public void Sleep() {
		try {
			Thread.sleep(1000);
		} catch (Exception ex) {

		}
	}
	public void DeepSleep() throws InterruptedException
	{
		Thread.sleep(4000);
	}
	public void quit() {
		driver.quit();
	}
	public void PageRefresh() {
		SeleniumHelper.driver.navigate().refresh();
	}
	public void GetURL(String path) {
		driver.get(path);
	}
	
	public String GetValueByID(String id) {
		return driver.findElement(By.id(id)).getText();
	}

	public String GetValueByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}

	public String getCssValue(String id, String attr) {
		return driver.findElement(By.id(id)).getCssValue(attr);
	}
	public void ClickByID(String id) {
		driver.findElement(By.id(id)).click();
		
	}
	public void ClickByClassName(String id) {
		driver.findElement(By.className(id)).click();
		
	}

	public void ClickByPartialText(String id) {
		driver.findElement(By.partialLinkText(id)).click();
		
	}

	public void ClickByLinkText(String id) {
		driver.findElement(By.linkText(id)).click();
		
	}

	public void ClickByCSSSelector(String id) {
		driver.findElement(By.cssSelector(id)).click();
		
	}

	public void ClickByXpath(String id) {

		driver.findElement(By.xpath(id)).click();
		
	}
	public void SetValueByID(String id, String data) {
		driver.findElement(By.id(id)).sendKeys(data);
	}

	public void SetValueByname(String id, String data) {
		driver.findElement(By.id(id)).sendKeys(data);
		
	}

	public void SetValueByXpath(String id, String data) {
		driver.findElement(By.id(id)).sendKeys(data);
		
	
}
	public String GetTextByXpath(String id) {
		return driver.findElement(By.xpath(id)).getText();
	}
	public String GetAttributeByXpath(String id,String attr) {
		return driver.findElement(By.xpath(id)).getAttribute(attr);
		
	}
	public void NavigateBack() {
		SeleniumHelper.driver.navigate().back();
	}
}