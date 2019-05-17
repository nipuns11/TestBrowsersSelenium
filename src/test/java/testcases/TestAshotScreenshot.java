package testcases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestAshotScreenshot {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		// Testing web table 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebElement ele = driver.findElement(By.xpath(xpathExpression));
		AShot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000));
		//ImageIO.write(screenshot.getImage(), "jpg" ,  new File(".\\screenshot"));
}
}
