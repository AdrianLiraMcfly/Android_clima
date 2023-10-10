package com.cartelderamironuevageneracion.calculus.models;

public class Celsius extends Grado {

    public Celsius(double valor){
        this.setValor(valor);
        this.setUnidad("Celsius");
    }

    public Celsius parse(Farenheit fa){
        return new Celsius((fa.getValor()-32)/1.8);
    }

    public Celsius parse(Kelvin ke){
        return new Celsius(ke.getValor()-273.15);
    }
}
