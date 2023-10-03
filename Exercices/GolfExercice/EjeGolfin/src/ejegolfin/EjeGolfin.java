/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejegolfin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author UriCantaSala
 */
public class EjeGolfin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
    FileReader fr=new FileReader("golfin.txt");
    ArrayList<Golf>go=new ArrayList();
    BufferedReader br=new BufferedReader(fr);
    FileWriter fw=new FileWriter("result.txt");
    BufferedWriter bw=new BufferedWriter(fw);
    int reduc=0;
    int tot,id=0;
    int result;
    String num;
    int def;
    String dades[];
    int suma=0;
    Golf a=new Golf();
    String s;
    bw.write("jugador"+""+" reduc"+" "+" Golpes por hoyo"+"        "+"  tot"+" "+" result");
    bw.newLine();
    while((s=br.readLine())!=null){
    dades=s.split(" ");
    num=s.substring(3,s.length());
        for (int i = 2; i < dades.length; i++) {
         suma=suma+Integer.parseInt(dades[i]);  
         reduc=Integer.parseInt(dades[1]);
        
        }
        
        result=suma-reduc; a=new Golf(result);
        go.add(a);
        tot=result+reduc;
       
            bw.write(dades[0]+"      "+reduc+"      "+num+"        "+tot+"    "+result);
            bw.newLine();
        
        suma=0;
    }bw.close();
        def=100;
        for (int i = 0; i < go.size(); i++) {
            Golf auxGolf=go.get(i);
            if (auxGolf.getResult()<def) {
                def=auxGolf.getResult();
                id=i+1;
            }
        }
        System.out.println("El guanyador és el jugador "+id+" con un resultado reducido de"+20);
       
  }
    
}
