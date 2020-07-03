package Test_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathCSSS_Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\Sel\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://rediff.com");
	driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
	//Regular Expression for xpath
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("enter email id");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("input#password")).sendKeys("pasword entered");
	
	
	driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
	System.out.println(driver.findElement(By.xpath("//div[contains(@class,'div_login_error')]")).getText());

}

}

