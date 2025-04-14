package Episode37;

public class Bike extends Vehicles{
	public boolean hasDisc() {
		return true;
	}
//override
	public void applybreak() {
		super.applybreak();
		System.out.println("Bike --Break Applied");
		
	}
}
