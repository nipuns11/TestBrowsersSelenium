package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbrowsers {
	
	public static void main(String[] args)
	{
		//latest selenium jar file 
		//latest browser version 
		// latest browser executable file 
		//dessired capabilites for browser properties 
		// dependency tool and build tool - Maven 
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\NipunSharma\\Downloads\\automation\\seleniumjar\\geckodriver.exe");
		// updated pom xml with webdriver manager no need to download executables 
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://nippun.blogspot.com/");
		String title = driver.getTitle();
		
		driver.close();
		
		
	}
	

}
