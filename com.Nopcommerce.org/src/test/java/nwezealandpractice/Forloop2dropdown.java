package nwezealandpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forloop2dropdown {

	public static void main(String[] args) throws Exception {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
	
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Password"))));
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		
		driver.findElement(By.xpath("(//*[contains(text(),'Sales')])[1]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),' Orders')])[1]")).click();
		
		WebElement pay = driver.findElement(By.id("PaymentMethodSystemName"));
		
		Select selection = new Select(pay);
		
	List <WebElement> alloptions = selection.getOptions();
	
	
	
	 for(int i=0; i<=3;i++) {
		
		System.out.println(i+ alloptions.get(i).getText());
		
		if(i==2) {
		
		alloptions.get(i).click();
	}
	 
	 }

	 
	 
	 
	 
	 
	 
}
}

