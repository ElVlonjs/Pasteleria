/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixer;

/**
 *
 * @author infor19
 */
public class Tarjeta {

    private String nif;
    private int pin;
    private String nombre;
    private String apellido;

    public Tarjeta() {
    }

    public Tarjeta(String nif, int pin, String nombre, String apellido) {
        this.nif = nif;
        this.pin = pin;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Tarjeta(Tarjeta Copia) {
        this.nif = Copia.nif;
        this.pin = Copia.pin;
        this.nombre = Copia.nombre;
        this.apellido = Copia.apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }     
     
    
public void MostrarTarjeta(){
    
    System.out.println("Tu NIF actual es: " + this.getNif());
    System.out.println("Tu PIN actual es: " + this.getPin());
    System.out.println("Tu NOMBRE actual es: " + this. getNombre());
    System.out.println("Tu APELLIDO actual es: " + this. getApellido());
    
}
}
