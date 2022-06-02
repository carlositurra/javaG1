package com.generation.f20220601.pruebasUnitarias;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void test(){
        Calculadora calc = new Calculadora();
        int resultado = calc.suma(12,42);//54

        //assertEquals(valorEsperado,Resultado);
        assertEquals(54,resultado);
    }
}