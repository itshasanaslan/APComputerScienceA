package unit7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import unit5.Student;

public class Program {

	public static void main(String[] args) {

		// 1st method Arrays.asList()
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		myList.add(10);
		int indexOf10 = myList.indexOf(10);
		int removedElement = myList.remove(indexOf10);

		int[] myArray = { 1, 2, 3, 4, 5, 10 };

		int removedOne = myArray[5];
		myArray[5] = 154;

		System.out.println(myList.set(5, 154));

		// forgot to mention, sorry
		// returns the element in the specific position
		myList.get(indexOf10);

	}

	public static void arrayListCreations() {
		// primitive types and objects
		// arraylists to store objects

		// classic arrays
		int[] anotherArray = new int[5];
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Wrapper classes
		// Because we can't create a list of primitive types, we can use Wrapper classes
		// ...
		// int -> Integer
		// double -> Double
		// boolean -> Boolean
		// Classical way to create
		ArrayList<Integer> intList = new ArrayList<Integer>();

		int x = 3;
		intList.add(1);
		intList.add(2);
		intList.add(x);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		intList.add(9);
		intList.add(10);

		Student student1 = new Student("deniz", "iper", "u733", 4.00);
		Student student2 = new Student("mete", "önder", "us733", 4.00);
		Student student3 = new Student("arya", "telli", "us7233", 3.00);

		// created a list of students

		ArrayList<Student> students = new ArrayList<>() {
			{
				add(student1);
				add(student2);
				add(student3);
			}
		};

		// Another method Arrays.asList()
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		// Another method List.of()
		ArrayList<Integer> mySecondList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

		// Be careful! IF you create a an empty list, you need to define the type in
		// both sides:
		// ArrayList<Integer> emptyList = new ArrayList<Integer>();

		// every student has toString method implemented; which returns a string.
		// when a list is called as a string, it automatically,
		// calls every objects' toString method and returns you a combined string of all
		// the elements.
		System.out.println(students);

		// return the size of method
		int sizeOfMyList = myList.size();

		// adds to the end of the list and returns true
		myList.add(20);

		// myList.indexOf(element) returns the index of that element.
		// if doesnt exist, it returns -1.
		if (myList.indexOf(20) == -1) {
			System.out.println("Doesn't exist");
		} else {
			System.out.println("exist");
		}

		System.out.println(myList);

		// when you remove an element, it returns that element and you can store if you
		// want to use it for later.
		int removedElement = myList.remove(myList.indexOf(20));

	}

}
