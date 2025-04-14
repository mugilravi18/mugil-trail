package Episode35;

public class Customer {

	private static final char[] UPILimit = null;

	public static void main(String[] args) {
		Axis cust = new Axis();
		cust.aadharMandatory();
		
		boolean panMandatory = cust.panMandatory();
		System.out.println(panMandatory);
		
		cust.interestFreeLoan();
		System.out.println(Axis.UPILimit);
		
		//cust.houseloan();
		// for class will create object
		//For interface will create reference variable
		
		RBI bank = new Axis();
		bank.houseloan();
		RBI.bikeloan();
	}

}
