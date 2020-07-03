package Test_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Firefox_SCSS_XPATH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Sel\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://google.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("div.gb_h:nth-child(1) > a:nth-child(1)")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".header__nav--ltr > li:nth-child(2) > a:nth-child(1)")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'identifierId\']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String x= driver.getCurrentUrl();
		//if (x == "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin") {
			//Works until the sign in only
		//driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("xx@gmail.com");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("div.PrDSKc:nth-child(3) > button:nth-child(1)")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\'yDmH0d\']")).sendKeys("enter the user email id");
		//}
	}
	
}
