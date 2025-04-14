package Episode20;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		WebElement frame =  driver.findElementByXPath("//iframe[@id = 'iframeResult']");
		driver.switchTo().frame(frame);
		driver.findElementByXPath("//button[.'Try it']").click();
	}

}
