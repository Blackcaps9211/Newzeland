package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login2 {

	WebDriver driver;

	@BeforeTest
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		Reporter.log("chromedriver SetUp is done");
	}

	@Test
      
	public void nopLogin() {

		driver.findElement(By.id("Email")).clear();
		
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		Reporter.log("Login Button Clicked Successfully");
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
		
		Reporter.log("Chrome Browser Closed Successfully");
		
	}

}


