package com.example.examen.pojos;

import androidx.annotation.NonNull;

import java.time.LocalDate;



public abstract class Empleado {

    public enum Genero {Varón, Mujer, Otro};

    String nombre;
    String apell1;
    String apell2;
    Genero genero;
    LocalDate incorporacion;

    protected Empleado(String nombre, String apell1, String apell2, Genero genero, LocalDate incorporacion) {
        this.nombre = nombre;
        this.apell1 = apell1;
        this.apell2 = apell2;
        this.genero = genero;
        this.incorporacion = incorporacion;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getApell1() {
        return apell1;
    }

    protected void setApell1(String apell1) {
        this.apell1 = apell1;
    }

    protected String getApell2() {
        return apell2;
    }

    protected void setApell2(String apell2) {
        this.apell2 = apell2;
    }

    protected Genero getGenero() {
        return genero;
    }

    protected void setGenero(Genero genero) {
        this.genero = genero;
    }

    protected LocalDate getIncorporacion() {
        return incorporacion;
    }

    protected void setIncorporacion(LocalDate incorporacion) {
        this.incorporacion = incorporacion;
    }

    @Override
    public String toString() {
        return ("Nombre: " + nombre + " "+ apell1 + " " + apell2 +"\nSexo: " + genero +
                "\nFecha de contrato: " + incorporacion);
    }
}
