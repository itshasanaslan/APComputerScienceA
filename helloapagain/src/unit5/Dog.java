package unit5;

public class Dog {
	//attributes
	String name;
	String breed;
	int age;
	

	// constructor
	//public ClassName () {}
	public Dog (String name, String breed, int age) {
		System.out.println("We are modifying the dog");
		System.out.println("A dog is born.");
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	// special function String toString()
	public String toString() {
		return name + " | Breed: " + breed + " || Age: " + age; 
	}
	
	
	// dogs do something
	// behaviors
	
	
	// a dog eats
	// it doesnt run unless I call it explicitly
	public void eat() {
		System.out.println("The dog is eating my entire salary");
	}
	
	// bark 
	public void bark(boolean isHungry = false) {
		System.out.println("Bark bark bark!");
		if (isHungry) {
			eat();
		}
	}
	
	
}
