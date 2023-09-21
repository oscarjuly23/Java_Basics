/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class tienda {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        float pa, pb, da, db, ua, ub, fa, fb, piva, pt, psta, pstb;
        final float iva = 0.21f, pta = 166f;

        System.out.println("Introdueix el preu del article A: ");
        cadena = br.readLine();
        pa = Float.parseFloat(cadena);
        System.out.println("Introdueix les unitats del article A: ");
        cadena = br.readLine();
        ua = Float.parseFloat(cadena);
        System.out.println("Introdueix el descompte aplicat del article A: ");
        cadena = br.readLine();
        da = Float.parseFloat(cadena);

        fa = (pa * ua) * da;

        System.out.println("Introdueix el preu del article B: ");
        cadena = br.readLine();
        pb = Float.parseFloat(cadena);
        System.out.println("Introdueix les unitats del article B: ");
        cadena = br.readLine();
        ub = Float.parseFloat(cadena);
        System.out.println("Introdueix descompte aplicat del article B: ");
        cadena = br.readLine();
        db = Float.parseFloat(cadena);

        fb = (pb * ub) * db;

        pt = fa + fb;

        piva = (pt * iva) + pt;

        System.out.println("Preu sense IVA: " + pt);
        System.out.println("Preu amb IVA: " + piva);

        psta = pt * pta;
        pstb = piva * pta;

        System.out.println("Pesetas amb IVA: " + psta);
        System.out.println("Pesetas sense IVA: " + pstb);

        br.close();

    }

}
