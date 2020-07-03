package Test_Selenium;

		import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.By;
		import org.openqa.selenium.Point;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

		public class Browser_Commands {

		public static void main(String[] args)throws InterruptedException{

		     // TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Sel\\geckodriver-v0.26.0-win64\\geckodriver.exe"    
		 WebDriver driver = new FirefoxDriver();

		     // Wait For Page To Load
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		     // Using get command redirect to url
		     driver.get("https://stqatools.com/");

		     // Get current url Title &amp; store into string
		     String Title = driver.getTitle();

		     // Get Text of particular element and save into string
		     String Button_Text = driver.findElement(By.id("Button")).getText();

		     // Get Existing url and save into string
		     String Current_url = driver.getCurrentUrl();

		     // Get Existing page source and save into string
		     String Page_Source = driver.getPageSource();                       

		     // Maximize the Browser
		     driver.manage().window().maximize();

		     // Minimize the Browser
		     driver.manage().window().setPosition(new Point(0, -1000));

		     // C the browser or page currently which is having the focus.
		     driver.close();

		     // Shut down or destroy the web driver instance (Close all the windows)
		     driver.quit();   
		  }
		}
	}

}
