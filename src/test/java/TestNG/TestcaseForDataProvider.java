package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utlis.DataproIntegrateExcel;

public class TestcaseForDataProvider extends DataproIntegrateExcel {
	   
	@Test(dataProvider = "Login") //@Test(dataProvider = "Login", dataProviderClass = Dataproinotherpack.class )//dataProvider ="GetData"
	public void login(String data[]) {
		System.out.println("Email:"+data[0]);
		System.out.println("Password:"+data[1]);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://letcode.in/login");
		 //driver.findElementByLinkText("Log in").click();
		 driver.findElementByXPath("//input[@placeholder ='Enter Username']").sendKeys(data[0]);
		 driver.findElementByXPath("//input[@type ='password']").sendKeys(data[1]);
		 //driver.findElementByClassName("button is-primary").click();
		// driver.findElementByXPath("//button[.='LOGIN']").click();
		// String title = driver.getTitle();
		 //System.out.println(title);
		 driver.quit();
		 
	 }

}
