package Test_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatePasswordField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\Sel\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("inputtext")).sendKeys("hello pw");
		//driver.findElement(By.id("email")).sendKeys("this is my first email id");
		
		//driver.findElement(By.name("pass")).sendKeys("this is my first password");
		//driver.findElement(By.linkText("Forgot account?")).click();
	}

}
