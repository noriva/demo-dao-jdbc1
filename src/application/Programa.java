package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Programa {

	public static void main(String[] args) {
		Department obj = new Department(1 , "books");
		Seller seller = new Seller(21,"bob","bog.com",new Date(),3000.0 , obj);
		
		SellerDao sd = DaoFactory.createSellerDao(); 
		
		System.out.println(obj);
		System.out.println(seller);

	}

}
