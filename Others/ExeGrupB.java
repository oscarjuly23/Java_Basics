package GrupoA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExeGrupB {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int exponent, base, residu;
        int potencia = 1;
        int suma;
        
        System.out.println("Base: ");
        cadena = br.readLine();
        base = Integer.parseInt(cadena);

        System.out.println("Exponent");
        cadena = br.readLine();
        exponent = Integer.parseInt(cadena);

        //calcular potència
        for (int i = 0; i < exponent; ++i) {
            potencia = potencia * base;
        }
        System.out.println("La potència és: " + potencia);

        
        //calcular la suma de les xifres
        suma = 0;
        while (potencia > 0) {
            residu = potencia % 10;
            suma = suma + residu;
            potencia = potencia / 10;
        }
        System.out.println("La suma de les xifres és " + suma);
    }

}
