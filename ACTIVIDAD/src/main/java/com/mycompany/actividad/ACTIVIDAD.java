package com.mycompany.actividad;


public class ACTIVIDAD {
    public static void main(String[] args) {
        Punto puntoA = new Punto(0, 0);
        Punto puntoB = new Punto(3, 0);
        Punto puntoC = new Punto(0, 4);
       
        Triangulo triangulo = new Triangulo("ABC", puntoA, puntoB, puntoC);

        Punto centroCirculo = new Punto(2, 2);
        int radioCirculo = 5;
        
        Circulo circulo = new Circulo("Círculo1", centroCirculo, radioCirculo);
        
        Punto vertice1 = new Punto(0, 0);
        Punto vertice2 = new Punto(4, 0);
        Punto vertice3 = new Punto(4, 3);
        Punto vertice4 = new Punto(0, 3);

        Rectangulo rectangulo = new Rectangulo("Rectángulo1", vertice1, vertice2, vertice3, vertice4);
        

        FiguraGeometrica[] figuras = { triangulo, circulo, rectangulo };
        double areaTotal = SuperficiePlana.calcularAreaTotal(figuras);
        
      
        
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Detalles de la figura:");
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + ((Shape) figura).obtenerPerimetro());
            System.out.println(figura.toString());
    }
}
}