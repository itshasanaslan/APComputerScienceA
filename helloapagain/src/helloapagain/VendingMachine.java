package helloapagain;

import java.util.Scanner;

public class VendingMachine {
	
	Item item1;
	Item item2;
	Item item3;
	Item item4;
	Item item5;
	
	
	public VendingMachine(Item item1, Item item2, Item item3, Item item4, Item item5) {
		
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
	}
	
	
	// 1) Name Stock Price
	
	public void showSnacks() {
		System.out.println("---------------------------------");
		System.out.println("1) " +  item1.toText());
		System.out.println("2) " +  item2.toText());
		System.out.println("3) " +  item3.toText());
		System.out.println("4) " +  item4.toText());
		System.out.println("5) " +  item5.toText());
		System.out.println("---------------------------------");
	}
	
	
	public void operate(User user) {
		System.out.print("You are here to buy: ");
		Scanner scanner = new Scanner(System.in);
		
		int selection = scanner.nextInt();
		
		if (selection == 1) {
			this.buy(user, item1);
		}
		else if (selection == 2) {
			this.buy(user, item2);
		}
		else if (selection == 3) {
			this.buy(user, item3);
		}else if (selection == 4) {
			this.buy(user, item4);
		}else if (selection == 5) {
			this.buy(user, item5);
		}
		else {
			System.out.println("We don't have that product.");
		}
	
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
