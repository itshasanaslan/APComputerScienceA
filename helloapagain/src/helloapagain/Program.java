package helloapagain;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Book book = new Book("Lord of the Rings", "Tolkien", 1950,false);
			book.checkOut();
			book.returnBook();
			System.out.println(book.toString());
	
			Scanner scanner = new Scanner(System.in);
			
			String val = "1";
			while(val != "") {
				System.out.print(val);
				val = scanner.nextLine();
			}
			
			System.out.println("Finished!!");
			
	}
	
	public static void temp() {
		
		// int, double, bit 0 1 0= false, 1=true
		
		int myAge= 26; // age is a variable
		// a pair of shoes 50.43 dollars
		
		double price = 50;
		// store me a bit about if I like ice-cream or not
		boolean iLikeIt = false;
		
		// binary, character a b c d e f g
		byte x = 70; // ASCII -F-

		  
		// string
		// 68 72 63 82 83

		// char N, char A, Char D, char I, char R
		int age = 26;
		double temperature = 25.2;
		char firstLetter = 'A';
		String name = "Aslan";
		boolean doILove = true;
	}
}
