package Episode39;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("circket",Keys.ENTER);
		driver.manage().window().maximize();
		
		Thread.sleep(50000);
		List<WebElement> circketcount = driver.findElementsByXPath("//*[contains(text(),'Circket') or contains(text(),'circket')]");
		System.out.println(circketcount.size());
		driver.quit();
		
	}

	public static void main1(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> elements = driver.findElementsByTagName("label");
		// To get one element last element
		WebElement lastelement =elements.get(elements.size()-1);
		System.out.println(lastelement.getText());
		// size of the elements
		int size = elements.size();
		if (size == 8) {
			System.out.println("Testcase Passed");
		}else 
			System.out.println("Testcase Failed");
		
		//To get all the Elements
		for (WebElement allele : elements) {
			String elementprint = allele.getText();
			System.out.println(elementprint);
			
		}
		
		

	}

}
