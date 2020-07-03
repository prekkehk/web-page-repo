package Test_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxGetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Sel\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		
		
		//Store the ID of the original window

		String originalWindow = driver.getWindowHandle();
		System.out.println(originalWindow);
		//Check we don't have other windows open already
		assert driver.getWindowHandles().size() == 1;
		
		
		//Click the link which opens in a new window
		//driver.findElement(By.linkText("new window")).click();
	
		
	}

}
