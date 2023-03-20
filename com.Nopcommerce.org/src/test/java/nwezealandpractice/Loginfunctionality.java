package nwezealandpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginfunctionality {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));

		driver.findElement(By.id("Email")).clear();

		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.id("Password")).clear();

		driver.findElement(By.id("Password")).sendKeys("admin");

		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		
		
		
		 // =  driver.findElement(By.id("admin@yourstore.com"));
		
		
		
		
		
		
		
		
	}

}
