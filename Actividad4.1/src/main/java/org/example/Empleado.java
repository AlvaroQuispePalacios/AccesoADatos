package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @Column(name= "dni")
    private String dni;

    @Column(name = "nom_emp")
    private String nombreEmpleado;

    @ManyToOne
    @JoinColumn(name = "id_depto", referencedColumnName = "id_depto", nullable = false)
    private Departamento idDepartamento;

    public Empleado(){}

    public Empleado(String dni, String nombreEmpleado, Departamento idDepartamento){
        this.dni = dni;
        this.nombreEmpleado = nombreEmpleado;
        this.idDepartamento = idDepartamento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Departamento getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
}
