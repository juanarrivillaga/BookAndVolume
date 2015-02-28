
public class DemoVolume {

	public static void main(String[] args) {
		Book[] book = new Book [3]; // create array of book objects
		
		//array small enough to initialize each object individually, but could use counter-controlled repetition
		book[0] = new Book("Winter 1963", "Don Draper", 122);
		book[1] = new Book("Spring 1964", "Don Draper ", 98);
		book[2] = new Book("Summer 1964", "Don Draper", 208);
		
		//create volume object - diary with three books
		Volume volume1 = new Volume("Diary", 3,book);
		//implicitely call toString method and explicitly call getBookArray to display properties of volume1
		System.out.print(volume1);
		System.out.println(volume1.getBookArray());

	}

}
/* SAMPLE OUTPUT:
------------------ 
Volume Name: Diary
Number of Books: 3
 1:
Title: Winter 1963
Author: Don Draper
Number of pages: 122
 2:
Title: Spring 1964
Author: Don Draper 
Number of pages: 98
 3:
Title: Summer 1964
Author: Don Draper
Number of pages: 208
---------------------
*/