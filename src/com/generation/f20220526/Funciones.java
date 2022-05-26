package com.generation.f20220526;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        //Funciones
        //4 tipos de funciones
        //2 que retornan
        //2 que no retornan, las funciones tipo void no retornan, solo ejecutan
        //nombre_funcion se escribe con minuscula la primera letra
        //no puede CREAR un metodo dentro de otro metodo, si puede LLAMAR a otro metodo

        saludo();//llamado al metodo
        calculoSumaPares(true, 23, "33", 44l, "sumar");

        int edad = obtenerEdad();
        System.out.println(edad);

        boolean mayorOMenor = validarMayorEdad(edad);

        if (mayorOMenor  == true) {
            System.out.println("Puede ingresar al curso");
        }else {
            System.out.println("No tiene la edad suficiente para acceder al curso");
        }

    }

    public static void calculoSumaPares(boolean verdad, int numero1, String numero2, long numero3, String accion) {
        Integer num2 = Integer.parseInt(numero2);
        System.out.println(numero1 + numero3 + num2);
    }

    //static, nos permite acceder al metodo
    public static void saludo() {
        //solicitar el ingreso de datos
        System.out.println("Buenos dias");
    }

    //funciones que retornan un tipo de datos
    public static Integer obtenerEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese edad");
        Integer edad = scanner.nextInt();

        return edad;//retornar el contenido de la variable
    }

    public static Boolean validarMayorEdad(Integer edad) {

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        } else {
            System.out.println("Es menor de edad");
            return false;
        }
        //return true;//false
    }
}
