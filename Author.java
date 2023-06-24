package Library;

import java.util.Scanner;

public class Author extends People{
	//attributes
	private String idAuthor;
	private String pseudonym;
	
	//constructor
	public Author() {
		super();
	}
	
	//constructor all
	public Author(String name, String id, String sex, String phoneNum, String address, String birthday, String idAuthor, String pseudonym) {
		super(name, id, sex, phoneNum, address, birthday);
		this.idAuthor = idAuthor;
		this.pseudonym = pseudonym;
	}

	//get&set attributes
	public String getIdAuthor() {
		return idAuthor;
	}

	public void setIdAuthor(String idAuthor) {
		this.idAuthor = idAuthor;
	}

	public String getPseudonym() {
		return pseudonym;
	}

	public void setPseudonym(String pseudonym) {
		this.pseudonym = pseudonym;
	}
	
	//set all attributes
	public void setall(String name, String id, String sex, String phoneNum, String address, String birthday, String idAuthor, String pseudonym) {
		super.setall(name, id, sex, phoneNum, address, birthday);
		this.idAuthor = idAuthor;
		this.pseudonym = pseudonym;
	}
	
	//input
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		
		System.out.println("Import ID Author: ");
		idAuthor = sc.nextLine();
		
		System.out.println("Import Pseudonym: ");
		pseudonym = sc.nextLine();
		
		sc.close();
	}
	
	public void output() {
		super.output();
		
		System.out.println("ID Author: " + getIdAuthor());
		
		System.out.println("Pseudonym: " + getPseudonym());
	}
}
