package fr.diginamic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "EMPRUNT")
@Getter
@Setter
@NoArgsConstructor
public class Emprunt {

    @Id
    private Integer id;

    @Column(name = "DATE_DEBUT")
    private String dateDebut;

    @Column(name = "DATE_FIN")
    private String dateFin;

    private Integer delai;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENT")
    private Client client;

    @ManyToMany
    @JoinTable(
            name = "COMPO",
            joinColumns = @JoinColumn(name = "ID_EMP"),
            inverseJoinColumns = @JoinColumn(name = "ID_LIV")
    )
    private List<Livre> livres = new ArrayList<>();

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id + ", dateDebut='" + dateDebut + '\'' + ", dateFin='" + dateFin + '\'' + ", delai=" + delai + '}';
    }
}