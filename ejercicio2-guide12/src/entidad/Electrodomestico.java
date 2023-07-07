package entidad;

import java.util.Scanner;

public class Electrodomestico {

    protected int precio;

    protected String color;

    protected char consumoEnergetico;

    protected double peso;

    public Electrodomestico() {
    }
    
    public Electrodomestico(int precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
    public void comprobarConsumoEnergetico(char letra){
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E') {
            setConsumoEnergetico(letra);
        }else{
            setConsumoEnergetico('F');
        }
       
    }
    public void comprobarColores(String color){
        
       
        if (color.equalsIgnoreCase("BLANCO") || color.equalsIgnoreCase("NEGRO") || color.equalsIgnoreCase("ROJO") || color.equalsIgnoreCase("AZUL") || color.equalsIgnoreCase("GRIS")) {
            setColor(color);
        } else {
            setColor("BLANCO");
        }
    
    }
    
    public void crearElectrodomestico(){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        //System.out.println("Escriba el precio del electrodomestico");
        this.precio = 1000;
        
        System.out.println("Escriba el peso del producto");
        this.peso= leer.nextDouble();
        
        System.out.println("Escriba el color del electrodomestico ");
        String color= leer.next().toUpperCase();
        
        comprobarColores(color);
        System.out.println("Escriba el consumo del electrodomestico");
        System.out.println("Opciones: A || B || C || D || E ||F");
        char letra= leer.next().toUpperCase().charAt(0);
        comprobarConsumoEnergetico(letra);
                
    }
    public void precioFinal(){
        switch (consumoEnergetico) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            default:
                precio += 100;
        }
        if (peso > 0 && peso <= 19) {
            precio += 100;
            
        }
        if (peso >= 20 && peso <= 49) {
            precio += 500;
        }
        if (peso >= 50 && peso <= 79) {
            precio += 800;
        }
        if (peso > 80) {
            precio += 1000;
        }
 
        System.out.println("El precio final es " + precio);
    }
}
