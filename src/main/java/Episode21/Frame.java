package Episode21;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/frame");
		//driver.switchTo().frame(0); // with ID
		// driver.switchTo().frame("firstFr"); //with Name
		//driver.findElementByName("fname").sendKeys("Thiru Shanav");
		//driver.findElementByName("lname").sendKeys("c");
		// With xpath
		WebElement frame = driver.findElementByXPath("//iframe[@src='frameui']");
		driver.switchTo().frame(frame);
		driver.findElementByName("fname").sendKeys("Thiru Shanav");
		driver.findElementByName("lname").sendKeys("T");
		driver.switchTo().frame(0);
		driver.findElementByName("email").sendKeys("mugil.ravi18@gmail.com");
		driver.switchTo().parentFrame();
		driver.findElementByName("lname").sendKeys("Shanav");
		
		//Default frame
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//button[text() = 'Refer the video']");
		}

}
