package Test_Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserdriverCurrentDriverURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://google.com");
		driver.navigate().to("https://oracle.com");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		
		
		
		}

}
