package helloapagain;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
		Item item1 = new Item("M&M", 10, 7.54);
		Item item2 = new Item("Ice-cream", 5, 10.23);
		Item item3 = new Item("Water", 5, 2.32);
		Item item4 = new Item("Ice tea", 10, 2.54);
		Item item5 = new Item("Chocolate", 1, 6.24);

		
		VendingMachine machine1 = new VendingMachine(item1, item2, item3, item4, item5);
		
		User user1 = new User("deniz", 4);
		
	
		
		// exit the while loop
		double x = 1;
		
		boolean canContinue = true;
		
		while (canContinue) {
			machine1.showSnacks();
			machine1.operate(user1);
		} 
		
	}
	
	public static boolean checkIfLeapYear(int year) {
	
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

	


