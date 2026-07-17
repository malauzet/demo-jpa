package fr.diginamic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CLIENT")
@Getter
@Setter
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    private String prenom;

    @OneToMany(mappedBy = "client")
    private List<Emprunt> emprunts = new ArrayList<>();

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + '}';
    }
}