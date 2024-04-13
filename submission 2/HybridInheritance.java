package submission2;


public class ClassA {
	void m1() {
		System.out.println("ClassA is something");
	}
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.m1();

	}

}

// ********************************************************

package submission2;

public class ClassB extends ClassA {
	void m2() {
		System.out.println("ClassB has everything");
	}

	public static void main(String[] args) {
		ClassB obj = new ClassB();
		obj.m1();
		obj.m2();

	}

}

// ********************************************************

package submission2;

public class ClassC extends ClassB{
	void m3() {
		System.out.println("ClassC is nothing");
	}
	
	public static void main(String[] args) {
		ClassC obj = new ClassC();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}

// *********************************************************


package submission2;

public class HybridInheritance extends ClassA{
	

	public static void main(String[] args) {
		
		HybridInheritance obj = new HybridInheritance();
		obj.m1();
	}

}
