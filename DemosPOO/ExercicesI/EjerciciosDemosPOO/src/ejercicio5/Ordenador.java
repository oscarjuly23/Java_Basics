/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Alumne
 */
public class Ordenador {
private String procesador;
private float peso;
private boolean estaEncendido;
private boolean pantallaActivada;

public void SetProcesador(String procesador){
this.procesador=procesador;
}
public void GetProcesador(String procesador){
System.out.println("El procesador es el = " + procesador);
}
public void SetPeso(float peso){
this.peso=peso;
}
public void getPeso(float peso){
System.out.println("El peso del ordenador es = " + peso);
}
public void apagarOrdenador(boolean estaEncendido){
this.estaEncendido=estaEncendido;
}
public void encenderOrdenador(boolean estaEncendido){
this.estaEncendido=estaEncendido;
}
public void estaEncendido(boolean estaEncendido){
    System.out.println("Esta encendido = " + estaEncendido);
}
public void activarPantalla(boolean pantallaActivada){
this.pantallaActivada=pantallaActivada;
}
public void desactivarPantalla(boolean pantallaActivada){
this.pantallaActivada=pantallaActivada;
}
public void estaPantallaEncendida(boolean pantallaActivada){
    System.out.println("Esta pantalla encendida = " + pantallaActivada);
}
}
