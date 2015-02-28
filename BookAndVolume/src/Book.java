
public class Book {
	private String title;
	private String author;
	private int numberOfPages;
	
	public Book(){
		this("No title yet", "No author yet", 0);
	}
	public Book(String title, String author, int numberOfPages){
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	@Override
	public String toString(){
		return "Title: "+title+"\nAuthor: "+author+"\nNumber of pages: "+numberOfPages;
	}
	

}
