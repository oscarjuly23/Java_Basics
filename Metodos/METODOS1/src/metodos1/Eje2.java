/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Eje2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String cadena;
//        int num, count=0;     
//        
//        for (int i = 0; i < 6; i++) {
//            int ran = (int) (Math.random()*49+0);
//            System.out.println(ran);
//            System.out.println("Introducir un número: ");
//            cadena = br.readLine();
//            num = Integer.parseInt(cadena);
//            if (num == ran){
//                count++;             
//        }
//            System.out.println("Número d'encerts: " + count);
        int[] primi = {12, 13, 15, 33, 23, 43};
        int[] usu_primi = new int[6];
       

        for (int i = 0; i < usu_primi.length; i++) {
            System.out.print("Introduce numero " + (i + 1) + " = ");
            usu_primi[i] = Integer.parseInt(br.readLine());
        }
        int n = n(primi, usu_primi);
        System.out.println("El número de aciertos es: " + n(primi,usu_primi));
    }

    public static int n(int[] auxPrimi, int[] auxUsu) {
        int count = 0;
        for (int i = 0; i < auxPrimi.length; i++) {
            for (int j = 0; j < auxUsu.length; j++) {
                if (auxPrimi[i] == auxUsu[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
