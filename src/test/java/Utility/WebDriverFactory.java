package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

	public static WebDriver createDriver(){
		String webdriver = System.getProperty("browser", "firefox");

		switch (webdriver) {
			
			case "firefox":
			System.setProperty("webdriver.gecko.driver","C:\\Users\\pdc4-training.pdc4\\Desktop\\Selenium Drivers\\geckodriver-v0.21.0-win64 (1)\\geckodriver.exe\\");
			return new FirefoxDriver();

			case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc4-training.pdc4\\Desktop\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
			return new ChromeDriver();

			case "ie":
			System.setProperty("webdriver.ie.driver", "C:\\Users\\pdc4-training.pdc4\\Desktop\\Selenium Drivers\\IEDriverServer_Win32_3.13.0 (1)\\IEDriverServer.exe");
			return new InternetExplorerDriver();

			default:
					throw new RuntimeException("Unsupported webdriver:" + webdriver);

			}

		}

	}
