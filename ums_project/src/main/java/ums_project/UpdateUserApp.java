package ums_project;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class UpdateUserApp {
    
    public User takeInput(Scanner sc, Integer id) {
        System.out.println("Enter The Name");
        String name = sc.next();
        
        System.out.println("Enter The Phone Number");
        Long phono = sc.nextLong();
        
        System.out.println("Enter The Username");
        String username = sc.next();
        
        System.out.println("Enter The Email");
        String email = sc.next();
        
        System.out.println("Enter The Password");
        String password = sc.next();
        
        return new User(id, name, phono, username, email, password);
    }

    public void updateUser(Scanner sc) {
        // Create EntityManagerFactory and EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();

        try {
            Integer id = new SelectUserById().selectUserById(sc);
            User u = takeInput(sc, id);

            EntityTransaction et = em.getTransaction();
            
            et.begin();
            em.merge(u);
            et.commit();
            
            System.out.println("\nUser Data Updated Successfully....\n");
        } finally {
            // Close EntityManager and EntityManagerFactory
            em.close();
            emf.close();
        }
    }
}
