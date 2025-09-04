package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "books");
		
		Seller seller = new Seller(21, "bob" , "sla" , LocalDate.now(), 2000.0, obj);
		System.out.println(seller);
	}

}
