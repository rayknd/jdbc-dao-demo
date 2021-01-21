package application;

import java.util.List;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		/*Scanner sc = new Scanner(System.in);
		sc.close();*/
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Department dep = new Department(2, "Eletronics");
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n\n === TEST 2: seller findByDepartment ===");
		List<Seller> seller2 = sellerDao.findByDepartment(dep);
		seller2.forEach(System.out::println);
		
		

	}

}
