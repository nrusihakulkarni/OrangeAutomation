package ComOrangeHRMBasaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static WebDriver driver;
	static String title;

	public static void lunchBrowser(String Browser, String url, String excepted) {

		switch (Browser) {
		
		case "Chrome": {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.navigate().to(url);
			title = driver.getTitle();
			 System.out.println(title);
			break;
		}

		case "Mozilla": {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.navigate().to(url);
			title = driver.getTitle();
			break;
		}
		
		case "Edge": {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.navigate().to(url);
			title = driver.getTitle();
			break;
		}
		
		default:
			throw new IllegalStateException("Unexpected value: " + Browser);
		}

		//ValidatePage.ContaintsOf(title, excepted);
	
		
	}

}
