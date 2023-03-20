package newzealand1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example4 {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
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
		
		 driver.findElement(By.linkText("Discounts")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.className("icon-collapse")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("SearchStartDate")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("SearchStartDate")).sendKeys("khivcc");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.linkText("Add new")).click();
		 

		 
		 
		 
		 
		 
		   
		 
		 
		 
		 
		 
		 
		
		// driver.findElement(By.linkText("Affiliates")).click();
	
		//Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Add new")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("Active")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("Address_FirstName")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("Address_FirstName")).sendKeys("veeru");
		//Thread.sleep(4000);
		
		//driver.findElement(By.id("Address_FirstName")).clear();
		
		
	
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
