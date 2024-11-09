package ums_project;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class SelectAllApp {

    public void selectAllUsers() {
        // Create EntityManagerFactory and EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();

        try {
            // Execute the query to select all users
            Query q = em.createQuery("from User");

            List<User> users = q.getResultList();

            for (User user : users) {
                System.out.println("\n" + user);
            }
            System.out.println();
        } finally {
            // Close EntityManager and EntityManagerFactory
            em.close();
            emf.close();
        }
    }
}
