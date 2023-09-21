/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Alumne
 */
public class testO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        objeto o1 = new objeto();
        objeto o2 = new objeto();
        objeto o3 = new objeto();
        
        
        
        
        o1.setNombre("paraguas");
        o2.setNombre("casco");
        o3.setNombre("vaso");
        
        System.out.println(o1.identificarse());
        System.out.println(o2.identificarse());
        System.out.println(o3.identificarse());
        
        
        
        //o.nombre = "paraguas";
    }
    
}
