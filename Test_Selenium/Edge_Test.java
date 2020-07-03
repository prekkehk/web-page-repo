package Test_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","D:\\Sel\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("prekkehari@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'identifier')]")).sendKeys("ener my email id");
		//driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/span/span")).click();
		driver.findElement(By.xpath("//span[contains{@class,'RveJvd snByac')]")).click();
		
		
	}

}
