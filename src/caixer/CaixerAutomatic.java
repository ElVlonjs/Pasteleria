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
public class CaixerAutomatic {

    private static int control_id;
    private int id_caixer;
    private int billets;
    private String tarjeta;
    
    

    public CaixerAutomatic() {
    }

    
    
    public CaixerAutomatic(int id_caixer, int billets, String tarjeta) {
        this.id_caixer = id_caixer;
        this.billets = billets;
        this.tarjeta = tarjeta;
        
    }
    
    
    
     public CaixerAutomatic(CaixerAutomatic Copia) {
        this.id_caixer = Copia.id_caixer;
        this.billets = Copia.billets;
        this.tarjeta = Copia.tarjeta;
    }

    public static int getControl_id() {
        return control_id;
    }

    public static void setControl_id(int control_id) {
        CaixerAutomatic.control_id = control_id;
    }

    public int getId_caixer() {
        return id_caixer;
    }

    public void setId_caixer(int id_caixer) {
        this.id_caixer = id_caixer;
    }

    public int getBillets() {
        return billets;
    }

    public void setBillets(int billets) {
        this.billets = billets;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
     
     

}
