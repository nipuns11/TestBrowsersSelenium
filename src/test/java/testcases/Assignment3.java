package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Testing web table
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("/html/body/table/tbody/tr/td/div/table/tbody/tr/td/form/table/tbody/tr[2]/td/input[1]"))
				.click();
		//login for handling image captcha using if loop using split operator 
		String text = driver.findElement(By.cssSelector("#mathq2")).getText();
		String[] elements = text.split(" ");
		
		int result = 0;

		if (elements[1].equals("+")) {

			result = Integer.valueOf(elements[0]) + Integer.valueOf(elements[2]);

		} else if (elements[1].equals("-")) {

			result = Integer.valueOf(elements[0]) - Integer.valueOf(elements[2]);

		} else if (elements[1].equals("*")) {

			result = Integer.valueOf(elements[0]) * Integer.valueOf(elements[2]);

		} else {

			result = Integer.valueOf(elements[0]) / Integer.valueOf(elements[2]);

		}

		System.out.println("Result:" + result);
		driver.findElement(By.xpath("//input[@id='mathuserans2']")).sendKeys(String.valueOf(result));

		driver.findElement(By.xpath("//div[@class='homesprite vot']")).click();
		driver.close();
		driver.quit();

	}
}
