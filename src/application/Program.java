package application;



import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: seller finById  ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TESTE 2: seller finByDepartment  ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 3: seller findAll ====");
		list = sellerDao.findAll();
		for(Seller obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 4: seller insert ====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id =  " + newSeller.getId());
		
		System.out.println("\n=== TESTE 5: seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		seller.setEmail("marta@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update Completed!");
		
		System.out.println("\n=== TESTE 6: seller delete ====");
		System.out.println("Enter id for delet test: ");
		int id = sc.nextInt();
		sellerDao.deletById(id);
		System.out.println("Delete complete!");

	}

}
