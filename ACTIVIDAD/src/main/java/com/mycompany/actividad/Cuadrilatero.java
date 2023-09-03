
package com.mycompany.actividad;

abstract class Cuadrilatero extends FiguraGeometrica {
    Punto vertice1;
    Punto vertice2;
    Punto vertice3;
    private Punto vertice4;

    public Cuadrilatero(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        super();
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    }
    public Punto getVertice1() {
    return vertice1;
}

public Punto getVertice2() {
    return vertice2;
}

public Punto getVertice3() {
    return vertice3;
}

public Punto getVertice4() {
    return vertice4;
}

    @Override
    public boolean esRegular() {
        return checkRectangulo();
    }

    private boolean checkRectangulo() {
        double[] lados = new double[4];
        lados[0] = vertice1.calcularDistancia(vertice2);
        lados[1] = vertice2.calcularDistancia(vertice3);
        lados[2] = vertice3.calcularDistancia(vertice4);
        lados[3] = vertice4.calcularDistancia(vertice1);

        // Verificar si es un rectángulo
        return (escalarProducto(lados[0], lados[2]) && escalarProducto(lados[1], lados[3]));
    }

    private boolean escalarProducto(double lado1, double lado2) {
        return Math.abs(lado1 * lado1 + lado2 * lado2 - lado1 * lado2) < 1e-9;
    }

    @Override
    public String toString() {
        return "Cuadrilátero: "  + ", Vértices: " + vertice1.toString() + ", " + vertice2.toString() + ", " + vertice3.toString() + ", " + vertice4.toString();
    }
}
