package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		List<Department>deps = new ArrayList<Department>();
		System.out.println("\n\n === TEST 2: department findAll ===");
		deps = departmentDao.findAll();
		deps.forEach(System.out::println);

		System.out.println("\n\n === TEST 3: department Insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new Id = " + newDepartment.getId());

		System.out.println("\n\n === TEST 4: update Department ===");
		department = departmentDao.findById(1);
		department.setName("Martha Wayne");
		departmentDao.update(department);
		System.out.println("Update completed!");

		System.out.println("\n\n === TEST 5: delete Department ===");
		System.out.println("Informe o id para ser deletado: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");

		sc.close();

	}

}
