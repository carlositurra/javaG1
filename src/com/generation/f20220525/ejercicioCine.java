package com.generation.f20220525;

import java.util.Scanner;

public class ejercicioCine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar edad
        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();

        // Constantes

        //valores
        int valorTicket = 3500;


        //validar descuentos por edad

        //variables
        int cotaMinima = 15;
        int cotaMaxima = 60;
        float descuentoMenor = (float) 0.6;
        float descuentoMayor = (float) 0.55;
        float descuentoNormal = (float) 0.3;


        if(edad <= cotaMinima)
        {
            //Ticket con 55% descuento
            int valor = (int) (valorTicket*(1-descuentoMenor));
            System.out.println("El precio del ticket es de: " + valor);
        }else if(edad > 60){
            int valor = (int) (valorTicket*(1-descuentoMayor));
        System.out.println("El precio del ticket es de: " + valor);

            //Ticket con 60% descuento
        }else{
            // Ticket normal; bajo la nocion de que debe ser
            int valor = valorTicket;
            System.out.println("El precio del ticket es de: " + valor);
                    // Ticket normal
            System.out.println("si llevas al menos 2 entradas tendrás un descuento del 30% en el valor final!");
            System.out.println("Ingrese cuántas entradas quiere");
            int numeroEntradas = sc.nextInt();

            if(numeroEntradas > 1){
                int valorEntradas = (int) (numeroEntradas*valorTicket*(1-descuentoNormal));
                System.out.println("El precio de los " + numeroEntradas + " tickets es de: " + valorEntradas);
        }
        }


        //Adicional

        //Ticket normal, solicitar cantidad de tickets
        //Si es >= 2 agregar 30% de descuento



    }

}
