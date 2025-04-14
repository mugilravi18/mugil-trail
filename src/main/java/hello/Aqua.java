package hello;

public class Aqua {
	
 public String DoFuel() {
	 String fuel = "Aqua car is currently fueling";
	 System.out.println(fuel);
	 return(fuel);
 }
 
 public boolean IsFuelingComplete() {
	 int a = 5;
	 int b = 7;
	 if (a > b) {
		 System.out.println("Fueling is not complete, there is an error");
	
	 }
	 if (b > a) {
		 System.out.println("Fueling is completed, congratulations");
	 }
	 return true;
 }
}