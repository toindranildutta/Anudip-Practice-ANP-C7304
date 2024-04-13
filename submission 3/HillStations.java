package submission3;

public class HillStations {
	// superclass location method
	void location(){
		System.out.println("This is superclass Hillstation");
	}
	// superclass famousfor method
	void famousFor() {
		System.out.println("This is superclass Famous Location");
	}
public static void main(String[] args) {
		
		HillStations obj = new Mussoorie();
		obj.location();
		obj.famousFor();
	}

}

// *******************************************************

package submission3;

public class Manali extends HillStations {
	void location() {
		System.out.println("This is Manali");
	}
	void famousFor() {
		System.out.println("I am famous for the hills beauty");
	}
	
	public static void main(String[] args) {
		
		HillStations obj = new Manali();
		obj.location();
		obj.famousFor();
	}

}

// *******************************************************

package submission3;

public class Gulmarg extends HillStations{

	void location() {
		System.out.println("This is Gulmarg");
	}
	void famousFor() {
		System.out.println("I am famous for Gulmarg");
	}
	
	public static void main(String[] args) {
		
		HillStations obj = new Gulmarg();
		obj.location();
		obj.famousFor();
	}

}

// *******************************************************

package submission3;

public class Mussoorie extends HillStations{

	void location() {
		System.out.println("This is Mussoorie");
	}
	void famousFor() {
		System.out.println("I am famous for Mussoorie");
	}
	
	public static void main(String[] args) {
		
		HillStations obj = new Mussoorie();
		obj.location();
		obj.famousFor();
	}

}

