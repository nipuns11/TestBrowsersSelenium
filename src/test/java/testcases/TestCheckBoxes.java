/**
 * 
 */
package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author shar0301
 *
 */
public class TestCheckBoxes {

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		// Testing Checkboxes
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement block = driver
				.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		List<WebElement> checkboxes = block.findElements(By.name("sports"));
		System.out.println(checkboxes.size());

		for (WebElement checkbox : checkboxes) {
			checkbox.click();
		}
		driver.close();
	}
}

//driver.findElement(By.cssSelector("div.display:nth-child(9) > input:nth-child(2)")).click();
//driver.findElement(By.cssSelector("div.display:nth-child(9) > input:nth-child(4)")).click();
//driver.findElement(By.cssSelector("div.display:nth-child(9) > input:nth-child(6)")).click();
//driver.findElement(By.cssSelector("div.display:nth-child(9) > input:nth-child(8)")).click();

//for(int i=2; i<=8; i += 2)
//{
//	driver.findElement(By.cssSelector("div.display:nth-child(9) > input:nth-child("+i+")")).click();
//System.out.println("div.display:nth-child(9) > input:nth-child("+i+")");
//
//}

//int i = 2;
//while (true) {
//	driver.findElement(By.cssSelector("div.display:nth-child(9) > input:nth-child(" + i + ")")).click();
//	i = i + 2;
//}

//public static boolean isElementPresent(By by) {
//	int size = driver.findElements(by).size();
//	if (size == 0) {
//		return false;
//	} else {
//		return true;
//	}
//}
