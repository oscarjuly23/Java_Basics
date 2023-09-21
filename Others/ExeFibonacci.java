package GrupoA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExeFibonacci {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String cadena;
        int fib0, fib1, aux;

        System.out.println("Inserta N veces de la sèrie");
        cadena = br.readLine();
        n = Integer.parseInt(cadena);

        fib0 = 0;
        fib1 = 1;
        
        for (int i = 0; i < n; ++i) {
            if (i == 0) {
                System.out.print(fib0 + ", ");
            } else {
                aux = fib0;
                fib0 = fib1;
                fib1 = aux + fib0;
                System.out.print(fib0 + ", ");
            }
        }
    }
}
