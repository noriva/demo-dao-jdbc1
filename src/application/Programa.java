package application;

import java.util.Date;

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

	}

}
