package MugilPOM;

import java.sql.Driver;

//import org.POMseleniumbase.MBasecode;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MLogin extends MBasecode {
	//RemoteWebDriver driver = null;
	//Validation
	public boolean createacc() {
	return	driver.findElementByLinkText("Create new accountss").isDisplayed();
	//System.out.println(check);

		
	}
	
	//Action
	public MLogin enterUserName(String username){
		//ChromeDriver driver = new ChromeDriver();
		driver.findElementById("//input[@type = 'text']").sendKeys(username);
		return this;
		
	}	
	public MLogin enterPassword(String password) {
		driver.findElementByXPath("//input[@type = 'password']").sendKeys(password);
		return this;
		
	}	
	public MLogin clicklogin() {
		driver.findElementByName("login").click();
		return this;
		
		
	}
	public void Login(String username, String password ) {
		enterUserName(username);
		enterPassword(password);
		clicklogin();
		
		
	}

}
