package Library;

import java.util.Scanner;

public class Reader extends People {
	//attributes
	private String account;
	private String password;
	private String dayRegister;
	private String email;
	private String timeLimit_card;
	private String idAccount;
	
	//constructor
	public Reader() {
		super();
	}
	
	//constructor all attributes	
	public Reader(String idAccount, String account, String password, String dayRegister, String email, String timeLimit_card) {
		super();
		this.idAccount = idAccount;
		this.account = account;
		this.password = password;
		this.dayRegister = dayRegister;
		this.email = email;
		this.timeLimit_card = timeLimit_card;
	}
	
	//set get attributes
	public String getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDayRegister() {
		return dayRegister;
	}

	public void setDayRegister(String dayRegister) {
		this.dayRegister = dayRegister;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTimeLimit_card() {
		return timeLimit_card;
	}

	public void setTimeLimit_card(String timeLimit_card) {
		this.timeLimit_card = timeLimit_card;
	}
	
	//set all attributes
	public void setall(String idAccount, String account, String password, String dayRegister, String email, String timeLimit_card) {
		super.setall(account, idAccount, password, dayRegister, email, timeLimit_card);
		this.idAccount = idAccount;
		this.account = account;
		this.password = password;
		this.dayRegister = dayRegister;
		this.email = email;
		this.timeLimit_card = timeLimit_card;
	}
	//input
		public void input() {
			Scanner sc = new Scanner(System.in);
			super.input();
			
			System.out.println("Import ID Account: ");
			idAccount = sc.nextLine();
			
			System.out.println("Import Account: ");
			account = sc.nextLine();
			
			System.out.println("Import Password: ");
			password = sc.nextLine();
			
			System.out.println("Import Day Register: ");
			dayRegister = sc.nextLine();
			
			System.out.println("Import Email: ");
			email = sc.nextLine();
			
			System.out.println("Import Time-Limit Card: ");
			timeLimit_card = sc.nextLine();
			
			sc.close();
		}
	//output
		public void output() {
			super.output();
			System.out.println("ID Account: " + getIdAccount());
			System.out.println("Accout: " + getAccount());
			System.out.println("Password: " + getPassword());
			System.out.println("Day Register: " + getDayRegister());
			System.out.println("Email: " + getEmail());
			System.out.println("Time-Limit Card: " + getTimeLimit_card());
		}
}