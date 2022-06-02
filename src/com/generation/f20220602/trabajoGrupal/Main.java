package com.generation.f20220602.trabajoGrupal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //declaracion de 2 profesores y dos administrativos
        Trabajador profeIsra = new Trabajador();
        Profesor profePame = new Profesor();
        Trabajador madga = new Administrativos();
        Administrativos Andrea = new Administrativos();

        //declaracion de lista de trabajadores
        List<Trabajador> generation = new ArrayList<Trabajador>();

        //datos profeIsra
        profeIsra.setNombre("Isra");
        profeIsra.setArea("clases");
        profeIsra.setHorasLaborales(45);


        //datos profe Pame
        profePame.setCurso(1);
        profePame.setLetraCurso("G");
        profePame.setNombre("Pame");
        profePame.setHorasLaborales(45);
        profePame.setArea("clases");

        //datos magda
        madga.setNombre("magda");

        //datos Andrea
        Andrea.setNombre("Andrea");

        generation.add(Andrea);
        generation.add(madga);
        generation.add(profePame);
        generation.add(profeIsra);

    }
}