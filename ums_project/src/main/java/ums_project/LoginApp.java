package ums_project;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;



public class LoginApp {

	public void login(Scanner sc) {
		EntityManager em = new EntityManagerImpl().createEntityManagerObject();
		
		System.out.println("Enter The Username");
		String username = sc.next();
		
		System.out.println("\nEnter the Password");
		String password = sc.next();
		
		Query q = em.createQuery("select u from User u where u.username =:un and u.password =:pwd");
		
		q.setParameter("un", username);
		q.setParameter("pwd", password);
		
		List<User> user = q.getResultList();
		
		if(!user.isEmpty())
		{
			System.out.println("\nUser Logged In Successfully...\n");
		}
		else {
			System.out.println("\nInvalid Credentials....!!\n");
		}
	}

}