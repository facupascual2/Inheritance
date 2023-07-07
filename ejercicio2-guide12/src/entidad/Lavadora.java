package entidad;


import entidad.Electrodomestico;
import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
        
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, int precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora[" + "Carga:" + carga + " // Precio: " + precio + " // Color: " + color + " // Consumo Energetico: " + consumoEnergetico + " // Peso: " + peso + ']';
    }

    
    
    
    public void crearLavadora(){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("ELECTRODOMESTICO LAVADORA");
        crearElectrodomestico();
        System.out.println("INGRESE LA CARGA");
        setCarga(leer.nextInt());
    }
    
    public void precioFinal(){
        
       super.precioFinal();
       if(carga>= 30){
           setPrecio(super.getPrecio()+500);
           
       }
    }
}
