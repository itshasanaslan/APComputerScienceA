package unit6;

public class ArrayManipulator {

	
	public static String getArrayAsString(String[] someArray) {
		String modified = "[\"";
		
		for (String element: someArray) {
			
			modified += element + "\", \"";
		}
		
		return modified.substring(0, modified.length() - 3) + "]";
	
		// ["demir", "deniz", "nadir", "mete"]
	}
	
	
	
	public static String getArrayAsString(int[] someArray) {
		String modified = "[";
		
		
		for (int element: someArray) {
			
			modified += element + ", ";
		}
		
		return modified.substring(0, modified.length() - 2) + "]";
	
		// ["demir", "deniz", "nadir", "mete"]
	}
	
	
	
	public static String getArrayAsString(boolean[] someArray) {
		String modified = "[\"";
		
		for (boolean element: someArray) {
			
			modified += element + "\", \"";
		}
		
		return modified.substring(0, modified.length() - 3) + "]";
	
		// ["demir", "deniz", "nadir", "mete"]
	}
	
	
	
	// write a function that returns the max number in an array
	
	public static int getMax(int[] array) {
		
		//int max = Integer.MIN_VALUE;
		int max = array[0];
		for (int number :array) {
			if (number > max) {
				max = number;
			}
		}
		
		return max;
	}
	
	
	
	
	/*
	 * 

min return the min element in the array
3sum return the sum
4occurence {1,3,4,3, 5, 3, 1}   (array, 3);






	 * 
	 */
	
	
	
}
