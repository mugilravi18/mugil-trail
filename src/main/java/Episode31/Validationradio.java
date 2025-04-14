package Episode31;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validationradio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//To maximum window
		driver.manage().window().maximize();
		//isDisplayed()
		   driver.get("https://buymeacoffee.com/letcode"); 
		   WebElement validate = driver.findElementByLinkText("Login"); 
		   boolean val = validate.isDisplayed();
		   System.out.println(val);
		 
		
		
		 driver.get("https://letcode.in/edit"); 
		 Boolean test = driver.findElementById("noEdit").isDisplayed(); 
		 System.out.println(test);
		
		//isEnable()it wont work because the disable key word didn't use instead of the they use class name la they have set the keyword)
		
		  driver.get("https://semantic-ui.com/elements/button.html"); 
		  boolean value = driver.findElementByXPath("//h4[.='Disabled']").isEnabled();
		 System.out.println(value);
		 
		//working code
		
		  driver.get("https://semantic-ui.com/elements/button.html"); WebElement btn =
		  driver.findElementByXPath("//button[text()[normalize-space()='Followed']]");
		  System.out.println(btn.isEnabled()); 
		  String attribute = btn.getAttribute("class");
		  System.out.println(attribute.contains("disabled"));
		 
		
		//isSelect()
		
		 driver.get("https://letcode.in/radio");
		 WebElement select = driver.findElementByXPath("(//label[@class = 'checkbox']//input)[1]"); 
		 boolean result = select.isSelected();
		 
		//System.out.println(select);
		
		driver.get("https://letcode.in/radio");
		WebElement remember = driver.findElementByXPath("((//label[@class='checkbox']//input)[1]");
		System.out.println(remember.isSelected());
		
		

	}

}
