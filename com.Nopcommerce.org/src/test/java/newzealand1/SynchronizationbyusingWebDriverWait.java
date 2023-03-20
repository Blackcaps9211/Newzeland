package newzealand1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizationbyusingWebDriverWait {

	public static void main(String[] args) {
	
		

		// launch the chrome driver 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// using explicit dynamic synchronization
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// using implicit dynamic synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// maximize the browser
		driver.manage().window().maximize();

		// open nopcommrace url in opened browser
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		// using explicit dynamic synchronization
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));

		driver.findElement(By.id("Email")).clear();

		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.id("Password")).clear();

		driver.findElement(By.id("Password")).sendKeys("admin");

		driver.findElement(By.xpath("//*[text()='Log in']")).click();

		// using explicit dynamic synchronization
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()=' Dashboard']"))));

		driver.findElement(By.xpath("(//*[contains(text(),'Sales')])[1]")).click();

		// using explicit dynamic synchronization
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(),' Orders')]"))));

		driver.findElement(By.xpath("//*[contains(text(),' Orders')]")).click();

		// using explicit dynamic synchronization
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath("(//*[contains(text(),'View')])[3]"))));

		// using explicit dynamic synchronization
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("(//*[contains(text(),'View')])[3]"))));

		driver.findElement(By.xpath("(//*[contains(text(),'View')])[3]")).click();
				
				
			
		
		
		
		

	}

}
