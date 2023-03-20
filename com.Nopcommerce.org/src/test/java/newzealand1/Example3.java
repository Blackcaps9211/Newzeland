package newzealand1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example3 {

	public static void main(String[] args) throws Exception {
	
		//browser setup
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FDiscount%2FList");
	Thread.sleep(6000);
	
	driver.findElement(By.tagName("input")).clear();
	Thread.sleep(2000);
	
	
	driver.findElement(By.tagName("input")).sendKeys("admin@yourstore.com");
	Thread.sleep(2000);
	
	driver.findElement(By.tagName("input")).clear();
	Thread.sleep(2000);
	
	driver.findElement(By.tagName("input")).sendKeys("admin");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[text()='Log in']")).click();
	
	

	}

}
