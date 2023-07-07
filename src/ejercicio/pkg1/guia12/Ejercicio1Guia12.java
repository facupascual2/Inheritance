
 
package ejercicio.pkg1.guia12;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;
import java.util.Scanner;


public class Ejercicio1Guia12 {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
      Animal perro1= new Perro(leer.next(), leer.next(), leer.nextInt(), leer.next());
        System.out.println("El perro se llama " + perro1.getNombre() + ", come "+ perro1.getAlimento() + " tiene " + perro1.getEdad() + " y es  " + perro1.getRazaAnimal() );
        
      Animal gato1= new Gato(leer.next(), leer.next(), leer.nextInt(), leer.next());
      System.out.println("El gato se llama " + perro1.getNombre() + ", come "+ perro1.getAlimento() + " tiene " + perro1.getEdad() + " y es  " + perro1.getRazaAnimal() );
      
      
      Animal caballo1= new Caballo(leer.next(), leer.next(), leer.nextInt(), leer.next());
        System.out.println("El caballo se llama " + perro1.getNombre() + ", come "+ perro1.getAlimento() + " tiene " + perro1.getEdad() + " y es  " + perro1.getRazaAnimal() );
        
    }
    
}
