package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_depto")
    private Integer idDepto;

    @Column(name = "nom_depto", length = 32, nullable = false)
    private String nomDepto;

    @ManyToOne
    @JoinColumn(name = "id_sede", nullable = false)
    private Sede sede;

    public Departamento() {}

    public Departamento(String nomDepto, Sede sede) {
        this.nomDepto = nomDepto;
        this.sede = sede;
    }

    public Integer getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(Integer idDepto) {
        this.idDepto = idDepto;
    }

    public String getNomDepto() {
        return nomDepto;
    }

    public void setNomDepto(String nomDepto) {
        this.nomDepto = nomDepto;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
}