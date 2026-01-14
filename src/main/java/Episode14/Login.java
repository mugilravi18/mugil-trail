package Episode14;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// Launch the browser
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// load the URL
		
		driver.get("https://letcode.in/login");
				// Click the login btn
		
				// Enter the Email id
		driver.findElementByLinkText("log in").click();
				// Enter the Password
		driver.findElementByName("Email").sendKeys("koushik350@gmail.com");
		driver.findElementByName("Password").sendKeys("Pass123$");
				// click the login btn
		driver.findElementByXPath("//button[.'Login']").click();		
	}

}
