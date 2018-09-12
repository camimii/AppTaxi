/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptaxi;

/**
 *
 * @author Camila
 */
public class AppTaxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo taxi1 = new Vehiculo (1231,"asd13","Suzuki","rtblabla",1993,13,20,0);
        taxi1.iniciarVuelta(700);
        taxi1.subirPasajero();
        taxi1.verTotalGastoBencina();
        taxi1.verGananciaxSubida();
        
        
    }
    
}
