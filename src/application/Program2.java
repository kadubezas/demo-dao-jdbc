package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== teste 1 find all ===");
		List<Department> list = departmentDao.findAll();
		 for (Department d : list) {
			 System.out.println(d);
		 }
		
		System.out.println("=== teste 2 find by Id ===");
		Department dep = departmentDao.findyById(3);
		System.out.println(dep);
		
		System.out.println("=== teste 3 insert ===");
		
		System.out.println("=== teste 4 Update ===");
		
		System.out.println("=== teste 5 Delete ===");
		
	}
}
