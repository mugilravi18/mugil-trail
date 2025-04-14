package Episode31;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//To maximum window
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio/");
		
		  WebElement test1 = driver.findElementByXPath("(//label[@class='checkbox']//input)[1]");
		  System.out.println(test1.isSelected()); 
		  WebElement test2 = driver.findElementByXPath("(//label[@class='checkbox']//input)[2]");
		  //see the difference between to print
		  System.out.println(test2);
		  System.out.println(test2.isSelected());
		//driver.findElementByXPath("//input[@type = 'checkbox']").click();
		
		  if (test2.isSelected() == false)
		  { 
			  test2.click(); 
			  }
		 

	}

}