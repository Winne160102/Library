package Library;

import java.util.Scanner;

public class BookManage {
	//attributes 
	private String dayBorrow;
	private String dayReturn;
	private String delayReturn;
	
	//constructor
	public BookManage(String dayBorrow, String dayReturn, String delayReturn) {
		this.dayBorrow = dayBorrow;
		this.dayReturn = dayReturn;
		this.delayReturn = delayReturn;
	}
	
	//set&get attributes
	public String getDayBorrow() {
		return dayBorrow;
	}
	public void setDayBorrow(String dayBorrow) {
		this.dayBorrow = dayBorrow;
	}
	public String getDayReturn() {
		return dayReturn;
	}
	public void setDayReturn(String dayReturn) {
		this.dayReturn = dayReturn;
	}
	public String getDelayReturn() {
		return delayReturn;
	}
	public void setDelayReturn(String delayReturn) {
		this.delayReturn = delayReturn;
	}
	
	//set all attributes
	public void setall(String dayBorrow, String dayReturn, String delayReturn) {
		this.dayBorrow = dayBorrow;
		this.dayReturn = dayReturn;
		this.delayReturn = delayReturn;
	}
	
	//input
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Import Borrowing Day: ");
		dayBorrow = sc.nextLine();
		
		System.out.println("Import Returning Day: ");
		dayReturn = sc.nextLine();
		
		System.out.println("Import Returning Delay: ");
		delayReturn = sc.nextLine();
		
		
		sc.close();
	}
	
	//output
	public void output() {
		System.out.println("Import Borrowing Day: " + getDayBorrow());
		
		System.out.println("Import Returning Day: " + getDayReturn());
		
		System.out.println("Import Returning Dalay: " + getDelayReturn());
	}
}
