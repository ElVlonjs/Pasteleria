/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixer;

import java.util.Scanner;

/**
 *
 * @author infor19
 */
public class Caixer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         boolean verdadero = true;
         Scanner input = new Scanner(System.in); //Input
        // TODO code application logic here
        
        Tarjeta t1 = new Tarjeta("aeio", 1234,"Valentin", "Amez");
        

        while (verdadero) {

            System.out.println("1.Sacar dinero ");
            System.out.println("2.Salir ");

            int elecion = input.nextInt();
            switch (elecion) {
                case 1:
                    t1.MostrarTarjeta();
                    
                    break;
                    
                   
                case 2:
                                
                    verdadero = false;
                    break;
                   

            }
        }
    }
    
}
