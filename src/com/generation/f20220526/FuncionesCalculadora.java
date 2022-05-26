package com.generation.f20220526;

import java.util.Scanner;

public class FuncionesCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = sc.nextInt();
        System.out.println("ingrese otro numero");
        int num2 = sc.nextInt();
        int resultadoResta = resta(num1,num2);
        int resultadoMultiplicacion = multiplicacion(num1,num2);


        System.out.println("la resta es: " + resultadoResta);
        System.out.println("la multiplicacion es: " + resultadoMultiplicacion);
    }


    //Funcion Multiplicacion
    public static Integer multiplicacion(int num1, int num2) {
        //
        int producto = num1 * num2;

        return producto;
    }

    //funcion resta
    public static Integer resta(int num1, int num2) {

        int resultadoResta = num1 - num2;

        return resultadoResta;

    }
}