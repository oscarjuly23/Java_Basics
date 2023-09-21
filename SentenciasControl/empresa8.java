/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicisUF1_IF02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class empresa8 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        
        //ESTA ALGO MAL!!!!! IMACABADO
        
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        float factura, efectivo, banco, credito, meses, valor, interes;

        System.out.println("Entra el valor de la factura:");
        cadena = br.readLine();
        factura = Float.parseFloat(cadena);

        if (factura > 5000) {

            efectivo = (factura - (factura * 0.4f));
            banco = (factura - (factura * 0.3f));
            credito = (factura - (efectivo + banco));
            meses = 6;
            interes = (credito + (credito * 0.2f));

        } else if (factura < 3000) {
            efectivo = (factura - (factura * 0.7f));
            banco = (factura * 0.18f);
            credito = (factura - (efectivo + banco));
            interes = (credito + (credito * 0.2f));
            meses = 6;
        } else {
            efectivo = (factura - (factura * 0.55f));
            banco = (factura * 0.25f);
            credito = (factura - (efectivo + banco));
            interes = (credito + (credito * 0.2f));
            meses = 3;
        }

        valor = (credito / meses);

        System.out.println("Resolución:");
        System.out.println("Factura = " + factura);
        System.out.println("Efectivo= " + efectivo);
        System.out.println("Banco = " + banco);
        System.out.println("Credito = " + credito);
        System.out.println("Numero de mensualidades = " + meses);
        System.out.println("valor = " + valor);
        br.close();
    }

}
