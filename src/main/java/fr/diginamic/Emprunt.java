package fr.diginamic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

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

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id + ", dateDebut='" + dateDebut + '\'' + ", dateFin='" + dateFin + '\'' + ", delai=" + delai + '}';
    }
}