package com.generation.f20220525;

import java.util.Scanner;

public class ReforzamientoConceptos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaracion de variables
        int inferior = 0;
        int superior = 0;
        int datoIngresado = 0;
        int sumaDentroRango = 0;
        int contadorFueraRango = 0;
        int contadorIgualLimites = 0;

        //ingreso inicial de datos
        do {
            System.out.println("ingrese un numero para el limite inferior");
            inferior = sc.nextInt();
            System.out.println("ingrese un numero para el limite superior");
            superior = sc.nextInt();

            // Imprimir para avisar que inferior es mayor a superior
            if (superior < inferior) {
                System.out.println("Limite inferior mayor al superior, ingrese numeros validos");
            }
        } while (superior < inferior);//condicion de quiebre


        // Introducir numeros. "0" Detiene el while.
        System.out.println("a continuacion, ingrese numeros a gusto, para terminar ingrese un 0");
        do {

            System.out.println("ingrese un numero");
            datoIngresado = sc.nextInt();

            //condicion de salida, sin considerar 0 en los contadores
            if (datoIngresado != 0) {
                if (datoIngresado < inferior || datoIngresado > superior) {//comprobacion fuera o dentro del rango
                    contadorFueraRango++;
                } else {
                    sumaDentroRango += datoIngresado;
                }
                if (datoIngresado == inferior || datoIngresado == superior) {//Comprobar si numero es igual a limite superior o inferior
                    contadorIgualLimites++;
                }
            }
        } while (datoIngresado != 0);

        //Imprimir resultados
        System.out.println("Suma de los numeros ingresados dentro del rango: " + sumaDentroRango);
        System.out.println("Numero fuera de rango: " + contadorFueraRango);
        System.out.println("Numero igual a limite inferior o superior: " + contadorIgualLimites);
    }
}

