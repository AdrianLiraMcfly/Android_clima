package com.cartelderamironuevageneracion.calculus.models;

public class Kelvin extends Grado {
    public Kelvin(double valor) {
        this.setValor(valor);
        this.setUnidad("Kelvin");
    }

    public Kelvin parse(Celsius ce){
        return new Kelvin(ce.getValor()+273.15);
    }

    public Kelvin parse(Farenheit fa){
        return new Kelvin((fa.getValor()+459.67)/1.8);
    }

}
