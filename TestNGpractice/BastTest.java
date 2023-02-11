package TestNGpractice;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.SWITCH;
import org.apache.commons.io.test.TestUtils;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

public class BastTest 
{
 public static WebDriver driver;
 public static Properties confiProperties;
 public static Properties ORPproperties;
 public static FileInputStream fis;
 public static WebDriverWait wait;
 public static java.util.logging.Logger Log =java.util.logging.Logger.getLogger("devpinoyLogger");
 protected static TestUtils testUtils = new TestutUtils();
 private String []path;
 @BeforeClass
 @Parameters({"browser"})
 public void setup(String browser)
 {
	 if(driver ==null) 
	 {
	 
		 String driverpath = testUtils.getdriverpath(browser);
		 confiProperties = new Properties();
		 Loadfile("Config.properties",confiProperties);
		 ORPproperties = new Properties();
		 Loadfile("objectRepository.properties",ORPproperties);
		 switch (browser.toLowerCase()) 
		 {
			 case"chrome":
			 System.setProperty("webdriver.chrome.driver", driverpath);	
			 DesiredCapabilities dc = new DesiredCapabilities();
		     dc.setCapability("marionite", false);
		     ChromeOptions  options = new ChromeOptions();
		     options.merge(options);
			 
		     driver = new ChromeDriver();
			 Log.info("chrome driver configured");
			 break;
			 case "edge":
				 System.setProperty("C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\msedgedriver.exe", driverpath);
				 driver =new EdgeDriver();
				 Log.info("edge driver configured");
				 break;	 
		 }		 
				 
				 driver.get(confiProperties.getProperty("testsiturl"));
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(Integer.parseInt(confiProperties.getProperty("implicit.wait")),TimeUnit.SECONDS);
				 wait = new WebDriverWait(driver,10);
				 Log.info("driver successfully created");
				 
		 }
	 }
 @AfterSuite
 public void teardown()
 {
	 if(driver!=null)
	 {
		 driver.quit();
	 }
	 
 }
 
 
      
private void Loadfile(String string, Properties oRPproperties2) {
	// TODO Auto-generated method stub
	
}
public By getselcetor(String string) {
	// TODO Auto-generated method stub
	return null;
}
public By getselector(String string) {
	// TODO Auto-generated method stub
	return null;
}
}
