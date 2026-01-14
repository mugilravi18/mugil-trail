package Episode25;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropByFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//To maximum window
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		WebElement source = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		int x = source.getLocation().getX();
		int y = source.getLocation().getY();
		//builder.dragAndDropBy(source, x, y).perform();
		builder.dragAndDropBy(source, 50, 90).perform();
	}

}
