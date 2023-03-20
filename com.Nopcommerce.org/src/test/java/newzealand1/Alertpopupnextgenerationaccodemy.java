package newzealand1;



import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpopupnextgenerationaccodemy {

	public static void main(String[] args) throws Exception {

		// setup the CB
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://nxtgenaiacademy.com/alertandpopup/");

		Thread.sleep(7000);

		driver.findElement(By.name("promptalertbox1234")).click();

		Thread.sleep(3000);

		Alert popup = driver.switchTo().alert();

		Thread.sleep(3000);

		String question = popup.getText();
		Thread.sleep(3000);

		System.out.println(question);
//
		popup.sendKeys("Yes");
		Thread.sleep(3000);

		popup.accept();
//		popup.dismiss();

		Thread.sleep(4000);

		String answer = driver.findElement(By.id("demoone")).getText();
		System.out.println(answer);

	Robot robot = new Robot();	
			
		
		
	}

}



