package Test_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QACLICK_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com");
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();
	}

}
