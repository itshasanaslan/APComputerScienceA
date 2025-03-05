package unitfinal;

import java.util.Arrays;

import helloapagain.TaskManager;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] randomArray = {23, 87, 45, 12, 98, 67, 34, 76, 5, 90, 56, 32, 74, 19, 88, 41, 99, 3, 68, 25, 82, 47, 60, 14, 53, 95, 36, 11, 79, 50, 7, 92, 29, 64, 100, 39, 18, 70, 85, 9, 57, 33, 48, 20, 66, 97, 31, 80, 15, 61};
		System.out.println(randomArray.length);
		int x = findIndex(randomArray, 61);
	}
	
	
	// linear search
	public static int findIndex(int[] arr, int findThis) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == findThis) {
				return i;
			}
		}
		return -1;
	}

	//Start with the entire sorted array
	//Find the middle element
	//If it's the target → Done!
	//If it's too small, search in the right half
	//If it's too large, search in the left half
	//Repeat this process until you find the element or the search space is empty

   public static int binarySearch(int[] arr, int left, int right, int target) {
	       // 0,1,2,3,4,5,6,7,8,9,10,11
			   // find 10
			   //binarySearch(array, 0, 11, 10)
			   if (left > right) return -1;  // Base case: target not found

	        // find the item in the middle
	        int mid = left + (right - left) / 2; 

	        if (arr[mid] == target) return mid;  // Found target in the middle
	        
	        else if (arr[mid] < target) {
	        	return binarySearch(arr, mid + 1, right, target); // Search right half
	        }
	        else {
	        	 return binarySearch(arr, left, mid - 1, target); // Search left half
	        }
	    }
	

	  // Merge Sort is a divide and conquer sorting algorithm that
	  // Divides the array into two halves.
	  // Recursively sorts each half.
	  // Merges the two sorted halves into a single sorted array.

	    // Merge Sort function
	// array = 0,1,2,3,4,5,6,7,8,9,10,11
	//mergeSort(array, 0, 11)
	//ascending (from smallest to the greatest), opposite = descending
	// 0->100
	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            int mid = left + (right - left) / 2; // Find the middle

	            mergeSort(arr, left, mid);  // Sort left half
	            mergeSort(arr, mid + 1, right); // Sort right half

	            merge(arr, left, mid, right); // Merge the sorted halves
	        }
	    }
	    public static void merge(int[] arr, int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        int[] leftArr = new int[n1];
	        int[] rightArr = new int[n2];

	        // Copy data to temporary arrays
	        for (int i = 0; i < n1; i++) {
	            leftArr[i] = arr[left + i];
	        }
	        for (int j = 0; j < n2; j++) {
	            rightArr[j] = arr[mid + 1 + j];
	        }

	        // Merge the two sorted arrays
	        int i = 0, j = 0, k = left;
	        while (i < n1 && j < n2) {
	            if (leftArr[i] <= rightArr[j]) {
	                arr[k] = leftArr[i];
	                i++;
	            } else {
	                arr[k] = rightArr[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy remaining elements from leftArr
	        while (i < n1) {
	            arr[k] = leftArr[i];
	            i++;
	            k++;
	        }

	        // Copy remaining elements from rightArr
	        while (j < n2) {
	            arr[k] = rightArr[j];
	            j++;
	            k++;
	        }
	    }
	
		public static void printReverse(String[] arr, int index) {
			
			if (index < 0) return;
			
			System.out.print(arr[index]  +" ");		
			
			printReverse(arr, index - 1);
			
		}
		
		// recursion
		//recursive
		
		public static int factorial(int x) {
			
			// base condition
			if (x == 1) {
				System.out.println("Finally found x as:" + x);
				return x;
			}
			
			System.out.println("Calling factorial with x:" + (x-1) +" * " + x);
			return x * factorial(x - 1);
		}
		
	
	
}
