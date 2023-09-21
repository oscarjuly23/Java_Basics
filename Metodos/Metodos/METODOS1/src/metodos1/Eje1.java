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
public class Eje1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int n;

        System.out.println("Introducir un número: ");
        cadena = br.readLine();
        n = Integer.parseInt(cadena);

        if (par(n) == true) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

    public static boolean par(int num) {
        return num % 2 == 0;
    }

//         if(num%2==0){
//             return true;
//         }else{
//             return false;
//         }
}
