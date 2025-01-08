package unit5;

public class Student {
	public static int studentCounter;
	private String name; // attribute
	private String lastName; // restricting fields' scope
	private String id;
	private double gpa;
	
	
	// create an instance. Then, set the values.
	// Set the values the moment we Create the instance 
	
	public Student(String name, String lastName, String id, double gpa) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.gpa = gpa;
		studentCounter++;
		// you can call a constructor inside from 
	}
	
	//override
	public Student() {
		System.out.println("New student is registered");
		studentCounter++;

	}
	
	
	public static void echoCounter()
	{
		System.out.println("Current student count: " + Student.studentCounter);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getGpa() {
		return gpa;
	}

	// mutator methods
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	
	
}

























