package exercise1;
import java.sql.Date;

public class Singer {
	
	private String id; // instance variable Id
	private String name; // instance variable name
	private String address; // instance variable address
	private String date; // instance variable date
	private int numberOfAlbums; // instance variable numberOfAblums
	/**
	 * @param id
	 * @param name
	 * @param address
	 * @param date
	 * @param numberOfAlbums
	 */
	public Singer(String id, String name, String address, String date, int numberOfAlbums) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.date = date;
		this.numberOfAlbums = numberOfAlbums;
	}
	/**
	 * @param id
	 * @param name
	 * @param address
	 * @param date
	 */
	public Singer(String id, String name, String address, String date) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.date = date;
		this.numberOfAlbums = 0;
	}
	/**
	 * @param id
	 * @param name
	 * @param address
	 */
	public Singer(String id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.date = null;
		this.numberOfAlbums = 0;
	}
	/**
	 * @param id
	 * @param name
	 */
	public Singer(String id, String name) {
		this.id = id;
		this.name = name;
		this.address = null;
		this.date = null;
		this.numberOfAlbums = 0;
	}
	/**
	 * @param id
	 */
	public Singer(String id) {
		this.id = id;
	}
	public Singer() {
		this.id = null;
		this.name = null;
		this.address = null;
		this.date = null;
		this.numberOfAlbums = 0;
	}
	// setter for all instance variables;
	public void setData(String id, String name, String address, String date, int numberOfAlbums) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.date = date;
		this.numberOfAlbums = numberOfAlbums;
	}
	// override toString
	@Override
	public String toString() {
		return "Singer:\n\t"+"Id:- "+this.id+"\n\tName:- "+this.name+"\n\tAddress:- "+this.address+"\n\tDate Of Birth:- "+this.date+"\n\tNumber od albums:- "+this.numberOfAlbums;
		
	}
	/**
	 * @return the id
	 * getter for id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 * setter id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 * getter name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 * setter name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 * getter address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 * setter address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the date
	 * getter date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 * setter date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the numberOfAlbums
	 * getter NumberOfAlbums
	 */
	public int getNumberOfAlbums() {
		return numberOfAlbums;
	}
	/**
	 * @param numberOfAlbums the numberOfAlbums to set
	 * setter NumberOfAlbums
	 */
	public void setNumberOfAlbums(int numberOfAlbums) {
		this.numberOfAlbums = numberOfAlbums;
	}
}
