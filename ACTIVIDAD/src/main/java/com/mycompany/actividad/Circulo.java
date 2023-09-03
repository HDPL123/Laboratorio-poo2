package com.mycompany.actividad;

// Clase Circulo
class Circulo extends FiguraGeometrica implements Shape{
    private final String nombreCirculo;
    private Punto centro;
    private int radio;

    public Circulo(String nombre, Punto centro, int radio) {
        super();
        this.nombreCirculo = nombre;
        this.centro = centro;
        this.radio = radio;
    }
    public String getNombreCirculo() {
        return nombreCirculo;
    }
    
    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio;
    }

    @Override
    public boolean esRegular() {
        return true; // Un círculo siempre es una figura regular
    }

    @Override
    public String toString() {
    return "Círculo: Centro: " + centro.toString() + ", Radio: " + radio ;
}

    @Override
    public double obtenerPerimetro() {
        // Implementa el cálculo del perímetro del círculo
        return 2 * Math.PI * radio;
    }
}

