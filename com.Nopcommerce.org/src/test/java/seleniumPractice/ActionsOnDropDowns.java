package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsOnDropDowns {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(2000);

		driver.findElement(By.id("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		
		
		driver.findElement(By.xpath("(//*[contains(text(),'Catalog')])[1]")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//*[contains(text(),' Products')])[1]")).click();
		Thread.sleep(3000);
		
		
	
		WebElement	Catagery = driver.findElement(By.id("SearchCategoryId"));
		
		Select slt = new Select(Catagery);
		
        List <WebElement> V = slt.getOptions();
        
        for(int i =0; i<V.size()-1;i++) {
        	System.out.println(V.get(i).getText());
        	if(i==2) {
        		V.get(i).click();
        	}
        }


		
		
		
		
		
		
		
		
		
	}
	
}
