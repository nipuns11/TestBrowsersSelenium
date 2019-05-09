package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		WebDriverManager.firefoxdriver().setup();
		driver.get("http://www.google.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("way2automation");
		WebDriverWait wait = new WebDriverWait(driver,5);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[2]/div[2]/div/center/input[1]"))).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/a/h3")).click();
		WebElement menu = driver.findElement(By.xpath("/html/body/div[4]/div/header/div[3]/div/nav/div[2]/ul/li[8]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		driver.findElement(By.xpath("/html/body/div[4]/div/header/div[3]/div/nav/div[2]/ul/li[8]/ul/li[2]/a")).click();
		
		
		
	}

}
