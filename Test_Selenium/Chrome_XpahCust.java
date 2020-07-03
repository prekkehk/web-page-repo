package Test_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_XpahCust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.kroger.com/");
		driver.manage().timeouts().implicitlyWait(28, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='WelcomeDesktop-welcome']")).click();
		// needto open the menu items from the sign in
	}

}
