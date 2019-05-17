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
public class TarjetaCredito extends Tarjeta{
    private int saldo;
    private int credito;

    public TarjetaCredito() {
    }

    public TarjetaCredito(int saldo, int credito) {
        this.saldo = saldo;
        this.credito = credito;
    }

    public TarjetaCredito(int saldo, int credito, String nif, int pin, String nombre, String apellido) {
        super(nif, pin, nombre, apellido);
        this.saldo = saldo;
        this.credito = credito;
    }

    public TarjetaCredito(int saldo, int credito, Tarjeta Copia) {
        super(Copia);
        this.saldo = saldo;
        this.credito = credito;
    }
    
    public TarjetaCredito(TarjetaCredito Copia) {
        this.saldo = Copia.saldo;
        this.credito = Copia.credito;
    
    
    
}

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
        @Override
    public void MostrarTarjeta(){
    
    System.out.println("Tu NIF actual es: " + this.getNif());
    System.out.println("Tu PIN actual es: " + this.getPin());
    System.out.println("Tu NOMBRE actual es: " + this. getNombre());
    System.out.println("Tu APELLIDO actual es: " + this. getApellido());
     System.out.println("Tu SALDO actual es: " + this. getSaldo());
     System.out.println("Tu CREDITO actual es: " + this. getCredito());
     
    
    
}
}
