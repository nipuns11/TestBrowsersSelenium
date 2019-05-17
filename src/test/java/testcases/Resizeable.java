package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizeable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// resizeable
		WebElement resize = driver.findElement(By.xpath("/html/body/div/div[3]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 400,400).perform();
		
		// drag and drop
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement Dragg = driver.findElement(By.id("draggable"));
		WebElement Dropp = driver.findElement(By.id("droppable"));
		action.dragAndDrop(Dragg, Dropp).perform();
			
		// right click on the image
		driver.get("https://en.wikipedia.org/wiki/Life_(2017_film)");
		WebElement img = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div/table[1]/tbody/tr[2]/td/a/img"));
		Actions action2 = new Actions(driver);
		action2.contextClick(img).perform();
			
		// Keyboard events
		driver.get("https://en.wikipedia.org/wiki/Life_(2017_film)");
		Actions keybev = new Actions(driver);
		keybev.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
		keybev.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		// composite actions are done using build().perform()
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).click();
		keybev.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		
		//JS alerts 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		driver.quit();
}
}
