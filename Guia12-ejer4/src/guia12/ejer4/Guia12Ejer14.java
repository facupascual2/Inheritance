/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. 
 En el main se crearán las formas y se mostrará el
resultado final.


 */
package guia12.ejer4;

import entidad.Circulo;
import entidad.Rectangulo;


/**
 *
 * @author win10
 */
public class Guia12Ejer14 {

   
    public static void main(String[] args) {
  
        
        Circulo C1 = new Circulo(10d);
        Circulo C2 = new Circulo(20d);
        
        System.out.println("-----------------");
        System.out.println("AREA CIRCULO 1: "+C1.calcularArea());
        System.out.println("PERIMETRO CIRCULO 1: "+C1.calcularPerimetro());
        System.out.println("-----------------");
        System.out.println("AREA CIRCULO 2: "+C2.calcularArea());
        System.out.println("PERIMETRO CIRCULO 2: "+C2.calcularPerimetro());
        
        Rectangulo R1 = new Rectangulo(2d, 10d);
        Rectangulo R2 = new Rectangulo(5d, 100d);
        
        System.out.println("-----------------");
        System.out.println("AREA RECTANGULO 1: "+R1.calcularArea());
        System.out.println("PERIMETRO RECTANGULO 1: "+R1.calcularPerimetro());
        System.out.println("-----------------");
        System.out.println("AREA RECTANGULO 2: "+R2.calcularArea());
        System.out.println("PERIMETRO RECTANGULO 2: "+R2.calcularPerimetro());
        
    }
   
}