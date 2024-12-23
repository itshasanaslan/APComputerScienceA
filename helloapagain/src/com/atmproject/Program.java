package com.atmproject;

public class Program {

	public static void main(String[] args) {
		
		// instance
		ATM atm1 = new ATM("Paypal", 10000);
		
		User user1 = new User("Elon Musk", 15000.21,  "1234");
		
		if (atm1.validatePin("1234", user1)) {
			atm1.showMenu(user1);
		}
		
	}

}
