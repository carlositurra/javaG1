package com.generation.f20220524;

import java.util.Scanner;

public class pruebaCasino {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //validar la mayoria de edad
        //establecer punto critico ->18

        //Solicitar todos los string
        //Primer paso, solicitamos los string, nombre, apellido y direccion
        System.out.println("Ingrese su Nombre");
        String nombre = sc.nextLine();
        System.out.println("ingrese su Apellido");
        String apellido = sc.nextLine();
        System.out.println("ingrese su Direccion sin numero");
        String direccion = sc.nextLine();



        //Solicitud de Numeros
        //Como segundo paso solicitamos los datos numericos, edad, numero de direccion
        System.out.println("ingrese el numero de su direccion");
        Integer numeroDireccion = sc.nextInt();
        System.out.println("ingrese su edad");
        Integer edad = sc.nextInt();

        // Tercer paso ingresar el saldo que tiene ($)
        System.out.println("Ingrese su saldo");
        Integer saldoBolsillo = sc.nextInt();







        // -----Validaciones-----


        // validacion de la mayoria de edad

        // variable de mayoria de edad
        int mayoriaEdad = 18; // Esta es la edad minima de ingreso


        if (edad >= mayoriaEdad){
            System.out.println("usted es mayor de edad");// respuesta si es mayor de edad
        }else {
            System.out.println("no esta permitido su ingreso"); //respuesta si es men
        }





        // el saldo minimo debe ser de 50.000/ no puede apostar con menos
        if( saldoBolsillo >= 50000) {
            System.out.println("Usted puede ingresar");
        }else {
            System.out.println("Usted no puede ingresar");
        }

        // apuesta
        // cuanto va a apostar de los 50.000/ no puede apostar mas de lo que tenga/ minimo de apuesta 10.000
        Integer saldoMinimoApuesta = 10000;
        Integer saldoMaximoApuesta = saldoBolsillo;

        // Solicitud de apuesta

        System.out.println("Ingrese apuesta (minimo 10000, maximo "+ saldoBolsillo +")");
        Integer apuesta =sc.nextInt();

        if (apuesta >= 10000 && apuesta <= saldoBolsillo){
            System.out.println("Apuesta realizada por el valor de: " + apuesta);
        }

    }
}
