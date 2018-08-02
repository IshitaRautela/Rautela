package orgExample.PNCSlenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LoginPageObject;

public class LoginNewTours {
	private WebDriver driver;
	@Test	(dataProvider="usernameandpassword", description = "This test case will test ")
	public void login(String username, String password ) {
	
		
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("user123");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("passwor123");
		driver.findElement(By.name("login")).click();
		//driver.navigate().back();
		
		
	}
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc4-training.pdc4\\Desktop\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.navigate().to("http://newtours.demoaut.com");
	  PageFactory.initElements(driver, LoginPageObject.class);
  }

  @DataProvider (name= "usernameandpassword")
	public String[][] credentials() {
	  return new String [][] {
		  new String[] {"user123", "password123" },
		  new String[] {"invalidUN", "invalidPW" }
	  };
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
