/*
 Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
 */
package entidad;

/**
 *
 * @author win10
 */
public interface calculosFormas {
      public Double valorPi = Math.PI;
      public Double calcularArea();
      public Double calcularPerimetro();
}
