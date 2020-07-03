package Test_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Facebook_CustomisedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Sel\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("email id is entered");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("enter password");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
}
}
