package testcases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbrowsers {

	public static String browser = "chrome";
	public static WebDriver driver;// web driver interface to reuse driver interface for different browsers

	public static void main(String[] args) {

		// latest selenium jar file
		// latest browser version
		// latest browser executable file
		// dessired capabilites for browser properties
		// dependency tool and build tool - Maven
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\NipunSharma\\Downloads\\automation\\seleniumjar\\geckodriver.exe");
		// updated pom xml with webdriver manager no need to download executables

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			// webdriver interface https://seleniumhq.github.io/selenium/docs/api/java/
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			// webdriver interface https://seleniumhq.github.io/selenium/docs/api/java/
			driver = new FirefoxDriver();

		}

		else if (browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			// webdriver interface https://seleniumhq.github.io/selenium/docs/api/java/
			driver = new InternetExplorerDriver();
		}
		// fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).withMessage("User defined TimeOut with seconds")
				.ignoring(NoSuchElementException.class);
		driver.get("http://nippun.blogspot.com/");
		// maximize a window
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector(
				"div.date-outer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(5) > a:nth-child(1)"))
				.click();
		// implicity wait for 3 seconds for the page to load till the time the element
		// is found
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1.title"))).click();

		// WebElement Lifetitle = driver.findElement(By.cssSelector("h1.title"));//
		// importance of webelement in maniuplation
		//
		// Lifetitle.click();

		// explicit wait is used to tell the Web Driver to wait for certain conditions
		// (Expected Conditions) or the maximum time exceeded before throwing an
		// "ElementNotVisibleException" exception.

		driver.close();// current browser windows
		driver.quit();// current browser windows plus all realted browsers

	}

}
