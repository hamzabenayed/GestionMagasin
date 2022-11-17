package com.example.hamzabenayed.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idFacture ;
    private String codeProduit;
    private float montantRemise;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateFacture;
    private boolean active;
    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactureList;
    @ManyToOne
    private Client client;

}
