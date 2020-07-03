/**
 * 
 */
package Test_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Owner
 *
 */
public class xPATH_CUSTID {

	/*
	  customised xpath identification
	 */

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//div[@class='gb_F gb_na'/div[1]/div[2]/div/a")).click();
	
		
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("search for BDD cucumber books");
	driver.findElement(By.xpath("//form[@id='tsf']/div[2]/div[1]/div[3]/center/input")).click();
	
			
	}

}
