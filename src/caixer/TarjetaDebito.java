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
public class TarjetaDebito extends Tarjeta {
    private int saldo;

    public TarjetaDebito() {
    }

    
    
    public TarjetaDebito(int saldo) {
        this.saldo = saldo;
    }

    public TarjetaDebito(int saldo, String nif, int pin, String nombre, String apellido) {
        super(nif, pin, nombre, apellido);
        this.saldo = saldo;
    }

    public TarjetaDebito(int saldo, Tarjeta Copia) {
        super(Copia);
        this.saldo = saldo;
    }
    
    
    
    
    
    public TarjetaDebito(TarjetaDebito Copia) {
        this.saldo = Copia.saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void MostrarTarjeta(){
    
    System.out.println("Tu NIF actual es: " + this.getNif());
    System.out.println("Tu PIN actual es: " + this.getPin());
    System.out.println("Tu NOMBRE actual es: " + this. getNombre());
    System.out.println("Tu APELLIDO actual es: " + this. getApellido());
     System.out.println("Tu SALDO actual es: " + this. getSaldo());
    
    
}
    
    
    
    
}
