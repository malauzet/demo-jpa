package fr.diginamic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "LIVRE")
@Getter
@Setter
@NoArgsConstructor
public class Livre {

    @Id
    private Integer id;

    private String titre;

    private String auteur;

    @ManyToMany(mappedBy = "livres")
    private List<Emprunt> emprunts = new ArrayList<>();

    @Override
    public String toString() {
        return "Livre{" + "id=" + id + ", titre='" + titre + '\'' + ", auteur='" + auteur + '\'' + '}';
    }
}
