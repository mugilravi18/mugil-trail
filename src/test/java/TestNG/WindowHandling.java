package TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	
    @Test
	public  void Window() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
		Thread.sleep(5000);
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		driver.findElement(By.linkText("Explore Workspace")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		List<String> list = new ArrayList<String>(windowhandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
		driver.close();
		Set<String> windowhandle2 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowhandle2);
		driver.switchTo().window(list.get(0));
		String print = driver.getCurrentUrl();
		System.out.println(print);
		

	}

}
