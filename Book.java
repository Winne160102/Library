package Library;

import java.util.Scanner;

public class Book {
	
	//attributes
	private String id;
	private String name;
	private String genre;
	private String dayPublish; // ngày xuất bản
	private String publishHouse;
	private String author;
	private String language;	
	private String rePrint;
	
	//constructor
	public Book() {
		
	}
	
	//constructor all attributes
	public Book(String id, String name, String genre, String dayPublish, String publishHouse, String author, String language, String rePrint ) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.dayPublish = dayPublish;
		this.publishHouse = publishHouse;
		this.author = author;
		this.language = language;
		this.rePrint = rePrint;
	}

	//set & get attributes
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDayPublish() {
		return dayPublish;
	}

	public void setDayPublish(String dayPublish) {
		this.dayPublish = dayPublish;
	}

	public String getPublishHouse() {
		return publishHouse;
	}

	public void setPublishHouse(String publishHouse) {
		this.publishHouse = publishHouse;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRePrint() {
		return rePrint;
	}

	public void setRePrint(String rePrint) {
		this.rePrint = rePrint;
	}
	
	//set all attributes
	public void setall(String id, String name, String genre, String dayPublish, String publishHouse, String author, String language, String rePrint ) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.dayPublish = dayPublish;
		this.publishHouse = publishHouse;
		this.author = author;
		this.language = language;
		this.rePrint = rePrint;
	}
	
	//input
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Import ID : ");
		id = sc.nextLine();	
				
		System.out.println("Import Name: ");
		name = sc.nextLine();
		
		System.out.println("Import Genre: ");
		genre = sc.nextLine();
		
		System.out.println("Import Publish Day: ");
		dayPublish = sc.nextLine();
		
		System.out.println("Import Publish House: ");
		publishHouse = sc.nextLine();
		
		System.out.println("Import Author: ");
		author = sc.nextLine();
		
		System.out.println("Import Language: ");
		language = sc.nextLine();
		
		System.out.println("Import Reprint: ");
		rePrint = sc.nextLine();
		
		sc.close();
	}
	
	//output 
	public void output() {
		System.out.println("ID'sBook: " + getId());
		
		System.out.println("Name'sBook: " + getName());
		
		System.out.println("Genre: " + getGenre());
		
		System.out.println("Day'sPublish: " + getDayPublish());
		
		System.out.println("House'sPublish: " + getPublishHouse());
		
		System.out.println("Author: " + getAuthor());
		
		System.out.println("Language: " + getLanguage());
		
		System.out.println("Reprint: " + getRePrint());
	}
	
}
