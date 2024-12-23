package com.atmproject;

public class User {
	String name;
	double accountBalance;
	String pin;

	public User(String name, double accountBalance, String pin) {
		this.name = name;
		this.accountBalance = accountBalance;
		this.pin = pin;
	}
	
	public void printBalance () {
		System.out.println(name + "  || Account Balance: $" +  accountBalance);
	}
	
	
	public boolean deposit(double amount) {
		if (amount < 0) {
			System.out.println("ERROR! Value must be greater than 0");
			return false;
		}
		else {
				accountBalance += amount;
				System.out.println("SUCCESS! $" + amount + " is added to your account");
				printBalance();
				return true;
		}
		
	}
	
	public boolean withdraw(double amount) {
		if (amount < 0) {
			System.out.println("ERROR! Value must be greater than 0");
			return false;
		}
		
		else if (amount > accountBalance) {
			System.out.println("ERROR! You don't have the sufficient funds!");
			return false;
		}
		else {
			accountBalance -= amount;
			System.out.println("SUCCESS! $" + amount + " is withdrawn from your account");
			printBalance();
			return true;
		}
	}
	
	
}
