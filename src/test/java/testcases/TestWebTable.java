package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTable {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		// Testing web table 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// number of rows and columns 
		List<WebElement> rowNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		System.out.println(rowNum.size());
		List<WebElement> colNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println(colNum.size());
		// get entire info from web table and print web table
		for(int rows=1; rows<=rowNum.size() ; rows++)
		{
			for(int cols=1; cols<colNum.size(); cols++ )
			{
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+cols+"]")).getText()+" ");
			}
		}
		driver.close();
		driver.quit();
}
}