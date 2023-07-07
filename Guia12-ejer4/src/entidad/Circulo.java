/*
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos.

Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
package entidad;

/**
 *
 * @author win10
 */
public class Circulo implements calculosFormas {
    
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public Double calcularArea() {
        Double area= valorPi *Math.pow(radio, 2);
        return area;
    }

    @Override
    public Double calcularPerimetro() {
       Double perimetro = valorPi * (radio*2);
       return perimetro;
    }
    
}
