package helloapagain;





public class Student {
	String name;
	String lastName;
	
	public Student(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		
		
		System.out.println("Öğrenci oluşturuldu");
	}
	
	
	
	public void info() {
		System.out.println("Öğrenci adı: " + name + " soyadı " + lastName);
	}
	
}