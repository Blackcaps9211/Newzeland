package nwezealandpractice;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nzpractice {



	public static void main(String[] args) {
		
		
		// launch the browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("username"))));
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("password"))));
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		
//  1.Handleling java script popups (or) Alerts by using alert interface 
// 2. To handle the popups frist we have to create a alert interface and jump into that alert by using swithTo();
		
		Alert popup = driver.switchTo().alert();
		
		System.out.println(popup.getText());  // we can get the text of the alert
		
		popup.accept();
		
		
		
		
		
		
		
		
		
		

	
	}

}
