/*
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos.


Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package entidad;

/**
 *
 * @author win10
 */
 public class Rectangulo implements calculosFormas {

     private Double base;
     private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
     
        
    @Override
    public Double calcularArea() {
        Double area = base * altura;
        return area;
    }

    @Override
    public Double calcularPerimetro() {
        Double perimetro= (base + altura) * 2;
        return perimetro;
    }
    
}
