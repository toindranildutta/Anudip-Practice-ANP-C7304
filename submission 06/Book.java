package submission06;

import java.util.ArrayList;

public class Book {				
	public int bookId;
	public String bookName;
	public String authorName;
	
	@Override					
	public String toString() {		// Overriding to string method
		System.out.println();
		return "bookId = " + bookId + ", bookName = " + bookName + ", authorName = " + authorName ;
	}

	public Book (int id, String bname, String aname)		// parameterized constructor for book
	{
		this.bookId = id;
		this.bookName = bname;
		this.authorName = aname;
	}

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<Book>();		// empty array list with capacity 10
		books.add(new Book(1, "The Monk who sold his ferrari", "Robin Sharma"));
		books.add(new Book(2, "The Sage with Two Horns", "Sudha Murty"));
		books.add(new Book(3, "The Alchemist", "Paulo Coelho"));
		
		for(Book book : books)			// printing the book objects
		{
			System.out.println(book.toString());
		}
	}

}
