package unit5;

public class Student {
	public static int studentCounter;
	private String name;
	private String lastName;
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
	
	
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected double getGpa() {
		return gpa;
	}

	// mutator methods
	protected void setGpa(double gpa) {
		this.gpa = gpa;
	}


	
	
}
