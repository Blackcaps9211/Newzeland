package newzealand1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) throws Exception {

		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(7000);

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[text()='Log in']")).click();

		Thread.sleep(7000);
//		driver.findElement(By.xpath("//*[contains(text(),'Dashboard')]")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Catalog')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Products')]")).click();
		Thread.sleep(3000);
		
 
		
		
		int rows = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr")).size();

		int columns = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr[1]/td")).size();

		System.out.println(rows + " " + columns);
		System.out.println();

		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= columns; j++) {

				String val = driver
						.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(val + "	");

				if (i == 2 && j == 1) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + i + "]/td[" + j + "]"))
							.click();
					Thread.sleep(3000);
					driver.findElement(By.id("delete-selected")).click();
					Thread.sleep(3000);
					driver.findElement(By.id("delete-selected-action-confirmation-submit-button")).click();
					Thread.sleep(3000);
				}

			}
			System.out.println();

		}

	}


	
		
		
		
		
		
		
		
	}


