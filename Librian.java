package Library;

import java.util.Scanner;

public class Librian extends People{
	//attributes
	private String idPersonel;
	private String worktime;
	
	//constructor
	public Librian() {
		super();
	}
	
	//constructor
	public Librian(String name, String id, String sex, String phoneNum, String address, String birthday, String idPersonel, String worktime) {
		super(name, id, sex, phoneNum, address, birthday);
		this.idPersonel = idPersonel;
		this.worktime = worktime;
	}
	
	//get&set attributes
	public String getIdPersonel() {
		return idPersonel;
	}
	public void setIdPersonel(String idPersonel) {
		this.idPersonel = idPersonel;
	}
	public String getWorktime() {
		return worktime;
	}
	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}
	
	//set all attributes
	public void setall(String name, String id, String sex, String phoneNum, String address, String birthday, String idPersonel, String worktime) {
		super.setall(name, id, sex, phoneNum, address, birthday);
		this.idPersonel = idPersonel;
		this.worktime = worktime;
	}
	//input
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		
		System.out.println("Import ID Personel: ");
		idPersonel = sc.nextLine();
		
		System.out.println("Import Worktime: ");
		worktime = sc.nextLine();

		sc.close();
	}
	
	//output
	public void output() {
		super.output();
		
		System.out.println("Id Personel: " + getIdPersonel());
		
		System.out.println("Worktime: " + getWorktime());
	}
}
