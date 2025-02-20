package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "sede")
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sede")
    private Integer idSede;

    @Column(name = "nom_sede", length = 255, nullable = true)
    private String nomSede;

    public Sede() {}

    public Sede(String nomSede) {
        this.nomSede = nomSede;
    }

    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    public String getNomSede() {
        return nomSede;
    }

    public void setNomSede(String nomSede) {
        this.nomSede = nomSede;
    }
}