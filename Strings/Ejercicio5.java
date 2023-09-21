
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        String s1 = "Benvingut a Java";
        String s2 = s1;
        String s3 = "Benvingut a Java";
        String s4 = "Benvingut a Java";

        System.out.println(s1.indexOf("J"));
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.replace("a", "t"));
        System.out.println(s1.lastIndexOf("a"));
        System.out.println(s1.lastIndexOf("a", 16));
        System.out.println(s1.length());
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 11));
        System.out.println(s1.startsWith("Ben"));
        System.out.println(s1.endsWith("Java"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replaceFirst("a", "T"));

        br.close();
    }

}
