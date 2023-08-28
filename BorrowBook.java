package Library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BorrowBook{
	private String dayBorrow;
	private String idCustomner;
	private String nameCustomer;
	private String idBook;
	private String nameBook;
	private int quantity;
	
	public String getDayBorrow() {
		return dayBorrow;
	}
	public void setDayBorrow(String dayBorrow) {
		this.dayBorrow = dayBorrow;
	}
	public String getIdCustomner() {
		return idCustomner;
	}
	public void setIdCustomner(String idCustomner) {
		this.idCustomner = idCustomner;
	}
	public String getNameCustomer() {
		return nameCustomer;
	}
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}
	public String getIdBook() {
		return idBook;
	}
	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}
	public String getNameBook() {
		return nameBook;
	}
	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BorrowBook(String dayBorrow, String idCustomner, String nameCustomer, String idBook, String nameBook,
			int quantity) {
		super();
		this.dayBorrow = dayBorrow;
		this.idCustomner = idCustomner;
		this.nameCustomer = nameCustomer;
		this.idBook = idBook;
		this.nameBook = nameBook;
		this.quantity = quantity;
	}
	
	public BorrowBook(String idBook, String nameBook, int quantity) {
		super();
		this.idBook = idBook;
		this.nameBook = nameBook;
		this.quantity = quantity;
	}
	
	public BorrowBook(String idCustomer, String nameCustomer) {
		super();
		this.idCustomner = idCustomer;
		this.nameCustomer = nameCustomer;
	}
	public BorrowBook() {
		super();
	}
	
	public void decreaseBook(ArrayList<BorrowBook> booklist) {
	    boolean found = false;
	    for(BorrowBook book : booklist) {
	        if(book.getIdBook().equals(idBook)) {
	            book.setQuantity(book.getQuantity()-1);
	            found = true;
	        }else if(book.getQuantity() == 0) {
	            System.out.println("Empty");
	        }
	        break;
	    }
	    if(!found) {
	        System.out.println("Not found");
	    }
	}
	
	public static boolean check(Scanner sc) {
		String choice;
		System.out.println("Order More ?? Yes(Y) or No(N) ");
		while(true) {
		choice = sc.nextLine();
			if(choice.equalsIgnoreCase("N") || choice.equalsIgnoreCase("Y")) break;
			System.out.println("Invalid Choice, Input Again!! ");
		}	
		return choice.equalsIgnoreCase("Y") ;
	}
	
	public ArrayList<BorrowBook> enterbrBook(Scanner sc){
		ArrayList<BorrowBook> list = new ArrayList();
		boolean exit = false;
		while(!exit) {
			System.out.println("Enter ID Customer: ");
			idCustomner = sc.nextLine();
			System.out.println("Enter Name Customer: ");
			nameCustomer = sc.nextLine();
			System.out.println("Enter ID Book: ");
			idBook = sc.nextLine();
			System.out.println("Enter Name Book: ");
			nameBook = sc.nextLine();
			System.out.println("Enter Quantity: ");
			quantity = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Day Borrow: ");
			dayBorrow = sc.nextLine();
			BorrowBook borrowBook = new BorrowBook(idCustomner, nameCustomer, idBook, nameBook, dayBorrow, quantity);
	        list.add(borrowBook);
	        decreaseBook(list);
	        fWriterBook(list);
	        if (!check(sc)) {
		        exit = true;
				}
	    	}
	    return list;
		}
			
	public void printInfo(ArrayList<BorrowBook> list) {
		for(BorrowBook borrow : list ) {
			System.out.println("ID Book: " + getIdBook());
			System.out.println("Name Book: " + getNameBook());
			System.out.println("Quantity: " + getQuantity());
			System.out.println("ID Customer: " + getIdCustomner());
			System.out.println("Name Customer: " + getNameCustomer());
		}
	}
	
	public ArrayList<BorrowBook> Readerbrbook(){
		ArrayList<BorrowBook> list = new ArrayList<BorrowBook>();
		try {
			FileReader fReader = new FileReader("/Users/belle/eclipse-workspace/NewBtap/src/Library/Book");
			BufferedReader bReader = new BufferedReader(fReader);
			while(true) {
				String line = bReader.readLine();
				if(line == null || line == "") break;
				String[] temp = line.split("[;]");
				BorrowBook data = new BorrowBook(temp[0], temp[1], Integer.parseInt(temp[2]));
				list.add(data);
			}
			bReader.close();
			fReader.close();
		} catch (Exception e) {
			 e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<BorrowBook> ReaderCustomer(){
	    ArrayList<BorrowBook> list = new ArrayList<BorrowBook>();
	    try {
	        FileReader fReader = new FileReader("/Users/belle/eclipse-workspace/NewBtap/src/Library/Customer");
	        BufferedReader bReader = new BufferedReader(fReader);
	        while(true) {
	            String line = bReader.readLine();
	            if(line == null || line == "") break;
	            String[] temp = line.split("[;]");
	            BorrowBook data = new BorrowBook(temp[0], temp[1]);
	            list.add(data);
	        }
	        bReader.close();
	        fReader.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return list;
	}
	 
	public void fWriterBook(ArrayList<BorrowBook>list) {
	    try {
	        FileWriter fWriter = new FileWriter("/Users/belle/eclipse-workspace/NewBtap/src/Library/Bill");
	        BufferedWriter bWriter = new BufferedWriter(fWriter);
	        for(BorrowBook data : list) {
	            bWriter.write(data.getIdBook() + ";" + data.getNameBook() + ";" + data.getQuantity() + ";" + data.getIdCustomner() + ";" + data.getNameCustomer());
	            bWriter.newLine();
	        }
	        bWriter.close();
	        fWriter.close();
	    }  catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public void choice() {
		Scanner sc = new Scanner(System.in);
		ArrayList<BorrowBook> list = new ArrayList<BorrowBook>();
		boolean exit = false;
		while(!exit) {
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
	            list = enterbrBook(sc);
	            break;
	        case 2:
	            printInfo(list);
	            break;
	        case 3:
	            fWriterBook(list);
	            break;
	        case 4:
	            exit = true;
	            break;
	        default:
				System.out.println("Invalid Choice!");
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		BorrowBook brBook = new BorrowBook();	
		brBook.choice();
	}
}

