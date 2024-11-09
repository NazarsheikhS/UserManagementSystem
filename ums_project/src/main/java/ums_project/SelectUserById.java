package ums_project;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class SelectUserById {

    public Integer selectUserById(Scanner sc) {
        // Create EntityManagerFactory and EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();

        Integer id = null;
        try {
            System.out.println("Enter User Id");
            id = sc.nextInt();

            User user = em.find(User.class, id);

            if (user != null) {
                System.out.println(user + "\n");
            } else {
                System.out.println("User not found\n");
            }
        } finally {
            // Close EntityManager and EntityManagerFactory
            em.close();
            emf.close();
        }
        return id;
    }
}
