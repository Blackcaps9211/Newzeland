package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTopicsOnebyOne {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin");
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='Log in']")).click();	
		
		
//	String currentwindowname = driver.getWindowHandle();    { By using of getWindowHandle() we are getting the
//	System.out.println(currentwindowname);                 Name of the current window  return type is String }
		
		
driver.findElement(By.xpath("//*[contains(text(),'Help')]")).click();
Thread.sleep(2000);
driver.findElement(By.className("nav-link")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[contains(text(),' Premium support services')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
