package ums_project;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;



public class DeleteApp {

	public void deleteUser(Scanner sc) {
		EntityManager em = new EntityManagerImpl().createEntityManagerObject();
		
		System.out.println("Enter Your Id To Delete");
		Integer id = sc.nextInt();
		
		User user = em.find(User.class, id);
		
		if(user != null)
		{
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.remove(user);
			et.commit();
			
			System.out.println("\nUser Deleted Successfully");
		}
		else {
			System.err.println("\nInvalid User Id...Unable to Delete User");
		}
	}

}