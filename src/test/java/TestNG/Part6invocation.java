package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Part6invocation {
	@Test(invocationCount = 4,invocationTimeOut = 10000)
	public  void Elements() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/search");
		driver.findElement(By.name("q")).sendKeys("circket",Keys.ENTER);
		driver.manage().window().maximize();
		List<WebElement> circketcount = driver.findElementsByXPath("//*[contains(text(),'Circket') or contains(text(),'circket')]");
		System.out.println(circketcount.size());
		driver.quit();
	}
}
