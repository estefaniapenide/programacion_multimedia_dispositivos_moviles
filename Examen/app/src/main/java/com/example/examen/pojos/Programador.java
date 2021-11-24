package com.example.examen.pojos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programador extends Empleado {
    ArrayList<String> lenguajes;

    public Programador(String nombre, String apell1, String apell2, Genero genero, LocalDate incorporacion, ArrayList<String> lenguajes) {
        super(nombre, apell1, apell2, genero, incorporacion);
        this.lenguajes = lenguajes;
    }

    public ArrayList<String> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(ArrayList<String> lenguajes) {
        this.lenguajes = lenguajes;
    }
}

