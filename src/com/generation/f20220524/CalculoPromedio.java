package com.generation.f20220524;

public class CalculoPromedio {

	public static void main(String[] args) {
		//int cantidadNotas = 12;
		//arreglo notas
		Integer[] notas = {20, -50, 67, -99, -10, 0, 88, 707, 58, 709, 33, 50};

		//variable acumuladora
		int sumaNotas = 0;//20
		int notasFueraDeRango = 0;

		//como recorrer el arreglo de notas
		for (int i = 0; i < notas.length; i++) {//i=0
			//validar nota (negativa o mayor que 100)
			if(notas[i] < 0 || notas[i] > 100){
				System.out.println("la nota:" +notas[i] + " en la posicion "+ (i + 1) + " esta fuera de rango"  );
				notasFueraDeRango++;
			}


			sumaNotas = sumaNotas + notas[i]; //accedemos a valores notas[i]
		}
		System.out.println("Tienes : "+notasFueraDeRango+" notas fuera del rango permitido");

		System.out.println("suma de notas: " + sumaNotas);

		//promedio-> suma todas las notas / cantidad de notas;
		float promedio = sumaNotas / notas.length;
		/* TODO validar el orden >= */
		//101

		//PUNTO CRITICO
		//0 >= reporbado <= 49; 50>= Aprobado <= 100
		if (promedio >= 50 && promedio <= 100) {
			System.out.println("Alumno aprobado");

		} else if (promedio >= 0 && promedio < 50) {
			System.out.println("Alumno reprobado");
		} else {
			System.out.println("nota fuera de rango");
			System.out.println("Error en el calculo del promedio");
		}
	}
}
