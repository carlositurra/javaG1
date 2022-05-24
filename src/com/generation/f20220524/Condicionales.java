package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        //capturar el ingreso por consola
        Scanner sc = new Scanner(System.in);

        //validar la mayoria de edad
        //establecer punto critico -> 18 años

        int mayoriaEdad = 18;

        //solicitar ingreso de edad
        System.out.println("Ingrese su edad");

        int edad = sc.nextInt(); //Capturando el ingreso por consola

        if (edad >= mayoriaEdad){
            System.out.println("Usted es mayor de edad");
        }else {
            System.out.println("no está permitido su ingreso");
        }
        System.out.println("ingresa tu nombre");
        String nombre = sc.nextLine();
        /*solicitar todos los string
        nombre, apellido, direccion

        edad, numeroDireccion
        saldo($) 50000 minimo en bolsillo

        Mayoria de edad,
        validar el saldo, no puede realizar apuestas

        cuanto apostara, minimo apuesta $10000
        * */

    }
}
