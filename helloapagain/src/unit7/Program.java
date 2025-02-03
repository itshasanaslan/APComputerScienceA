package unit7;

import java.util.ArrayList;

import unit5.Student;

public class Program {

	public static void main(String[] args) {
		
		Student student1 = new Student("deniz", "iper", "u733", 4.00);
		Student student2 = 	new Student("mete", "önder", "us733", 4.00);
		Student student3 = new Student("ara", "telli", "us7233", 3.00);
		
		// created an empty list of students
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		
		students.remove(0);
		
		// to be continued...
		
	}

}
