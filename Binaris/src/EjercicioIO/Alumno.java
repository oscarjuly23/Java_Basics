/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioIO;

/**
 *
 * @author Alumne
 */
public class Alumno {

    int anio;
    int mes;
    int dia;
    int id; //identificador
    static int num_Alumnos = 0;

    public Alumno(int anio, int mes, int dia, int id) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.id = id;
    }

    public Alumno() {

    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNum_Alumnos() {
        return num_Alumnos;
    }

    public static void setNum_Alumnos(int num_Alumnos) {
        Alumno.num_Alumnos = num_Alumnos;

    }
}
