package Episode9;

public class Svariable {
	
	int x = 1;
	static int y = 10;
	
	public void incre() {
		x++;
		y++;
		
		System.out.println(x + "is a non-static" +"\n" +  y + "is a static" );
		
	}
	
	

	public static void main(String[] args) {
		Svariable ls1 = new Svariable();
		ls1.incre();
		ls1.incre();
		Svariable ls2 = new Svariable();
		ls2.incre();
		

	}

}
