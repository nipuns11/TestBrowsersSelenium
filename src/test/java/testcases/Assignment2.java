package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				// Testing web table 
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				WebDriverManager.chromedriver().setup();
				driver.get("http://qa.way2automation.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[1]/input")).sendKeys("Test");
				driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[2]/input")).sendKeys("1234");
				driver.findElement(By.cssSelector(".ajaxsubmit > fieldset:nth-child(7) > input:nth-child(2)")).sendKeys("abc@gmail.com");
				driver.findElement(By.cssSelector("div.bottom:nth-child(12) > div:nth-child(2) > input:nth-child(1)")).click();
		
				driver.close();
				driver.quit();
				
				
		}

	}


