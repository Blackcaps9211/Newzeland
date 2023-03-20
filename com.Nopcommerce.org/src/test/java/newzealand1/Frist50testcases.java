package newzealand1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frist50testcases {

	public static void main(String[] args) {
		
	// Lunch the web browser	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	// implicit implicitly wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		
		driver.get("https://admin-demo.nopcommerce.com");
		
	boolean	val = driver.findElement(By.id("Email")).isDisplayed();
		if(val==true) {
			
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		}
		else {
			System.out.println("Please enter valid URL");
		}
		
	// Alert a1= driver.switchTo().alert();
	// a1.accept();
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Dashboard"))));
	// boolean start = driver.findElement(By.xpath("(//*[@class='card-title'])[1]")).isDisplayed();
	
	//	driver.findElement(By.xpath("\"(//button[@type='button'])[2]\"")).click();
		 
		 
		 
		 boolean Npnews = driver.findElement(By.xpath("(//*[@class='card-title'])[2]")).isDisplayed();

		if(Npnews==true) { 
		 driver.findElement(By.xpath("(//*[@class='card-title'])[2]")).getText();
		 
		}
		
		// driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.className("float-left")).click();
		
	Actions action = new Actions(driver);
	
	action.moveToElement(driver.findElement(By.xpath("(//*[text()='Product'])[1]"))).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 

		
		
		
		
		
		//boolean	 cs = driver.findElement(By.xpath("(//button[@type='button'])[3]")).isEnabled();

//if(cs==false) {
//	
//	driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
//	
//}
//
//boolean order = driver.findElement(By.xpath("(//button[@type='button'])[4]")).isEnabled();
//
// if (order==true) {
//	
//	driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
//}
	// driver.findElement(By.xpath("(//*[contains(text(),'More info')])[1]")).click();	
		 
		 
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
