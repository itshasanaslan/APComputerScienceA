package unit5;

public class Program {

	public static void main(String[] args) {
	
		// public and private
		// always mark your attributes as private
		// access the data by returning them
		
		Dog dog1 = new Dog();
		dog1.setName("Jack");
		System.out.println(dog1.getName());
		
	}
	
	public static void dogStuff() {
		
		// creating an instance
		// instantiation
		Dog dog1 = new Dog("Garip", "Golden", 3);
		System.out.println("----------------------");
		Dog dog2 = new Dog();
	}

}
