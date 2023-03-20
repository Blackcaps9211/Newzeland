package nwezealandpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Syntaxpractice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
	
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Password"))));
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("content-header"))));
		 driver.findElement(By.className("float-left")).click();
		
		 Actions action = new Actions(driver);
		
		 action.moveToElement(driver.findElement(By.xpath("(//*[text()='Product'])[1]"))).perform();
	      driver.findElement(By.xpath("(//span[@class='navigation-top-menu-label'])[1]")).click();
		 // action.moveToElement(driver.findElement(By.className("navigation-top-menu-label"))).click();
		
//		driver.findElement(By.xpath("(//*[@class='fas fa-plus']/parent::button)[2]")).click();
//		
//		driver.findElement(By.className("small-box-footer")).click();
//		WebElement pay = driver.findElement(By.id("PaymentMethodSystemName"));
//		
//		Select selection = new Select(pay);
//		
//		selection.selectByIndex(2);
	      
	 //     driver.navigate().back();
	//      driver.navigate().back();
		
		

	}

}
