package application;

import java.util.Date;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		/*Scanner sc = new Scanner(System.in);
		sc.close();*/
		
		Department books = new Department(1,"Books");
		
		Seller seller = new Seller(1, "Bob", "bob@gmail.com", new Date(), 750.00, books);
		
		System.out.println(books);
		System.out.println(seller);

	}

}
