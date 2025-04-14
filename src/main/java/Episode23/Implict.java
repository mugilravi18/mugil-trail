package Episode23;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Implict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// load the URL
		
		driver.get("https://letcode.in/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByLinkText("log in").click();
				
		driver.findElementByName("Email").sendKeys("koushik350@gmail.com");
		driver.findElementByName("Password").sendKeys("Pass123$");
	}

}
