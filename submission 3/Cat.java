package submission3;

public class Animal {
	void makeSound() {
		System.out.println("The animal makes a sound.");
	}
}
// *************************************

package submission3;

public class Dog extends Animal{
	void makeSound() {
		System.out.println("The dog barks");
	}

	public static void main(String[] args) {
		Animal myDog = new Dog();
		myDog.makeSound();

	}

}
// ***************************************

package submission3;

public class Cat extends Dog{

	void makeSound() {
		System.out.println("The cat meows");
	}

	public static void main(String[] args) {
		Dog myCat = new Cat();
		myCat.makeSound();

	}

}

