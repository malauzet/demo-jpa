package fr.diginamic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Override
    public String toString() {
        return "Livre{" + "id=" + id + ", titre='" + titre + '\'' + ", auteur='" + auteur + '\'' + '}';
    }
}
