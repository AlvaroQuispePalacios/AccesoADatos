package org.example;

import jakarta.persistence.*;


import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @Column(name= "dni", nullable = false, unique = true)
    private String dni;

    @Column(name = "nom_emp", nullable = false)
    private String nombreEmpleado;

    @ManyToOne(fetch = FetchType.LAZY)  // Mejora el rendimiento con Lazy Loading
    @JoinColumn(name = "id_depto", nullable = false)
    private Departamento departamento;

    public Empleado() {}

    public Empleado(String dni, String nombreEmpleado, Departamento departamento){
        this.dni = dni;
        this.nombreEmpleado = nombreEmpleado;
        this.departamento = departamento;
    }

    // Getters y Setters
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
