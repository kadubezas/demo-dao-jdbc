package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: seller findById ===");		
		Seller seller = sellerDao.findyById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test 2: seller findByDepartment ===");	
		Department dep = new Department(4,null);		
	    List<Seller> list = sellerDao.findByDepartment(dep);
	    
	    for(Seller s : list) {
	    	System.out.println(s);
	    }
	    
		System.out.println("\n=== Test 3: seller findAll ===");			
	    list = sellerDao.findAll();
	    
	    for(Seller s : list) {
	    	System.out.println(s);
	    }
	}

}
