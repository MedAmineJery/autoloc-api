package tn.esprit.autoloc.autoloc.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.internal.build.AllowNonPortable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Agence {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String nom;
    private String ville ;
    private String adresse ;
    private int telephone ;

}
