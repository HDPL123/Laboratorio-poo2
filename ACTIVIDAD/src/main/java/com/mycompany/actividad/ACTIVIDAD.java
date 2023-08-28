package com.mycompany.actividad;


public class ACTIVIDAD {
    public static void main(String[] args) {
        Punto puntoA = new Punto(0, 0);
        Punto puntoB = new Punto(3, 0);
        Punto puntoC = new Punto(0, 4);

        Triangulo triangulo = new Triangulo("ABC", puntoA, puntoB, puntoC);
        


  
        FiguraGeometrica[] figuras = { triangulo };
        double areaTotal = SuperficiePlana.calcularAreaTotal(figuras);
        boolean esRegular = triangulo.esRegular(); // Verificar si el triángulo es regular

        System.out.println(triangulo.toString());
        System.out.println();
        System.out.println("Area total: " + areaTotal);
        System.out.println();
        if (esRegular) {
            System.out.println("El triangulo es regular.");
        } else {
            System.out.println("El triangulo no es regular.");
        }
        
    }
}