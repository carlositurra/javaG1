package com.generation.f20220526;

public class FuncionesMath {
    public static void main(String[] args) {

        //math

        //elevar o potencia
        double numeroElevado = Math.pow(4.8, 3);
        System.out.println(numeroElevado);

        //Redondear al antero mayor
        double enteroMayor = Math.ceil(numeroElevado);
        System.out.println(enteroMayor);

        //Redondear al entero menor
        double enteroMenor = Math.floor(numeroElevado);
        System.out.println(enteroMenor);

        //Redondeo
        double enteroRedondeado = Math.round(numeroElevado);
        System.out.println(enteroRedondeado);

        //numeros aleatorios
        //Math.random() >= 0.0 y < 1.0
        double aleatorio = Math.random();
        System.out.println(aleatorio);

        //numeros aleatorios entre 0 y 10
        double num010 = Math.random()*10;
        System.out.println(num010);

        //numeros aleatorios entre 2 y 8
        double num28 = (Math.random() * (8-2) + 2);
        System.out.println(num28);

        //numeros aleatorios entre 50 y 70
        double num29 = (Math.random() * (70-50) + 50);
        System.out.println(Math.abs(num29));
        System.out.println(Math.round(num29));
    }
}
