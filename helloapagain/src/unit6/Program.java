package unit6;

import unit5.Dog;

public class Program {

	public static void main(String[] args) {
	 
		
		// Array in maths
		// is a sequence of data
		
		
		// what kind of data type do you want to store


		
		double[] myDoubleList = new double[20];
		String[] myStringList = new String[20];
		Dog[] myDogList = new Dog[20];
		
		// initializer
		int[] myList =  {3,4,5,6,};
			
	
		arrayPassByReference(myList);
		System.out.println("First element " + myList[0]);
		 
		int[] anotherList =  {1,2,3};

		 // json
		
		/*
		//int[] myList = new int[4];

		myList[0] = 3; // element
		myList[1] = 4; // element
		myList[2] = 5; // element
		myList[3] = 6; // element
	*/
		System.out.println("Length:" +	myList.length);
		
		
	// go through every element in my array
	// traverse an array
	int sum = getSumOfArray(anotherList);
	
	System.out.println("Sum is:" + sum);

		
		// by default
		// int 0, doubles 0.0
		// booleans false
		// objects are null
		
		// array length is final, it doesnt' change.

	
	
	
	// let's have a random array from a function we wrote 
	// with 100 elements
	int[] myRandomArray1 = getRandomArray(100);
	

	}
	
	// create a function that returns the sum of array
	// {1,2,3}, sum = 6;
	
	public static int getSumOfArray(int[] someArray) {
		
		int sum = 0;
		
		// go through every element in the array
		// add every element's value to the sum
		
		for (int element = 0; element < someArray.length; element++) {
			sum += someArray[element];
		}
		
		return sum;
		
	}
	
	
	public static void arrayPassByReference(int[] someArray) {
		System.out.println("First element " + someArray[0]);
		someArray[0] = 3333;
		System.out.println("First element changed in function: " + someArray[0]);

	}
	

	// which returns me an array with random numbers
	public static int[] getRandomArray(int length) {
		
		int max = 100;
		int min = 1;
		int[] someArray = new int[length];
		
		for (int i = 0; i < length; i++) {
			someArray[i] = (int) (Math.random() * (max - min + 1) + min);
		}
		
		return someArray;
		
		
	}
	
	
	
	
}










