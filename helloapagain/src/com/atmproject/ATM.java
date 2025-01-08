package com.atmproject;

import java.util.Scanner;

public class ATM {
	private String name;
	private double balance;
	
	public ATM(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	// override constructor

	
	public ATM() {
		// to be able to give the values later
	}


	// GETTERS
	
	public String getName() {
		return this.name;
	}
	
	
	public double getBalance() {
		return this.balance;
	}
	
	
	// MUTATOR / SETTERS
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	 
	
	public boolean validatePin(String inputPin, User user) {
		if (inputPin == user.getPin()) {
			System.out.println("User logged in. Welcome to " + name + " ATM!");
			 System.out.println(user);
			return true;
		}
		
		System.out.println("INVALID PIN!");
		return false;
		
	}
	
	public void showMenu(User user) {
		String text = """
1. View account balance.
2. Deposit money.
3. Withdraw money.
4. Exit.
""";
		System.out.println(text);

		boolean proceed = true;
		int selection;
		Scanner sc = new Scanner(System.in);
		
		while (proceed)  {
			System.out.print("Operation (1-4): ");
			selection =sc.nextInt();
			if (selection == 1) {
				System.out.println(user);

			}
			else if (selection == 2) {
				System.out.println("Current operation: Deposit" );
				System.out.print("Enter the amount: $" );
				double amount = sc.nextDouble();
				boolean success = user.deposit(amount);
				if (success) {
					// update atm balance
					balance += amount;
				}
			} 
			else if (selection == 3) {
				System.out.println("Current operation: Withdraw" );
				System.out.print("Enter the amount: $" );
				double amount = sc.nextDouble();
				// missing logic. We don't know if the atm has the sufficient money.
				
				
				if (amount <= balance) {
					boolean success = user.withdraw(amount);
					if (success) {
						// update atm balance
						balance -= amount;
					}
				}
				
				else {
					System.out.println("We don't have the sufficient funds. You can visit the nearest atm");
				}
				
				
				
			
			}
			else if (selection == 4) {
				proceed = false;
			}
			else {
				System.out.println("Invalid command.");
			}
			
			
			sc.nextLine();
			System.out.println("Press anything to continue...");
			sc.nextLine();
			System.out.println("-------------------------------------");
			System.out.println(text);

			if (!proceed) {
				for (int i = 0; i < 4; i ++) {
					System.out.println("************");
				}
				System.out.println("GOODBYE!");
			}
			
		}
		
		
	}

	
}
