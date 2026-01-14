
package Episode35;

public class Axis implements RBI{
	
	public void interestFreeLoan() {
		System.out.println("Free Loan");
	}

	@Override
	public void aadharMandatory() {
		System.out.println("Aadhar Added");
		
	}

	@Override
	public boolean panMandatory() {
		return false;
	}

	@Override
	public boolean panMandatory(boolean e) {
		// TODO Auto-generated method stub
		return false;
	}

}
