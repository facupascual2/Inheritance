//Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
//para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.
package ejercicio2.guide12;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;


public class Ejercicio2Guide12 {

    public static void main(String[] args) {
       Lavadora lavadora1 = new Lavadora();
       lavadora1.crearLavadora();
       lavadora1.precioFinal();
        System.out.println(lavadora1);
        
        
        Televisor televisor1 = new Televisor();
        televisor1.crearTelevisor();
        televisor1.precioFinal();
        System.out.println(televisor1);
    }
    ArrayList<Electrodomestico>  listaElectro= new ArrayList();
      
 }  