package Episode20;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/alert");
		// accept
		//driver.switchTo().alert().accept();
		driver.findElementById("accept").click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Simple alert text "+text);
		alert.accept();
		// prompt
		driver.findElementById("prompt").click();
		//		System.out.println(driver.getCurrentUrl());
		driver.switchTo().alert();
		alert.sendKeys("koushik");
		System.out.println(alert.getText());
		alert.accept();
		String name = driver.findElementById("myName").getText();
		System.out.println(name);		
	}

}


