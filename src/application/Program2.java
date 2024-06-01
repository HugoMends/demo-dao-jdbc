package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		/*System.out.println("\n=== TESTE 1: department insert ====");
		Department newDepartment = new Department(5, "Games");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id =  " + newDepartment.getId());*/
		
		System.out.println("\n=== TESTE 2: department findById ====");
		Department departmentTest = departmentDao.findById(1);
		System.out.println(departmentTest);
		
		System.out.println("\n=== TESTE 3: department update ====");
		departmentTest = departmentDao.findById(1);
		departmentTest.setName("Food");
		departmentDao.update(departmentTest);
		System.out.println("Department Updated!");
		
		System.out.println("\n=== TESTE 4: department findAll ====");
		List<Department>list = departmentDao.findAll();
		for(Department obj:list) {
			System.out.println(obj);
		}

	}

}
