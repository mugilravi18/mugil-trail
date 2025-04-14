package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Part12dataprovider {
	@DataProvider(name = "Login")
	public String[][] GetData() {
		String[][] data = new String[2][2];
		//row 1
		data[0][0] = "mor_2314";
		data[0][1] = "83r5^_";
		
		data[1][0] = "mor_2314";
		data[1][1] = "83r5^_";
		return data;
	}
	@Test(dataProvider = "Login")
	 void login(String email, String pass) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://letcode.in/login");
		 //driver.findElementByLinkText("Log in").click();
		 driver.findElementByXPath("//input[@placeholder ='Enter Username']").sendKeys(email);
		 driver.findElementByXPath("//input[@type ='password']").sendKeys(pass);
		 //driver.findElementByClassName("button is-primary").click();
		 driver.findElementByXPath("//button[.='LOGIN']").click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 
	 }
}
