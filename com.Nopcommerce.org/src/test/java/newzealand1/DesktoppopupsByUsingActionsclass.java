package newzealand1;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesktoppopupsByUsingActionsclass {

	public static void main(String[] args) throws Exception {
		
	// launch the browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Catalog')])[1]")).click();
		
		driver.findElement(By.xpath("(//*[contains(text(),' Categories')])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@name='importexcel']")).click();
		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("(//*[@class='form-control'])[last()]")).click();
		
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		
		Thread.sleep(6000);
		
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(6000);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(6000);
		action.click();
		Thread.sleep(6000);
		action.sendKeys("C:\\Users\\hp\\Desktop\\kk");
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("(//*[@type='submit'])[last()]"));
		
		
		
		
			}

}
