package TestNG;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class Part4n5priority {

	@Test(priority = 1)
	public  void Signup() {
		System.out.println("sign up");

	}
	@Test(dependsOnMethods = "TestNG.Part4n5priority.Signup",priority = -1)// if we want to access from other class
	public  void login() {
		System.out.println("login");

	}
	@Test(dependsOnMethods = "login")
	public  void Searchproduct() {
		System.out.println("Searchproduct");

	}

	@Test /* (dependsOnMethods = "Searchproduct") */ (priority = 3)
	public  void Addtocart() {
		System.out.println("Addtocart");
		throw new RuntimeErrorException(null); // Intentional failing this method so upcoming method got skipped

	}

	@Test /* (dependsOnMethods = "Addtocart") */ (priority = 4)
	public  void Signout() {
		System.out.println("Signout");

	}
	

}
