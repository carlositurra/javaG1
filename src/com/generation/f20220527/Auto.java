package com.generation.f20220527;

public class Auto {

    //clase es un modelo o prototipo
    //un objeto, nace a partir de la clase,tiene caracteristicas o atributos,
    //tiene metodos o funciones,
    //es algo concreto, lo convertimos en abstracto(no tangible).
    //tangible: usamos los 5 sentidos para describir

    //atributo
    private String color;
    private String marca;
    private String modelo;
    private Double velocidad;
    //constructores

    //constructor vacio
    public Auto() {
    }

    //constructor con parametros
    public Auto(String color, String marca, String modelo, Double velocidad) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    //accesadores y mutadores (get y set)

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    //metodos o funciones personalizadas

    public void aumentarVelocidad(){
        this.velocidad = 10d;
    }



}
