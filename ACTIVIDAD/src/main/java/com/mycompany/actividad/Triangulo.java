package com.mycompany.actividad;

// Clase Triangulo
class Triangulo extends FiguraGeometrica implements Shape {
    private String nombre;
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo() {
        this("", new Punto(), new Punto(), new Punto());
    }

    public Triangulo(String nombre, Punto punto1, Punto punto2, Punto punto3) {
        this.nombre = nombre;
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    @Override
    public double calcularArea() {
        // ImplementaciÃ³n del cÃ¡lculo del Ã¡rea del triÃ¡ngulo usando fÃ³rmula de HerÃ³n
        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);
        double s = (lado1 + lado2 + lado3) / 2; // SemiperÃ­metro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public boolean esRegular() {
    double lado1 = punto1.calcularDistancia(punto2);
    double lado2 = punto2.calcularDistancia(punto3);
    double lado3 = punto3.calcularDistancia(punto1);
    
    // Comprueba si los tres lados son aproximadamente iguales
    double tolerancia = 1e-6; // Tolerancia para comparaciones de punto flotante
    boolean ladosIguales = Math.abs(lado1 - lado2) < tolerancia &&
                           Math.abs(lado2 - lado3) < tolerancia &&
                           Math.abs(lado3 - lado1) < tolerancia;
    
    return ladosIguales;
    }
    @Override
    public String toString() {
        return "Triangulo: " + nombre + " tiene 3 Puntos: " + punto1.toString() + "," + punto2.toString() + "," + punto3.toString();
    }
    @Override
    public double obtenerPerimetro() {
        // Implementa el cálculo del perímetro del triángulo
        // Puedes hacerlo utilizando la suma de las longitudes de sus lados
        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);
        return lado1 + lado2 + lado3;
    }
}
