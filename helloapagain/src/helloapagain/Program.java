package helloapagain;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		String sentence = "There is a ladybug over there!";
		System.out.println( removeSpaces(sentence) );

	}
	
	
	public static String removeSpaces(String text) {
		String anotherString = "";
		
		for (int i = 0; i < text.length(); i++ ) {
			
			if (text.charAt(i) != ' ') {
				anotherString += text.charAt(i);
			}	
		}
		
		return anotherString;
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

	


