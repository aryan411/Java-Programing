/**
 * 
 */
package exercise1;

// driver class
public class Driver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singer singer = new Singer(); // Create Singer object
		System.out.println("Default value for string Object");
		System.out.println(singer.toString());
		singer.setData("1", "Ed Sheeran", "Unite States", "1-1-1996", 1000); // Setting the instance variables of object
		System.out.println("After setting up the data");
		System.out.println(singer.toString());

	}

}
