package application;

import java.util.Locale;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		/*Scanner sc = new Scanner(System.in);
		sc.close();*/
		
		Department books = new Department(1,"Books");
		
		System.out.println(books);

	}

}
