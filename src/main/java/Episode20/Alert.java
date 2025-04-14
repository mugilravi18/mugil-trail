package Episode20;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		
		driver.findElementById("accept").click();
		driver.switchTo().alert().accept(); 
		//driver.switchTo().alert().dismiss();
	//Thread.sleep(5000);
		driver.findElementById("confirm").click();
		//Thread.sleep(5000);
		driver.switchTo().alert().accept();		
		//dismiss
		driver.findElementById("confirm").click();
		//Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
		driver.findElementById("prompt").click();
		driver.switchTo().alert();
		//alert.sendkeys("Mugil");
		//alert.accept();
		String name = driver.findElementById("myName").getText();
		System.out.println(name);
		

	}


		
}


