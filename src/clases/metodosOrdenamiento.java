/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class metodosOrdenamiento {

    //Burbuja
    //Intercambio
    Neumatico[] n;

    public metodosOrdenamiento(Neumatico[] n) {
        this.n = n;
        

    }

//
    public void setNE(int i, Neumatico ne) {

        n[i] = ne;
    }

    public Neumatico getNE(int pos) {
        return n[pos];
    }
    
        public void cambiar(int p1, int p2) {
        Neumatico temp;
        temp = getNE(p1);
        setNE(p1, getNE(p2));
        setNE(p2, temp);
    }



    public Neumatico[] ordenarBurbuja() {

        int i, j;
        for (i = 0; i <= n.length - 1; i++) {
            if (getNE(i) == null) {
                continue;
            }
            for (j = 0; j <= (n.length - i) - 2; j++) {

                if (getNE(j).getAnchoNominal() > getNE(j + 1).getAnchoNominal()) {
                    cambiar(j, j + 1);
                }
            }
        }

        return n;
    }

    public Neumatico[] ordenarIntercambio() {
        int i, j;
        for (i = 0; i <= n.length - 1; i++) {
            for (j = i + 1; j <= n.length - 1; j++) {
                if (getNE(i).getAnchoNominal() < getNE(j).getAnchoNominal()) {
                    cambiar(i, j);
                }
            }
        }
        return n;
    }

    public Neumatico[] ordenarQuicksort(int primero, int ultimo) {
        
        int i = primero, j = ultimo;
        int pivote = n[(primero + ultimo) / 2].getAnchoNominal();
        do {
            while (n[i].getAnchoNominal() < pivote) {
                i++;
            }
            while (n[j].getAnchoNominal() > pivote) {
                j--;
            }
            if (i <= j) {
                cambiar(i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            ordenarQuicksort( primero, j);
        }
        if (ultimo > i) {
            ordenarQuicksort( i, ultimo);
        }
        
        return n;
    }

    public void ordenarMarcaCompareto(List neumaticos) {

        Collections.sort(neumaticos, new comparatorNeumatico());

    }
    
        public String mostrarListaNeumaticos() {

        String mensaje = "Marca\tTamaño de Ring\tVelocidad Max\tPerfil de Carga\tAncho Nominal\n";

        for (int i = 0; i < 1000; i++) {

            if (getNE(i).getTamRing() == 0) {
                continue;

            }
            mensaje += getNE(i).getMarca() + "\t" + getNE(i).getTamRing() + "\t" + getNE(i).getVelMax() + "\t" + getNE(i).getPerfilCarga() + "\n" + getNE(i).getAnchoNominal();

        }
        return mensaje;

    }

}
