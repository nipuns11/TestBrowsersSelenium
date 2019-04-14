package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {

		// Testing Dropdown list
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.findElement(By.id("searchLanguage")).sendKeys("Galego"); old method
		// Select class is better
		WebElement Dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(Dropdown);
		select.selectByValue("hi");
		select.getAllSelectedOptions();

		// isdisplyed() for display and isenabled() for enabled ,isElementpresent is
		// also avaliable
		boolean display = driver
				.findElement(By.cssSelector(
						"div.other-project:nth-child(1) > a:nth-child(1) > div:nth-child(2) > span:nth-child(1)"))
				.isDisplayed();
		System.out.println(display);

		// getting all the tagname in a list for weblement
		List<WebElement> options = Dropdown.findElements(By.tagName("option"));
		// printing the size of the dropdown
		System.out.println(options.size());
		// printing the name of the 8th element
		System.out.println(options.get(7).getText());

		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}

		// printing all the links on the block
		WebElement driver2 = driver.findElement(By.id("searchLanguage"));
		List<WebElement> links = driver2.findElements(By.tagName("a"));
		System.out.println("Printing links ");
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}

		driver.close();
		driver.quit();
	}

}
