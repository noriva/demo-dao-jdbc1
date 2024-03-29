package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("\n\n=== test 5 : seller updatet====");
		seller = sellerDao.findById(8);
		seller.setName("Norival");
		sellerDao.update(seller);
		System.out.println("update completo");
		
		System.out.println("\n\n=== test 6 : seller updatet====");
		System.out.println("entre com id : ");
		int id = sc.nextInt();
		
		sellerDao.deleteById(id);
		System.out.println("delete completo");
		
		sc.close();


	}

}
