package newzealand1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle_and_getWndowHandeles {

	public static void main(String[] args) throws Exception {

		// launch the web browser
		
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
				
				driver.findElement(By.xpath("//*[contains(text(),'Help')]")).click();
				Thread.sleep(2000);
				
//				String currentwindowname = driver.getWindowHandle();
//				System.out.println(currentwindowname);
				
			    driver.findElement(By.xpath("//*[contains(text(),'Documentation')]")).click();
			    Thread.sleep(3000);
				driver.findElement(By.xpath("//*[contains(text(),' Community forums')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[contains(text(),'Premium support services')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[contains(text(),' Solution partners')]")).click();
				Thread.sleep(3000);
				
				Set<String>allwindows=driver.getWindowHandles();
				int count = allwindows.size();
				System.out.println(count);
				
				Set<String> alleindownames = driver.getWindowHandles();
				System.out.println(alleindownames);
					
		
		
		
		
	}

}
