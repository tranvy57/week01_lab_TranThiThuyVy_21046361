package iuh.fit.week01_lab_tranthithuyvy_21046361;

import iuh.fit.week01_lab_tranthithuyvy_21046361.entities.Test;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Testmain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA ORM MariaDB");
        EntityManager em = emf.createEntityManager();

        Test testEntity = new Test(1, "Sample Name");

        em.getTransaction().begin();
        em.persist(testEntity);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
