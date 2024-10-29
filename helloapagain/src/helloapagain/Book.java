package helloapagain;

public class Book {

	private String title;
	private String author;
	private int year;
	private boolean checkedOut;
	
	public Book(String title, String author, int year, boolean checkedOut) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.checkedOut = checkedOut;
	}


	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isCheckedOut() {
		return checkedOut;
	}
	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	
	public void checkOut() {
		setCheckedOut(true);
	}
	
	public void returnBook() {
		setCheckedOut(false);
	}
	
	public String toString() {
		return getTitle() +  " by " + getAuthor() + "(" + year + ")" + ".On library: " + !isCheckedOut();
	}
	
}
