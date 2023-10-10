package com.cartelderamironuevageneracion.calculus.models;

public class Farenheit extends Grado {
    public Farenheit(double valor){
        this.setValor(valor);
        this.setUnidad("Farenheit");
    }

    public Farenheit parse(Celsius ce){
        return new Farenheit(ce.getValor()*1.8+32);
    }

    public Farenheit parse(Kelvin ke){
        return new Farenheit(ke.getValor()*1.8-459.67);
    }
}
