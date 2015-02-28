
public class Book {
	private String title;
	private String author;
	private int numberOfPages;
	
	public Book(){//default constructor
		this("No title yet", "No author yet", 0);
	}
	public Book(String title, String author, int numberOfPages){//another constructor
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	@Override
	public String toString(){
		return "Title: "+title+"\nAuthor: "+author+"\nNumber of pages: "+numberOfPages;
	}
}
