package inBuiltPOMinSW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Dashbord2 {
	
	WebDriver driver;
public	Dashbord2(WebDriver d) {
	
    this.driver = d;
    PageFactory.initElements(driver,this);   
}


@FindBy(how = How.CLASS_NAME, using="content-header")
WebElement Dashboard;

public boolean verifyDashboard() {
	boolean veri = Dashboard.isDisplayed();
	
	return veri;
	
}

}
