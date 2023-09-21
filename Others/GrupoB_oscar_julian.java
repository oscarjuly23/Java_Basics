/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupob_oscar_julian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class GrupoB_oscar_julian {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int num = 1, exp = 1, pot = 1, count = 0, div = 1, sum = 0;

        System.out.println("Introdueix una base: ");
        cadena = br.readLine();
        num = Integer.parseInt(cadena);

        System.out.println("Introdueix una exponent: ");
        cadena = br.readLine();
        exp = Integer.parseInt(cadena);

        do {
            pot = pot * num;
            count++;
        } while (count != exp);

        System.out.println(num + "^" + exp + " = " + pot);
        //AIXO ES FARIA EN UN FOR MILLOR
        //SINO EN UN WHILE (I NO UN DO WHILE)
        //while (count != exo) {
        //}
        
        
        //calcular potència
        //for (int i = 0; i < exponent; ++i) {
            //potencia = potencia * base;
        //}
        // System.out.println("La potència és: " + potencia);
        do {
            div = pot % 10;
            sum = sum + div;
            pot = pot / 10;
            
        } while (pot > 0);
        //ES FA UN WHILE NO DO WHILE!
        //while (pot > 0) {
        //}       
        
        
         //calcular la suma de les xifres
        //suma = 0;
        //while (potencia > 0) {
          //  residu = potencia % 10;
            //suma = suma + residu;
            //potencia = potencia / 10;
        //}
        //System.out.println("La suma de les xifres és " + suma);
        
        System.out.println("La suma de sus dígitos es " + sum + ".");
        br.close();
    }

}
