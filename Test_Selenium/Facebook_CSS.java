package Test_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://facebook.com/");
		driver.manage().timeouts().implicitlyWait(28, TimeUnit.SECONDS);

		// driver.findElement(By.cssSelector("input[name='email']")).sendKeys("enter
		// email id");
		// driver.findElement(By.cssSelector("input#email")).sendKeys("enter email id
		// sir");
		driver.findElement(By.cssSelector("#email")).sendKeys("enter email id sir");
		// driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("password");
		// driver.findElement(By.cssSelector("input#pass")).sendKeys("password");
		driver.findElement(By.cssSelector("#pass")).sendKeys("password");

		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		// needto open the menu items from the sign in
	}
}
