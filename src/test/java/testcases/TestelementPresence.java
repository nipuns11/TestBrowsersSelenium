package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestelementPresence {
	public static WebDriver driver;

	// method to find element presence,using for Xpath
	public static boolean isElementPresent(String locator) {
		try {
			driver.findElement(By.xpath(locator));
			return true;
		} catch (Throwable T) {
			return false;
		}
		// another method
//		int size = driver.findElements(By.xpath(locator)).size();
//		if(size==0) {
//			return false;
//		}else {
//			return true;
//		}

	}

	public static void main(String[] args) {

		// Testing element presence

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// is Enabled and isSelected and isDisplayed

		System.out.println(isElementPresent("/html/body/div[6]/div[3]/div[2]/a/div[2]/span[1]"));

		driver.close();
		driver.quit();
	}
}
