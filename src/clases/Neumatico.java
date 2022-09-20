/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


public class Neumatico {
    
    //Marca (String)
    //Tamaño del ring (int)
    //Velocidad max (char: S,T, X,V, W, Y, Z)
    //Perfil de la carga de la llanta (int: de 80 a 114)
    //Ancho nominal en milimetros (int: de 200 a 300)
    
    private String marca;
    private int tamRing;
    private char velMax;
    private int cargaLlanta;
    private int anchoNominal;
    
    public Neumatico(String marca, int tamRing, char velMax, int cargaLlanta, int anchoNominal){
        
        this.marca = marca;
        this.tamRing = tamRing;
        this.velMax = velMax;
        this.cargaLlanta = cargaLlanta;
        this.anchoNominal = anchoNominal;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public int getTamRing() {
        return tamRing;
    }


    public void setTamRing(int tamRing) {
        this.tamRing = tamRing;
    }


    public char getVelMax() {
        return velMax;
    }


    public void setVelMax(char velMax) {
        this.velMax = velMax;
    }


    public int getCargaLlanta() {
        return cargaLlanta;
    }


    public void setCargaLlanta(int cargaLlanta) {
        this.cargaLlanta = cargaLlanta;
    }


    public int getAnchoNominal() {
        return anchoNominal;
    }


    public void setAnchoNominal(int anchoNominal) {
        this.anchoNominal = anchoNominal;
    }
    
    
    
    
    
    
}
