package helloapagain;

import java.util.Scanner;

public class VendingMachine {
	
	
	// declaring an array
	private Item[] items;
	
	
	public VendingMachine(Item[] items) {
		this.items = items;
	}
	
	

	
	// 
	
	// 1) Name Stock Price
	
	public void showSnacks() {
		System.out.println("---------------------------------");
		//System.out.println("1) " +  item1.toText());
		
		/*
		int counter = 1;
		for (Item thatItem : this.items) {
			System.out.println( counter + ") " +  thatItem.toText());
			counter++;
		}
		*/
		
		for (int i = 1 ;  i < this.items.length + 1;i++) {
			Item thatItem = this.items[i];
			System.out.println( i + ") " +  thatItem.toText());
		}
		
		System.out.println("---------------------------------");
	}
	
	
	public boolean operate(User user) {
	
		System.out.print("You are here to buy: ");
		Scanner scanner = new Scanner(System.in);
		
		int selection = scanner.nextInt();
		selection--;
		if (selection < 0 || selection > this.items.length -1) {
			System.out.println("That item does not exist");
		}
		else {
			this.buy(user, this.items[selection]);
		}
		

		return true;
		
	}
	
	public void buy(User currentUser, Item whichItem) {
		// check stock
		if (itemExists(whichItem)) {
				
			// check user's money
			if (currentUser.money >= whichItem.price) {
				whichItem.stock -= 1;
				
				currentUser.money -= whichItem.price;
				System.out.println("You bought the item. Current balance: $" +  currentUser.money);
			}
			else {
				System.out.println("You don't have the sufficient funds! Current balance: $" +  currentUser.money);
			}
		}
		else {
			System.out.println("Item is run out of stock!");
		}
	}
	
	public boolean itemExists(Item item) {
		return item.stock > 0;
	}
	
}
