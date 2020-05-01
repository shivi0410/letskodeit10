package mainFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class MainDriver {

	public static WebDriver driver;
	
	/*public MainDriver(WebDriver driver) {

		this.driver = driver;
	
	}
*/

	public void openBrowser(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHIVI\\Downloads\\NEW Files\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			driver.get("https://learn.letskodeit.com");
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", "C:\\Users\\SHIVI\\Downloads\\NEW Files\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SHIVI\\Downloads\\NEW Files\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		}
		else {
			System.out.println("Invalid Selection");
		}

	}

}