package helloapagain;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	int x = 10;
	int y = 5;
	
	boolean firstCondition = (y / x) == 0;
	boolean secondCondition  = (x != 0);
	

	
	System.out.println(firstCondition ||  secondCondition);
	}
	
	
	public static void multiplicationEasy() {

		for (int firstNumber = 2; firstNumber <=10; firstNumber += 2) {
		
			// 2 x 10 = 20
			for (int secondNumber = 1; secondNumber <= 10; secondNumber++) {
				System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
			}
			System.out.println("");
		}
	}
 	public static void multiplicationHard() {
		//Task: Write a program to display a multiplication table (1–10).
		//Skip rows where the multiplier is odd (use continue).
		//Stop completely if the product exceeds 50 (use break).
	
		// Instead of incrementing i++, we can just use i += 2; and remove the if (i % 2 ==1) statement.
	for (int i = 1; i <= 10; i++) {
			
			// check if it's an odd number.
			if (i % 2 == 1) {
				continue;
			}
			// 2 x 5 = 10
			for (int j = 1; j <= 10; j++) {
				int product = i * j;
			
				//Stop completely if the product exceeds 50 (use break).
				if (product > 50) {
					break;
				}
				
				System.out.println(i + " x " + j + " = " + product);
			}
			
			System.out.println("");
		}
	}
	
	public static void  palindromeStuff(String text) {
		String palindromeText = "Delia Saw I Was Ailed";
		String sentence = "There is a ladybug over there!";

		
		StringManipulator manipulator = new StringManipulator();
		
		System.out.println(manipulator.isPalindrome(palindromeText));
// Borrow or rob
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
		Item item6 = new Item("Brownies", 3, 6.24);
		Item item7 = new Item("Chips", 5, 6.24);
		Item item8 = new Item("Coke", 2, 6.24);
		Item item9 = new Item("Apple juice", 1, 6.24);
		Item item10 = new Item("Orange juice", 1, 6.24);


		
		VendingMachine machine1 = new VendingMachine(item1, item2, item3, item4, item5);
		VendingMachine machine2 = new VendingMachine(item10, item3, item7, item4, item5);
		User user1 = new User("deniz", 4);
		
		String name;
		double money;
		
		machine2.showSnacks();
		
		while(machine2.operate(user1)) {
			machine2.showSnacks();

			// change the value of canOperate when the user wanted to leave
			
		}
	}
	
	
}






	
	









// (int) (Math.random() * (max - min + 1)) + min

	


