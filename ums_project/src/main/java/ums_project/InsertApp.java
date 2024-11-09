package ums_project;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class InsertApp {
	
	public User takeInput(Scanner sc)
	{
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("\nEnter Your Phone Number");
		Long phono = sc.nextLong();
		
		System.out.println("\nEnter Your Username");
		String username = sc.next();
		
		System.out.println("\nEnter Your Email");
		String email = sc.next();
		
		System.out.println("\nEnter Your Password");
		String password = sc.next();
		
		return new User(name, phono, username, email, password);
	}

	public void addUser(Scanner sc) {
		
		EntityManager em = new EntityManagerImpl().createEntityManagerObject();
		
		User u = new InsertApp().takeInput(sc);
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(u);
		et.commit();
		
		System.out.println("\nUser Data Inserted Successfully....\n");
	}
}