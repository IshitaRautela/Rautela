package orgExample.PNCSlenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	private WebDriver driver;
	@Test(description="This thst case will test the login feature")
	public void login() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"header\"]/div/header/div/div[4]/div[2]/span/i[2]"))));
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/header/div/div[4]/div[2]/span/i[2]")).click();
		driver.findElement(By.name("login[username]")).clear();
		driver.findElement(By.name("login[username]")).sendKeys("ishu.rautela@gmail.com");
		driver.findElement(By.name("login[password]")).clear();
		driver.findElement(By.name("login[password]")).sendKeys("stalkbuylove");
		driver.findElement(By.name("send")).click();
	}
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc4-training.pdc4\\Desktop\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://www.stalkbuylove.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
