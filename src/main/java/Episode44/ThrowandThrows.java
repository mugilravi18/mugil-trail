package Episode44;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThrowandThrows {


		
	public void code(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			//If we want to stop the execution from this 
			throw new RuntimeException();
		}
	}
	public static void main(String[] args)  {
		ThrowandThrows lts = new ThrowandThrows();
		lts.test();
		//		lts.code();
	}

     // Try&Catch, ThrowVsThrows in Selenium  
	public void test(){
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/signin");
		try {
			driver.findElement(By.name("email1")).sendKeys("koushik350@gmail.com");
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			//To stop the execution from this
			throw new RuntimeException();
		}
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		driver.quit();
	}



}