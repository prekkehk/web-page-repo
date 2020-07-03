package Test_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		///driver.get("https://google.com");
		driver.get("https://www.udemy.com");
		driver.findElement(By.cssSelector("button[data-purpose='header-login']")).click();
	}
}
