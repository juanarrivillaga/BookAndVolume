
public class Volume {
	private String volumeName;
	private int numberOfBooks;
	private Book[] book;
	
	public Volume (String volumeName, int numberOfBooks, Book [] bookToAdd){ //constructor
		this.volumeName = volumeName;
		this.numberOfBooks = numberOfBooks;
		book = bookToAdd;
		
	}
	
	public Volume (){// default constructor: USE AT YOUR OWN RISK: NULL POINTER MAY OCCUR
		this("no name yet", 0, null);
	}
	@Override
	public String toString(){//note to get info about books within volume use getBookArray()
		 return "Volume Name: "+volumeName+"\nNumber of Books: "+numberOfBooks;
	}
	public String getBookArray(){
		String str = "\n";
		
		for (int counter = 0; counter < book.length; counter++){ //use counter-controlled repetition to construct a string
			str = str + " " +(counter + 1)+":\n"+ book[counter]+"\n"; // use string concatenation
		}
		return str;
	}
	
}
