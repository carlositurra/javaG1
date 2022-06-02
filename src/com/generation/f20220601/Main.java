package com.generation.f20220601;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Michi;
import com.generation.f20220601.modelos.Perro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //herencia
        Mascota mascota = new Mascota();
        mascota.setColor("gris");
        mascota.setNombre("tom");

        Perro perro = new Perro();
        perro.setColor("RedFaund");
        perro.setNombre("Ayun");

        Gato gato = new Gato();
        gato.setEspecie("Felino");
        gato.setPelaje("pelo");
        gato.setPeso(3);

        System.out.println(gato);


        Michi michi = new Michi(true);
        michi.setColor("amarillo");
        System.out.println(michi);

        /*Polimorfismo*/
        List<Mascota> listaMascotas = new ArrayList<Mascota>();
        Mascota regalon = new Mascota("Negro", "Canes", "Pelo", "Firulais", 1.5f, "Macho");
        listaMascotas.add(regalon);

        Mascota felix = new Gato();
        felix.setNombre("Felix");
        felix.setColor("Negro");
        felix.setPeso(3);
        listaMascotas.add(felix);

        Mascota chocolo = new Perro();
        chocolo.setNombre("Chocolo");
        chocolo.setColor("Cafe");
        chocolo.setPeso(10);
        listaMascotas.add(chocolo);

        System.out.println("*********************************");

        regalon.hacerSonido();//llamado al metodo en mascota
        felix.hacerSonido();
        chocolo.hacerSonido();

        System.out.println("*********************************");

        //recorrer un arreglo
        for(Mascota mascota2 : listaMascotas){
            mascota2.hacerSonido();
        }


    }
}
