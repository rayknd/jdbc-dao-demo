package application;

import java.util.Date;
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
		
		System.out.println("\n\n === TEST 3: seller findAll ===");
		seller2 = sellerDao.findAll();
		seller2.forEach(System.out::println);
		
		System.out.println("\n\n === TEST 4: insert Seller ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new Id = " + newSeller.getId());
		
		System.out.println("\n\n === TEST 5: update Seller ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed!");
	}

}
