package Episode33;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submitfn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://letcode.in/signin");
		/*
		 * driver.get("https://letcode.in/signin");
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		 * driver.findElementByName("")
		 * driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		 * driver.findElement(By.name("password")).sendKeys("Pass123$");
		 * driver.findElement(By.xpath("//button[text()='LOGIN']")).submit();
		 */
		driver.get("https://letcode.in/button");
		driver.findElement(By.id("home")).submit();
	}

}
