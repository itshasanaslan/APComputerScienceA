package unit5;

import java.util.UUID;

public class Program {

	public static void main(String[] args) {
		
		Student.echoCounter();

		Student deniz = new Student("deniz", "iper", "3284r7e763", 3.99);
		Student.echoCounter();
		// SCOPE
		Student bilgi = new Student("bilgi", "asdsa", "3284r7e763", 3.99);
		Student.echoCounter();

	
	
		

	}
	
	public void dogStuff() {
		
		// creating an instance
		// instantiation
		Dog dog1 = new Dog("Garip", "Golden", 3);
		System.out.println("----------------------");
		Dog dog2 = new Dog();
	}

}
