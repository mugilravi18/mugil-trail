package Episode34;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithActiveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//To maximum window
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");
		WebElement ele = driver.switchTo().activeElement();
		ele.sendKeys("mugil.ravi18@gmail.com",Keys.TAB, "Shanthi", Keys.ENTER);

	}

}
