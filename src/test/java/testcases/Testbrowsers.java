package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbrowsers  {

	public static String browser = "chrome";
	public static WebDriver driver;// web driver interface to reuse driver interface for different browsers 

	public static void main(String[] args)
	{
		//latest selenium jar file 
		//latest browser version 
		// latest browser executable file 
		//dessired capabilites for browser properties 
		// dependency tool and build tool - Maven 
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\NipunSharma\\Downloads\\automation\\seleniumjar\\geckodriver.exe");
		// updated pom xml with webdriver manager no need to download executables 
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			//webdriver interface https://seleniumhq.github.io/selenium/docs/api/java/
			driver = new ChromeDriver();
			
			
		}else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			//webdriver interface https://seleniumhq.github.io/selenium/docs/api/java/
			driver = new FirefoxDriver();
			
		}
		
		else if(browser.equals("ie")) {
		WebDriverManager.iedriver().setup();
		//webdriver interface https://seleniumhq.github.io/selenium/docs/api/java/
		driver = new InternetExplorerDriver();
	}
	
		driver.get("http://nippun.blogspot.com/");
		
		driver.findElement(By.cssSelector("div.date-outer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(5) > a:nth-child(1)")).click();;
		
		
		WebElement Lifetitle = driver.findElement(By.cssSelector("h1.title"));// importance of webelement in maniuplation 
		Lifetitle.click();
		
		driver.close();//current browser windows 
		driver.quit();//current browser windows plus all realted browsers 
		
	}

}
