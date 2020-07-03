package Test_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\Sel\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("this is my email"); // Xpath
		
		driver.findElement(By.name("pw")).sendKeys("this is password");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		//String x= driver.findElement(By.cssSelector("#error")).getText();
		//System.out.println(x);
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}	
	}


