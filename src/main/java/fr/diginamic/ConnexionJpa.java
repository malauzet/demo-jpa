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

        IO.println("———————————————————————————————————————————————————————————————————————————————————————");

        TypedQuery<Livre> query = emb.createQuery("SELECT l FROM Livre l", Livre.class);
        List<Livre> livres = query.getResultList();
        for (Livre l : livres) {
            System.out.println(l);
        }

        IO.println("———————————————————————————————————————————————————————————————————————————————————————");

        Client client = emb.find(Client.class, 1);
        System.out.println(client);
        for (Emprunt emprunt : client.getEmprunts()) {
            System.out.println("  -> " + emprunt);
        }

        IO.println("———————————————————————————————————————————————————————————————————————————————————————");

        Emprunt emprunt = emb.find(Emprunt.class, 1);
        System.out.println(emprunt);
        for (Livre l : emprunt.getLivres()) {
            System.out.println("  -> " + l);
        }

        emb.close();
        entityManagerFactory.close();
    }
}
