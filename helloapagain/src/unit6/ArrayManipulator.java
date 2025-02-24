package unit6;

import java.util.ArrayList;

public class ArrayManipulator {

	public static String getArrayAsString(String[] someArray) {
		String modified = "[\"";

		for (String element : someArray) {

			modified += element + "\", \"";
		}

		return modified.substring(0, modified.length() - 3) + "]";

		// ["demir", "deniz", "nadir", "mete"]
	}

	public static String getArrayAsString(int[] someArray) {
		String modified = "[";

		for (int element : someArray) {

			modified += element + ", ";
		}

		return modified.substring(0, modified.length() - 2) + "]";

		// ["demir", "deniz", "nadir", "mete"]
	}

	public static String getArrayAsString(boolean[] someArray) {
		String modified = "[\"";

		for (boolean element : someArray) {

			modified += element + "\", \"";
		}

		return modified.substring(0, modified.length() - 3) + "]";

		// ["demir", "deniz", "nadir", "mete"]
	}

	// write a function that returns the max number in an array

	public static int getMax(int[] array) {

		// int max = Integer.MIN_VALUE;
		int max = array[0];
		for (int number : array) {
			if (number > max) {
				max = number;
			}
		}

		return max;
	}

	// array, value
	// remove an element from an array
	// resizing the array
	// returning array
	public static int[] removeFromArray(int[] array, int value) {
		int counterForValue = 0;
		// keep track of the occurence of that value
		for (int number : array) {
			// because we just read the data,
			// it is okay to use enhanced for loop
			if (number == value) {
				counterForValue++;
			}
		}
		// create a new array but smaller so it has enough size for the new elements
		// if my array has 8 elements, and if I remove 3 of them, copiedArray must have
		// 5 elements.
		int[] copiedArray = new int[array.length - counterForValue];
		// [0, 0, 0, 0, 0] // initial values in our int array
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != value) {
				// it is not our value which means we can transfer it to new array
				// use the counter index, because it only increments in this code block and is
				// safe
				copiedArray[counter++] = array[i];
			}
		}

		// return its reference so we can access it
		return copiedArray;
	}
	
	public static int[] getRandomArray(int min, int max, int length) {
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = (int) (Math.random() * (max - min + 1)) + min;
		}
		
		return arr;
	}
	public static ArrayList<Integer> getRandomArrayList(int min, int max, int length) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			arr.add((int) (Math.random() * (max - min + 1)) + min);
		}
		return arr;
	}
	
	
	public static String get2DArrayAsString(int[][] arr) {
		String s = "[";
		
		
		for (int i = 0; i < arr.length; i++) {
			s+= "\n[";
			for (int j = 0; j < arr[i].length; j++) {
				s+= arr[i][j] + ", ";
			}
			
			s+= "],";
		}
		
		
		s += "\n]";
	
		return s;
	}

}
