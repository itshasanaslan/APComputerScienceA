package unit6;

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

}
