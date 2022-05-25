package com.generation.f20220525;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una opcion");
        System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
        int opcion = sc.nextInt();//capturando el ingreso por consola

        //while valida que la condicion sea verdadera
        while (opcion < 0 || opcion > 4) {

            System.out.println("Ingrese opcion valida");
            System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
            opcion = sc.nextInt();

        }
        System.out.println("fuera del while");
        switch (opcion) {
            case 1:
                //accion para la opcion 1
                System.out.println("**sumar**");
                break;
            case 2:
                System.out.println("restar");
                break;
            case 3:
                System.out.println("multiplicar");
                break;
            case 4:
                System.out.println("dividir");
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }
        System.out.println("Fuera del Switch");

    }
}
