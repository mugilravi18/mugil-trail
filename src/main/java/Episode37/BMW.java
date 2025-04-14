package Episode37;

public class BMW extends Bike {
	
	int mileage = 30;
	
	String getcolor() {
		return "grey";
	}
	
	public static void main(String[] args) {
		BMW mybike = new BMW();
		mybike.getcolor();
		int test = mybike.mileage;
		System.out.println(test);
		boolean test2 = mybike.hasDisc();
		mybike.applybreak();
		Vehicles myvehicle = new Vehicles();
		myvehicle.applybreak();
		myvehicle.hornmust();
	}
	

}
