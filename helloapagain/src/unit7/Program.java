package unit7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import unit5.Student;
import unit6.ArrayManipulator;

public class Program {

	public static void main(String[] args) {

		// Sorting
		int[] nums  = ArrayManipulator.getRandomArray(0, 100, 20);
		ArrayList<Integer> numsList =  ArrayManipulator.getRandomArrayList(0, 100, 20);

		Collections.sort(numsList, Comparator.reverseOrder());
		System.out.println(numsList);
		
	}
	// {12,4,3,2,19,21,92,53};

	//Look at all the nums and find the smallest one.
	//Swap it with the first num in the row.
	//Now, ignore the first num (because it's already sorted ✅) and look at the rest of the nums.
	//Find the next smallest num and move it to the second spot.
	//Keep repeating until all nums are sorted

	
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		// assign arrays length to a variable
		
		for (int index = 0; index < n; index++) {
			int minimumIndex = index;
			
			//second loop
			for (int j = index + 1; j < n; j++) {
				//
				if (arr[j] < arr[minimumIndex]) {
					minimumIndex = j;
				}
			}
			
			  // Swap elements
            int temp = arr[index];
            arr[index] = arr[minimumIndex];
            arr[minimumIndex] = temp;
		}
		// {12,4,3,2,19,21,92,53};
		// {2,4,3,12,19,21,92,53};

	}
	
	
	

	//Start with the second element and compare it with the previous element.
	//If it's smaller, shift larger elements to the right and insert it in the correct position.
	//Repeat for all elements.


	public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {  // Start from the second element
        int key = arr[i]; // Element to be inserted
        int j = i - 1;

        // Move elements of arr[0..i-1] that are greater than key one position ahead
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key; // Insert key into its correct position
    }
	}	

		public static void searching() {
		ArrayList<String> names = 	new ArrayList<String>();
		
		boolean exists = exists(names, "Elif"); 
		
		System.out.println(exists);
	
		
		ArrayList<Double> doubleList = new ArrayList<Double>(Arrays.asList(1.0, 2.5, 3.9, 5.1));
		double lookFor = 4.0;
		double delta = 0.2;
		
		System.out.println(findIndexInDoubleList(doubleList, 2.2, delta));
	
		// write a function that searches a double list and finds the specified item's index.
		
	}
	
	public static int findIndexInDoubleList(ArrayList<Double> doubleList, double lookForThis, double delta) {
		
		for (int i = 0; i < doubleList.size(); i++) {
			double d = doubleList.get(i);
			if (Math.abs(d - lookForThis) <= delta) {
				return i;
			}	
		}
		return -1;
	}
	
	public static boolean exists(ArrayList<String> strList, String lookForThis) {
		
		for (int i = 0 ; i < strList.size(); i++) {
			if (lookForThis.toLowerCase().equals(strList.get(i).toLowerCase())) {
				return true;
			}
		}
		return false;
	}
	
	public static int findIndex(ArrayList<String> strList, String lookForThis) {
		
		for (int i = 0 ; i < strList.size(); i++) {
			if (lookForThis.toLowerCase().equals(strList.get(i).toLowerCase())) {
				return i;
			}
		}
		return -1;
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
