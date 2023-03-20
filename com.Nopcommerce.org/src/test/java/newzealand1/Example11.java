package newzealand1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example11 {

	public static void main(String[] args) throws Exception {

		// launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin");
		driver.manage().window().maximize();

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);

		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[text()='Log in']")).click();

		boolean Catalogpresence = driver.findElement(By.xpath("//*[contains(text(),'Catalog')]")).isDisplayed();
		boolean Catalogactive = driver.findElement(By.xpath("//*[contains(text(),'Catalog')]")).isEnabled();
		System.out.println(Catalogpresence);
		System.out.println(Catalogactive);

		driver.findElement(By.xpath("//*[contains(text(),'Catalog')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(),'Products')]")).click();
		Thread.sleep(2000);

		WebElement download = driver.findElement(By.name("download-catalog-pdf"));
		Thread.sleep(2000);

//	  driver.findElement(By.tagName("a")).click();
		driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(download)).click();
		Thread.sleep(8000);

		driver.findElement(By.id("Name")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("Name")).sendKeys("Nokia");
		Thread.sleep(2000);

		driver.findElement(By.id("ShortDescription")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("ShortDescription"))
				.sendKeys("Nokia is one of the best brand and it is Finland Brand");
		Thread.sleep(2000);

		driver.findElement(By.id("Sku")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("Sku")).sendKeys("Phones");
		Thread.sleep(2000);

		driver.findElement(By.id("ShowOnHomepage")).click();
		boolean publishedcheckbox = driver.findElement(By.className("check-box")).isSelected();

		System.out.println(publishedcheckbox);

	}

}
