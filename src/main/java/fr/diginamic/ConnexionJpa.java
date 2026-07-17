package fr.diginamic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ConnexionJpa {
    static void main() {
        /*
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("compta");
        EntityManager em = entityManagerFactory.createEntityManager();
        Region region = em.find(Region.class, 1);
        System.out.println(region.getNom());
        */

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("biblio");
        EntityManager emb = entityManagerFactory.createEntityManager();

        Livre livre = emb.find(Livre.class, 1);
        System.out.println(livre);

        TypedQuery<Livre> query = emb.createQuery("SELECT l FROM Livre l", Livre.class);
        List<Livre> livres = query.getResultList();

        for (Livre l : livres) {
            System.out.println(l);
        }
    }
}
