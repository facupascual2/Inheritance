package entidad;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private int resolucion;

    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor(int resolucion, boolean sintonizador, int precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    
        @Override
    public String toString() {
        return "Televisor[" + "Resolucion: " + resolucion + " // Sintonizador TDT: " + sintonizador+ " // Precio: " + precio + " // Color: " + color + " // Consumo Energetico: " + consumoEnergetico + " // Peso: " + peso + ']';
    }
    
    

    public void crearTelevisor(){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("ELECTRODOMESTICO TELEVISOR");
       crearElectrodomestico();
        System.out.println("Ingrese la resolucion");
        setResolucion(leer.nextInt());
        System.out.println("Ingrese si tiene sintonizador o no");
        if(leer.next().equalsIgnoreCase("s")){
            sintonizador=true;
        }else{
            sintonizador= false;
        }
   }
    @Override
       public void precioFinal(){
        super.precioFinal();
        if (resolucion >= 40) {
            setPrecio(getPrecio()*2); 
        }
        
        if(sintonizador){
            setPrecio(getPrecio()+500);
        }
    }
}
