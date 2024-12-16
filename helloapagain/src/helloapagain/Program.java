package helloapagain;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		vendingMachineCaller();
	
		
		
	}
	
	public static boolean checkIfLeapYear(int year) {
	
	return  (year % 4 ==0 && (year % 100 !=0 || year % 400 ==0));
	}
	
	
public static void whileLoop() {
	int x = 1;
	Scanner sc = new Scanner(System.in);
	
	// 10
	
	int score = 5;
	
	// write a while loop to read an integer between 1-11
	// if it is true, exit
	//  false, reask the user to enter a score

	while ( !(score > 0 && score < 11)  ) {
		
		System.out.print("Enter a score 1-10: ");
		//read the number
		score = sc.nextInt();
		System.out.println();
	}
	
	System.out.println("Score is : " + score);

	
	
	//while statement to print even numbers between 1 to 30
}
	
	
	public static void vendingMachineCaller() {

		Item item1 = new Item("M&M", 10, 7.54);
		Item item2 = new Item("Ice-cream", 5, 10.23);
		Item item3 = new Item("Water", 5, 2.32);
		Item item4 = new Item("Ice tea", 10, 2.54);
		Item item5 = new Item("Chocolate", 1, 6.24);

		
		VendingMachine machine1 = new VendingMachine(item1, item2, item3, item4, item5);
		
		User user1 = new User("deniz", 4);
		
		machine1.showSnacks();
		
		while(machine1.operate(user1)) {
			machine1.showSnacks();

			// change the value of canOperate when the user wanted to leave
			
		}
	}
	
	
}






	
	




/*
 * Challenges:

// Create a function which changes the random number. example: manager.randomizeAgain(); This function also prints that "New random number is generated between min and max." Also provide the min and max.

//Whenever user guesses the number correctly, congratulate and randomizeAgain() inside play() function;

//When creating GameManager object, give min and max values as parameters.
 */










// (int) (Math.random() * (max - min + 1)) + min

	


