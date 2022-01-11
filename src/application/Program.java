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

		System.out.println("=== Test 1: seller findById ===");
		Seller seller = sellerDao.findyById(3);
		System.out.println(seller);

		System.out.println("\n=== Test 2: seller findByDepartment ===");
		Department dep = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(dep);

		for (Seller s : list) {
			System.out.println(s);
		}

		System.out.println("\n=== Test 3: seller findAll ===");
		list = sellerDao.findAll();

		for (Seller s : list) {
			System.out.println(s);
		}

//		System.out.println("\n=== Test 4: seller insert ===");
//
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
//		
//		sellerDao.insert(newSeller);
//		
//		System.out.println("Inserted! New Id: "+ newSeller.getId());
		System.out.println("\n=== Test 5: seller update ===");
		
		seller = sellerDao.findyById(1);
		
		seller.setName("Martha Waine");
		
		sellerDao.update(seller);
		
		System.out.println("update complete");
		
		System.out.println("\n=== Test 6: seller update ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete complete");
		
		sc.close();
		
	}

}
