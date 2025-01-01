package unit5;

public class Dog {
	// name, breed and age are ATTRIBUTES of Dog.
	
	//default access modifier
	private String name;
	private String breed;
	// datatype variablename;
	private int age;
	public int timesDataRequested;
	
	//public ClassName () {}
	// parameterized CONSTRUCTOR
	public Dog (String name, String breed, int age) {
		System.out.println("We are modifying the dog");
		System.out.println("A dog is born.");
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	// CONSTRUCTOR OVERLOADING
	public Dog() {
		System.out.println("Dog is created without values");
	}
	
	
	// special function - METHOD OVERLOADING
	public String toString() {
		return name + " | Breed: " + breed + " || Age: " + age; 
	}
	
	
	// dogs do something
	// behaviors
	// a dog eats
	// it doesn't run unless I call it explicitly
	 public void eat() {
		System.out.println( name +" is eating my entire salary");
	}
	
	// bark - METHOD (function) with a parameter
	public void bark(boolean isHungry) {
		System.out.println("Bark bark bark!");
		if (isHungry) {
			eat();
		}
	}
	
	public void happyBirthday() {
		this.age++;
		System.out.println("Happy  birthday to you " + name + "! Now you are " + age + " years old!");
	}
	
	// GETTERS / returning private data in a controlled way
	public String getName() {
		this.timesDataRequested++;
		return name;
	}
	
	// SETTER
	public void setName(String newName) {
		this.name = newName;
	}
	public int getAge() {
		this.timesDataRequested++;
		return this.age;
	}
	
}
