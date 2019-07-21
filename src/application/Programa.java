package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Programa {

	public static void main(String[] args) {

		SellerDao sellerDao = new DaoFactory().createSellerDao();
		System.out.println("=== test 1 : seller findbyid====");

		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println("\n\n=== test 2 : seller findbyidDepartment====");

		Department department = new Department(2, null);

		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n\n=== test 3 : seller findballt====");
		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n\n=== test 4 : seller insertt====");
		Seller newSeller = new Seller(null , "Norival Marson" , "marson@bol.com.br" , new Date(),4000.0,department);
		
		sellerDao.insert(newSeller);
		System.out.println("Inser : " + newSeller.getId());


	}

}
