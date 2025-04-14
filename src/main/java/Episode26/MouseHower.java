package Episode26;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.flipkart.com/");
		driver.get("https://www.flipkart.com/tvs-and-appliances-new-clp-store");
		driver.findElementByXPath("//button[.='✕']").click();
		WebElement elect = driver.findElementByXPath("//span[.='Electronics']");
	    Actions builder = new Actions(driver);
	    builder.moveToElement(elect).perform();
	    driver.findElementByLinkText("Apple").click();
	    
	}

}
