package com.example.examen.pojos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comercial extends Empleado {
    ArrayList<String> idiomas;

    public Comercial(String nombre, String apell1, String apell2, Genero genero, LocalDate incorporacion, ArrayList<String> idiomas) {
        super(nombre, apell1, apell2, genero, incorporacion);
        this.idiomas = idiomas;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }
}
