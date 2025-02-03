package unit5;


public class Program {

	public static void main(String[] args) {
		
		
		// primitive types int, double, char, boolean + String
		
		// pass by value
		
		String name = "deniz";
		
		passByValue(name); // passing a copy & pass by value
		
		System.out.println("Printing x again: " + name);
		
		
		
		System.out.println("---------------------------");
		
		Dog dog1 = new Dog("jack", "pitbull", 3);
		
		passByReference(dog1);
		
		
		System.out.println("Printing dog name again: " + dog1.getName());

		Student[] students = new Student[3];
		// assume that students are given

	}
	
	public void dogStuff() {
		// creating an instance
		// instantiation
		Dog dog1 = new Dog("Garip", "Golden", 3);
		System.out.println("----------------------");
		Dog dog2 = new Dog();
	}
	
	
	public static void passByValue(String name) {
		System.out.println("Printing: " + name);
		name = "bilgi";
		System.out.println("Printing: " + name);
	}
	
	
	public static void passByReference(Dog dog) {
		dog.setName("tony");
		System.out.println("Printing: " + dog.getName());
	}

}
