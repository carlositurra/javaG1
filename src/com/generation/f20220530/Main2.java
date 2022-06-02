package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {


        List<Alumno> grupo2 = new ArrayList<Alumno>();

        Alumno gene = new Alumno("Genesis", "Quezada", 27, "G1");
        Alumno gabo = new Alumno("Gabriel", "Guzman", 29, "G1");
        Alumno cata = new Alumno("Catalina", "Castillo", 26, "G1");
        Alumno carlos = new Alumno("Carlos", "Iturra", 26, "G1");
        Alumno nico = new Alumno("Nicolas", "Neira", 27, "G1");

        grupo2.add(gene);
        grupo2.add(gabo);
        grupo2.add(cata);
        grupo2.add(carlos);
        grupo2.add(nico);


        System.out.println("*********************************");
        System.out.println("Nombre completo: " + gene.getNombre() + " " + gene.getApellido() + " Edad: " + gene.getEdad() + " curso " + gene.getCurso());
        System.out.println("Nombre completo: " + gabo.getNombre() + " " + gabo.getApellido() + " Edad: " + gabo.getEdad() + " Curso: " + gabo.getCurso());// get para obtener el atributo que tiene asignado mi variable
        System.out.println("nombre completo: " + cata.getNombre() + " " + cata.getApellido() + " Edad: " + cata.getEdad() + " Curso: " + cata.getCurso());
        System.out.println("Nombre completo: " + carlos.getNombre() + " " + carlos.getApellido() + " Edad: " + carlos.getEdad() + " Curso: " + carlos.getCurso());
        System.out.println("Nombre completo: " + nico.getNombre() + " " + nico.getApellido() + " Edad: " + nico.getEdad() + " Curso: " + nico.getCurso());
        System.out.println("*********************************");


        for (Alumno dato : grupo2) {
            System.out.println(dato);
        }
    }
}