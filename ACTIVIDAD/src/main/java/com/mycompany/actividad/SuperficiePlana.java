
package com.mycompany.actividad;

// Clase SuperficiePlana
class SuperficiePlana {
    public static double calcularAreaTotal(FiguraGeometrica[] figuras) {
        double areaTotal = 0;
        for (FiguraGeometrica figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }
}