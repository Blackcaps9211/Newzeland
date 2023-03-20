package newzealand1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example5 {

	public static void main(String[] args) throws Exception {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().setSize(null);
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2F");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Promotions")).click();
		Thread.sleep(2000);
		
		// driver.findElement(By.linkText("Discounts")).click();
		
		 driver.findElement(By.linkText("Affiliates")).click();
		 Thread.sleep(6000);
		 
		// driver.navigate().back();
		// Thread.sleep(4000);
		 
		// driver.navigate().forward();
		// Thread.sleep(4000);
		 
		// driver.navigate().refresh();
		// Thread.sleep(4000);
		 
		// driver.manage().window().minimize();
		 //Thread.sleep(3000);
		 
		// driver.manage().window().maximize();
		 
		 
		 System.out.println(driver.getTitle());
		 System.out.println();
		 
		 System.out.println(driver.getCurrentUrl());
		 System.out.println();

		 System.out.println();

		 
		 
		 
		 
		 
		
	

	}

}
