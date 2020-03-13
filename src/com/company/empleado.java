package com.company;

public class empleado {
    private String nombre;
    private Double Sueldo;

    public empleado(String nombre, Double sueldo) {
        this.nombre = nombre;
        Sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double sueldo) {
        Sueldo = sueldo;
    }
}
