package grupoa_oscar_julian;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alumne
 */
public class DNI2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        int dni, residu;
        char c = 0;

        System.out.println("Introduce la parte numérica de tu DNI: ");
        input = br.readLine();
        dni = Integer.parseInt(input);

        residu = (dni % 23);

        switch (residu) {
            case 0:
                c = 'A';
                break;
            case 1:
                c = 'B';
                break;
            case 2:
                c = 'C';
                break;
            case 3:
                c = 'D';
                break;
            case 4:
                c = 'E';
                break;
            case 5:
                c = 'F';
                break;
            case 6:
                c = 'G';
                break;
            case 7:
                c = 'H';
                break;
            case 8:
                c = 'J';
                break;
            case 9:
                c = 'K';
                break;
            case 10:
                c = 'L';
                break;
            case 11:
                c = 'N';
                break;
            case 12:
                c = 'M';
                break;
            case 13:
                c = 'P';
                break;
            case 14:
                c = 'Q';
                break;
            case 15:
                c = 'R';
                break;
            case 16:
                c = 'S';
                break;
            case 17:
                c = 'T';
                break;
            case 18:
                c = 'V';
                break;
            case 19:
                c = 'W';
                break;
            case 20:
                c = 'X';
                break;
            case 21:
                c = 'Y';
                break;
            case 22:
                c = 'Z';
                break;
        }

        System.out.println("La lletra del DNI " + dni + " es: " + c);
        System.out.println("DNI: " + dni + c);
    }
}
