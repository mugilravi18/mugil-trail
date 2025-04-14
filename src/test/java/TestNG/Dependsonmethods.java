package TestNG;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
// for example amazon we can search and add to cart without login
public class Dependsonmethods {
	@Test
	public void signup() {
		System.out.println("sign up");
	}
	@Test
	public  void login() {
		System.out.println("login");
		throw new NoSuchElementException("element not there");
	}
	@Test(dependsOnMethods = "TestNG.Dependsonmethods.login",alwaysRun =true)// even though the dependency method failed this method can run because of the keyword "alwaysRun = true"
	public  void Searchproduct() {
		System.out.println("Searchproduct");

	}

}
