package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {
    public static void main(String[] args) {
        //ArrayList, son Arrays DINAMICOS, que significa que se puede modificar su tamaño
        //instancia de clase, definicion de arreglo
        ArrayList<String> colores = new ArrayList<String>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();

        //agregar un elemento a la lista
        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");

        //si existe un elemento en esa posicion lo desplaza a la siguiente posicion
        colores.add(1,"amarillo");

        //imprimir contenido
        System.out.println(colores);

        //acceder a un elemento
        System.out.println(colores.get(2));

        //tamaño del arreglo size()
        System.out.println(colores.size());

        //modificar un elemento
        colores.set(1,"naranja");
        System.out.println(colores);

        //quitar un elemento arreglo.remove(posicion)
        colores.remove(1);
        System.out.println(colores);

        //quitar todos los elementos
        //colores.clear();
        //System.out.println(colores);

        //recorrer el arreglo

        for (int i = 0; i < colores.size();i++){
            System.out.println(colores.get(i));
        }
        System.out.println("*******************");

        for (String color : colores){
            System.out.println(color);
        }

        //ordenar el arreglo de forma ascendente
        Collections.sort(colores);
        System.out.println(colores);


        numerosPares.add(14);
        numerosPares.add(2);
        numerosPares.add(8);
        numerosPares.add(6);
        numerosPares.add(10);
        numerosPares.add(20);
        System.out.println(numerosPares + " ");
        System.out.println();
        Collections.sort(numerosPares);
        System.out.println(numerosPares + "");

        System.out.println();
        //reverse NO ordena descedientemente, invierte el orden
        //para que quede ordenado descendientemente se suele usar primero el "sort",
        //para que quede ordenado de manera ascendente y luego se usa el "reverse" para invertirlo.
        Collections.reverse(numerosPares);
        System.out.println(numerosPares + "");



    }
}
