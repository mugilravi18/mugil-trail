package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Part10Parameter {
	@Parameters({"email","password"})
	@Test
	//Gave String to know the email and password so we declared in method
	void login(String emailID, String pass ) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.findElementByLinkText("Log in").click();
		driver.findElementByName("email")
		.sendKeys(emailID);
		driver.findElementByName("password").sendKeys(pass);
		driver.findElementByXPath("//button[.='LOGIN']").click();
		String title = driver.getTitle();
		System.out.println("Title is "+title);
	}
	
	

}
