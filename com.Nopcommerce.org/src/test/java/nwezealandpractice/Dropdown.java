package nwezealandpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		
		
		// launch the web browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		
		driver.get("https://jqueryui.com/");
		
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//*[contains(text(),'jQuery UI')])[3]"))));
	driver.findElement(By.xpath("//*[text()='Droppable']")).click();
	
	driver.switchTo().frame(0);
	
	WebElement source = driver.findElement(By.id("draggable"));
	Thread.sleep(2000);
	WebElement target = driver.findElement(By.id("droppable"));
		
	 
		

	}


}
