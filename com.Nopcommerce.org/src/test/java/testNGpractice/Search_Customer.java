package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_Customer {

	WebDriver driver;
	public Search_Customer(WebDriver d) {
		
		this.driver = d;
	}
	
	
	//By verifyCust = By.xpath("(//*[contains(text(),'Customers')])[last()]");
	By enterEmail = By.id("SearchEmail");
	By enterFristName = By.id("SearchFirstName");
	By enterLastName = By.id("SearchLastName");
	By enterLastactivityfrom = By.id("SearchLastActivityFrom");
	By enterLastactivityto = By.id("SearchLastActivityTo");
    By tableinfo = By.xpath("//table[@id='[']/tbody/tr");
	
	//public void verifyCust() {
		
//	}

public void enterEmail() {
		
	driver.findElement(enterEmail).sendKeys("admin@yourStore.com");
	}

public void enterFristName() {
	driver.findElement(enterFristName).sendKeys("John");
}

public void enterLastName() {
	driver.findElement(enterLastName).sendKeys("Smith");
}

public void enterLastactivityfrom() {
	driver.findElement(enterLastactivityfrom).sendKeys("3/13/2017");
}

public void enterLastactivityto() {
	driver.findElement(enterLastactivityto).sendKeys("1/10/2023");
}

	public void tableinfo() {
		
	int count = driver.findElements(tableinfo).size();
	
	if (count != 0){
		
		System.out.println("Login is success full");
		
	}
	else {
		
		System.out.println("Login is not successfull");
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
