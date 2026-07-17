package fr.diginamic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    static void main() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("compta");

        EntityManager em = entityManagerFactory.createEntityManager();
    }
}
