package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Part8Threadpool {
	// invocationCount - Number of times, threadPoolSize - Number of execution in parallel
	//@Test (invocationCount =3 , threadPoolSize =2)
	//Time Out is used to set the time to execute the function/testcase.
	//@Test(timeOut = 5000)
	//expectedExceptions doing the testcase pass on the report but the actual execution is failed.In this case i wantedly did the change in findelement to fail the testcase.
	@Test(expectedExceptions = {NoSuchElementException.class})
	public  void Elements() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/search");
		driver.findElement(By.name("q1")).sendKeys("circket",Keys.ENTER);
		driver.manage().window().maximize();
		List<WebElement> circketcount = driver.findElementsByXPath("//*[contains(text(),'Circket') or contains(text(),'circket')]");
		System.out.println(circketcount.size());
		driver.quit();
	}
}
