package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOne {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			// Testing web table 
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			driver.get("https://www.google.ca");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("way2automation");
			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println("Printing links ");
			System.out.println(links.size());
			for (int i = 0; i < links.size(); i++) {
				System.out.println(links.get(i).getText());
			}

			driver.close();
			driver.quit();
			
			
	}

}
