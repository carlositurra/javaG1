package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap; //Importar Libreria HashMap

public class ColeccionesMap {
    public static void main(String[] args) {
        // Colecciones Map
        // Pares clave <--> valor
        // Definicion, estructura del HashMap
        // HashMap< K, V> map = new HashMap<K, V>();
        // K = key o clave; V = value o valor
        // Otra forma de escribir
        // HashMap mapa = new HashMap ();

        HashMap<String, String> objHashMap = new HashMap<>();
        //HashMap objHashMap = new HashMap();
        // Agregando keys y values al objHasMap .put
        objHashMap.put("Nombre", "Nicolas");
        objHashMap.put("ApellidoP", "Neira");
        objHashMap.put("ApellidoM", "Lopes");
        objHashMap.put("edad", "27");
        // Imprime los elementos dentro del HashMap
        System.out.println("Elementos del mapa");
        System.out.println(objHashMap);
        //{Nombre=Nicolas, ApellidoP=Neira, ApellidoM=Lopes, edad=27}
        // Conseguir el valor atravez de la key .get
        System.out.println(objHashMap.get("ApellidoP"));
        //Neira
        // Eliminar par .remove
        objHashMap.remove("Edad");
        System.out.println(objHashMap);
        //{Nombre=Nicolas, ApellidoP=Neira, ApellidoM=Lopes}
        // Mostrar solamente las keys disponibles .keySet();
        System.out.println(objHashMap.keySet());
        //[Nombre, ApellidoP, ApellidoM]
        // Motrar todos los value en el mapa
        System.out.println(objHashMap.values());
        //[Nicolas, Neira, Lopes]

        //Agregar mas datos para una sola clave ArrayList dentro de un HashMap
        //Creo la instancia new ArrayList
        ArrayList<String> vocales = new ArrayList<String>();
        //Agrego elementos dentro de ArrayList vocales
        vocales.add("a");
        vocales.add("e");
        vocales.add("i");
        vocales.add("o");
        vocales.add("u");

        //Agrego key "vocales" y value vocales al objHashMap
        // objHashMap.put("vocales",vocales);

        //Imprimo objHasMap con la nueva key y value
        System.out.println(objHashMap);
        //{Nombre=Nicolas, ApellidoP=Neira, ApellidoM=Lopes, vocales=[a, e, i, o, u]}
        //Imprimir solamente las vocales
        System.out.println(objHashMap.get("vocales"));
        //[a, e, i, o, u]

        //Crear menu de comida donde nosotros elegimos el plato
        //Lo haremos con HashMap y que el usuario eliga el plato
        //Imprimir plato

    }
}


