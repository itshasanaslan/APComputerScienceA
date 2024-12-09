package helloapagain;


/*
 * 
 * Write a method applyDiscount() and give a  double discountRate on the parameter. 
 * Apply the discount rate on the book price and print "The new price is: " +price.
 */



public class Book {

	// name
	// author
	// price
	
	private String name;
	private String author;
	private double price;
	
	
	// constructor
	public Book(String name, String bookAuthor, double bookPrice) {
		this.name = name;
		author = bookAuthor.substring(0, 1).toUpperCase() + bookAuthor.substring(1);
		price = bookPrice;
		System.out.println("The new book is created");

	}
	
	

	public String getAuthor() {
		return author;
	}
	
	// apply discount 15%
	public void applyDiscount(double discountRate) {
		
		// price * discountRate
		price = price - price * discountRate;
		System.out.println("Price is changed. The new price is: " + price );
		
	}
	
	public void printPrice() {
		System.out.println("Price:" + price );

	}
	
	
	// that gives the book price with a discount. But, I just want to check
	
	public double applyDiscountForTest(double discountRate) {
			return price - price * discountRate;
	}
	
	
	public void sayHello() {
		System.out.println("Hello ");
	}
	
	public void sayHello(String name) {

		System.out.println("Hello " + name);

	}
	
	
}


