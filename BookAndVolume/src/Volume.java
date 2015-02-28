
public class Volume {
	private String volumeName;
	private int numberOfBooks;
	public Book[] book;
	
	public Volume (String volumeName, int numberOfBooks){
		this.volumeName = volumeName;
		this.numberOfBooks = numberOfBooks;
		book = new Book[numberOfBooks];
		for(int counter = 0; counter < book.length; counter++){
			book[counter] = new Book();
		}
	}
	
	public Volume (){
		this("no name yet", 1);
	}
	@Override
	public String toString(){
		 return "Volume Name: "+volumeName+"\nNumber of Books: "+numberOfBooks;
	}
}
