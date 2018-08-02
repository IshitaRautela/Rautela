package orgExample.PNCSlenium;

import org.testng.annotations.Test;

import Pages.LoginPageObject;
import Utility.WebDriverFactory;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;

	@Test(priority=1)
  public void register() {
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Ishita");
		driver.findElement(By.name("lastName")).sendKeys("Rautela");
		driver.findElement(By.name("phone")).sendKeys("123456790");
		driver.findElement(By.id("userName")).sendKeys("ishita@yahoo.com");
		//driver.findElement(By.name("address1")).sendKeys("House no. 57");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("House no. 57");
		driver.findElement(By.name("city")).sendKeys("Chandigarh");
		driver.findElement(By.name("state")).sendKeys("punjab");
		driver.findElement(By.name("postalCode")).sendKeys("289614");
		
		//Select country = new Select (driver.findElement(By.name("country")));
		//country.selectByVisibleText("INDIA");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("user123");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("confirmPassword")).sendKeys("password123");
		driver.findElement(By.name("register")).click();
		
		
  }
	
	
	
  @BeforeTest
  public void beforeTest() {
	  driver = WebDriverFactory.createDriver();
	  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\pdc4-training.pdc4\\Desktop\\Selenium Drivers\\geckodriver-v0.21.0-win64 (1)\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://newtours.demoaut.com//");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  PageFactory.initElements(driver,LoginPageObject.class);
  }

  @AfterTest
  public void afterTest() {
  }
  
  @Test(priority=2)
  public void login() {
	  driver.findElement(By.linkText("sign-in")).click();
	  
	  
	  
  }

}
