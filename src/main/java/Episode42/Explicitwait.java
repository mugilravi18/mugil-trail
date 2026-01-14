package Episode42;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize(); 
		  // It will just wait for Elements not for Alert so we are going for WebDriverWait
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://letcode.in/waits");
		  driver.findElement(By.id("accept")).click(); 
		  // condition To wait for alert to get pop up 
		  WebDriverWait wait = new WebDriverWait(driver,30); 
		  //wait until the alert comes 
		  Alert until = wait.until(ExpectedConditions.alertIsPresent()); 
		  //To get text
		  System.out.println(until.getText());
		  // To accept the Alert 
		  //until.accept();
		  driver.switchTo().alert().accept();
		 
		 
		
		
		
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  ChromeDriver driver1 = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://letcode.in/signin"); 
		  //invisibility 
		  //To Signup
		  driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		  driver.findElement(By.name("password")).sendKeys("Pass123$");
		  driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		  // To find the Toast 
		  WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']")); 
		  //To wait till the toast visible 
		  WebDriverWait wait1 = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOf(toast)); 
		  //To print the text
		  System.out.println(toast.getText()); 
		  // To wait until the toast invisible
		  wait.until(ExpectedConditions.invisibilityOf(toast)); 
		  //click the signout
		  driver.findElement(By.linkText("Sign out")).click();
		 
		
		//wait for the title change
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.get("https://www.flipkart.com/mobile-phones-store");
		//driver.findElementByXPath("//button[.='✕']").click();
		WebElement elec = driver.findElementByXPath("//span[.='Electronics']");
		//To create object
		Actions builder = new Actions(driver2);
		//To hover the mouse
		builder.moveToElement(elec).perform();
		// To Find apple
		WebElement Apple = driver.findElement(By.linkText("Apple"));
		// To create a object 
		WebDriverWait wait2 = new WebDriverWait(driver,30);
		// To wait until the apple visible
		wait.until(ExpectedConditions.visibilityOf(Apple));
		//To click
		Apple.click();
		//Wait until the title comes to apple nu oru word
		wait.until(ExpectedConditions.titleContains("Apple"));
		// To print
		System.out.println(Apple);
		
		
		
		
		
		
	}

}
