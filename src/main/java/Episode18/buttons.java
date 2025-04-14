package Episode18;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/button");
		
		//Get the x & y coordinates
		//driver.findElementById("position").getLocation();
		WebElement all = driver.findElementById("position");
		Point point = all.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("point x" +x + "point y" +y );
		
		//find the color of the button
		WebElement btncolor = driver.findElementById("color");
		String color = btncolor.getCssValue("background-color");
		System.out.println(color);
		
		//find the height & width of the button
		Rectangle rect = driver.findElementById("property").getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getPoint());
		Dimension dim = rect.getDimension();
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
		//Confirm button is disable
		boolean value = driver.findElementById("isDisabled").isEnabled();
		System.out.println(value);
	
		driver.quit();
	}

}
