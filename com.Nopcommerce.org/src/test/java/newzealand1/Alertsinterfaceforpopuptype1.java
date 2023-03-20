package newzealand1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertsinterfaceforpopuptype1 {

	public static void main(String[] args) throws Exception {
		
	// setup the cb	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(),'Log in')]")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//*[contains(text(),'Sales')])[1]")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[(text()=' Orders')]")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("(//*[(text()='View')])[3]")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("order-delete")).click();
//		Thread.sleep(2000);
//		
//		Alert popup = driver.switchTo().alert();
//		Thread.sleep(2000);
//		
//		System.out.println(popup.getText());
//		
//		popup.accept();
		
		driver.findElement(By.xpath("(//*[contains(text(),'Customers')])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[contains(text(),' Activity log')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[text()='Delete'])[3]")).click();
		Thread.sleep(5000);
		
		Alert popup=driver.switchTo().alert();
		Thread.sleep(5000);
		
		System.out.println(popup.getText());
		Thread.sleep(5000);
		
		popup.accept();
//		popup.dismiss();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
