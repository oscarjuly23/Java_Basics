/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_uf3_oscar_julian;

/**
 *
 * @author Alumne
 */
class Homes {

 
    private String homes;
    private int nhomes;
    private int nhombesbcn;
    private int nhomesn;

    public Homes() {
    }

    public Homes(String homes, int nhomes, int nhombesbcn, int nhomesn) {
        this.homes = homes;
        this.nhomes = nhomes;
        this.nhombesbcn = nhombesbcn;
        this.nhomesn = nhomesn;
    }

    public String getHomes() {
        return homes;
    }

    public int getNhomes() {
        return nhomes;
    }

    public int getNhombesbcn() {
        return nhombesbcn;
    }

    public int getNhomesn() {
        return nhomesn;
    }
    
    
}
