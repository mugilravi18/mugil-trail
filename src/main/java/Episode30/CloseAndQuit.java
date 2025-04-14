package Episode30;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			//To maximum window
			driver.manage().window().maximize();
			driver.get("https://letcode.in/edit");
			//get text
			WebElement header = driver.findElementByTagName("h1");
			String text = header.getText();
			System.out.println(text);
			//driver.quit();
			//driver.close();
	}

}
