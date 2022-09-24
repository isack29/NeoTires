/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class metodosBusqueda {

    //Metodo busqueda lineal (por id)
    //Metodo busqueda binaria
    public String buscarPorPerfildeCarga(int perfilDeCarga, Neumatico[] n) {
        System.out.println("b");
        String ms = "";

        for (int i = 0; i < 1000; i++) {

            if (n[i] == null) {

                continue;

            }

            if (n[i].getPerfilCarga() == perfilDeCarga) {
                ms = n[i].getMarca() + "" + n[i].getTamRing() + "" + n[i].getVelMax() + "" + n[i].getPerfilCarga() + "" + n[i].getAnchoNominal();
            }

        }

        return ms;

    }

}
