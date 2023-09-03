
package com.mycompany.actividad;

class Rectangulo extends Cuadrilatero implements Shape {
    public Rectangulo(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        super(nombre, vertice1, vertice2, vertice3, vertice4);
    }

    @Override
    public double calcularArea() {
        double base = getVertice1().calcularDistancia(getVertice2());
        double altura = getVertice2().calcularDistancia(getVertice3());
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectángulo: " +  ", Vértices: " + getVertice1().toString() + ", " + getVertice2().toString() + ", " + getVertice3().toString() + ", " + getVertice4().toString();
    }

    @Override
    public double obtenerPerimetro() {
        // Implementa el cálculo del perímetro del rectángulo
        double base = getVertice1().calcularDistancia(getVertice2());
        double altura = getVertice2().calcularDistancia(getVertice3());
        return 2 * (base + altura);
    }
}
