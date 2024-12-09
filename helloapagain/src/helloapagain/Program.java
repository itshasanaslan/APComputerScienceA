package helloapagain;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// LEAP YEARS
	
		int year = 2024;
		
		
		//NESTED IF STATEMENTS
		
		
		// create a function that return a boolean: if the integer is  a leap year or not
		// simplify the statements
		
		boolean isLeapYear = checkIfLeapYear(2024);
		if (isLeapYear) {
			System.out.println("Leap");
		}
		else {
			System.out.println("not leap");

		}
		
	}
	
	
	public static boolean checkIfLeapYear(int year) {
		// first: can it be divided by 4:
				//true:
					// -> if it's divisible by 100:
						// if true:
							// can it be divided by 400
								// 
						//if false, false
				
				//False -> it's a leap year
	return  (year % 4 ==0 && (year % 100 !=0 || year % 400 ==0));
	}
	
}






	
	




/*
 * Challenges:

// Create a function which changes the random number. example: manager.randomizeAgain(); This function also prints that "New random number is generated between min and max." Also provide the min and max.

//Whenever user guesses the number correctly, congratulate and randomizeAgain() inside play() function;

//When creating GameManager object, give min and max values as parameters.
 */










// (int) (Math.random() * (max - min + 1)) + min

	


