package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<Alumno>();

        //instancia de una clase
        Alumno alumno = new Alumno();
        Alumno alumno2 = new Alumno("Leonardo","Utreras",26,"G1");

        listaAlumnos.add(alumno);
        listaAlumnos.add(alumno2);


        alumno.setNombre("Diana");

        System.out.println(alumno.getNombre());
        System.out.println(alumno2.getNombre());

        //setter
        alumno.setNombre("Israel");
        System.out.println(alumno.getNombre());

        System.out.println(alumno2.toString());

        for (Alumno dato : listaAlumnos){
            System.out.println(dato);

        }

    }
}
