package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utlis.Dataproinotherpack;

public class Part13dataprofromotherpac extends Dataproinotherpack {
	
	@Test(dataProvider = "Login") //@Test(dataProvider = "Login", dataProviderClass = Dataproinotherpack.class )//dataProvider ="GetData"
	 void login(String email, String pass) {
		System.out.println(email);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://letcode.in/login");
		 //driver.findElementByLinkText("Log in").click();
		 driver.findElementByXPath("//input[@placeholder ='Enter Username']").sendKeys(email);
		 driver.findElementByXPath("//input[@type ='password']").sendKeys(pass);
		 //driver.findElementByClassName("button is-primary").click();
		// driver.findElementByXPath("//button[.='LOGIN']").click();
		// String title = driver.getTitle();
		 //System.out.println(title);
		 driver.quit();
		 
	 }

}

