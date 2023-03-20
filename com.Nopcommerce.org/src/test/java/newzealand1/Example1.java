package newzealand1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	public static void main(String[] args) throws Exception {

		// launch the chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// maximize the browser
				driver.manage().window().maximize();
				
				// open nopcommrace url in opened browser
				driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

				Thread.sleep(7000);

				driver.findElement(By.id("Email")).clear();
				Thread.sleep(3000);
				driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
				
				driver.findElement(By.id("Password")).clear();
				Thread.sleep(3000);
				driver.findElement(By.id("Password")).sendKeys("admin");
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()='Log in']")).click();

	}

}
