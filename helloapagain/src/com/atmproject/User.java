package com.atmproject;

public class User {
	private String name;
	
	private double accountBalance;
	private String pin;

	public User(String name, double accountBalance, String pin) {
		this.name = name;
		this.accountBalance = accountBalance;
		this.pin = pin;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public String toString() {
		int indexOfSpace = name.indexOf(" ");
		return name.substring(0, 1)  + "****"+  " " + name.substring(indexOfSpace +1 , indexOfSpace+2) + "****  || Account Balance: $" +  accountBalance;

	}
	
	public boolean deposit(double amount) {
		if (amount < 0) {
			System.out.println("ERROR! Value must be greater than 0");
			return false;
		}
		else {
				accountBalance += amount;
				System.out.println("SUCCESS! $" + amount + " is added to your account");
				System.out.println(this);
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
			System.out.println(this);
			return true;
		}
	}
	

	
}
